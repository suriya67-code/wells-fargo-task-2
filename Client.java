package com.wellsfargo.counselor;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Long clientId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @ManyToOne
    @JoinColumn(name = "advisor_id", nullable = false)
    private FinancialAdvisor financialAdvisor;

    public Client() {}

    public Client(String firstName, String lastName, String email, FinancialAdvisor financialAdvisor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.financialAdvisor = financialAdvisor;
    }

    public Long getClientId() { return clientId; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public FinancialAdvisor getFinancialAdvisor() { return financialAdvisor; }
    public void setFinancialAdvisor(FinancialAdvisor financialAdvisor) { this.financialAdvisor = financialAdvisor; }
}
