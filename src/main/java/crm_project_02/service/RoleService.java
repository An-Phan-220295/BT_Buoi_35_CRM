package crm_project_02.service;

import crm_project_02.repository.RoleRepository;

public class RoleService {
	private RoleRepository roleRepository = new RoleRepository();
	
	public boolean addRole(String name, String desc) {
		int count = roleRepository.insert(name, desc);
		return count>0;
	}
}
