package br.com.technos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.technos.course.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
