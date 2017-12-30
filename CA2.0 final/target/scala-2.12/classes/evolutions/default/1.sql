# --- !Ups
create table contact (
  email                         varchar(255),
  first_name                    varchar(255),
  last_name                     varchar(255),
  phone_number                  varchar(255),
  subject                       varchar(255),
  comment                       varchar(2000),
  constraint pk_contact primary key (email)
);

create table order_item (
  id                            bigint auto_increment not null,
  order_id                      bigint,
  cart_id                       bigint,
  product_id                    bigint,
  quantity                      integer not null,
  price                         double not null,
  constraint pk_order_item primary key (id)
);

create table product (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  category                      varchar(255),
  description_s                 varchar(255),
  description_l                 varchar(4000),
  stock                         integer not null,
  price                         double not null,
  spec1                         varchar(255),
  spec2                         varchar(255),
  spec3                         varchar(255),
  constraint pk_product primary key (id)
);

create table shop_order (
  id                            bigint auto_increment not null,
  order_date                    timestamp,
  customer_email                varchar(255),
  constraint pk_shop_order primary key (id)
);

create table shopping_cart (
  id                            bigint auto_increment not null,
  customer_email                varchar(255),
  constraint uq_shopping_cart_customer_email unique (customer_email),
  constraint pk_shopping_cart primary key (id)
);

create table user (
  role                          varchar(255),
  email                         varchar(255) not null,
  first_name                    varchar(255),
  last_name                     varchar(255),
  password                      varchar(255),
  street1                       varchar(255),
  street2                       varchar(255),
  town                          varchar(255),
  post_code                     varchar(255),
  credit_card                   varchar(255),
  constraint pk_user primary key (email)
);

alter table order_item add constraint fk_order_item_order_id foreign key (order_id) references shop_order (id) on delete restrict on update restrict;
create index ix_order_item_order_id on order_item (order_id);

alter table order_item add constraint fk_order_item_cart_id foreign key (cart_id) references shopping_cart (id) on delete restrict on update restrict;
create index ix_order_item_cart_id on order_item (cart_id);

alter table order_item add constraint fk_order_item_product_id foreign key (product_id) references product (id) on delete restrict on update restrict;
create index ix_order_item_product_id on order_item (product_id);

alter table shop_order add constraint fk_shop_order_customer_email foreign key (customer_email) references user (email) on delete restrict on update restrict;
create index ix_shop_order_customer_email on shop_order (customer_email);

alter table shopping_cart add constraint fk_shopping_cart_customer_email foreign key (customer_email) references user (email) on delete restrict on update restrict;


# --- !Downs

alter table order_item drop constraint if exists fk_order_item_order_id;
drop index if exists ix_order_item_order_id;

alter table order_item drop constraint if exists fk_order_item_cart_id;
drop index if exists ix_order_item_cart_id;

alter table order_item drop constraint if exists fk_order_item_product_id;
drop index if exists ix_order_item_product_id;

alter table shop_order drop constraint if exists fk_shop_order_customer_email;
drop index if exists ix_shop_order_customer_email;

alter table shopping_cart drop constraint if exists fk_shopping_cart_customer_email;

drop table if exists order_item;

drop table if exists product;

drop table if exists shop_order;

drop table if exists shopping_cart;

drop table if exists user;

