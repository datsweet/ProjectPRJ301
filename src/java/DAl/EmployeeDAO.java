package DAL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Employee;

/**
 * DAO for Employee entities
 * @author tungu
 */
public class EmployeeDAO extends BaseDAO<Employee> {

    @Override
    public List<Employee> getAll() {
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT id, user_id, name, email, phone, position, created_at, updated_at FROM employees";
        
        try (ResultSet rs = executeQuery(sql)) {
            while (rs != null && rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getInt("id"));
                employee.setUserId(rs.getInt("user_id"));
                employee.setName(rs.getString("name"));
                employee.setEmail(rs.getString("email"));
                employee.setPhone(rs.getString("phone"));
                employee.setPosition(rs.getString("position"));
                employee.setCreatedAt(rs.getDate("created_at"));
                employee.setUpdatedAt(rs.getDate("updated_at"));
                employees.add(employee);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return employees;
    }

    @Override
    public Employee getById(int id) {
        String sql = "SELECT id, user_id, name, email, phone, position, created_at, updated_at FROM employees WHERE id = ?";
        
        try (ResultSet rs = executeQuery(sql, id)) {
            if (rs != null && rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getInt("id"));
                employee.setUserId(rs.getInt("user_id"));
                employee.setName(rs.getString("name"));
                employee.setEmail(rs.getString("email"));
                employee.setPhone(rs.getString("phone"));
                employee.setPosition(rs.getString("position"));
                employee.setCreatedAt(rs.getDate("created_at"));
                employee.setUpdatedAt(rs.getDate("updated_at"));
                return employee;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public Employee getByUserId(int userId) {
        String sql = "SELECT id, user_id, name, email, phone, position, created_at, updated_at FROM employees WHERE user_id = ?";
        
        try (ResultSet rs = executeQuery(sql, userId)) {
            if (rs != null && rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getInt("id"));
                employee.setUserId(rs.getInt("user_id"));
                employee.setName(rs.getString("name"));
                employee.setEmail(rs.getString("email"));
                employee.setPhone(rs.getString("phone"));
                employee.setPosition(rs.getString("position"));
                employee.setCreatedAt(rs.getDate("created_at"));
                employee.setUpdatedAt(rs.getDate("updated_at"));
                return employee;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public List<Employee> getByPosition(String position) {
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT id, user_id, name, email, phone, position, created_at, updated_at FROM employees WHERE position = ?";
        
        try (ResultSet rs = executeQuery(sql, position)) {
            while (rs != null && rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getInt("id"));
                employee.setUserId(rs.getInt("user_id"));
                employee.setName(rs.getString("name"));
                employee.setEmail(rs.getString("email"));
                employee.setPhone(rs.getString("phone"));
                employee.setPosition(rs.getString("position"));
                employee.setCreatedAt(rs.getDate("created_at"));
                employee.setUpdatedAt(rs.getDate("updated_at"));
                employees.add(employee);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return employees;
    }

    @Override
    public int insert(Employee employee) {
        String sql = "INSERT INTO employees (user_id, name, email, phone, position) VALUES (?, ?, ?, ?, ?)";
        return executeInsert(sql, 
                employee.getUserId(), 
                employee.getName(), 
                employee.getEmail(), 
                employee.getPhone(), 
                employee.getPosition());
    }

    @Override
    public boolean update(Employee employee) {
        String sql = "UPDATE employees SET user_id = ?, name = ?, email = ?, phone = ?, position = ?, updated_at = GETDATE() WHERE id = ?";
        return executeUpdate(sql, 
                employee.getUserId(), 
                employee.getName(), 
                employee.getEmail(), 
                employee.getPhone(), 
                employee.getPosition(), 
                employee.getId()) > 0;
    }

    @Override
    public boolean delete(int id) {
        String sql = "DELETE FROM employees WHERE id = ?";
        return executeUpdate(sql, id) > 0;
    }
}
