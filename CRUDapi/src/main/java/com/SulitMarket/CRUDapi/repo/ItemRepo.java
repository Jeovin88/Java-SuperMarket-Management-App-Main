package com.SulitMarket.CRUDapi.repo;

import com.SulitMarket.CRUDapi.entity.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo extends CrudRepository<Item, Integer> {

}
