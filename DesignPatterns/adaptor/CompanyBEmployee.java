import java.util.List;

public class CompanyBEmployee implements Employee {

    private static CompanyBEmployee companyBEmployee = null;
    private static final String EMAIL_ADDRESS = "companyb.com";
    String userName;
    String no;

    private CompanyBEmployee(){}

    public static CompanyBEmployee getInstance(){
        if(companyBEmployee==null){
            synchronized (CompanyBEmployee.class){
                if(companyBEmployee==null){
                    companyBEmployee = new CompanyBEmployee();
                }
            }
        }
        return companyBEmployee;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    String lastName;
    String email;


    @Override
    public String getFirstName() {
        return userName;
    }

    @Override
    public String getId() {
        return no;
    }

    @Override
    public String getEmail() {
        this.email = getFirstName() + "_" + lastName + "@" + EMAIL_ADDRESS;
        return this.email;
    }

    public CompanyBEmployee(String userName, String no, String lastName) {
        this.userName = userName;
        this.no = no;
        this.lastName = lastName;
        this.email = getEmail();
    }

    public List<CompanyBEmployee> getSampleEmployees() {
        List<CompanyBEmployee> list = List.of(
                new CompanyBEmployee("name1", "1", "last1"),
                new CompanyBEmployee("name2", "2", "last2"),
                new CompanyBEmployee("name3", "3", "last3")
        );
        return list;
    }

    ;

}
