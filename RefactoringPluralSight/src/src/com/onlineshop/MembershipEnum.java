package com.onlineshop;

public enum MembershipEnum {


    PLATINUM(1),
    GOLD(2),
    SILVER(3);

    private int rank;

    MembershipEnum(int i) {
        rank = i;
    }
    public int getRank(){
        return rank;
    }
}
