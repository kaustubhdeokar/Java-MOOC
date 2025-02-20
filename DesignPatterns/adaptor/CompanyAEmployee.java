import java.util.List;

public class CompanyAEmployee implements Employee{

    private static CompanyAEmployee companyAEmployee = null;
    String firstName;
    String id;
    String email;

    public CompanyAEmployee(String firstName, String id, String email) {
        this.firstName = firstName;
        this.id = id;
        this.email = email;
    }

    private CompanyAEmployee(){}

    public static CompanyAEmployee getInstance(){
        if(companyAEmployee==null){
            synchronized (CompanyAEmployee.class){
                if(companyAEmployee==null){
                    companyAEmployee = new CompanyAEmployee();
                }
            }
        }
        return companyAEmployee;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<CompanyAEmployee> getSampleEmployees(){
        List<CompanyAEmployee> list = List.of(
                new CompanyAEmployee("name1","1","name1@1.com"),
                new CompanyAEmployee("name2","2","name2@2.com"),
                new CompanyAEmployee("name3","3","name3@3.com")
        );
        return list;
    };
}
