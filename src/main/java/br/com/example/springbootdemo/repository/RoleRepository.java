package br.com.example.springbootdemo.repository;

import br.com.example.springbootdemo.model.Role;
import br.com.example.springbootdemo.model.RoleNameEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleNameEnum roleName);
}
