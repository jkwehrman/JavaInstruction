//
package db;

import java.util.List;

// use T for generic- means type
public interface DAO<T> {
	
	T get(int Id);
	List<T> getAll();  //get list of all products
	boolean add(T t);  //T - type, t - variableName
	boolean update(T t);
	boolean delete (T t);

	
}
 