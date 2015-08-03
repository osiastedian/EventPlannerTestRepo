package project.dao;

import java.util.List;

import org.slim3.datastore.DaoBase;
import org.slim3.datastore.Datastore;

import project.model.UserModel;

public class UserModelDao extends DaoBase<UserModel>{
    Datastore db;
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
