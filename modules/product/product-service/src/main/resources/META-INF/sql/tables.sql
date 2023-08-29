create table panasonic_Product (
	uuid_ VARCHAR(75) null,
	productId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	productCost LONG,
	productName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	field1 VARCHAR(75) null,
	field2 BOOLEAN,
	field3 INTEGER,
	field4 DATE null,
	field5 VARCHAR(75) null
);