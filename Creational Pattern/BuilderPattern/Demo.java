class Demo{
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder.with().name("Neha").gender("Female").lives().in("ABC").of("521175").build();
        System.out.println(person.toString());
    }
}