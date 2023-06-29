package eStoreProduct.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class InvoiceRowMapper implements RowMapper<Invoice> {
    @Override
    public Invoice mapRow(ResultSet rs, int rowNum) throws SQLException {
        Invoice invoice = new Invoice();
        invoice.setOrderId(rs.getLong("ordr_id"));
        invoice.setBillNo(rs.getString("ordr_billno"));
        invoice.setOrderDate(rs.getDate("ordr_odate").toLocalDate());
        invoice.setPaymentMode(rs.getString("ordr_paymode"));
        invoice.setShippingAddress(rs.getString("ordr_saddress"));
        invoice.setShipmentDate(rs.getDate("ordr_shipment_date").toLocalDate());
        invoice.setQuantity(rs.getInt("orpr_qty"));
        invoice.setGst(rs.getDouble("orpr_gst"));
        invoice.setPrice(rs.getDouble("orpr_price"));
        return invoice;
    }
}

