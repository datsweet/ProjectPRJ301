package DAL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Request;

/**
 * DAO for Request entities
 * @author tungu
 */
public class RequestDAO extends BaseDAO<Request> {

    @Override
    public List<Request> getAll() {
        List<Request> requests = new ArrayList<>();
        String sql = "SELECT id, apartment_id, request_type, description, status, assigned_to, created_at FROM requests";
        
        try (ResultSet rs = executeQuery(sql)) {
            while (rs != null && rs.next()) {
                Request request = new Request();
                request.setId(rs.getInt("id"));
                request.setApartmentId(rs.getInt("apartment_id"));
                request.setRequestType(rs.getString("request_type"));
                request.setDescription(rs.getString("description"));
                request.setStatus(rs.getString("status"));
                request.setAssignedTo(rs.getInt("assigned_to"));
                request.setCreatedAt(rs.getDate("created_at"));
                requests.add(request);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RequestDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return requests;
    }

    @Override
    public Request getById(int id) {
        String sql = "SELECT id, apartment_id, request_type, description, status, assigned_to, created_at FROM requests WHERE id = ?";
        
        try (ResultSet rs = executeQuery(sql, id)) {
            if (rs != null && rs.next()) {
                Request request = new Request();
                request.setId(rs.getInt("id"));
                request.setApartmentId(rs.getInt("apartment_id"));
                request.setRequestType(rs.getString("request_type"));
                request.setDescription(rs.getString("description"));
                request.setStatus(rs.getString("status"));
                request.setAssignedTo(rs.getInt("assigned_to"));
                request.setCreatedAt(rs.getDate("created_at"));
                return request;
            }
        } catch (SQLException ex) {
            Logger.getLogger(RequestDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public List<Request> getByApartmentId(int apartmentId) {
        List<Request> requests = new ArrayList<>();
        String sql = "SELECT id, apartment_id, request_type, description, status, assigned_to, created_at FROM requests WHERE apartment_id = ?";
        
        try (ResultSet rs = executeQuery(sql, apartmentId)) {
            while (rs != null && rs.next()) {
                Request request = new Request();
                request.setId(rs.getInt("id"));
                request.setApartmentId(rs.getInt("apartment_id"));
                request.setRequestType(rs.getString("request_type"));
                request.setDescription(rs.getString("description"));
                request.setStatus(rs.getString("status"));
                request.setAssignedTo(rs.getInt("assigned_to"));
                request.setCreatedAt(rs.getDate("created_at"));
                requests.add(request);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RequestDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return requests;
    }
    
    public List<Request> getByEmployeeId(int employeeId) {
        List<Request> requests = new ArrayList<>();
        String sql = "SELECT id, apartment_id, request_type, description, status, assigned_to, created_at FROM requests WHERE assigned_to = ?";
        
        try (ResultSet rs = executeQuery(sql, employeeId)) {
            while (rs != null && rs.next()) {
                Request request = new Request();
                request.setId(rs.getInt("id"));
                request.setApartmentId(rs.getInt("apartment_id"));
                request.setRequestType(rs.getString("request_type"));
                request.setDescription(rs.getString("description"));
                request.setStatus(rs.getString("status"));
                request.setAssignedTo(rs.getInt("assigned_to"));
                request.setCreatedAt(rs.getDate("created_at"));
                requests.add(request);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RequestDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return requests;
    }

    @Override
    public int insert(Request request) {
        String sql = "INSERT INTO requests (apartment_id, request_type, description, status, assigned_to) VALUES (?, ?, ?, ?, ?)";
        return executeInsert(sql, 
                request.getApartmentId(), 
                request.getRequestType(), 
                request.getDescription(), 
                request.getStatus(), 
                request.getAssignedTo());
    }

    @Override
    public boolean update(Request request) {
        String sql = "UPDATE requests SET apartment_id = ?, request_type = ?, description = ?, status = ?, assigned_to = ? WHERE id = ?";
        return executeUpdate(sql, 
                request.getApartmentId(), 
                request.getRequestType(), 
                request.getDescription(), 
                request.getStatus(), 
                request.getAssignedTo(), 
                request.getId()) > 0;
    }
    
    public boolean updateStatus(int id, String status) {
        String sql = "UPDATE requests SET status = ? WHERE id = ?";
        return executeUpdate(sql, status, id) > 0;
    }
    
    public boolean assignRequest(int id, int employeeId) {
        String sql = "UPDATE requests SET assigned_to = ? WHERE id = ?";
        return executeUpdate(sql, employeeId, id) > 0;
    }

    @Override
    public boolean delete(int id) {
        String sql = "DELETE FROM requests WHERE id = ?";
        return executeUpdate(sql, id) > 0;
    }
}
