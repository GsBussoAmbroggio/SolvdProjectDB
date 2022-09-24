package MySQL;

import dao.IAccount_transDAO;
import models.Account_trans;
import models.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.List;

public class MySQLAccount_transDAO implements IAccount_transDAO {

    final String INSERT = "INSERT INTO account (ACCOUNT_ID,AVAIL_BALANCE,PENDING_BALANCE,STATUS,OPEN_DATE,LAST_ACTIVITY_DATE,CLOSE_DATE,customer_CUST_ID,branch_BRANCH_ID,employee_EMP_ID,product_PRODUCT_CD) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
    final String UPDATE = "UPDATE account SET ACCOUNT_ID=?,AVAIL_BALANCE=?,PENDING_BALANCE=?,STATUS=?,OPEN_DATE=?,LAST_ACTIVITY_DATE=?,CLOSE_DATE=?,customer_CUST_ID=?,branch_BRANCH_ID=?,employee_EMP_ID=?,product_PRODUCT_CD=?";
    final String DELETE = "DELETE FROM account WHERE ACCOUNT_ID=?";
    final String GETALL = "SELECT ACCOUNT_ID,AVAIL_BALANCE,PENDING_BALANCE,STATUS,OPEN_DATE,LAST_ACTIVITY_DATE,CLOSE_DATE,customer_CUST_ID,branch_BRANCH_ID,employee_EMP_ID,product_PRODUCT_CD FROM account";
    final String GETONE = "SELECT ACCOUNT_ID,AVAIL_BALANCE,PENDING_BALANCE,STATUS,OPEN_DATE,LAST_ACTIVITY_DATE,CLOSE_DATE,customer_CUST_ID,branch_BRANCH_ID,employee_EMP_ID,product_PRODUCT_CD FROM account WHERE ACCOUNT_ID = ?";


    private Connection conn;

    public MySQLAccount_transDAO(Connection conn){
        this.conn = conn;
    }


    @Override
    public void insert(Account_trans e) {
        PreparedStatement stat =null;
        try{
            stat = conn.prepareStatement(INSERT);
            stat.setLong(1,e.getAccountID());
            stat.set
        }

    }

    @Override
    public void modify(Account_trans e) {

    }

    @Override
    public void delete(Account_trans e) {

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
    public List<Account_trans> GetAllEmployee() {
        return null;
    }

    @Override
    public Account_trans GetBy(Long ID) {
        return null;
    }
}
