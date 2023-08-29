package com.blog.api.internal.graphql.mutation.v1_0;

import com.blog.api.dto.v1_0.Blogs;
import com.blog.api.resource.v1_0.BlogsResource;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;

import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author me
 * @generated
 */
@Generated("")
public class Mutation {

	public static void setBlogsResourceComponentServiceObjects(
		ComponentServiceObjects<BlogsResource>
			blogsResourceComponentServiceObjects) {

		_blogsResourceComponentServiceObjects =
			blogsResourceComponentServiceObjects;
	}

	@GraphQLField(description = "Creates a new BlogPost")
	public Blogs createBlog(@GraphQLName("blogs") Blogs blogs)
		throws Exception {

		return _applyComponentServiceObjects(
			_blogsResourceComponentServiceObjects,
			this::_populateResourceContext,
			blogsResource -> blogsResource.postBlog(blogs));
	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private <T, E1 extends Throwable, E2 extends Throwable> void
			_applyVoidComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeConsumer<T, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			unsafeFunction.accept(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(BlogsResource blogsResource)
		throws Exception {

		blogsResource.setContextAcceptLanguage(_acceptLanguage);
		blogsResource.setContextCompany(_company);
		blogsResource.setContextHttpServletRequest(_httpServletRequest);
		blogsResource.setContextHttpServletResponse(_httpServletResponse);
		blogsResource.setContextUriInfo(_uriInfo);
		blogsResource.setContextUser(_user);
		blogsResource.setGroupLocalService(_groupLocalService);
		blogsResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<BlogsResource>
		_blogsResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}