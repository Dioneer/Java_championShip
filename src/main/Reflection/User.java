package main.Reflection;

import java.time.LocalDate;

public class User extends Person implements Comparable<User>{
    private String user;
    private LocalDate lastLoginDate;
    private boolean isActive;
    private String pwd = "password";

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public LocalDate getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(LocalDate lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public User(String name, int age) {
       super(name,age);
    }
    @Deprecated
    public void purchase(){
        System.out.println("Bay");
    }
    @Override
    public int compareTo(User o) {
        return o.getLastLoginDate().compareTo(this.lastLoginDate);
    }
}
