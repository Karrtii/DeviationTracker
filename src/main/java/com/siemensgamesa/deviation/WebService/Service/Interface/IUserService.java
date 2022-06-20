package com.siemensgamesa.deviation.WebService.Service.Interface;

import com.siemensgamesa.deviation.Model.UserModel;

public interface IUserService {
    UserModel registerUser(UserModel user);
    UserModel getUser(String userEmail);
    void addRoleToUser(String userEmail, String roleName);
    UserModel getUserFromHeader(String header);
}
