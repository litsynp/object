package com.litsynp.ch2.movie.pricing;

import com.litsynp.ch2.money.Money;
import com.litsynp.ch2.movie.DiscountCondition;
import com.litsynp.ch2.movie.DiscountPolicy;
import com.litsynp.ch2.movie.Screening;

public class AmountDiscountPolicy extends DiscountPolicy {

    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
