import java.sql.*;
public class Main {
    static final String username = "User";
    static final String password = "12345";
    static final String url = "jdbc:mysql://localhost:3306/week4";

    public static void main(String[] args) throws SQLException {
        tableProduct();
        addProduct("Galaxy S9+", "2020", "samsung", "35590", "black");
        deleteProduct("Galaxy S9+");
        updateProduct("Galaxy S8+", "2");
    }

    private static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(url, username, password);
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


    private static void addProduct(String name, String yearModel, String brand, String priceModel, String color) throws SQLException {
        Connection connection = getConnection();
        if (connection != null) {
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement("Insert into product(name,yearModel,brand," +
                        "priceModel,color)  values(?,?,?,?,?)");
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, yearModel);
                preparedStatement.setString(3, brand);
                preparedStatement.setString(4, priceModel);
                preparedStatement.setString(5, color);

                int rows = preparedStatement.executeUpdate();
                System.out.println("rows added " + rows);
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if(preparedStatement != null)
                        preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private static void deleteProduct(String name) throws SQLException {
        Connection connection = getConnection();
        if (connection != null) {
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement("DELETE from product where name =?");
                preparedStatement.setString(1, name);
                int rows = preparedStatement.executeUpdate();
                System.out.println("rows deleted " + rows);
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if(preparedStatement != null)
                        preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private static void updateProduct(String name, String id) throws SQLException {
        Connection connection = getConnection();
        if (connection != null) {
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement("UPDATE product SET name = ? WHERE id = ?");

                preparedStatement.setString(1, name);
                preparedStatement.setString(2, id);
                int rows = preparedStatement.executeUpdate();
                System.out.println("rows updated " + rows);
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if(preparedStatement != null)
                        preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void tableProduct() throws SQLException {
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM product";
        ResultSet resultSet = statement.executeQuery(query);
        if (resultSet != null) {
            try {

                ResultSetMetaData metadata = resultSet.getMetaData();
                int columnCount = metadata.getColumnCount();
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(metadata.getColumnName(i) + "\t");
                }
                System.out.println("\n");

                while (resultSet.next()) {
                    for (int i = 1; i <= columnCount; i++) {
                        System.out.print(resultSet.getString(i) + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if(resultSet != null)
                        resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


