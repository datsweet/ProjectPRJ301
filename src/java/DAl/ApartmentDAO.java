package DAL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Apartment;

/**
 * DAO for Apartment entities
 * @author tungu
 */
public class ApartmentDAO extends BaseDAO<Apartment> {

    @Override
    public List<Apartment> getAll() {
        List<Apartment> apartments = new ArrayList<>();
        String sql = "SELECT id, apartment_number, building_name, floor_number, street_address, district, city FROM apartments";
        
        try (ResultSet rs = executeQuery(sql)) {
            while (rs != null && rs.next()) {
                Apartment apartment = new Apartment();
                apartment.setId(rs.getInt("id"));
                apartment.setApartmentNumber(rs.getString("apartment_number"));
                apartment.setBuildingName(rs.getString("building_name"));
                apartment.setFloorNumber(rs.getInt("floor_number"));
                apartment.setStreetAddress(rs.getString("street_address"));
                apartment.setDistrict(rs.getString("district"));
                apartment.setCity(rs.getString("city"));
                apartments.add(apartment);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ApartmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return apartments;
    }

    @Override
    public Apartment getById(int id) {
        String sql = "SELECT id, apartment_number, building_name, floor_number, street_address, district, city FROM apartments WHERE id = ?";
        
        try (ResultSet rs = executeQuery(sql, id)) {
            if (rs != null && rs.next()) {
                Apartment apartment = new Apartment();
                apartment.setId(rs.getInt("id"));
                apartment.setApartmentNumber(rs.getString("apartment_number"));
                apartment.setBuildingName(rs.getString("building_name"));
                apartment.setFloorNumber(rs.getInt("floor_number"));
                apartment.setStreetAddress(rs.getString("street_address"));
                apartment.setDistrict(rs.getString("district"));
                apartment.setCity(rs.getString("city"));
                return apartment;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ApartmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public List<Apartment> getByUserId(int userId) {
        List<Apartment> apartments = new ArrayList<>();
        String sql = "SELECT a.id, a.apartment_number, a.building_name, a.floor_number, a.street_address, a.district, a.city " +
                    "FROM apartments a INNER JOIN apartment_users au ON a.id = au.apartment_id " +
                    "WHERE au.user_id = ?";
        
        try (ResultSet rs = executeQuery(sql, userId)) {
            while (rs != null && rs.next()) {
                Apartment apartment = new Apartment();
                apartment.setId(rs.getInt("id"));
                apartment.setApartmentNumber(rs.getString("apartment_number"));
                apartment.setBuildingName(rs.getString("building_name"));
                apartment.setFloorNumber(rs.getInt("floor_number"));
                apartment.setStreetAddress(rs.getString("street_address"));
                apartment.setDistrict(rs.getString("district"));
                apartment.setCity(rs.getString("city"));
                apartments.add(apartment);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ApartmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return apartments;
    }

    @Override
    public int insert(Apartment apartment) {
        String sql = "INSERT INTO apartments (apartment_number, building_name, floor_number, street_address, district, city) VALUES (?, ?, ?, ?, ?, ?)";
        return executeInsert(sql, 
                apartment.getApartmentNumber(), 
                apartment.getBuildingName(), 
                apartment.getFloorNumber(), 
                apartment.getStreetAddress(), 
                apartment.getDistrict(), 
                apartment.getCity());
    }

    @Override
    public boolean update(Apartment apartment) {
        String sql = "UPDATE apartments SET apartment_number = ?, building_name = ?, floor_number = ?, street_address = ?, district = ?, city = ? WHERE id = ?";
        return executeUpdate(sql, 
                apartment.getApartmentNumber(), 
                apartment.getBuildingName(), 
                apartment.getFloorNumber(), 
                apartment.getStreetAddress(), 
                apartment.getDistrict(), 
                apartment.getCity(), 
                apartment.getId()) > 0;
    }

    @Override
    public boolean delete(int id) {
        String sql = "DELETE FROM apartments WHERE id = ?";
        return executeUpdate(sql, id) > 0;
    }
}
