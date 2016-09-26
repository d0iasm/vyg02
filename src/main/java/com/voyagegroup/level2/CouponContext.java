package com.voyagegroup.level2;

public class CouponContext {
    private CouponContext mInstance = null;

    CouponState mCoupon = null;

    public CouponContext(int aCouponState, boolean aHasPizza){
        if(aCouponState == 0){
            mCoupon = FiveHundredCoupon.getInstance();
        }else if(aCouponState == 1 && aHasPizza){
            mCoupon = FourHundredPizzaCoupon.getInstance();
        }else if(aCouponState == 2){
            mCoupon = TwoHundredCoupon.getInstance();
        }else if(aCouponState == 3){
            mCoupon = OneHundredCoupon.getInstance();
        }
    }

    public int getPayTimes(int aHadCoupon){
        return mCoupon.getPayTimes(aHadCoupon);
    }

    public int getPayAmount(){
        if(mCoupon == null){
            return 0;
        }
        return mCoupon.getPayAmount();
    }
}
