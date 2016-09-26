package com.voyagegroup.level2;

public class CouponContext {
    CouponState mCoupon = null;

    public CouponContext(int aCouponState, boolean aHasPizza) {
        if (aCouponState == 0) {
            mCoupon = FiveHundredCoupon.getInstance();
        } else if (aCouponState == 1 && aHasPizza) {
            mCoupon = FourHundredPizzaCoupon.getInstance();
        } else if (aCouponState == 2) {
            mCoupon = TwoHundredCoupon.getInstance();
        } else if (aCouponState == 3) {
            mCoupon = OneHundredCoupon.getInstance();
        }
    }

    public int getPayTimes(int aHadCoupon) {
        if (mCoupon == null) {
            return 0;
        }
        return mCoupon.getPayTimes(aHadCoupon);
    }

    public int getPayAmount() {
        if (mCoupon == null) {
            return 0;
        }
        return mCoupon.getPayAmount();
    }
}
