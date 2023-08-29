/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.product.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Product}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Product
 * @generated
 */
public class ProductWrapper
	extends BaseModelWrapper<Product>
	implements ModelWrapper<Product>, Product {

	public ProductWrapper(Product product) {
		super(product);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("productId", getProductId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("productCost", getProductCost());
		attributes.put("productName", getProductName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("field1", getField1());
		attributes.put("field2", isField2());
		attributes.put("field3", getField3());
		attributes.put("field4", getField4());
		attributes.put("field5", getField5());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long productId = (Long)attributes.get("productId");

		if (productId != null) {
			setProductId(productId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long productCost = (Long)attributes.get("productCost");

		if (productCost != null) {
			setProductCost(productCost);
		}

		String productName = (String)attributes.get("productName");

		if (productName != null) {
			setProductName(productName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String field1 = (String)attributes.get("field1");

		if (field1 != null) {
			setField1(field1);
		}

		Boolean field2 = (Boolean)attributes.get("field2");

		if (field2 != null) {
			setField2(field2);
		}

		Integer field3 = (Integer)attributes.get("field3");

		if (field3 != null) {
			setField3(field3);
		}

		Date field4 = (Date)attributes.get("field4");

		if (field4 != null) {
			setField4(field4);
		}

		String field5 = (String)attributes.get("field5");

		if (field5 != null) {
			setField5(field5);
		}
	}

	/**
	 * Returns the company ID of this product.
	 *
	 * @return the company ID of this product
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this product.
	 *
	 * @return the create date of this product
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the field1 of this product.
	 *
	 * @return the field1 of this product
	 */
	@Override
	public String getField1() {
		return model.getField1();
	}

	/**
	 * Returns the field2 of this product.
	 *
	 * @return the field2 of this product
	 */
	@Override
	public boolean getField2() {
		return model.getField2();
	}

	/**
	 * Returns the field3 of this product.
	 *
	 * @return the field3 of this product
	 */
	@Override
	public int getField3() {
		return model.getField3();
	}

	/**
	 * Returns the field4 of this product.
	 *
	 * @return the field4 of this product
	 */
	@Override
	public Date getField4() {
		return model.getField4();
	}

	/**
	 * Returns the field5 of this product.
	 *
	 * @return the field5 of this product
	 */
	@Override
	public String getField5() {
		return model.getField5();
	}

	/**
	 * Returns the group ID of this product.
	 *
	 * @return the group ID of this product
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this product.
	 *
	 * @return the modified date of this product
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this product.
	 *
	 * @return the primary key of this product
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the product cost of this product.
	 *
	 * @return the product cost of this product
	 */
	@Override
	public long getProductCost() {
		return model.getProductCost();
	}

	/**
	 * Returns the product ID of this product.
	 *
	 * @return the product ID of this product
	 */
	@Override
	public long getProductId() {
		return model.getProductId();
	}

	/**
	 * Returns the product name of this product.
	 *
	 * @return the product name of this product
	 */
	@Override
	public String getProductName() {
		return model.getProductName();
	}

	/**
	 * Returns the uuid of this product.
	 *
	 * @return the uuid of this product
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this product is field2.
	 *
	 * @return <code>true</code> if this product is field2; <code>false</code> otherwise
	 */
	@Override
	public boolean isField2() {
		return model.isField2();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this product.
	 *
	 * @param companyId the company ID of this product
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this product.
	 *
	 * @param createDate the create date of this product
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the field1 of this product.
	 *
	 * @param field1 the field1 of this product
	 */
	@Override
	public void setField1(String field1) {
		model.setField1(field1);
	}

	/**
	 * Sets whether this product is field2.
	 *
	 * @param field2 the field2 of this product
	 */
	@Override
	public void setField2(boolean field2) {
		model.setField2(field2);
	}

	/**
	 * Sets the field3 of this product.
	 *
	 * @param field3 the field3 of this product
	 */
	@Override
	public void setField3(int field3) {
		model.setField3(field3);
	}

	/**
	 * Sets the field4 of this product.
	 *
	 * @param field4 the field4 of this product
	 */
	@Override
	public void setField4(Date field4) {
		model.setField4(field4);
	}

	/**
	 * Sets the field5 of this product.
	 *
	 * @param field5 the field5 of this product
	 */
	@Override
	public void setField5(String field5) {
		model.setField5(field5);
	}

	/**
	 * Sets the group ID of this product.
	 *
	 * @param groupId the group ID of this product
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this product.
	 *
	 * @param modifiedDate the modified date of this product
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this product.
	 *
	 * @param primaryKey the primary key of this product
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the product cost of this product.
	 *
	 * @param productCost the product cost of this product
	 */
	@Override
	public void setProductCost(long productCost) {
		model.setProductCost(productCost);
	}

	/**
	 * Sets the product ID of this product.
	 *
	 * @param productId the product ID of this product
	 */
	@Override
	public void setProductId(long productId) {
		model.setProductId(productId);
	}

	/**
	 * Sets the product name of this product.
	 *
	 * @param productName the product name of this product
	 */
	@Override
	public void setProductName(String productName) {
		model.setProductName(productName);
	}

	/**
	 * Sets the uuid of this product.
	 *
	 * @param uuid the uuid of this product
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected ProductWrapper wrap(Product product) {
		return new ProductWrapper(product);
	}

}