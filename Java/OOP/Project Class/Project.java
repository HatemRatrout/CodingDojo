public class Project {
    private String name;
    private String Description;
    public Project ()
    {
        this.name ="";
        this.Description ="";
    }
    public Project (String name)
    {
        this.name = name;
        this.Description ="";
    }
    public Project (String name, String Description)
    {
        this.name = name;
        this.Description = Description;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName ()
    {
        return this.name;
    }
    public void setDescription (String Description)
    {
        this.Description = Description;
    }
    public String getDescription ()
    {
        return this.Description;
    }
    public static void main(String[] args) {
        
    }
}
class test {
    public static void main(String[] args) {
        Project x = new Project();
        x.setName("hatem");
        String name=x.getName();
        System.out.println(name);
    }
}