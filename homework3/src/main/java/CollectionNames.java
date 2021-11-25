public enum CollectionNames {
    LIST("ArrayList"),
    MAP("HashMap"),
    SET("HashSet");

    String name;

    CollectionNames(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
