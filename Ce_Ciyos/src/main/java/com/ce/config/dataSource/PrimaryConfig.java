package com.ce.config.dataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;

/**
 * @author Chen's
 * @date 2019/6/10 10:07
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
    entityManagerFactoryRef = "entityManagerFactoryPrimary",
    transactionManagerRef = "transactionManagerPrimary",
    basePackages = {
      "com.ce.sys.repository",
      "com.ce.ciyos.order.repository",
      "com.ce.ciyos.gate.repository"
    }) // 设置Repository所在位置
public class PrimaryConfig {

  @Autowired
  @Qualifier("primaryDataSource")
  private DataSource primaryDataSource;

  @Autowired private JpaProperties jpaProperties;

  @Autowired private HibernateProperties hibernateProperties;

  //    private Map<String, String> getVendorProperties(DataSource dataSource) {
  //        return jpaProperties.getHibernateProperties(dataSource);
  //    }

  @Primary
  @Bean(name = "entityManagerFactoryPrimary")
  public LocalContainerEntityManagerFactoryBean entityManagerFactoryPrimary(
      EntityManagerFactoryBuilder builder) {
    Map<String, Object> properties =
        hibernateProperties.determineHibernateProperties(
            jpaProperties.getProperties(), new HibernateSettings());
    return builder
        .dataSource(primaryDataSource)
        .properties(properties)
        .packages(
            "com.ce.sys.entiy", "com.ce.ciyos.order.entiy", "com.ce.ciyos.gate.entiy") // 设置实体类所在位置
        .persistenceUnit("primaryPersistenceUnit")
        .build();
  }

  @Primary
  @Bean(name = "entityManagerPrimary")
  public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
    return entityManagerFactoryPrimary(builder).getObject().createEntityManager();
  }

  @Primary
  @Bean(name = "transactionManagerPrimary")
  public PlatformTransactionManager transactionManagerPrimary(EntityManagerFactoryBuilder builder) {
    return new JpaTransactionManager(entityManagerFactoryPrimary(builder).getObject());
  }
}
