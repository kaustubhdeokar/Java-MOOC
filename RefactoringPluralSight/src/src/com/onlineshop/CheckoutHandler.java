package com.onlineshop;


import com.onlineshop.items.Item;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.List;

public class CheckoutHandler {

    private LocalDate deliveryWindowStart;
    private LocalDate deliveryWindowEnd;
    private boolean bCountDeliveryCharges = true;

    public double costWithVoucherDiscount(List<Item> items, String voucher) {
        double baseTotal = 0;

        for (Item item : items) {
            baseTotal = baseTotal + item.getPrice();
        }

        if (validateVoucher(voucher)) {
            baseTotal = calculateDiscount(baseTotal);
        } else {
            System.out.println("Invalid voucher");
        }
        return baseTotal;
    }

    private boolean validateVoucher(String voucher) {
        return voucher.equals("GIMME_DISCOUNT") || voucher.equals("CHEAPER_PLEASE");
    }

    private Double calculateDiscount(double amount) {
        return BigDecimal.valueOf(amount * 0.95).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }

    public void setDeliveryTimeWindow(LocalDate deliveryStart, LocalDate deliveryEnd) {
        this.deliveryWindowStart = deliveryStart;
        this.deliveryWindowEnd = deliveryEnd;

        System.out.println(String.format("Your Order will delivered some time between %s and %s", deliveryWindowStart, deliveryWindowEnd));
    }

    public double costWithMembershipandAddressBenefits(String membership, String address) {
        double baseTotal = 0;
        baseTotal += calculateMembershipDiscount(membership);
        if (!Double.isNaN(baseTotal) && !bCountDeliveryCharges) {
            return baseTotal;
        }

        baseTotal += calculateDeliverCharges(address);

        return baseTotal;
    }

    private Double calculateDeliverCharges(String address) {
        double deliveryCharges = 0;
        if (address.contains("US")) {
            deliveryCharges = deliveryCharges + 5;
        } else {
            deliveryCharges = deliveryCharges + 10;
        }
        return deliveryCharges;
    }

    private Double calculateMembershipDiscount(String membership) {
        if (membership.equalsIgnoreCase("GOLD")) {
            bCountDeliveryCharges = false;
            return 0.0;
        }
        return Double.NaN;
    }
}