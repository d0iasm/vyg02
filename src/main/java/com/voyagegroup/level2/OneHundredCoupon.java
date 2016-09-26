package com.voyagegroup.level2;

public class OneHundredCoupon implements CouponState {
    private static OneHundredCoupon mInstance = null;

    public static OneHundredCoupon getInstance() {
        if (mInstance == null) {
            mInstance = new OneHundredCoupon();
        }
        return mInstance;
    }

    @Override
    public int getPayTimes(int aHadCoupon) {
        return Math.min(aHadCoupon, 3);
    }

    @Override
    public int getPayAmount() {
        return 100;
    }
}