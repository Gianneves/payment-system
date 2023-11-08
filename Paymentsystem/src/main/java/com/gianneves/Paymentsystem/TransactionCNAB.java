package com.gianneves.Paymentsystem;

import java.math.BigDecimal;

public record TransactionCNAB(
        Integer type,
        String date,
        BigDecimal value,
        Long cpf,
        String card,
        String hour,
        String ownerShop,
        String shopName) {
}
