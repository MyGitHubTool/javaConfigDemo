package com.ctban.swallow.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author GuoJie 2018/7/2 14:33
 */
@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
public class DatasourceConfig {

    @Autowired
    Environment ev;

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(ev.getProperty("jdbc.url"));
        dataSource.setUsername(ev.getProperty("jdbc.username"));
        dataSource.setPassword(ev.getProperty("jdbc.password"));
        dataSource.setDriverClassName(ev.getProperty("jdbc.driver.class.name"));
        dataSource.setMaxActive(ev.getProperty("max.active", int.class));
        dataSource.setInitialSize(ev.getProperty("initial.size", int.class));
        dataSource.setMaxWait(ev.getProperty("max.wait", long.class));
        dataSource.setMinIdle(ev.getProperty("min.idle", int.class));
        dataSource.setTimeBetweenEvictionRunsMillis(ev.getProperty("time.between.eviction.runs.millis", long.class));
        dataSource.setMinEvictableIdleTimeMillis(ev.getProperty("min.evictable.idle.time.millis", long.class));
        dataSource.setValidationQuery(ev.getProperty("validation.query"));
        dataSource.setTestWhileIdle(ev.getProperty("test.while.idle", boolean.class));
        dataSource.setTestOnBorrow(ev.getProperty("test.on.borrow", boolean.class));
        dataSource.setTestOnReturn(ev.getProperty("test.on.return", boolean.class));
        dataSource.setMaxOpenPreparedStatements(ev.getProperty("max.open.prepared.statements", int.class));
        dataSource.setRemoveAbandoned(ev.getProperty("remove.abandoned", boolean.class));
        dataSource.setRemoveAbandonedTimeout(ev.getProperty("remove.abandoned.timeout", int.class));
        dataSource.setLogAbandoned(ev.getProperty("log.abandoned", boolean.class));
        return dataSource;
    }

    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager() {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource());
        return dataSourceTransactionManager;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}
