package com.mts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mts.model.Account;

@Repository
public interface NewAccountRepository extends CrudRepository<Account, String> {

}
