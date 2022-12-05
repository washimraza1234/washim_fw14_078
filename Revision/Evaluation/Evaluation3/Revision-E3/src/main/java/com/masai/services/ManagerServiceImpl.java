package com.masai.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entities.Employee;
import com.masai.entities.Manager;
import com.masai.exceptions.ManagerException;
import com.masai.repository.ManagerRepo;

@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private ManagerRepo managerDao;

	@Override
	public Employee findEmployeeReportingManager(Integer id) throws ManagerException {
		Optional<Manager> opt = managerDao.findById(id);

		if (opt.isPresent()) {

			Manager manager = opt.get();

			return manager.getEmployee();
		}

		else
			throw new ManagerException("No employee for manager ID: "+id);
	}

}
