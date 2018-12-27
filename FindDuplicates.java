import java.util.*;
public class FindDuplicates { //FindDuplicates
    public static void main(String args[])
    {
        ArrayList orig=new ArrayList(Arrays.asList(2,3,4,10,5,1,6,7,3,5,10,8,9,1,7,3));
            //Store test elements
        ArrayList chek=new ArrayList();
            //chek contains only distinct values
        ArrayList dupl=new ArrayList();
            //dupl contains all duplicate values
            
        System.out.println("Original array list is: "+orig);        
        
        for(int i=0;i<orig.size();i++)
        {
            int temp=(int)orig.get(i);
            
            if(!in_arraylist(temp,chek))
                chek.add(temp);
            else if(!in_arraylist(temp,dupl))
                dupl.add(temp);
        }
        System.out.println("Duplicate values in list are: "+dupl);
    }
    public static boolean in_arraylist(int val, ArrayList x) //function to check if a certain value is in an array list or not
    {
        for(int j=0;j<x.size();j++)
        {
            if(val == (int)x.get(j))
                return true;
        }
        return false;
    }
}