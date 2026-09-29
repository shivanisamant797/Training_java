package com.shivani.busgo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;
import java.time.LocalDateTime;

@Table("locations")
public class Location {

    @Id
    private Long id;

    private String name;
    private String city;
    private String state;

    @Column("created_at")
    private LocalDateTime createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Location() {
    }

    public Location(Long id, String name, String city, String state, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.state = state;
        this.createdAt = createdAt;
    }

    // Generate getters and setters
}