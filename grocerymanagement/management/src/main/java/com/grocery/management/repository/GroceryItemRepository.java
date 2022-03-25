package com.grocery.management.repository;

import com.grocery.management.entity.GroceryItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroceryItemRepository extends MongoRepository<GroceryItem, String> {
    GroceryItem findByName(String name);
}



