package com.prs.db;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.prs.business.User;
import com.prs.business.PurchaseRequest;
import com.prs.business.PurchaseRequestLineItem;

public interface PurchaseRequestLineItemRepository extends CrudRepository<PurchaseRequestLineItem, Integer> {

//	public Object save(PurchaseRequestLineItem u);

	void delete(PurchaseRequestLineItem u);

	Object save(PurchaseRequest u);

	void delete(PurchaseRequest u);
	
	

} 
