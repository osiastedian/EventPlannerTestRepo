package project.service;

import java.util.List;

import project.dao.UserModelDao;
import project.dto.UserDto;
import project.model.TodoModel;
import project.model.UserModel;


public class UserService {
    /**
     * Data access object assigned to UserService
     */
    private UserModelDao userModelDao = new UserModelDao();
    
    
    
    /**
     * Adds a user to the database
     * @param user
     *          the user to be added
     * @return whether the transaction is successful or not.
     */
    public boolean addUserModel(UserDto user){
        UserModel model = new UserModel();
        model.setKey(user.getKey());
        model.setAddress(user.getAddress());
        model.setAge(user.getAge());
        model.setBirthday(user.getBirthday());
        model.setEmail(user.getEmail());
        //model.set
        return true;
        
    }
    
    /**
     * Removes a user to the database
     * @param user
     *          the user to be removed
     * @return whether the transaction is successful or not.
     */
    public boolean removeUserModel(UserDto user){
        return true;
    }
    
    /**
     * Updates a user to the database
     * @param user
     *          the user to be updated
     * @return whether the transaction is successful or not.
     */
    public boolean updateUserModel(UserDto user){
        return true;
    }
    
    /**
     * Gets a user to the database
     * @param user
     *          the user to be updated
     * @return whether the transaction is successful or not.
     */
    public String getUsermodel(UserDto user){
        return null;
    }
}
