package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    int[] a={1,3,5,7,0,0,0,0};
        int[] b={2,4,6,8};
        merge(a,4,b,4);
        for(int i:a){
            System.out.println(i);
        }
    }
    //Given two sorted integer arrays nums1 and nums2,merge nums2 into nums1 as one sorted array.
    //note: you may assume that nums1 has enough space(size that is greater or equal to m+n)
    //to hold additional elements from nums2. The number of elements initialized in nums1 and nums2
    //are m and n respectively.
    public static void merge(int[] nums1,int m,int[] nums2,int n){
        int p=m-1;
        int q=n-1;
        int i=m+n;
        while(p>=0&&q>=0){                            //从后往前加数据，即最大值放最后面
            while(p<0){nums1[--i]=nums2[q--];}
            while(q<0){nums1[--i]=nums1[p--];}
            if(nums1[p]>nums2[q]){
                nums1[--i]=nums1[p--];
            }else{
                nums1[--i]=nums2[q--];
            }
        }
    }
}
