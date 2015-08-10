package project.service;

import java.util.List;

import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Transaction;

import project.dao.UserModelDao;
import project.dto.UserDto;
import project.meta.TodoModelMeta;
import project.meta.UserModelMeta;
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
    public boolean removeUserModel(Key key){
        boolean ok = false;
        Transaction trans = Datastore.beginTransaction();
        Datastore.delete(key);
        trans.commit();
        ok = true;
        return ok;
    }
    
    /**
     * Updates a user to the database
     * @param user
     *          the user to be updated
     * @return whether the transaction is successful or not.
     */
    public boolean updateUserModel(UserDto user){
        boolean ok = false;
        Transaction trans = Datastore.beginTransaction();
        Datastore.put(user);
        trans.commit();
        ok = true;
        return ok;
    }
    
    /**
     * Gets a user to the database
     * @param user
     *          the user to be updated
     * @return whether the transaction is successful or not.
     */
    public UserDto getUsermodel(UserDto user){
      //String json = null;
        UserDto dto= null;
        dto = Datastore.get(UserDto.class, Datastore.createKey("Users", user.getName()));
        //UserModelMeta tm = new UserModelMeta();
        //json = tm.modelToJson(model);
        return dto;
    }
}
