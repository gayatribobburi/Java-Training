public class Assign3
{
    public static void main(String args[])
    {
        Emp e=new Emp();
        Manager t=new Manager();
        Account a=new Account();
        s.setName("raju");
        s.setAge(85);
        s.setEmail("raju@gmail.com");
        s.setAddress("delhi");
        System.out.println("Emp name is:"+s.getName());
        System.out.println("Emp age is:"+s.getAge());
        System.out.println("Emp email is:"+s.getEmail());
        System.out.println("Emp address is:"+s.getAddress());

        t.setManagerName("charan");
        t.setManagerAge(78);
        t.setManagerEmail("charan@gmail.com");
        t.setManagerAddress("nanded");
        System.out.println("teacher name is:"+t.getManagerName());
        System.out.println("teacher age is:"+t.getManagerAge());
        System.out.println("teacher email is:"+t.getManagerEmail());
        System.out.println("teacher address is:"+t.getManagerAddress());

        





    }
    
}
class Emp
{
    private String name;
    private int age;
    private String email;
    private String address;
    public Emp()
    {
        System.out.println("Emp default constructor");
    }
     
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getEmail()
    {
        return email;
    }
    public String getAddress()
    {
        return address;
    }

}


class Manager
{
    private String name;
    private int age;
    private String email;
    private String address;
    public Manager()
    {
        System.out.println("Manager default constructor");
    }
     
    public void setManagerName(String name)
    {
        this.name=name;
    }
    public void setManagerAge(int age)
    {
        this.age=age;
    }
    public void setManagerEmail(String email)
    {
        this.email=email;
    }
    public void setManagerAddress(String address)
    {
        this.address=address;
    }

    public String getManagerName()
    {
        return name;
    }
    public int getManagerAge()
    {
        return age;
    }
    public String getManagerEmail()
    {
        return email;
    }
    public String getManagerAddress()
    {
        return address;
    }

}
class Batch
{
    private String name;
    private int size;
    private Emp[] Emp;
    private Manager manager;
public Batch()
{
    System.out.println("batch class default constructor");
}
    public void setBatchName(String name)
    {
        this.name=name;

    }
    public void setBatchSize(int size)
    {
        this.size=size;
    }
    public String getBatchName(String name)
    {
        return name;

    }
    public int getBatchSize(int size)
    {
        return size;
    }


}
