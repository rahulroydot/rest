package com.blog.api.internal.resource.v1_0;

import com.blog.api.dto.v1_0.Blogs;
import com.blog.api.resource.v1_0.BlogsResource;
import com.liferay.blogs.model.BlogsEntry;
import com.liferay.blogs.service.BlogsEntryLocalServiceUtil;
import com.liferay.blogs.service.BlogsEntryServiceUtil;
import com.liferay.blogs.service.persistence.BlogsEntryUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.vulcan.pagination.Page;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author me
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/blogs.properties",
	scope = ServiceScope.PROTOTYPE, service = BlogsResource.class
)
public class BlogsResourceImpl extends BaseBlogsResourceImpl {
	
	public  Blogs postBlog(Blogs blog) throws PortalException {
		
		try{
			
			 long entryId = CounterLocalServiceUtil.increment();
			 
			  BlogsEntry blogsEntry =BlogsEntryUtil.create(entryId);
			 
		ServiceContext scontext = new ServiceContext();

		scontext.setScopeGroupId(20121L);
		
		BlogsEntryServiceUtil.addEntry(	blog.getHeadline(), blog.getHeadline(), blog.getArticleBody(), "this is content", new Date().getMonth(),	new Date().getDay(), new Date().getYear(), new Date().getHours(), new Date().getMinutes(),	true, false, new String [0] , null,
				null, null, scontext);
	}

		catch(Exception e) {
			e.printStackTrace();
		}
		return blog;
		
		
	}
	
	
	public Page<Blogs> getBlogs(){
		
		List<BlogsEntry> allblogs = BlogsEntryLocalServiceUtil.getBlogsEntries(0, BlogsEntryLocalServiceUtil.getBlogsEntriesCount());
		
	   List<Blogs> blog = new ArrayList<>();
	   for (BlogsEntry blogEntry : allblogs) {
		   Blogs b = new Blogs();
		   b.setArticleBody(blogEntry.getDescription());
		   b.setHeadline(blogEntry.getTitle());
		   b.setId(blogEntry.getEntryId());
		   blog.add(b);
	   }
	   Page<Blogs> ans = Page.of(blog);
		return ans;
		
		
	}
	
	
}