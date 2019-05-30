package com.prs.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.prs.business.User;
import com.prs.business.JsonResponse;
import com.prs.business.User;
import com.prs.db.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepo;

	@GetMapping("/")
	public JsonResponse getAll() {
		JsonResponse jr = null;
		try {
			jr=JsonResponse.getInstance(userRepo.findAll());
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
			Optional<User> u = userRepo.findById(id);
			if(u.isPresent())
				jr=JsonResponse.getInstance(u);
			else
				jr=JsonResponse.getInstance("No product found for id: "+id);
		}
		catch (Exception e ) {
			jr=JsonResponse.getInstance(e);
		}
		return jr;
	}
	////	// /////////////////////////////////////////////////////////////////////////

	@GetMapping("/userName")
	public JsonResponse getByUserName(@RequestParam ("userName") String userName) {
		JsonResponse jr = null;
		try {
			Optional<User> u = userRepo.findByUserName(userName);

			if(u.isPresent())
				jr=JsonResponse.getInstance(u);
			else
				jr=JsonResponse.getInstance("No product found for code: "+userName);
		}
		catch (Exception e ) {
			jr=JsonResponse.getInstance(e);
		}
		return jr;

		//change to use for get from code='java'
	}
	//// ------------------------------------------------------------------------------------------------------------------
		@GetMapping("/login")
		public JsonResponse getLogin(@RequestParam ("userName") String userName, @RequestParam ("password")String password) {
			JsonResponse jr = null;
			try {
				Optional<User> u = userRepo.findByUserNameAndPassword(userName, password);
	
				if(u.isPresent())
					jr=JsonResponse.getInstance(u);
				else jr=JsonResponse.getInstance("No product found for login id: "+userName);
			}
			catch (Exception e ) {
				jr=JsonResponse.getInstance(e);
			}
			return jr;
	
			//change to use for get from code='java'
		}
	
			 
		@PostMapping("/")
		public JsonResponse add(@RequestBody User u) {
			JsonResponse jr = null;
			//May need to enhance exception handling if more than one exception type needs to be caught
			try {
				jr=JsonResponse.getInstance(userRepo.save(u));
			}
			catch (Exception e ) {
				jr=JsonResponse.getInstance(e);
			}
			return jr;
		}
	
		@PutMapping("/{id}")
		public JsonResponse update(@RequestBody User u) {
			JsonResponse jr = null;
			//May need to enhance exception handling if more than one exception type needs to be caught
			try {
				if (userRepo.existsById(u.getId())) {
					jr=JsonResponse.getInstance(userRepo.save(u));
				}
				else {
					jr=JsonResponse.getInstance("Product id:  "+u.getId()+"does not exist and you are attemping to save it.");
				}
			}
			catch (Exception e ) {
				jr=JsonResponse.getInstance(e);
			}
			return jr;
		}
	
		@DeleteMapping("/{id}")
		public JsonResponse delete(@RequestBody User u) {
			JsonResponse jr = null;
			//May need to enhance exception handling if more than one exception type needs to be caught
			try {
				if (userRepo.existsById(u.getId())) {
					userRepo.delete(u);
					jr=JsonResponse.getInstance("Product deleted.");
				}
				else {
					jr=JsonResponse.getInstance("Product id:  "+u.getId()+"does not exist and you are attemping to save it.");
				}
			}
			catch (Exception e ) {
				jr=JsonResponse.getInstance(e);
			}
			return jr;
		}
}






