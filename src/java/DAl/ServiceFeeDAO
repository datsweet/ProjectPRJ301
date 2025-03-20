package DAL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.ServiceFee;

/**
 * DAO for ServiceFee entities
 * @author tungu
 */
public class ServiceFeeDAO extends BaseDAO<ServiceFee> {

    @Override
    public List<ServiceFee> getAll() {
        List<ServiceFee> fees = new ArrayList<>();
        String sql = "SELECT id, apartment_id, month, water_fee, parking_fee, service_fee, total_fee, created_at, updated_at FROM service_fees";
        
        try (ResultSet rs = executeQuery(sql)) {
            while (rs != null && rs.next()) {
                ServiceFee fee = new ServiceFee();
                fee.setId(rs.getInt("id"));
                fee.setApartmentId(rs.getInt("apartment_id"));
                fee.setMonth(rs.getDate("month"));
                fee.setWaterFee(rs.getDouble("water_fee"));
                fee.setParkingFee(rs.getDouble("parking_fee"));
                fee.setServiceFee(rs.getDouble("service_fee"));
                fee.setTotalFee(rs.getDouble("total_fee"));
                fee.setCreatedAt(rs.getDate("created_at"));
                fee.setUpdatedAt(rs.getDate("updated_at"));
                fees.add(fee);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServiceFeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return fees;
    }

    @Override
    public ServiceFee getById(int id) {
        String sql = "SELECT id, apartment_id, month, water_fee, parking_fee, service_fee, total_fee, created_at, updated_at FROM service_fees WHERE id = ?";
        
        try (ResultSet rs = executeQuery(sql, id)) {
            if (rs != null && rs.next()) {
                ServiceFee fee = new ServiceFee();
                fee.setId(rs.getInt("id"));
                fee.setApartmentId(rs.getInt("apartment_id"));
                fee.setMonth(rs.getDate("month"));
                fee.setWaterFee(rs.getDouble("water_fee"));
                fee.setParkingFee(rs.getDouble("parking_fee"));
                fee.setServiceFee(rs.getDouble("service_fee"));
                fee.setTotalFee(rs.getDouble("total_fee"));
                fee.setCreatedAt(rs.getDate("created_at"));
                fee.setUpdatedAt(rs.getDate("updated_at"));
                return fee;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServiceFeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public List<ServiceFee> getByApartmentId(int apartmentId) {
        List<ServiceFee> fees = new ArrayList<>();
        String sql = "SELECT id, apartment_id, month, water_fee, parking_fee, service_fee, total_fee, created_at, updated_at FROM service_fees WHERE apartment_id = ?";
        
        try (ResultSet rs = executeQuery(sql, apartmentId)) {
            while (rs != null && rs.next()) {
                ServiceFee fee = new ServiceFee();
                fee.setId(rs.getInt("id"));
                fee.setApartmentId(rs.getInt("apartment_id"));
                fee.setMonth(rs.getDate("month"));
                fee.setWaterFee(rs.getDouble("water_fee"));
                fee.setParkingFee(rs.getDouble("parking_fee"));
                fee.setServiceFee(rs.getDouble("service_fee"));
                fee.setTotalFee(rs.getDouble("total_fee"));
                fee.setCreatedAt(rs.getDate("created_at"));
                fee.setUpdatedAt(rs.getDate("updated_at"));
                fees.add(fee);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServiceFeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return fees;
    }
    
    public ServiceFee getByApartmentIdAndMonth(int apartmentId, Date month) {
        String sql = "SELECT id, apartment_id, month, water_fee, parking_fee, service_fee, total_fee, created_at, updated_at " +
                    "FROM service_fees WHERE apartment_id = ? AND YEAR(month) = YEAR(?) AND MONTH(month) = MONTH(?)";
        
        try (ResultSet rs = executeQuery(sql, apartmentId, month, month)) {
            if (rs != null && rs.next()) {
                ServiceFee fee = new ServiceFee();
                fee.setId(rs.getInt("id"));
                fee.setApartmentId(rs.getInt("apartment_id"));
                fee.setMonth(rs.getDate("month"));
                fee.setWaterFee(rs.getDouble("water_fee"));
                fee.setParkingFee(rs.getDouble("parking_fee"));
                fee.setServiceFee(rs.getDouble("service_fee"));
                fee.setTotalFee(rs.getDouble("total_fee"));
                fee.setCreatedAt(rs.getDate("created_at"));
                fee.setUpdatedAt(rs.getDate("updated_at"));
                return fee;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServiceFeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    @Override
    public int insert(ServiceFee fee) {
        String sql = "INSERT INTO service_fees (apartment_id, month, water_fee, parking_fee, service_fee) VALUES (?, ?, ?, ?, ?)";
        return executeInsert(sql, fee.getApartmentId(), fee.getMonth(), fee.getWaterFee(), fee.getParkingFee(), fee.getServiceFee());
    }

    @Override
    public boolean update(ServiceFee fee) {
        String sql = "UPDATE service_fees SET apartment_id = ?, month = ?, water_fee = ?, parking_fee = ?, service_fee = ?, updated_at = GETDATE() WHERE id = ?";
        return executeUpdate(sql, fee.getApartmentId(), fee.getMonth(), fee.getWaterFee(), fee.getParkingFee(), fee.getServiceFee(), fee.getId()) > 0;
    }

    @Override
    public boolean delete(int id) {
        String sql = "DELETE FROM service_fees WHERE id = ?";
        return executeUpdate(sql, id) > 0;
    }
}
