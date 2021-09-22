class Demo{
   static Controller controller;
    public Demo(String name){
         controller = new Controller();
        if(name.equals("Sales"))
            controller.setDbConnection();
        else
            controller.setSalesConnection();
    }
    public static void main(String[] args) {
        String name = "DB";
        new Demo(name);
        controller.open();
        controller.close();
    }
}