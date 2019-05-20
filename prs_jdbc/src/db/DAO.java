//This is cut and pasted code
package db;

import java.util.List;

import business.User;

// use T for generic- means type
public interface DAO<T> {
	
	T get(String user);
	List<T> getAll();  //get list of all products
	boolean add(T t);  //T - type, t - variableName
	boolean update(T t);
	boolean delete (int user);
	boolean delete(T t);	
}
