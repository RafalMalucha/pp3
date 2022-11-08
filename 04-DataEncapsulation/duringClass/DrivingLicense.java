public class DrivingLicense{

    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private String licenseNumber;
    private int yearOfIssue;
    private String category;

    public void displayData(){
        System.out.println(getName());
        System.out.println(getSurname());
        System.out.println(getAddress());
        System.out.println(getPostalCode());
        System.out.println(getCity());
        System.out.println(getLicenseNumber());
        System.out.println(getYearOfIssue());
        System.out.println(getCategory());
    }

    public String getName(){
        return name;
    }

    public void setName(String driverName){
        this.name = driverName.substring(0, 1).toUpperCase() + driverName.substring(1).toLowerCase();
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String driverSurname){
        this.surname  = driverSurname;
    }

    public String getAddress(){
        return address;
    }

    public void setAddres(String driverAddress){
        this.address  = driverAddress;
    }

    public String getPostalCode(){
        return postalCode;
    }

    public void setPostalCode(String driverPostalCode){
        this.postalCode  = driverPostalCode;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String driverCity){
        this.city  = driverCity;
    }

    public String getLicenseNumber(){
        return licenseNumber;
    }

    public void setLicenseNumber(String driverLicenseNumber){
        this.licenseNumber  = driverLicenseNumber;
    }

    public int getYearOfIssue(){
        return yearOfIssue;
    }

    public void set(int driverYearOfIssue){
        if(driverYearOfIssue >= 1980 && driverYearOfIssue <= 2022){
            this.yearOfIssue = driverYearOfIssue;
        }
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String driverCategory){
        this.category  = driverCategory;
    }
}