public class Fruits {
    String Taste;
    int Size;
    public void Eat()
    {
        System.out.println("Name of the Fruit is Banana");
        System.out.println("Taste of Fruit is Mast ");
    }
}
class Apple extends Fruits
{
    public void Eat()
    {
        System.out.println("Tasty Apple");
    }
}
class Orange extends Fruits
{
    public void Eat()
    {
        System.out.println("Tasty Orange");
    }
}
class Test
{
    public static void main(String[] args) {
        Apple obj=new Apple();
        System.out.println("For Apple:-");
        System.out.println(obj.Size=20);
        System.out.println(obj.Taste="Sweet");
        obj.Eat();
        System.out.println();
        Orange obj1=new Orange();
        System.out.println("For Orange:-");
        System.out.println(obj1.Size=30);
        System.out.println(obj1.Taste="Mast");
        obj1.Eat();
    }

}
