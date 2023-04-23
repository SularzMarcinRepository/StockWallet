package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users_brokers")
public class UsersBrokers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Column(name = "account_number")
    private String accountnumber;

    @ManyToOne
    private Users users;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public UsersBrokers() {
    }

    public long getId() {
        return id;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    @Override
    public String toString() {
        return "UsersBrokers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accountnumber='" + accountnumber + '\'' +
                ", users=" + users +
                '}';
    }
}
