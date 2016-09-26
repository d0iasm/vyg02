package com.voyagegroup.level2;

public class FourHundredPizzaCoupon implements CouponState {
    private static FourHundredPizzaCoupon mInstance = null;

    public static FourHundredPizzaCoupon getInstance(){
        if(mInstance == null){
            mInstance = new FourHundredPizzaCoupon();
        }
        return mInstance;
    }

    @Override
    public int getPayTimes(int aHadCoupon) {
        return Math.min(aHadCoupon, 1);
    }

    @Override
    public int getPayAmount() {
        return 400;
    }
}
