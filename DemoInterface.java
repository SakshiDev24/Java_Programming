interface Circle
{
    //characteristic
    float PI = 3.14f;  //public static final
}
class DemoInterface
{
    public static void main(String A[])
    {
        System.out.println(Circle.PI);
        Circle PI = 7.12f;  //erroe due to final

    }
}