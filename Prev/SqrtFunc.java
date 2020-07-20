class SqrtFunc{
public int mySqrt(int x) {
        long left = 1,right = x,mid=0;
        while(left<=right){
            mid = left+(right-left)/2;
            if(mid*mid==x){
                return (int)mid;
            }
            else if(mid*mid>x){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return left*left<x ? (int)left:(int)right;
    }
}
