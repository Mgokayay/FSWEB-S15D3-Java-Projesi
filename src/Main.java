import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1,"Gökay","Ay"));
        employees.add(new Employee(1,"Gökay","Ay"));
        employees.add(new Employee(2,"Samet","Ozturk"));
        employees.add(new Employee(2,"Kaim","Arvas"));
        employees.add(new Employee(3,"Oyku","Oktay"));
        employees.add(new Employee(3,"Eda","Kalaycıoğlu"));
        employees.add(new Employee(4,"Hamza","Şahin"));
        employees.add(new Employee(5,"Murat","Şimşek"));

        Map<Integer,Employee> employeeMap = new HashMap<>();
        List<Employee> removedEmployees= new ArrayList<>();

        Iterator<Employee> iterator = employees.iterator();
        while(iterator.hasNext()){
            Employee employee = iterator.next();
            if(employee == null) {
                System.out.println("Null data!");
                continue;
            }if(employeeMap.containsKey(employee.getId())){
                removedEmployees.add(employee);
                iterator.remove();
            }else{
                employeeMap.put(employee.getId(), employee);
            }
        }


    }
}