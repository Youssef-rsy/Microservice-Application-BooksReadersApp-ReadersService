package com.local.ysf.ReaderService.infrastructure;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.local.ysf.ReaderService.Entity.Reader;

@Repository
@Transactional
public interface ReaderRepository extends JpaRepository<Reader, UUID> {

}
