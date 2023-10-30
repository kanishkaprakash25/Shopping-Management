package com.MyApp.CRUD.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.MyApp.CRUD.Entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

	@Query("SELECT p FROM Product p WHERE p.name= :name ORDER BY p.name ASC")
	public List<Product> getByName(@Param("name")String name);
	
	@Query("SELECT p FROM Product p WHERE p.type= :type ORDER BY p.name ASC")
	public List<Product> getByType(@Param("type")String type);
	

	@Query("SELECT p FROM Product p WHERE p.cost<= :maxCost ORDER BY p.cost ASC")
	public List<Product> getByCostMax(@Param("maxCost")int maxCost);

	@Query("SELECT p FROM Product p WHERE p.cost>= :minCost ORDER BY p.cost ASC")
	public List<Product> getByCostMin(@Param("minCost")int minCost);
	
	@Query("SELECT p FROM Product p WHERE p.cost >=:minCost AND p.cost<=:maxCost ORDER BY p.cost ASC")
	public List<Product> getByCostRange(@Param("minCost") int minCost,@Param("maxCost") int maxCost);
}
