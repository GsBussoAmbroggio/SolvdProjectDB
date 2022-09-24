package MySQL;

import dao.IAccountDAO;
import models.Account;
import models.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import java.util.List;

public class MySQLAccountDAO implements IAccountDAO {

    final String INSERT = "INSERT INTO account (ACCOUNT_ID,AVAIL_BALANCE,PENDING_BALANCE,STATUS,OPEN_DATE,LAST_ACTIVITY_DATE,CLOSE_DATE,customer_CUST_ID,branch_BRANCH_ID,employee_EMP_ID,product_PRODUCT_CD) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
    final String UPDATE = "UPDATE account SET ACCOUNT_ID=?,AVAIL_BALANCE=?,PENDING_BALANCE=?,STATUS=?,OPEN_DATE=?,LAST_ACTIVITY_DATE=?,CLOSE_DATE=?,customer_CUST_ID=?,branch_BRANCH_ID=?,employee_EMP_ID=?,product_PRODUCT_CD=?";
    final String DELETE = "DELETE FROM account WHERE ACCOUNT_ID=?";
    final String GETALL = "SELECT ACCOUNT_ID,AVAIL_BALANCE,PENDING_BALANCE,STATUS,OPEN_DATE,LAST_ACTIVITY_DATE,CLOSE_DATE,customer_CUST_ID,branch_BRANCH_ID,employee_EMP_ID,product_PRODUCT_CD FROM account";
    final String GETONE = "SELECT ACCOUNT_ID,AVAIL_BALANCE,PENDING_BALANCE,STATUS,OPEN_DATE,LAST_ACTIVITY_DATE,CLOSE_DATE,customer_CUST_ID,branch_BRANCH_ID,employee_EMP_ID,product_PRODUCT_CD FROM account WHERE ACCOUNT_ID = ?";

    private Connection conn;

    public MySQLAccountDAO(Connection conn){
        this.conn = conn;
    }
    @Override
    public void insert(Account e) {
        PreparedStatement stat =null;
        try{
            stat = conn.prepareStatement(INSERT);
            stat.setLong(1,e.getAccountID());
            stat.setDouble(2,e.getAvailBalance());
            stat.setDouble(3,e.getPendingBalance());
            stat.setString(4,e.getStatus());
            stat.setDate(5,new Date(e.getOpenDate().getTime());
            stat.setDate(6,new Date (e.getLastActivity().getTime());
            stat.setDate(7,new Date (e.getCloseDate().getTime());
            stat.setInt(8,e.getCustID());
            stat.setInt(9,e.getBranchID());
            stat.setInt(10,e.getEmpID());
            stat.setString(11,e.getProductCD());
        }finally {stat.close();

        }


    }

    @Override
    public void modify(Account e) {

    }

    @Override
    public void delete(Account e) {

    }

    @Override
    public void insert(Employee emp) {

    }

    @Override
    public void modify(Employee emp) {

    }

    @Override
    public void delete(Employee emp) {

    }

    @Override
    public List<Account> GetAllEmployee() {
        return null;
    }

    @Override
    public Account GetBy(Long ID) {
        return null;
    }
}
