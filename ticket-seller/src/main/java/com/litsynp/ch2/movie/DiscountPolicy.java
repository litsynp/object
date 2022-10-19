package com.litsynp.ch2.movie;

import com.litsynp.ch2.money.Money;

public interface DiscountPolicy {

    Money calculateDiscountAmount(Screening screening);
}
