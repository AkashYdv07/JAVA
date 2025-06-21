// Array is used to store multiple value of a specific datatype 
// Array is a collection of elements of the same datatype.
// int num[] = {3,4,5,6}   // initialization of array
// if we define the size of array we have to stick to it i.e array size is fixed .
// int num[] = new int[4];   it means 4 spaces of integer is initialized contiguous memory location
// Exception are runtime error - the error that come during runtime at compile time there is no problem 


public class Array {
    public static void main(String[] args) {
        int nums[] = {3,4,5,6};   // array initialization  
        nums[1] = 6;  // assign the value

        //Dynamic array 
        int nums1[] = new int[4];  // by default all the value will be zero
        nums1[0] = 4;
        nums1[1] = 34;
        nums1[2] = 65;
        nums1[3] = 98;
        System.out.println("First element of array is: "+ nums[0]);
        // for (int i = 0; i < nums.length; i++) {
        //     System.out.println(nums[i]);
        // }    

        // Array of array - Multidimensional array
        int nums2[][] = new int[3][4];

        for(int i=0;i<3;i++)
        {
            for(int j =0;j<4;j++)
            {
                nums2[i][j] = (int)(Math.random() * 100);
            }
        }

        for(int i=0;i<3;i++)
        {
            for(int j =0;j<4;j++)
            {
                System.out.print(nums2[i][j] + " ");
            }
            System.out.println();
        }

        for(int n[] : nums2)
        {
            for(int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        // Now if we want to arrays of different sizes 
        int nums3[][] = new int[3][]; // this type of arrays are called jagged arrays
        // for these type of arrays you have to define the size of each array separately

        nums3[0] = new int[3];
        nums3[1] = new int[4];
        nums3[2] = new int[5];

    }
}
