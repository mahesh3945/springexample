package coreClient;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
/*import com.mkyong.customer.dao.CustomerDAO;
import com.mkyong.customer.model.Customer;*/

import org.springframework.jdbc.core.JdbcTemplate;

import core.Customer;
import core.CustomerDAO;

public class JdbcCustomerDAO implements CustomerDAO
{
 private DataSource dataSource;

 public void setDataSource(DataSource dataSource) {
  this.dataSource = dataSource;
 }

 private JdbcTemplate jdbcTemplate;
 
 public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

public DataSource getDataSource() {
	return dataSource;
}

public void insert(Customer customer){

  String sql = "INSERT INTO Customerspring " +
    "(customerId, customerName, customerAge) VALUES (?, ?, ?)";
  Connection conn = null;
  try {
   conn = dataSource.getConnection();
   PreparedStatement ps = conn.prepareStatement(sql);
   ps.setInt(1, customer.getCustId());
   ps.setString(2, customer.getName());
   ps.setInt(3, customer.getAge());
   ps.executeUpdate();
   ps.close();

  } catch (SQLException e) {
   throw new RuntimeException(e);

  } finally {
   if (conn != null) {
    try {
     conn.close();
    } catch (SQLException e) {}
   }
  }
 }

@Override
public void delete(int cid)
{
	jdbcTemplate.update("delete from customerspring where customerID="+cid);
	
}
public void update(int cage)
{
	jdbcTemplate.update("update customerspring set customerAge ='"+cage+"' WHERE customerId= '"+111+"'");
}
}