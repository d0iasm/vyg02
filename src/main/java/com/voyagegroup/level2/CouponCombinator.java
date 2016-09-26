package com.voyagegroup.level2;

public class CouponCombinator {

    public int[] pay(int aTotalAmount, boolean aHasPizza, int[] aHadCoupon) {
        int[] tUsedCoupon = new int[]{0, 0, 0, 0};
        int tPayAmount = aTotalAmount;

        if (1000 >= aTotalAmount) {
            return tUsedCoupon;
        }

        for (int i = 0; i < 4; i++) {
            CouponContext tCouponContext = new CouponContext(i, aHasPizza);
            for (int j = 0; j < tCouponContext.getPayTimes(aHadCoupon[i]); j++) {
                tPayAmount -= tCouponContext.getPayAmount();
                if (0 > tPayAmount) {
                    return tUsedCoupon;
                }
                tUsedCoupon[i]++;
            }
        }
        return tUsedCoupon;
    }
}
