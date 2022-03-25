package com.grocery.management.service.Impl;

import com.grocery.management.entity.GroceryItem;
import com.grocery.management.repository.GroceryItemRepository;
import com.grocery.management.service.GroceryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroceryItemServiceImpl implements GroceryItemService {

    @Autowired
    private GroceryItemRepository groceryItemRepo;

    @Override
    public void createGroceryList(List<GroceryItem> groceryItemList) {
        groceryItemRepo.saveAll(groceryItemList);
    }

    @Override
    public Optional<List<GroceryItem>> showAllGroceryItems() {
        return Optional.of(groceryItemRepo.findAll());
    }

    @Override
    public Optional<GroceryItem> getGroceryItemByName(String groceryItemName) {
        return Optional.ofNullable(groceryItemRepo.findByName(groceryItemName));
    }

    @Override
    public void deleteGroceryItem(GroceryItem groceryItem) {
       groceryItemRepo.delete(groceryItem);
    }
}
