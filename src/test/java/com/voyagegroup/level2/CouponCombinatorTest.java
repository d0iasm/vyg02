package com.voyagegroup.level2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CouponCombinatorTest {
    CouponCombinator mCouponCombinator = new CouponCombinator();

    @Test
    public void notUseCouponForThousandOrLessTest() {
        assertThat(mCouponCombinator.pay(1000, true, new int[]{1, 1, 1, 1}), is(new int[]{0, 0, 0, 0}));
    }

    @Test
    public void notUseCouponForNotHaveCouponTest() {
        assertThat(mCouponCombinator.pay(1200, true, new int[]{0, 0, 0, 0}), is(new int[]{0, 0, 0, 0}));
    }

    @Test
    public void useCouponNotPizzaTest() {
        assertThat(mCouponCombinator.pay(1400, false, new int[]{2, 1, 1, 2}), is(new int[]{2, 0, 1, 2}));
    }

    @Test
    public void payAllCouponTest() {
        assertThat(mCouponCombinator.pay(1400, true, new int[]{2, 1, 1, 2}), is(new int[]{2, 1, 0, 0}));
    }

    @Test
    public void payMaxCouponTest() {
        assertThat(mCouponCombinator.pay(2200, true, new int[]{3, 2, 3, 4}), is(new int[]{2, 1, 2, 3}));
    }

    @Test
    public void payAllCouponNotPizzaTest(){
        assertThat(mCouponCombinator.pay(1400, false, new int[]{2, 1, 3, 2}), is(new int[]{2, 0, 2, 0}));
    }
}