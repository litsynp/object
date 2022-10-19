package com.litsynp.ch2.movie.pricing;

import com.litsynp.ch2.money.Money;
import com.litsynp.ch2.movie.DiscountPolicy;
import com.litsynp.ch2.movie.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
