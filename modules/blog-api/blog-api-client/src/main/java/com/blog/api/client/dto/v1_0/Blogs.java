package com.blog.api.client.dto.v1_0;

import com.blog.api.client.function.UnsafeSupplier;
import com.blog.api.client.serdes.v1_0.BlogsSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author me
 * @generated
 */
@Generated("")
public class Blogs implements Cloneable, Serializable {

	public static Blogs toDTO(String json) {
		return BlogsSerDes.toDTO(json);
	}

	public String getArticleBody() {
		return articleBody;
	}

	public void setArticleBody(String articleBody) {
		this.articleBody = articleBody;
	}

	public void setArticleBody(
		UnsafeSupplier<String, Exception> articleBodyUnsafeSupplier) {

		try {
			articleBody = articleBodyUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String articleBody;

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public void setHeadline(
		UnsafeSupplier<String, Exception> headlineUnsafeSupplier) {

		try {
			headline = headlineUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String headline;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setId(UnsafeSupplier<Long, Exception> idUnsafeSupplier) {
		try {
			id = idUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long id;

	@Override
	public Blogs clone() throws CloneNotSupportedException {
		return (Blogs)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Blogs)) {
			return false;
		}

		Blogs blogs = (Blogs)object;

		return Objects.equals(toString(), blogs.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return BlogsSerDes.toJSON(this);
	}

}