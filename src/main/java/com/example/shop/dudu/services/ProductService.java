package com.example.shop.dudu.services;

import com.example.shop.dudu.model.Product;
import com.example.shop.dudu.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
//    {
//        products.add(new Product(++ID,"Khalil Mamoon", "Их гаджеты по праву признаны одними из самых лучших и качественных. ", 6600, "USA"));
//        products.add(new Product(++ID,"FUMO", "Особенно насыщенный, густой и ароматный.", 9000, "Egypt"));
//    }
    public List<Product> listProducts(String title) {
        List<Product> products = productRepository.findAll();
        if (title != null) {
            productRepository.findByTitle(title);
        }
        return productRepository.findAll();
    }
    public void saveProducts(Product product) {
        log.info("Saving new {}", product);
        productRepository.save(product);
    }
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}