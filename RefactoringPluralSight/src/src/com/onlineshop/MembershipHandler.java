package com.onlineshop;

public class MembershipHandler {

    MembershipEnum membershipEnum;

    MembershipHandler(MembershipEnum membershipEnum) {
        this.membershipEnum = membershipEnum;
    }

    public double getDeliveryCharges(MembershipEnum membershipEnum){
        if(membershipEnum.getRank() == 1){
            return 0;
        }
        else if(membershipEnum == MembershipEnum.GOLD){
            return 0.5;
        }
    }

}
