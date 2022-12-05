package Services;

import User.IUser;

import java.util.ArrayList;

public interface IFormHandler {
    public void GetInformation(IUser user);
    public void PrintForm();
    public void FormUser(ArrayList<String> Form, IUser user);
}
