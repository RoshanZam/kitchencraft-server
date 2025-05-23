package com.example.kitchencraft.services;

import com.example.kitchencraft.models.OrderItem;
import com.example.kitchencraft.repositories.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository OrderItemRepository;

    public List<OrderItem> getAllOrderItems() {
        return OrderItemRepository.findAll();
    }

    public OrderItem getOrderItemById(Long id) {
        return OrderItemRepository.findById(id).orElse(null);
    }

    public OrderItem saveOrderItem(OrderItem OrderItem) {
        return OrderItemRepository.save(OrderItem);
    }

    public void deleteOrderItem(Long id) {
        OrderItemRepository.deleteById(id);
    }
}
