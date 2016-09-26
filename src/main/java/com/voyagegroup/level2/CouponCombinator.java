package com.voyagegroup.level2;

public class CouponCombinator {

    public int[] pay(int aTotalAmount, boolean aHasPizza, int[] aHadCoupon) {
        int[] tUsedCoupon = new int[]{0, 0, 0, 0};
        int tPayAmount = aTotalAmount;

        if (1000 >= aTotalAmount) {
            return tUsedCoupon;
        }

        for (int i = 0; i < 4; i++) {
            int tCouponNumber = Math.min(aHadCoupon[i], 2);
            for (int j = 0; j < tCouponNumber; j++) {
                if (i == 0) tPayAmount -= 500;
                if (i == 1 && aHasPizza && j == 0) {
                    tPayAmount -= 400;
                }
                if (i == 2) tPayAmount -= 200;
                if (i == 3){
                    tPayAmount -= 100;
                    System.out.println("hoge");
                }
                if (0 > tPayAmount) {
                    return tUsedCoupon;
                }
                if (i != 1) {
                    tUsedCoupon[i]++;
                } else if (aHasPizza && j == 0) {
                    tUsedCoupon[1]++;
                }

            }
        }
        return tUsedCoupon;
    }
}
