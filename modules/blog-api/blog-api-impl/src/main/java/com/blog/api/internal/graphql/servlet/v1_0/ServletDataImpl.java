package com.blog.api.internal.graphql.servlet.v1_0;

import com.blog.api.internal.graphql.mutation.v1_0.Mutation;
import com.blog.api.internal.graphql.query.v1_0.Query;
import com.blog.api.resource.v1_0.BlogsResource;

import com.liferay.portal.vulcan.graphql.servlet.ServletData;

import javax.annotation.Generated;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

/**
 * @author me
 * @generated
 */
@Component(immediate = true, service = ServletData.class)
@Generated("")
public class ServletDataImpl implements ServletData {

	@Activate
	public void activate(BundleContext bundleContext) {
		Mutation.setBlogsResourceComponentServiceObjects(
			_blogsResourceComponentServiceObjects);

		Query.setBlogsResourceComponentServiceObjects(
			_blogsResourceComponentServiceObjects);
	}

	@Override
	public Mutation getMutation() {
		return new Mutation();
	}

	@Override
	public String getPath() {
		return "/blog-api-graphql/v1_0";
	}

	@Override
	public Query getQuery() {
		return new Query();
	}

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<BlogsResource>
		_blogsResourceComponentServiceObjects;

}