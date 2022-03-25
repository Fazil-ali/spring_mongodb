package com.grocery.management.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("groceryitems")
@Getter
@Setter
@ToString
public class GroceryItem {

    @Id
    private String id;
    private String name;
    private int quantity;
    private String category;

}
