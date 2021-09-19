class Person{
    //personal details
     String name;
     String gender;
    //address details
     String postcode;
     String streetNo;

    @java.lang.Override
    public java.lang.String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", postcode='" + postcode + '\'' +
                ", streetNo='" + streetNo + '\'' +
                '}';
    }
}