create index IX_DFCD83EC on panasonic_Product (productName[$COLUMN_LENGTH:75$]);
create index IX_61739112 on panasonic_Product (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_72713414 on panasonic_Product (uuid_[$COLUMN_LENGTH:75$], groupId);