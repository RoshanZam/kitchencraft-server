package com.example.kitchencraft.controllers;

import com.example.kitchencraft.models.CartItem;
import com.example.kitchencraft.services.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cartitems")
@CrossOrigin("*")
public class CartItemController {

    @Autowired
    private CartItemService cartItemService;

    @GetMapping
    public List<CartItem> getAll() {
        return cartItemService.getAllCartItems();
    }

    @GetMapping("/user/{userId}")
    public List<CartItem> getByUser(@PathVariable Long userId) {
        return cartItemService.getCartItemsByUserId(userId);
    }

    @PostMapping
    public CartItem addCartItem(@RequestBody CartItem cartItem) {
        return cartItemService.saveCartItem(cartItem);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        cartItemService.deleteCartItem(id);
    }
}
