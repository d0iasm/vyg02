package com.voyagegroup.level2;

public class FiveHundredCoupon implements CouponState {
    private static FiveHundredCoupon mInstance = null;

    public static FiveHundredCoupon getInstance() {
        if (mInstance == null) {
            mInstance = new FiveHundredCoupon();
        }
        return mInstance;
    }

    @Override
    public int getPayTimes(int aHadCoupon) {
        return Math.min(aHadCoupon, 2);
    }

    @Override
    public int getPayAmount() {
        return 500;
    }
}
