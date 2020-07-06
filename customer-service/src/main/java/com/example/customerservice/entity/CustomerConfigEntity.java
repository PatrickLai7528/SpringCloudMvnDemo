package com.example.customerservice.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @author Kin
 */
@Component
@RefreshScope
public class CustomerConfigEntity {
    @Value("${data.env}")
    private String env;

    @Value("${data.user.username}")
    private String username;

    @Value("${data.user.password}")
    private String password;


    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerConfigEntity that = (CustomerConfigEntity) o;
        return Objects.equals(env, that.env) &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(env, username, password);
    }

    @Override
    public String toString() {
        return "CustomerInfo{" +
                "env='" + env + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
