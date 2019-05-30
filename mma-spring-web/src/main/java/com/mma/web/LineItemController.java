package com.mma.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mma.business.JsonResponse;
import com.mma.business.LineItem;
import com.mma.business.Product;
import com.mma.db.LineItemRepository;
import com.mma.db.ProductRepository;

@RestController
@RequestMapping("/lineItem")
public class LineItemController {

	@Autowired
	private LineItemRepository lineItemRepo;
	
	@GetMapping("/")
	public JsonResponse getAll() {
		JsonResponse jr = null;
		try {
			jr=JsonResponse.getInstance(lineItemRepo.findAll());
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
			Optional<LineItem> l = lineItemRepo.findById(id);
					if(l.isPresent())
			jr=JsonResponse.getInstance(l);
					else
						jr=JsonResponse.getInstance("No product found for id: "+id);
		}
		catch (Exception e ) {
			jr=JsonResponse.getInstance(e);
		}
		return jr;
	}
	
	@PostMapping("/")
	public JsonResponse add(@RequestBody LineItem l) {
		JsonResponse jr = null;
		//May need to enhance exception handling if more than one exception type needs to be caught
		try {
			jr=JsonResponse.getInstance(lineItemRepo.save(l));
		}
		catch (Exception e ) {
			jr=JsonResponse.getInstance(e);
		}
		return jr;
	}
		
	@PutMapping("/")
	public JsonResponse update(@RequestBody LineItem l) {
		JsonResponse jr = null;
		//May need to enhance exception handling if more than one exception type needs to be caught
		try {
			if (lineItemRepo.existsById(l.getId())) {
				jr=JsonResponse.getInstance(lineItemRepo.save(l));
			}
			else {
				jr=JsonResponse.getInstance("LineItem id:  "+l.getId()+"does not exist and you are attemping to save it.");
			}
		}
		catch (Exception e ) {
			jr=JsonResponse.getInstance(e);
		}
		return jr;
	}
	
	@DeleteMapping("/")
	public JsonResponse delete(@RequestBody LineItem l) {
		JsonResponse jr = null;
		//May need to enhance exception handling if more than one exception type needs to be caught
		try {
			if (lineItemRepo.existsById(l.getId())) {
				lineItemRepo.delete(l);
				jr=JsonResponse.getInstance("Product deleted.");
			}
			else {
				jr=JsonResponse.getInstance("Product id:  "+l.getId()+"does not exist and you are attemping to save it.");
			}
		}
		catch (Exception e ) {
			jr=JsonResponse.getInstance(e);
		}
		return jr;
	}
	}
