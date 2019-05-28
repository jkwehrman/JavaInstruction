package com.prs.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prs.business.JsonResponse;
import com.prs.business.PurchaseRequest;
import com.prs.business.PurchaseRequestLineItem;
import com.prs.business.User;
import com.prs.db.PurchaseRequestLineItemRepository;


@RestController
@RequestMapping("/purchaseRequestLineItem")
public class PurchaseRequestLineItemController {

	@Autowired
	private PurchaseRequestLineItemRepository purchaseRequestLineItemRepo;

	@GetMapping("/")
	public JsonResponse getAll() {
		JsonResponse jr = null;
		try {
			jr=JsonResponse.getInstance(purchaseRequestLineItemRepo.findAll());
		}
		catch (Exception e ) {
			jr=JsonResponse.getInstance(e);
		}
		return jr;
	}

	@GetMapping("/{id}")
	public JsonResponse get(@PathVariable int id) {
		JsonResponse jr = null;
		try {
			Optional<PurchaseRequestLineItem> u = purchaseRequestLineItemRepo.findById(id);
			if(u.isPresent())
				jr=JsonResponse.getInstance(u);
			else
				jr=JsonResponse.getInstance("No purchase request line item found for id: "+id);
		}
		catch (Exception e ) {
			jr=JsonResponse.getInstance(e);
		}
		return jr;
	}

	@PostMapping("/")
	public JsonResponse add(@RequestBody PurchaseRequestLineItem u) {
		JsonResponse jr = null;
		try {
			jr=JsonResponse.getInstance(purchaseRequestLineItemRepo.save(u));
		}
		catch (Exception e ) {
			jr=JsonResponse.getInstance(e);
		}
		return jr;
	}
	
	@PostMapping("/purchase-request-line-items")
	public JsonResponse addLineItem(@RequestBody PurchaseRequestLineItem u) {
	JsonResponse jr = null;
//	u.setStatus("new");
	try {
		jr=JsonResponse.getInstance(purchaseRequestLineItemRepo.save(u));
	}
	catch (Exception e ) {
		e.printStackTrace();
		jr=JsonResponse.getInstance(e);
	}
	return jr;
	}

	@PutMapping("/{id}")
	public JsonResponse update(@RequestBody PurchaseRequestLineItem u) {
		JsonResponse jr = null;
		//May need to enhance exception handling if more than one exception type needs to be caught
		try {
			if (purchaseRequestLineItemRepo.existsById(u.getId())) {
				jr=JsonResponse.getInstance(purchaseRequestLineItemRepo.save(u));
			}
			else {
			}
		}
		catch (Exception e ) {
			jr=JsonResponse.getInstance(e);
		}
		return jr;
	}

	@PutMapping("/purchase-request-line-items/{id}")
	public JsonResponse updateLineItem(@RequestBody PurchaseRequest u) {
		JsonResponse jr = null;
		try {
			if (purchaseRequestLineItemRepo.existsById(u.getId())) {
				jr=JsonResponse.getInstance(purchaseRequestLineItemRepo.save(u));
			}
			else {
				jr=JsonResponse.getInstance("PurchaseRequest id:  "+u.getId()+"does not exist and you are attemping to save it.");
			}
		}
		catch (Exception e ) {
			jr=JsonResponse.getInstance(e);
		}
		return jr;
	}
	
	@DeleteMapping("/{id}")
	public JsonResponse delete(@RequestBody PurchaseRequestLineItem u) {
		JsonResponse jr = null;
		//May need to enhance exception handling if more than one exception type needs to be caught
		try {
			if (purchaseRequestLineItemRepo.existsById(u.getId())) {
				purchaseRequestLineItemRepo.delete(u);
				jr=JsonResponse.getInstance("Purchase Request Line Item deleted.");
			}
			else {
				jr=JsonResponse.getInstance("PurchaseRequestLineItem id:  "+u.getId()+"does not exist and you are attemping to save it.");
			}
		}
		catch (Exception e ) {
			jr=JsonResponse.getInstance(e);
		}
		return jr;
	}
	
	@DeleteMapping("/purchase-request-line-items/{id}")
	public JsonResponse deleteLineItem(@RequestBody PurchaseRequestLineItem u) {
		JsonResponse jr = null;
		//May need to enhance exception handling if more than one exception type needs to be caught
		try {
			if (purchaseRequestLineItemRepo.existsById(u.getId())) {
				purchaseRequestLineItemRepo.delete(u);
				jr=JsonResponse.getInstance("Purchase Request deleted.");
			}
			else {
				jr=JsonResponse.getInstance("PurchaseRequest id:  "+u.getId()+"does not exist and you are attemping to save it.");
			}
		}
		catch (Exception e ) {
			jr=JsonResponse.getInstance(e);
		}
		return jr;
	}
	
//	@PostMapping("/authenticateAndReview")
//	public JsonResponse authenticateAndReview(@RequestBody User u) {
//		JsonResponse jr = null;
//		try {
//			Optional<User> user = User.findByUserNameAndPassword(u.getUserName(), u.getPassword());
//			if(user.isPresent()) {
//				jr=JsonResponse.getInstance(user);
//			}	else {
//				jr=JsonResponse.getInstance("No user name found for login id: "+u.getUserName());
//		}
//		}
//		
//		catch (Exception e ) {
//			jr=JsonResponse.getInstance(e);
//		}
//		return jr;
//		
//			
//	}
	
}
