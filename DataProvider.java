package org.example;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;

public class DataProvider {
    private static DataSource dataSource;
    private static String url;
    private static String user;
    private static String password;
    private DataProvider() {}

    public static DataSource getDataSource(String url, String user, String password) {
        if (dataSource == null) {
            var ds = new MysqlDataSource();
            ds.setURL(url);
            ds.setUser(user);
            ds.setPassword(password);
            dataSource = ds;
        }
        return dataSource;
    }
    public static DataSource getDataSource2() {
        return dataSource;
    }
}
