class Demo{
    public static void main(String args[]){
//        SingletonABC2 obj = SingletonABC2.getInstance();
//        SingletonABC2 obj2 = SingletonABC2.getInstance();
//        System.out.println(obj);
//        System.out.println(obj2);

        Thread t1 = new Thread(new Runnable(){
            public void run(){
               // SingletonABC4  obj = SingletonABC4.getInstance();
                SingletonABC5 obj = SingletonABC5.INSTANCE;
            }
        });
        Thread t2 = new Thread(new Runnable(){
            public void run(){
                //SingletonABC4   obj2 = SingletonABC4.getInstance();
                SingletonABC5 obj2 = SingletonABC5.INSTANCE;

            }
        });
         t1.start();
        t2.start();
    }
}
// Early Instantiation
class SingletonABC{
    static SingletonABC obj = new SingletonABC();
    private SingletonABC(){
        //empty
    }
    public static SingletonABC getInstance(){
        return obj;
    }
}


//Lazy Instantiation
class SingletonABC2{
    static SingletonABC2 obj;
    private SingletonABC2(){
        //empty
    }
    public static SingletonABC2 getInstance(){
        if(obj==null)
          obj = new SingletonABC2(); //instance created at getInstance called and only at 1st time
        return obj;
    }
}

//Synchronized method

class SingletonABC3{
    static SingletonABC3 obj;
    private SingletonABC3(){
        System.out.println("Instance created");
    }
    public static synchronized SingletonABC3 getInstance(){
        if(obj==null)
            obj = new SingletonABC3(); //instance created at getInstance called and only at 1st time even though more than 2 threads run
        return obj;
    }
}

//Synchronized block(Double check locking)

class SingletonABC4{
    static SingletonABC4 obj;
    private SingletonABC4(){
        System.out.println("Instance created");
    }
    public static  SingletonABC4 getInstance(){
        if(obj==null){
            synchronized(SingletonABC4.class){
                if(obj==null)
                    obj = new SingletonABC4(); //instance created at getInstance called and only at 1st time even though more than 2 threads run efficiently
            }
        }
        return obj;
    }
}

//enum  creation ( java >1.5)

enum SingletonABC5{
  INSTANCE;
  private SingletonABC5(){
      System.out.println("Instance created");
  }
}

