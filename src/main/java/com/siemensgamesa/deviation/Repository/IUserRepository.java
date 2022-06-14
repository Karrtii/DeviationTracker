package com.siemensgamesa.deviation.Repository;

import com.siemensgamesa.deviation.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IUserRepository extends JpaRepository<UserModel, Long> {

    UserModel findByUserEmail(String userEmail);
}
