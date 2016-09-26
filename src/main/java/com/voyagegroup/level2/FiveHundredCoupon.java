package com.voyagegroup.level2;

public class FiveHundredCoupon implements CouponState {
    private static FiveHundredCoupon instance = null;

    public static FiveHundredCoupon getInstance(){
        if(instance == null){
            instance = new FiveHundredCoupon();
        }
        return instance;
    }

    @Override
    public int getPayAmount() {
        return 0;
    }
}
