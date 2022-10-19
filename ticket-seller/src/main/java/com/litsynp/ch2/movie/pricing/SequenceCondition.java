package com.litsynp.ch2.movie.pricing;

import com.litsynp.ch2.movie.DiscountCondition;
import com.litsynp.ch2.movie.Screening;

public class SequenceCondition implements DiscountCondition {

    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
