package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utilities.DBUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBStepDefs {

    @Given("user connects to the database")
    public void user_connects_to_the_database() {
        DBUtils.createConnection();//Using create connection method from util
    }

    @Given("user gets {string} from {string} table")
    public void user_gets_from_table(String column, String table) {
//        SELECT * FROM tp_customer;
        String query = "select "+column+" from "+table;
//        executing the query we are going customer table
        DBUtils.executeQuery(query);
    }

    @Given("user reads all the {string} column data")
    public void user_reads_all_the_column_data(String column) throws SQLException {
// go to the next row 1st column has no data
        DBUtils.getResultset().next();

//      Now currently we are in the first row, this method will return only first data
        Object columnData1 =  DBUtils.getResultset().getObject(column);
        System.out.println(columnData1);

//      go to 2nd row
        DBUtils.getResultset().next(); // we are on the row 2 now
        Object columnData2 =  DBUtils.getResultset().getObject(column);
        System.out.println(columnData2);

        //iterating ssn column
        while (DBUtils.getResultset().next()){ //this method keeps going next line if ther is data in next line
            Object nextColumnData= DBUtils.getResultset().getObject(column);
            System.out.println(nextColumnData);

        }

    }

    @Then("close the database connection")
    public void close_the_database_connection() {
       DBUtils.closeConnection();
    }

    @Then("verify {string} table {string} coulumn contains {string}")
    public void verify_table_coulumn_contains(String table, String column, String data) {
        //get all the column  datas
        List<Object> allColumnData =DBUtils.getColumnData("select * from "+table,column);
        Assert.assertTrue(allColumnData.contains(data));
        // System.out.println(allColumnData);

        //2.Way
        //List<Object> expectedData = new ArrayList<>();
        //expectedData.add(data);
        //Assert.assertTrue(allColumnData.containsAll(expectedData));

    }

    @Then("read the row count of {string} table")
    public void read_the_row_count_of_table(String table) throws Exception {
        int rowCount = DBUtils.getRowCount();
        System.out.println(table+ " row count "+ rowCount);

    }
    @Then("read column name of {string} table")
    public void read_column_name_of_table(String table) {
        String query = "select * from " + table;
        System.out.println(DBUtils.getColumnNames(query));

    }


}