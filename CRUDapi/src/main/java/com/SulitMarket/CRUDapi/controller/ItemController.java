package com.SulitMarket.CRUDapi.controller;

import com.SulitMarket.CRUDapi.entity.Item;
import com.SulitMarket.CRUDapi.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping("/save/item")
    public Item saveItem(@RequestBody Item item) {
        return itemService.saveItem(item);
    }

    @GetMapping("/get/item")
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @GetMapping("/get/item/{itemNo}")
    public Item getItemById(@PathVariable Integer itemNo) {
        return itemService.getItemById(itemNo);
    }

    @PutMapping("/update/item")
    public Item updateItem(@RequestBody Item item){
        return itemService.updateItem(item);
    }

    @DeleteMapping("/delete/item/{itemNo}")
    public void deleteItem(@PathVariable Integer itemNo) {
        itemService.deleteItem(itemNo);
    }


}
