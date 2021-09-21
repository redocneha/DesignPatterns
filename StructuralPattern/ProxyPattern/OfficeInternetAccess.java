interface OfficeInternetAccess{
    void grantAccess();
}

class RealInternetAccess implements OfficeInternetAccess{
    String empName;

    public RealInternetAccess(String empName){
        this.empName = empName;
    }
    @java.lang.Override
    public void grantAccess() {
        System.out.println("Employee "+ empName+" is granted with internet access");
    }
}

class ProxyInternetAccess implements  OfficeInternetAccess{
    String empName;
    RealInternetAccess realInternetAccess;

    public ProxyInternetAccess(String empName){
        this.empName = empName;
    }

    @java.lang.Override
    public void grantAccess() {
        if(getRole(empName)>4)
        {
            realInternetAccess = new RealInternetAccess(empName);
            realInternetAccess.grantAccess();
        }
        else{
            System.out.println("Employee "+empName+" cannot be granted with internet access as role is < 4");
        }
    }

    public int getRole(String empName){
        if(empName.equals("Neha")) return 10;
        else return 2;
    }
}