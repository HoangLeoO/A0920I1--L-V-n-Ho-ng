package dao;

import model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements  IUserDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/ql_user?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "hoang911";
    private static final String INSERT_USERS_SQL = "INSERT INTO users" + "  (name, email, country) VALUES " +
            " (?, ?, ?);";

    private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";
    private static final String SELECT_ALL_USERS = "select * from users";
    private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
    private static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, country =? where id = ?;";
    public  UserDAO(){}
    protected Connection getConnection(){
        Connection connection = null ;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);

        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
    @Override
    public void insertUser(User user) throws SQLException {
        System.out.println(INSERT_USERS_SQL);
        try (Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(INSERT_USERS_SQL)){
            statement.setString(1,user.getName());
            statement.setString(2,user.getEmail());
            statement.setString(3,user.getCountry());
            System.out.println(statement);
            statement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public User selectUser(int id) {
        User user = null ;
        try (Connection connection = getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                user = new User(id, name, email, country);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }


    @Override
    public List<User> selectAllUsers() {
        List<User> users = new ArrayList<>();
        try (
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_USERS);) {
            System.out.println(statement);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                users.add(new User(id,name,email,country));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return  users;
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        boolean rowDelete;
        try(Connection connection = getConnection() ; PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL)){
            statement.setInt(1,id);
            rowDelete = statement.executeUpdate()>0;
        }
        return rowDelete;
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
       boolean rowUpdate;
        try(Connection connection = getConnection() ; PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL)){
            statement.setString(1,user.getName());
            statement.setString(2,user.getEmail());
            statement.setString(3,user.getCountry());
            statement.setInt(4,user.getId());
            rowUpdate = statement.executeUpdate()>0;
        }
        return rowUpdate;
    }
    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}