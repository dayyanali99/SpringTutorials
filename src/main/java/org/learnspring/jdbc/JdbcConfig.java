package org.learnspring.jdbc;

import org.learnspring.jdbc.dao.StudentDAO;
import org.learnspring.jdbc.dao.StudentDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "org.learnspring.jdbc")
public class JdbcConfig
{
    @Bean(name = "dataSource")
    public DataSource getDataSource()
    {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        ds.setUsername("dayyanali99");
        ds.setPassword("Ph1losopher*");
        return ds;
    }

    @Bean(name="jdbcTemplate")
    public JdbcTemplate getJdbcTemplate()
    {
        return new JdbcTemplate(getDataSource());
    }

    @Bean(name = "studentDao")
    public StudentDAO getStudentDao()
    {
        return new StudentDAOImpl();
    }
}
