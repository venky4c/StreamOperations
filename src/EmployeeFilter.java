import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilter {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Ram", 42),
                new Employee( "Shiva", 24),
                new Employee("Usha", 29),
                new Employee("Raghav", 25)
        );
        List<Employee> employeesYoungerThan30 = employees.stream()
                .filter(employee -> employee.age < 30)
                .collect(Collectors.toList());
        List<String> youthfulEmployees = employeesYoungerThan30.stream().
                map(emp -> emp.name).collect(Collectors.toUnmodifiableList());
        System.out.println(youthfulEmployees);
    }
}
