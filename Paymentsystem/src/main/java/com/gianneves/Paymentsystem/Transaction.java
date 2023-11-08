package com.gianneves.Paymentsystem;

import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Date;

public record Transaction(
        Long id,
        Integer type,
        Date date,
        BigDecimal value,
        Long cpf,
        String card,
        Time hour,
        String ownerShop,
        String shopName
) {
}
