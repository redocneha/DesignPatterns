 class PersonBuilder {
    protected Person person = new Person();
    public Person build(){
        return person;
    }
    public PersonAddressBuilder lives(){
        return new PersonAddressBuilder(person);
    }
    public PersonDetailsBuilder with(){
      return new PersonDetailsBuilder(person);
    }
}

 class PersonAddressBuilder extends  PersonBuilder{
    public PersonAddressBuilder(Person p){
        this.person = p;
    }
    public PersonAddressBuilder in(String streetNo){
        this.person.streetNo = streetNo;
        return  this;
    }

    public PersonAddressBuilder of(String postcode){
        this.person.postcode = postcode;
        return this;
    }
}

class PersonDetailsBuilder extends  PersonBuilder{
    public PersonDetailsBuilder(Person p){
        this.person = p;
    }
    public PersonDetailsBuilder name(String name){
        this.person.name = name;
        return this;
    }

    public PersonDetailsBuilder gender(String gender){
        this.person.gender = gender;
        return this;

    }
}