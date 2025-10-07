package com.ofss.model;
import org.springframework.data.repository.CrudRepository;
// Here, Bank is the entity class and Integer is the data type
// of the primary key
public interface BankRepository extends CrudRepository<Bank, Integer>{
}