package com.company;
public class hanoi
{
    public static void hanoi(int n,char from,char mid,char to)
    {
        if(n==1)
        {
            //Moving disk1 on to the first rod
            System.out.println("Moving disk "+n+"From rod:"+from+"To Rod"+to);
            return;
        }
        //Moving n-1 disks to the second rod
        hanoi(n-1,from,to,mid);
        System.out.println("Moving disk "+n+"From rod:"+from+"To Rod"+to);
        //Moving the disks on top of already moved first disk
        hanoi(n-1,mid,from,to);
    }
    public static void main(String args[])
    {
        int n=3;
        hanoi(n,'A','B','C');
    }
}

