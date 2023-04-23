package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "logging_data")
public class LoggingData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String login;
    private String password;
    @OneToOne(mappedBy = "loggingData")
    private Users users;

    public LoggingData() {
    }

    public long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }


    @Override
    public String toString() {
        return "LoggingData{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", users=" + users +
                '}';
    }
}
