package com.manufacturingPlant.virtualPlant.model;

import javax.persistence.*;

@Entity
@Table(name = "agents")
public class Agent {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "agent_name")
    private String agentName;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "web_site")
    private String webSite;

    @Column(name = "email")
    private String email;

    public Agent() {
    }

    public Agent(String agentName, String address, String phone, String webSite, String email) {
        this.agentName = agentName;
        this.address = address;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        if (!phone.equals(agent.phone)) return false;
        if (!webSite.equals(agent.webSite)) return false;
        return email.equals(agent.email);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + agentName.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + phone.hashCode();
        result = 31 * result + webSite.hashCode();
        result = 31 * result + email.hashCode();
        return result;
    }
}
