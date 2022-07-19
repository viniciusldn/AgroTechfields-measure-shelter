package com.betrybe.repository;

import javax.enterprise.context.ApplicationScoped;

import com.betrybe.model.SatelliteData;

import io.quarkus.mongodb.panache.PanacheMongoRepository;

@ApplicationScoped
public class SatelliteRepository
    implements PanacheMongoRepository<SatelliteData> {
}
