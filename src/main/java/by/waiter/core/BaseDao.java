package by.waiter.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.support.nativejdbc.NativeJdbcExtractor;

import javax.annotation.PostConstruct;

/**
 * Created by Vassilev on 28.06.2015.
 */
public abstract class BaseDao extends JdbcDaoSupport {


    private int queryTimeout;
    @Autowired
    DriverManagerDataSource driverManagerDataSource;

    @PostConstruct
    protected void initialize() {
       setDataSource(driverManagerDataSource);
    }

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public int getQueryTimeout() {
        return queryTimeout;
    }

    public void setQueryTimeout(int queryTimeout) {
        this.queryTimeout = queryTimeout;
    }
}
