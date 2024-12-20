package org.example.billingservice.entities;

import jakarta.persistence.*;
import lombok.*;
import org.example.billingservice.model.Product;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ProductItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    private long productId;
    @ManyToOne
    private Bill bill;
    private int quantity;
    private double unitPrice;
    @Transient
    private Product product;
}
