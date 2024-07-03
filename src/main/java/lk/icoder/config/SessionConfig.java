package lk.icoder.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;

import javax.sql.DataSource;

@Configuration
@EnableJdbcHttpSession
@ComponentScan(basePackages = "lk.icoder")
public class SessionConfig {

    private static final Logger logger = LoggerFactory.getLogger(SessionConfig.class);


    @Bean
    public DataSource dataSource() {
        logger.info("Configuring DataSource for PostgreSQL using JNDI");
        JndiDataSourceLookup dataSourceLookup = new JndiDataSourceLookup();
//        DataSource dataSource = dataSourceLookup.getDataSource("java:comp/env/jdbc/sessionDS");
        DataSource dataSource = dataSourceLookup.getDataSource("");
        logger.info("DataSource configured: {}", dataSource);
        return dataSource;
    }
}
