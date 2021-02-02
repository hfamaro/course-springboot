package br.com.technos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.technos.course.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
