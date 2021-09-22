class Demo{
    public static void main(String[] args) {
        Context context = new Context(new Subtraction());
        int a =10,b=20;
        System.out.println(context.calculate(a,b));
    }
}