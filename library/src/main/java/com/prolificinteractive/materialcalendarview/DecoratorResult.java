package com.prolificinteractive.materialcalendarview;

class DecoratorResult {
    public final DayViewDecorator decorator;
    public final DayViewFacade result;
    public final int state;
    
    DecoratorResult(DayViewDecorator decorator, DayViewFacade result) {
        this(decorator, result, 1);
    }

    DecoratorResult(DayViewDecorator decorator, DayViewFacade result, int state) {
        this.decorator = decorator;
        this.result = result;
        this.state = state;
    }
}
