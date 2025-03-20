package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Generic base DAO class that provides common CRUD operations
 * @author tungu
 * @param <T> The entity type
 */
public abstract class BaseDAO<T> extends DBContext {
    
    /**
     * Get all entities of type T
     * @return List of all entities
     */
    public abstract List<T> getAll();
    
    /**
     * Get entity by ID
     * @param id The ID of the entity
     * @return The entity or null if not found
     */
    public abstract T getById(int id);
    
    /**
     * Insert a new entity
     * @param entity The entity to insert
     * @return The ID of the inserted entity or -1 if failed
     */
    public abstract int insert(T entity);
    
    /**
     * Update an existing entity
     * @param entity The entity to update
     * @return true if successful, false otherwise
     */
    public abstract boolean update(T entity);
    
    /**
     * Delete an entity by ID
     * @param id The ID of the entity to delete
     * @return true if successful, false otherwise
     */
    public abstract boolean delete(int id);
    
    /**
     * Helper method to execute a query and return a result set
     * @param sql The SQL query
     * @param params Parameters for the query
     * @return ResultSet from the query
     */
    protected ResultSet executeQuery(String sql, Object... params) {
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                statement.setObject(i + 1, params[i]);
            }
            return statement.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    /**
     * Helper method to execute an update and return the number of affected rows
     * @param sql The SQL query
     * @param params Parameters for the query
     * @return Number of affected rows or -1 if failed
     */
    protected int executeUpdate(String sql, Object... params) {
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                statement.setObject(i + 1, params[i]);
            }
            return statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    
    /**
     * Helper method to execute an insert and return the generated ID
     * @param sql The SQL query
     * @param params Parameters for the query
     * @return Generated ID or -1 if failed
     */
    protected int executeInsert(String sql, Object... params) {
        try {
            PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            for (int i = 0; i < params.length; i++) {
                statement.setObject(i + 1, params[i]);
            }
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
}
