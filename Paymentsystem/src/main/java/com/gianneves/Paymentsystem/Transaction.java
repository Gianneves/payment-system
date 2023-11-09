package com.gianneves.Paymentsystem;

import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
    public Transaction withValue(BigDecimal value) {
        return new Transaction(
        this.id(), this.type, this.date(), value,
        this.cpf(), this.card(), this.hour(),
        this.ownerShop(), this.shopName());
    }

    public Transaction withDate(String date) throws ParseException {
        var dateFormat = new SimpleDateFormat("yyyyMMdd");
        var newDate = dateFormat.parse(date);

        return new Transaction(
                this.id(), this.type, new Date(newDate.getTime()), value,
                this.cpf(), this.card(), this.hour(),
                this.ownerShop(), this.shopName());
    }

    public Transaction withHour(String hour) throws ParseException {
        var dateFormat = new SimpleDateFormat("HHmmss");
        var newDate = dateFormat.parse(hour);

        return new Transaction(
                this.id(), this.type, this.date(), this.value(),
                this.cpf(), this.card(), new Time(newDate.getTime()),
                this.ownerShop(), this.shopName());
    }
}
