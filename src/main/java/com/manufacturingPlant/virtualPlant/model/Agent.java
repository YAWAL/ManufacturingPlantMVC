package com.manufacturingPlant.virtualPlant.model;

import javax.persistence.*;

@Entity
public class Agent {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "agent_name")
    private String agentName;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_num")
    private String phoneNum;

    @Column(name = "web_site")
    private String webSite;

    @Column(name = "email")
    private String email;

    public Agent() {
    }

    public Agent(String agentName, String address, String phoneNum, String webSite, String email) {
        this.agentName = agentName;
        this.address = address;
        this.phoneNum = phoneNum;
        this.webSite = webSite;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Agent agent = (Agent) o;

        if (id != agent.id) return false;
        if (!agentName.equals(agent.agentName)) return false;
        if (!address.equals(agent.address)) return false;
        if (!phoneNum.equals(agent.phoneNum)) return false;
        if (!webSite.equals(agent.webSite)) return false;
        return email.equals(agent.email);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + agentName.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + phoneNum.hashCode();
        result = 31 * result + webSite.hashCode();
        result = 31 * result + email.hashCode();
        return result;
    }
}
