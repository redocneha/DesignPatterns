class Demo{
    public static void main(String[] args) {
        CollectionNamesRepo repo = new CollectionNamesRepo();
        Iterator iterator = repo.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}