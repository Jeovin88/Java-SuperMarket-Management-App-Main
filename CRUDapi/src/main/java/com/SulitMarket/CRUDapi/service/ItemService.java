package com.SulitMarket.CRUDapi.service;

import com.SulitMarket.CRUDapi.repo.ItemRepo;
import com.SulitMarket.CRUDapi.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepo itemRepo;

    public Item saveItem(Item item) {
        return itemRepo.save(item);
    }

    public List<Item> getAllItems() {
        List<Item> itemList = new ArrayList<>();
        itemRepo.findAll().forEach(itemList::add);
        return itemList;
    }

    public Item getItemById(Integer itemNo) {
        return itemRepo.findById(itemNo).orElseThrow();
    }

    public Item updateItem(Item item) {
        itemRepo.findById(item.getItemNo()).orElseThrow();
        return itemRepo.save(item);
    }

    public void deleteItem(Integer itemNo) {
        itemRepo.deleteById(itemNo);
    }


}
