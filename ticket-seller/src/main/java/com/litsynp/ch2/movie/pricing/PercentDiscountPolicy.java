package com.litsynp.ch2.movie.pricing;

import com.litsynp.ch2.money.Money;
import com.litsynp.ch2.movie.DiscountCondition;
import com.litsynp.ch2.movie.DiscountPolicy;
import com.litsynp.ch2.movie.Screening;

public class PercentDiscountPolicy extends DiscountPolicy {

    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
