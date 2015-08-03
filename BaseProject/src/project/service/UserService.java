package project.service;

import java.util.List;

import project.dao.UserModelDao;
import project.model.UserModel;


public class UserService {
    /**
     * Data access object assigned to UserService
     */
    private UserModelDao userModelDao = new UserModelDao();
    
    /**
     * Gets all the users in the db
     * @return list of UserModels
     */
    public List<UserModel> getAllUsers(){
        return null;
    }
    
    /**
     * Adds a user to the database
     * @param user
     *          the user to be added
     * @return whether the transaction is successful or not.
     */
    public boolean addUserModel(UserModel user){
        return true;
    }
    
    /**
     * Removes a user to the database
     * @param user
     *          the user to be removed
     * @return whether the transaction is successful or not.
     */
    public boolean removeUserModel(UserModel user){
        return true;
    }
    
    /**
     * Updates a user to the database
     * @param user
     *          the user to be updated
     * @return whether the transaction is successful or not.
     */
    public boolean updateUserModel(UserModel user){
        return true;
    }
    
    /**
     * Gets a user to the database
     * @param user
     *          the user to be updated
     * @return whether the transaction is successful or not.
     */
    public UserModel getUsermodel(UserModel user){
        return null;
    }
}
