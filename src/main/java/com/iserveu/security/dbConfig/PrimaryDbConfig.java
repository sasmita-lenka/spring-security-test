package com.iserveu.security.dbConfig;
//package com.iserveu.pool.dbConfig;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import jakarta.persistence.EntityManagerFactory;
//
//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(entityManagerFactoryRef = "primaryEntityManagerFactory", transactionManagerRef = "primaryTransactionManager", basePackages = {
//		"com.iserveu.pool.repo" })
//public class PrimaryDbConfig {
//	@Bean(name = "primaryDataSource")
//	@Primary
//	@ConfigurationProperties(prefix = "spring.datasource")
//	public DataSource primaryDataSource() {
//		return DataSourceBuilder.create().build();
//	}
//
//	@Primary
//	@Bean(name = "primaryEntityManagerFactory")
//	public LocalContainerEntityManagerFactoryBean primaryEntityManagerFactory(EntityManagerFactoryBuilder builder,
//			@Qualifier("primaryDataSource") DataSource primaryDataSource) {
//
//		System.out.println("primary db config");
//		return builder.dataSource(primaryDataSource).packages("com.iserveu.pool.entity").build();
//	}
//
//	@Primary
//	@Bean(name = "primaryTransactionManager")
//	public PlatformTransactionManager primaryTransactionManager(
//			@Qualifier("primaryEntityManagerFactory") EntityManagerFactory primaryEntityManagerFactory) {
//		return new JpaTransactionManager(primaryEntityManagerFactory);
//	}
//}