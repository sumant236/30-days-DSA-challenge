//Breadth (Choudayi): Dono deewaron ke beech ka distance (right - left).
//Length (Unchayi): Dono deewaron mein se jo choti ho (kyunki paani humesha choti deewar ke level tak hi bharega).
//Area = min(height[left], height[right]) * (right - left)

import java.util.Scanner;

import static java.lang.System.in;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = n-1;
        int maxArea = Integer.MIN_VALUE;

        while(left<right){
            int area = Math.min(arr[left], arr[right]) * (right-left);
            if(area > maxArea){
                maxArea = area;
            }

            if(arr[left]<arr[right]){
                left ++;
            }
            else {
                right--;
            }
        }
        System.out.println(maxArea);
    }
}