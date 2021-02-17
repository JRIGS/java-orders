package com.lambdaschool.javaorders.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customers
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long customercode;

    @Column(nullable = false)
    private String customername;

    private String customercity;
    private String workingarea;
    private String customercountry;
    private String grade;
    private double openingamt;
    private double receiveamt;
    private double paymentamt;
    private double outstandingamt;
    private String phone;

    @ManyToOne
    @JoinColumn(name = "agentcode", nullable = false)
    @JsonIgnoreProperties(value = "customers")
    private Agents agents;

    @OneToMany(mappedBy = "customers", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties(value = "customers")
    private List<Orders> orders = new ArrayList<>();

    public Customers()
    {}

    public Customers(
        String customername,
        String customercity,
        String workingarea,
        String customercountry,
        String grade,
        double openingamt,
        double receiveamt,
        double paymentamt,
        double outstandingamt,
        String phone,
        Agents agents)
    {
        this.customername = customername;
        this.customercity = customercity;
        this.workingarea = workingarea;
        this.customercountry = customercountry;
        this.grade = grade;
        this.openingamt = openingamt;
        this.receiveamt = receiveamt;
        this.paymentamt = paymentamt;
        this.outstandingamt = outstandingamt;
        this.phone = phone;
        this.agents = agents;
    }

    public long getCustomercode()
    {
        return customercode;
    }

    public void setCustomercode(long customercode)
    {
        this.customercode = customercode;
    }

    public String getCustomername()
    {
        return customername;
    }

    public void setCustomername(String customername)
    {
        this.customername = customername;
    }

    public String getCustomercity()
    {
        return customercity;
    }

    public void setCustomercity(String customercity)
    {
        this.customercity = customercity;
    }

    public String getWorkingarea()
    {
        return workingarea;
    }

    public void setWorkingarea(String workingarea)
    {
        this.workingarea = workingarea;
    }

    public String getCustomercountry()
    {
        return customercountry;
    }

    public void setCustomercountry(String customercountry)
    {
        this.customercountry = customercountry;
    }

    public String getGrade()
    {
        return grade;
    }

    public void setGrade(String grade)
    {
        this.grade = grade;
    }

    public double getOpeningamt()
    {
        return openingamt;
    }

    public void setOpeningamt(double openingamt)
    {
        this.openingamt = openingamt;
    }

    public double getReceiveamt()
    {
        return receiveamt;
    }

    public void setReceiveamt(double receiveamt)
    {
        this.receiveamt = receiveamt;
    }

    public double getPaymentamt()
    {
        return paymentamt;
    }

    public void setPaymentamt(double paymentamt)
    {
        this.paymentamt = paymentamt;
    }

    public double getOutstandingamt()
    {
        return outstandingamt;
    }

    public void setOutstandingamt(double outstandingamt)
    {
        this.outstandingamt = outstandingamt;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public Agents getAgents()
    {
        return agents;
    }

    public void setAgents(Agents agents)
    {
        this.agents = agents;
    }

    public List<Orders> getOrders()
    {
        return orders;
    }

    public void setOrders(List<Orders> orders)
    {
        this.orders = orders;
    }

    @Override
    public String toString()
    {
        return "Customers{" +
            "customercode=" + customercode +
            ", customername='" + customername + '\'' +
            ", customercity='" + customercity + '\'' +
            ", workingarea='" + workingarea + '\'' +
            ", customercountry='" + customercountry + '\'' +
            ", grade='" + grade + '\'' +
            ", openingamt=" + openingamt +
            ", receiveamt=" + receiveamt +
            ", paymentamt=" + paymentamt +
            ", outstandingamt=" + outstandingamt +
            ", phone='" + phone + '\'' +
            ", agents=" + agents +
            ", orders=" + orders +
            '}';
    }
}