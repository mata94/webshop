package com.example.mobileshop.repository;

import com.example.mobileshop.models.Cart;
import com.example.mobileshop.models.Product;
import com.example.mobileshop.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long> {

    @Query("SELECT c FROM Cart c INNER JOIN c.user u WHERE u.id =:userId")
    public List<Cart> findAllUserCarts(Long userId);

    @Query("SELECT c FROM Cart c INNER JOIN c.user u INNER JOIN c.product p WHERE u = :user AND p = :product")
    public Cart findCartByUserAndProduct(@Param("user") User user, @Param("product") Product product);

}
