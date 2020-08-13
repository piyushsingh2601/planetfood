/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PLANETFOOD.dao;

import PLANETFOOD.dbutil.DBConnection;
import PLANETFOOD.pojo.Employees;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Asus
 */
public class EmployeesDao {

    public static boolean addEmp(Employees e) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into EMPS values(?,?,?,?)");
        ps.setString(1, e.getEmpId());
        ps.setString(2, e.getEmpName());
        ps.setDouble(3, e.getSal());
        ps.setString(4, e.getJob());
     
        int x = ps.executeUpdate();
        if (x > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static HashMap<String, String> getAllEmpId() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select EMPID,ENAME from EMPS");
        HashMap<String, String> empIdList = new HashMap<>();
        while (rs.next()) {
            String empId = rs.getString(1);
            String empName = rs.getString(2);
            empIdList.put(empId, empName);
        }
        return empIdList;
    }

    public static String getNewId() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        int id = 101;
        ResultSet rs = st.executeQuery("Select count (*) from EMPS");
        if (rs.next()) {
            id = id + rs.getInt(1);
        }
        return "E" + id;
    }

    public static ArrayList<Employees> getAllEmpData() throws SQLException {
        ArrayList<Employees> empList = new ArrayList<Employees>();
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select * from EMPS");
        while (rs.next()) {
            Employees e = new Employees();
            e.setEmpId(rs.getString(1));
            e.setEmpName(rs.getString(2));
            e.setJob(rs.getString(4));
            e.setSal(rs.getDouble(3));
            empList.add(e);
        }
        return empList;
    }

    public static boolean deleteEmployee(String EmpId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from EMPS where EMPID=?");
        ps.setString(1, EmpId);
        int count = ps.executeUpdate();
        if (count == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static HashMap<String, Employees> getEmpById(String empId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String qry = "Select * from EMPS where EMPID=?";
        PreparedStatement ps = conn.prepareStatement(qry);
        HashMap<String, Employees> empList = new HashMap<String, Employees>();
        ps.setString(1, empId);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Employees p = new Employees();
            p.setEmpId(rs.getString(1));
            p.setEmpName(rs.getString(2));
            p.setJob(rs.getString(4));
            p.setSal(rs.getDouble(3));

            empList.put(p.getEmpId(), p);
        }
        return empList;
    }

    public static boolean editEmployee(Employees e) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("UPDATE EMPS SET ENAME=?,SALARY=?,JOB=? WHERE EMPID=?");
        ps.setString(1, e.getEmpName());
        ps.setDouble(2, e.getSal());
        ps.setString(3, e.getJob());
        ps.setString(4, e.getEmpId());
        int count = ps.executeUpdate();
        if (count == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static ArrayList<Employees> getAllEmp() throws SQLException {
        ArrayList<Employees> emp = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from EMPS");
        while (rs.next()) {
            Employees e = new Employees();
            e.setEmpId(rs.getString("EMPID"));
            e.setEmpName(rs.getString("ENAME"));
            e.setSal(rs.getDouble("SALARY"));
            e.setJob(rs.getString("JOB"));
            emp.add(e);
        }
        return emp;
    }

    public static String getUserName(String empid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select ENAME from EMPS where EMPID=?");
        ps.setString(1, empid);
        ResultSet rs = ps.executeQuery();
        String ename = null;
        if (rs.next()) {
            ename = rs.getString(1);
        }
        return ename;
    }

    public static boolean setJob(String empid) throws SQLException {
        String job = getJob(empid);
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update EMPS set job='cashier' where empid=?");
        ps.setString(1, empid);
        int count = ps.executeUpdate();
        if (count != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String getJob(String empid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select job from EMPS where empid=?");
        ps.setString(1, empid);
        ResultSet rs = ps.executeQuery();
        String job;
        if (rs.next()) {
            job = rs.getString(1);
            return job;
        } else {
            return null;
        }

    }

    public static boolean removeCashier(String userid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from users where userid=?");
        ps.setString(1, userid);
        int count = ps.executeUpdate();
        if (count == 0) {
            return false;
        } else {
            return true;
        }
    }
}
