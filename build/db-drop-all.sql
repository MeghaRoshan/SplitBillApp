alter table if exists bills_table drop constraint if exists fk_bills_table_payee_user_id;

alter table if exists users_table drop constraint if exists fk_users_table_bill_bill_id;
drop index if exists ix_users_table_bill_bill_id;

drop table if exists bills_table cascade;

drop table if exists users_table cascade;

