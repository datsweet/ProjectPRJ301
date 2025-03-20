package DAL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Resident;

/**
 * DAO for Resident entities
 * @author tungu
 */
public class ResidentDAO extends BaseDAO<Resident> {

    @Override
    public List<Resident> getAll() {
        List<Resident> residents = new ArrayList<>();
        String sql = "SELECT id, name, apartment_id, relationship_to_owner, created_at FROM residents";
        
        try (ResultSet rs = executeQuery(sql)) {
            while (rs != null && rs.next()) {
                Resident resident = new Resident();
                resident.setId(rs.getInt("id"));
                resident.setName(rs.getString("name"));
                resident.setApartmentId(rs.getInt("apartment_id"));
                resident.setRelationshipToOwner(rs.getString("relationship_to_owner"));
                resident.setCreatedAt(rs.getDate("created_at"));
                residents.add(resident);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ResidentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return residents;
    }

    @Override
    public Resident getById(int id) {
        String sql = "SELECT id, name, apartment_id, relationship_to_owner, created_at FROM residents WHERE id = ?";
        
        try (ResultSet rs = executeQuery(sql, id)) {
            if (rs != null && rs.next()) {
                Resident resident = new Resident();
                resident.setId(rs.getInt("id"));
                resident.setName(rs.getString("name"));
                resident.setApartmentId(rs.getInt("apartment_id"));
                resident.setRelationshipToOwner(rs.getString("relationship_to_owner"));
                resident.setCreatedAt(rs.getDate("created_at"));
                return resident;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ResidentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public List<Resident> getByApartmentId(int apartmentId) {
        List<Resident> residents = new ArrayList<>();
        String sql = "SELECT id, name, apartment_id, relationship_to_owner, created_at FROM residents WHERE apartment_id = ?";
        
        try (ResultSet rs = executeQuery(sql, apartmentId)) {
            while (rs != null && rs.next()) {
                Resident resident = new Resident();
                resident.setId(rs.getInt("id"));
                resident.setName(rs.getString("name"));
                resident.setApartmentId(rs.getInt("apartment_id"));
                resident.setRelationshipToOwner(rs.getString("relationship_to_owner"));
                resident.setCreatedAt(rs.getDate("created_at"));
                residents.add(resident);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ResidentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return residents;
    }

    @Override
    public int insert(Resident resident) {
        String sql = "INSERT INTO residents (name, apartment_id, relationship_to_owner) VALUES (?, ?, ?)";
        return executeInsert(sql, resident.getName(), resident.getApartmentId(), resident.getRelationshipToOwner());
    }

    @Override
    public boolean update(Resident resident) {
        String sql = "UPDATE residents SET name = ?, apartment_id = ?, relationship_to_owner = ? WHERE id = ?";
        return executeUpdate(sql, resident.getName(), resident.getApartmentId(), resident.getRelationshipToOwner(), resident.getId()) > 0;
    }

    @Override
    public boolean delete(int id) {
        String sql = "DELETE FROM residents WHERE id = ?";
        return executeUpdate(sql, id) > 0;
    }
}
