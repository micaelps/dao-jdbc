package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();
		
		List<Department> list  = departmentDao.findAll();
		
		
		for (Department dep : list) {
			System.out.println(dep);
		}
			
		
	}

}
