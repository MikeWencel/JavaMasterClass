package com.mike_wen;

public class Main {

    public static void main(String[] args) {
	getBucketCount(3.4,2.1,1.5,2);

	System.out.println(getBucketCount(3.4,2.1,1.5));
	System.out.println(getBucketCount(7.25,4.3,2.35));
	System.out.println(getBucketCount(3.26,0.75));
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

    public static int getBucketCount(double width,double height, double arePerBucket){
        double area;
        if ((width <0) && (height < 0) ){
            return -1;
        }else{
           area = width * height;
           double buckets = area / arePerBucket;
           int bucketCover = (int) Math.ceil(buckets);
           return bucketCover;
        }

    }

    public static int getBucketCount (double area, double areaPerBucket){
        if ((area <= 0 || areaPerBucket <= 0 )){
            return -1;
        }else {
            double bucketArea = area/areaPerBucket;
            int buckets = (int) Math.ceil(bucketArea);
            return buckets;
        }
    }
}
