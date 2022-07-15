package com.betrybe.repository;

import com.betrybe.model.IslandModel;
import io.quarkus.mongodb.panache.PanacheMongoRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class IslandRepository implements PanacheMongoRepositoryBase<IslandModel, Long>{
  
}
