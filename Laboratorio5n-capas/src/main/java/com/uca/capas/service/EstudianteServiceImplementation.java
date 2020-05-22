package com.uca.capas.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.dao.EstudianteDao;
import com.uca.capas.domain.Estudiante;

@Service
public class EstudianteServiceImplementation implements EstudianteService {
	
	@Autowired
	EstudianteDao estudianteDAO;

	@Override
	public List<Estudiante> findAll() throws DataAccessException {
		return estudianteDAO.findAll();
	}

	@Override
	public Estudiante findOne(Integer code) throws DataAccessException {
		return estudianteDAO.findOne(code);
	}

	@Override
	@Transactional
	public void save(Estudiante estudiante) throws DataAccessException {
		estudianteDAO.save(estudiante);
		
	}

	@Override
	@Transactional
	public void delete(Integer codigoEstudiante) throws DataAccessException {
		estudianteDAO.delete(codigoEstudiante);
		
	}

}
