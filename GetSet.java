class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}

class GetSet {

    public static void main(String[] args) {
        Person obj = new Person();
        obj.setName("Shubham Katiyar");
        System.out.println(obj.getName());
    }

}