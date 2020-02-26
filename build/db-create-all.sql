create table bills_table (
  bill_id                       serial not null,
  bill_name                     varchar(255) not null,
  amount                        float not null,
  payee_user_id                 integer not null,
  constraint uq_bills_table_payee_user_id unique (payee_user_id),
  constraint pk_bills_table primary key (bill_id)
);

create table users_table (
  user_id                       serial not null,
  first_name                    varchar(100) not null,
  email                         varchar(255) not null,
  constraint uq_users_table_email unique (email),
  constraint pk_users_table primary key (user_id)
);

alter table bills_table add constraint fk_bills_table_payee_user_id foreign key (payee_user_id) references users_table (user_id) on delete restrict on update restrict;
