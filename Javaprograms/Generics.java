package datastructure;


public class Generics<T1,T2> {
    T1 id;
    T2 name;
    public void setId(T1 t){
        this.id=t;
    }
    public T1 getId(){
        return id;
    }
    public void setname(T2 t){
        this.name=t;
    }
    public T2 getname(){
        return name;
    }
    public static void main(String[] args) {
        Generics<Integer,String> g1=new Generics<Integer,String>();
        g1.setId(13);
        g1.setname("qwe");
        System.out.println(g1.getId());
                System.out.println(g1.getname());

    }
}
