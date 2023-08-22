package oops;

public class parametrizedConstructor {
    String name;
    int id;

    public parametrizedConstructor(String nm, int ID){
       name = nm;
       id = ID;
    }
    public static void main(String[] args) {

        parametrizedConstructor p = new parametrizedConstructor("val",3);
        System.out.println(p.name + " " + p.id);
        
    }
    
}
