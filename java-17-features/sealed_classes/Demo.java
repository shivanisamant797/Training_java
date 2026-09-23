
//either final or sealed class can extend a sealed class.

sealed class A permits B, C{

}
final class B extends A{

}
final class C extends A{

}
class D{

}
public class Demo{
    public static void main(String args[]){

    }
}