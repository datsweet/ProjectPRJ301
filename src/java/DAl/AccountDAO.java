package DAL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.User;

/**
 * DAO for User accounts
 * @author tungu
 */
public class AccountDAO extends BaseDAO<User> {

    @Override
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        String sql = "SELECT id, username, password_hash, email, role_id, created_at FROM users";
        
        try (ResultSet rs = executeQuery(sql)) {
            while (rs != null && rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPasswordHash(rs.getString("password_hash"));
                user.setEmail(rs.getString("email"));
                user.setRoleId(rs.getInt("role_id"));
                user.setCreatedAt(rs.getDate("created_at"));
                users.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return users;
    }

    @Override
    public User getById(int id) {
        String sql = "SELECT id, username, password_hash, email, role_id, created_at FROM users WHERE id = ?";
        
        try (ResultSet rs = executeQuery(sql, id)) {
            if (rs != null && rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPasswordHash(rs.getString("password_hash"));
                user.setEmail(rs.getString("email"));
                user.setRoleId(rs.getInt("role_id"));
                user.setCreatedAt(rs.getDate("created_at"));
                return user;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public User getByUsername(String username) {
        String sql = "SELECT id, username, password_hash, email, role_id, created_at FROM users WHERE username = ?";
        
        try (ResultSet rs = executeQuery(sql, username)) {
            if (rs != null && rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPasswordHash(rs.getString("password_hash"));
                user.setEmail(rs.getString("email"));
                user.setRoleId(rs.getInt("role_id"));
                user.setCreatedAt(rs.getDate("created_at"));
                return user;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    @Override
    public int insert(User user) {
        String sql = "INSERT INTO users (username, password_hash, email, role_id) VALUES (?, ?, ?, ?)";
        return executeInsert(sql, user.getUsername(), user.getPasswordHash(), user.getEmail(), user.getRoleId());
    }

    @Override
    public boolean update(User user) {
        String sql = "UPDATE users SET username = ?, password_hash = ?, email = ?, role_id = ? WHERE id = ?";
        return executeUpdate(sql, user.getUsername(), user.getPasswordHash(), user.getEmail(), user.getRoleId(), user.getId()) > 0;
    }

    @Override
    public boolean delete(int id) {
        String sql = "DELETE FROM users WHERE id = ?";
        return executeUpdate(sql, id) > 0;
    }
    
    public boolean authenticate(String username, String passwordHash) {
        String sql = "SELECT id FROM users WHERE username = ? AND password_hash = ?";
        
        try (ResultSet rs = executeQuery(sql, username, passwordHash)) {
            return rs != null && rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
