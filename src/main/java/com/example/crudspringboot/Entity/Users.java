package com.example.crudspringboot.Entity;import jakarta.persistence.*;import lombok.Getter;import lombok.Setter;import lombok.ToString;@Entity@Getter@Setter@ToString@Table(name = "users")public class Users {    //model user for the database    @Id    @GeneratedValue(strategy = GenerationType.IDENTITY)    @Column(name = "id")    private Long id;    @Column(name = "nombre")    private String nombre;    @Column(name = "apellido")    private String apellido;    @Column(name = "email")    private String email;    @Column(name = "edad")    private Long edad;    @Column(name = "sexo")    private String sexo;}