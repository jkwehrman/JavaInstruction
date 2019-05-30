package com.mma.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mma.business.Invoice;
import com.mma.business.JsonResponse;
import com.mma.business.Product;
import com.mma.db.InvoiceRepository;
import com.mma.db.ProductRepository;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

	@Autowired
	private InvoiceRepository invoiceRepo;	
	
	@GetMapping("/")
	public JsonResponse getAll() {
		JsonResponse jr = null;
		try {
			jr=JsonResponse.getInstance(invoiceRepo.findAll());
		}
		catch (Exception e ) {
			jr=JsonResponse.getInstance(e);
		}
		return jr;
	}
	
	@PostMapping("/")
	public JsonResponse add(@RequestBody Invoice i) {
		JsonResponse jr = null;
		//May need to enhance exception handling if more than one exception type needs to be caught
		try {
			jr=JsonResponse.getInstance(invoiceRepo.save(i));
		}
		catch (Exception e ) {
			jr=JsonResponse.getInstance(e);
		}
		return jr;
	}
	
	@PutMapping("/")
	public JsonResponse update(@RequestBody Invoice i) {
		JsonResponse jr = null;
		//May need to enhance exception handling if more than one exception type needs to be caught
		try {
			if (invoiceRepo.existsById(i.getId())) {
				jr=JsonResponse.getInstance(invoiceRepo.save(i));
			}
			else {
				jr=JsonResponse.getInstance("Invoice id:  "+i.getId()+"does not exist and you are attemping to save it.");
			}
		}
		catch (Exception e ) {
			jr=JsonResponse.getInstance(e);
		}
		return jr;
	}
	
	
	@DeleteMapping("/")
	public JsonResponse delete(@RequestBody Invoice i) {
		JsonResponse jr = null;
		//May need to enhance exception handling if more than one exception type needs to be caught
		try {
			if (invoiceRepo.existsById(i.getId())) {
				invoiceRepo.delete(i);
				jr=JsonResponse.getInstance("Invoice deleted.");
			}
			else {
				jr=JsonResponse.getInstance("Invoice id:  "+i.getId()+"does not exist and you are attemping to save it.");
			}
		}
		catch (Exception e ) {
			jr=JsonResponse.getInstance(e);
		}
		return jr;
	}	
	
	
	
		}
		
		
