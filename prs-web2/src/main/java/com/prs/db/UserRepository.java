package com.prs.db;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.prs.business.User;
import com.prs.business.PurchaseRequest;

public interface UserRepository extends CrudRepository<User, Integer> {

	public Optional<User> findByUserName(String userName);
	public Optional<User> findByUserNameAndPassword(String userName, String password);
//	public Optional<User> findByID(String ID);
	public Object save(PurchaseRequest u);
}

