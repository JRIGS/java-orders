package com.lambdaschool.javaorders.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "agents")
public class Agents
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long agentcode;

    private String agentname;
    private String workingarea;
    private double commision;
    private String phone;
    private String country;

    @OneToMany(mappedBy = "agents", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties(value = "agents")
    private List<Customers> customers = new ArrayList<>();

    public Agents()
    {
    }

    public Agents(
        String agentname,
        String workingarea,
        double commision,
        String phone,
        String country)
    {
        this.agentname = agentname;
        this.workingarea = workingarea;
        this.commision = commision;
        this.phone = phone;
        this.country = country;
    }

    public long getAgentcode()
    {
        return agentcode;
    }

    public void setAgentcode(long agentcode)
    {
        this.agentcode = agentcode;
    }

    public String getAgentname()
    {
        return agentname;
    }

    public void setAgentname(String agentname)
    {
        this.agentname = agentname;
    }

    public String getWorkingarea()
    {
        return workingarea;
    }

    public void setWorkingarea(String workingarea)
    {
        this.workingarea = workingarea;
    }

    public double getCommision()
    {
        return commision;
    }

    public void setCommision(double commision)
    {
        this.commision = commision;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public List<Customers> getCustomers()
    {
        return customers;
    }

    public void setCustomers(List<Customers> customers)
    {
        this.customers = customers;
    }

    @Override
    public String toString()
    {
        return "Agents{" +
            "agentcode=" + agentcode +
            ", agentname='" + agentname + '\'' +
            ", workingarea='" + workingarea + '\'' +
            ", commision=" + commision +
            ", phone='" + phone + '\'' +
            ", country='" + country + '\'' +
            ", customers=" + customers +
            '}';
    }
}
