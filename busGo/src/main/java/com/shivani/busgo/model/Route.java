package com.shivani.busgo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("routes")
public class Route {

    @Id
    private Long id;

    @Column("source_location_id")
    private Long sourceLocationId;

    @Column("destination_location_id")
    private Long destinationLocationId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSourceLocationId() {
        return sourceLocationId;
    }

    public void setSourceLocationId(Long sourceLocationId) {
        this.sourceLocationId = sourceLocationId;
    }

    public Long getDestinationLocationId() {
        return destinationLocationId;
    }

    public void setDestinationLocationId(Long destinationLocationId) {
        this.destinationLocationId = destinationLocationId;
    }

    public Route() {
    }

    public Route(Long id, Long sourceLocationId, Long destinationLocationId) {
        this.id = id;
        this.sourceLocationId = sourceLocationId;
        this.destinationLocationId = destinationLocationId;
    }

    // Generate getters and setters
}