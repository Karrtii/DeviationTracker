package com.siemensgamesa.deviation.Repository;

import com.siemensgamesa.deviation.Model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRoleRepository extends JpaRepository<UserRole, Long> {

    UserRole findByRoleName(String roleName);
}
