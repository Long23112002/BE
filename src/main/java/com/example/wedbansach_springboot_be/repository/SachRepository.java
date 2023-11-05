package com.example.wedbansach_springboot_be.repository;
import com.example.wedbansach_springboot_be.entity.Sach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource(path = "sach")
public interface SachRepository extends JpaRepository<Sach, Integer> {
}