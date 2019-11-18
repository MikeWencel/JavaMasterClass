package com.mike_wen;

public class Main {

    public static void main(String[] args) {
	getBucketCount(3.4,2.1,1.5,2);
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        double area;
        if ((width < 0) && (height < 0) && (areaPerBucket < 0)){
            return -1;
        }else{
            area = width * height;
            System.out.println(area);
            double buckets = Math.ceil(area / areaPerBucket);
            int bucketCover = (int)buckets - extraBuckets;
            System.out.println(bucketCover);
            return bucketCover;

        }
    }
}
