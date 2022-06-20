package com.siemensgamesa.deviation.WebService.Service.Interface;

import com.siemensgamesa.deviation.Model.UserModel;

public interface IUserService {
    void registerUser(UserModel user);
    UserModel getUser(String userEmail);
    UserModel getUserFromHeader(String header);
}
