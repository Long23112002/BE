package com.example.wedbansach_springboot_be.repository;

import com.example.wedbansach_springboot_be.entity.SachYeuThich;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SachYeuThichRepository extends JpaRepository<SachYeuThich, Integer> {
}