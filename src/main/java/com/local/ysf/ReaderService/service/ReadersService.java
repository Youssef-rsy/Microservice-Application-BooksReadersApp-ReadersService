package com.local.ysf.ReaderService.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.local.ysf.ReaderService.Entity.Reader;
@Service
public interface ReadersService {

	public void saveReader(Reader reader);
	public Reader getReader(UUID readerId);
	public List<Reader> getAllReader();
	public void deleteReader(UUID readerId);
	public Reader updateReader(UUID readerId, Reader reader);
}
