public class Teacher {
    private String id;
    private String name;
    public Teacher(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getName() {
       return id + name;
    }
    
}