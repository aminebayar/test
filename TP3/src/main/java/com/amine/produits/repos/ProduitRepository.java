package com.amine.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amine.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
