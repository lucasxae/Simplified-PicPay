package com.SimplePicPay.domain.user;

import java.math.BigDecimal;

import org.hibernate.usertype.UserType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "users")
@Table(name ="users")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //GERA IDS DE FORMA AUTOMATICA, POREM NÃO É UMA DAS MELHORES FORMAS PRA ISSO

    private Long id;
    
    private String firstName;

    private String lastName;

    @Column(unique=true) // COLUNA UNICA, ASSIM, DOCUMENT NÃO PODERA SER REPETIDO 
    private String document;

    @Column(unique=true) // COLUNA UNICA, ASSIM, EMAIL NÃO PODERA SER REPETIDO 
    private String email;

    private String password;

    private BigDecimal balance;

    @Enumerated(EnumType.STRING)
    private UserType userType;
}
