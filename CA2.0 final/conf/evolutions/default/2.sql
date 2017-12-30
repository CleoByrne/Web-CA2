# --- !Ups

ALTER TABLE PRODUCT ADD sale_price double;
ALTER TABLE PRODUCT ADD on_sale integer;
ALTER TABLE USER ADD phone_number varchar2(255);
ALTER TABLE ORDER_ITEM ADD sale_price double;
ALTER TABLE ORDER_ITEM ADD on_sale integer not null;

# --- !Downs

ALTER TABLE PRODUCT DROP sale_price;
ALTER TABLE PRODUCT DROP on_sale;
ALTER TABLE USER DROP phone_number;
ALTER TABLE ORDER_ITEM DROP sale_price;
ALTER TABLE ORDER_ITEM DROP on_sale;