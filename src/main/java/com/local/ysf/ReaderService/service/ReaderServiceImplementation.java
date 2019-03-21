package com.local.ysf.ReaderService.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.local.ysf.ReaderService.Entity.Reader;
import com.local.ysf.ReaderService.infrastructure.ReaderRepository;
@Service
public class ReaderServiceImplementation implements ReadersService {

	@Autowired
	private ReaderRepository readerRepository;
	
	
	@Override
	public void saveReader(Reader reader) {
		readerRepository.save(reader);
	}

	@Override
	public Reader getReader(UUID readerId) {
		Optional<Reader> reader = readerRepository.findById(readerId);
		if(reader.isPresent())
			return reader.get();
		return null;
	}

	@Override
	public List<Reader> getAllReader() {
		return readerRepository.findAll();
	}

	@Override
	public void deleteReader(UUID readerId) {
		readerRepository.deleteById(readerId);

	}

	@Override
	public Reader updateReader(UUID readerId, Reader reader) {
		Reader updatedReader = getReader(readerId);
		updatedReader.setFirstName(reader.getFirstName());
		updatedReader.setLastName(reader.getLastName());
		updatedReader.setListOfBook(reader.getListOfBook());
		return updatedReader;
	}

}
