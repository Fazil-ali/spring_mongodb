package com.grocery.management.controller;

import com.grocery.management.Exception.GroceryNotFound;
import com.grocery.management.entity.GroceryItem;
import com.grocery.management.service.GroceryItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api")
public class GroceryController {

    @Autowired
    private GroceryItemService groceryItemService;

    @PostMapping("/groceries")
    public void addGroceries(@RequestBody List<GroceryItem> groceryItemList) {
        groceryItemService.createGroceryList(groceryItemList);
        log.info("Groceries saved!!!");
    }

    @GetMapping("/groceries")
    public List<GroceryItem> getGroceryList() throws GroceryNotFound {
        log.info("Getting all groceries!!!");
        return groceryItemService.showAllGroceryItems().orElseThrow(()-> new GroceryNotFound("Groceries not found"));
    }

    @GetMapping("/grocery/{name}")
    public GroceryItem getGroceryByName(@PathVariable("name") String groceryName) throws GroceryNotFound {
        log.info("Getting all grocery with name as " + groceryName);
        return groceryItemService.getGroceryItemByName(groceryName).orElseThrow(()-> new GroceryNotFound("Grocery not found"));
    }

    @DeleteMapping("grocery/{name}")
    public void updateGroceryItem(@PathVariable("name") String groceryName) throws GroceryNotFound {
        GroceryItem groceryItem = groceryItemService.getGroceryItemByName(groceryName)
                .orElseThrow(()-> new GroceryNotFound("Grocery not found"));
        groceryItemService.deleteGroceryItem(groceryItem);
    }
}
