import java.text.ParseException;

import com.ideas2it.employee.view.EmployeeView;

/**
 * this class is used as runner file
 * @version 24/2/21
 * @author  danveer
 */
public class EmployeeManagement {
    public static void main(String[] args) throws ParseException {
        EmployeeView employeeView = new EmployeeView();
        employeeView.userSelection();
    }
}