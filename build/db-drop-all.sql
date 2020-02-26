alter table if exists bills_table drop constraint if exists fk_bills_table_payee_user_id;

drop table if exists bills_table cascade;

drop table if exists users_table cascade;

