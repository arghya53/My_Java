class increment
{
    public static void main(String Arg[])
    {
        int x= 5, y=7, z;
        z = x++ + 4 * ++y;
        System.out.println(x + " " + y + " "+ z);
    }
}