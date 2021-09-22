public class CollectionNamesRepo implements Container{
    public String names[] = {"Neha","Irfan","Razia","Dastagiri"};
    @java.lang.Override
    public Iterator getIterator() {
        return new CollectionNamesIterator();
    }
    private class CollectionNamesIterator implements Iterator{
        int i;
        @java.lang.Override
        public boolean hasNext() {
            return  i < names.length;
        }

        @java.lang.Override
        public String next() {
            if(i>=names.length)
                return "Invalid";
            return names[i++];
        }
    }
}

