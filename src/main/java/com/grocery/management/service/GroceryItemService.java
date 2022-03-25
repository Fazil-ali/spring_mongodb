package com.grocery.management.service;

import com.grocery.management.entity.GroceryItem;

import java.util.List;
import java.util.Optional;

public interface GroceryItemService {
    void createGroceryList(List<GroceryItem> groceryItemList);
    Optional<List<GroceryItem>> showAllGroceryItems();
    Optional<GroceryItem> getGroceryItemByName(String groceryItemName);
    void deleteGroceryItem(GroceryItem groceryItem);

}
