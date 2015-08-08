package project.dao;

import java.util.List;

import org.slim3.datastore.DaoBase;
import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Transaction;

import project.meta.TodoModelMeta;
import project.model.TodoModel;
import project.model.UserModel;

public class UserModelDao extends DaoBase<UserModel>{
    Datastore db;
    
    
    /**
     * Adds a user to the database
     * @param user
     *          the user to be added
     * @return whether the transaction is successful or not.
     */
    public boolean addUserModel(UserModel user){
        boolean ok = false;
        Transaction trans = Datastore.beginTransaction();
        Key key = Datastore.createKey(TodoModel.class, user.getName());
        user.setKey(key);
        Datastore.put(user);
        trans.commit();
        ok = true;
        return ok;
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
    public boolean updateUserModel(UserModel user){
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
    public String getUsermodel(UserModel user){
        String json = null;
        TodoModel model= null;
        model = Datastore.get(TodoModel.class, Datastore.createKey("User", user.getName()));
        TodoModelMeta tm = new TodoModelMeta();
        json = tm.modelToJson(model);
        return json;
    }
}
