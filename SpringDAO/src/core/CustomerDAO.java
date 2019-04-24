package core;


public interface CustomerDAO
{
 public void insert(Customer customer);
 //public Customer findByCustomerId(int custId);
 public void delete(int cid);
 public void update(int cage);
}
