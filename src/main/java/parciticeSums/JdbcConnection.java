package parciticeSums;



import com.mysql.cj.jdbc.JdbcConnection;

class TaskDAO {
	public void createTask(JdbcConnection jdbcConnection) { // User defined Exception {
		// Write code here to get connection
		// Create insert statement
		// Execute insert statement
		// close connection
		
//		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/3306/savinglives")) {
//            String insertQuery = "INSERT INTO task (id, name, status) VALUES (?, ?, ?)";
//            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
//                preparedStatement.setInt(1, task.id);
//                preparedStatement.setString(2, task.name);
//                preparedStatement.setString(3, task.status);
//            }
//        } catch (SQLException e) {
//            throw new DAOException("somthing wrong in creating the task", e);
//        }
//	} 

}
}
// Create Junit Test case and test the TaskDao.createTask method