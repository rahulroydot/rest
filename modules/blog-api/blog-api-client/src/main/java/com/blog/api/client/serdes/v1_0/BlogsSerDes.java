package com.blog.api.client.serdes.v1_0;

import com.blog.api.client.dto.v1_0.Blogs;
import com.blog.api.client.json.BaseJSONParser;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

/**
 * @author me
 * @generated
 */
@Generated("")
public class BlogsSerDes {

	public static Blogs toDTO(String json) {
		BlogsJSONParser blogsJSONParser = new BlogsJSONParser();

		return blogsJSONParser.parseToDTO(json);
	}

	public static Blogs[] toDTOs(String json) {
		BlogsJSONParser blogsJSONParser = new BlogsJSONParser();

		return blogsJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Blogs blogs) {
		if (blogs == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (blogs.getArticleBody() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"articleBody\": ");

			sb.append("\"");

			sb.append(_escape(blogs.getArticleBody()));

			sb.append("\"");
		}

		if (blogs.getHeadline() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"headline\": ");

			sb.append("\"");

			sb.append(_escape(blogs.getHeadline()));

			sb.append("\"");
		}

		if (blogs.getId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(blogs.getId());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		BlogsJSONParser blogsJSONParser = new BlogsJSONParser();

		return blogsJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Blogs blogs) {
		if (blogs == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (blogs.getArticleBody() == null) {
			map.put("articleBody", null);
		}
		else {
			map.put("articleBody", String.valueOf(blogs.getArticleBody()));
		}

		if (blogs.getHeadline() == null) {
			map.put("headline", null);
		}
		else {
			map.put("headline", String.valueOf(blogs.getHeadline()));
		}

		if (blogs.getId() == null) {
			map.put("id", null);
		}
		else {
			map.put("id", String.valueOf(blogs.getId()));
		}

		return map;
	}

	public static class BlogsJSONParser extends BaseJSONParser<Blogs> {

		@Override
		protected Blogs createDTO() {
			return new Blogs();
		}

		@Override
		protected Blogs[] createDTOArray(int size) {
			return new Blogs[size];
		}

		@Override
		protected void setField(
			Blogs blogs, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "articleBody")) {
				if (jsonParserFieldValue != null) {
					blogs.setArticleBody((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "headline")) {
				if (jsonParserFieldValue != null) {
					blogs.setHeadline((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "id")) {
				if (jsonParserFieldValue != null) {
					blogs.setId(Long.valueOf((String)jsonParserFieldValue));
				}
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		for (String[] strings : BaseJSONParser.JSON_ESCAPE_STRINGS) {
			string = string.replace(strings[0], strings[1]);
		}

		return string;
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(entry.getKey());
			sb.append("\": ");

			Object value = entry.getValue();

			Class<?> valueClass = value.getClass();

			if (value instanceof Map) {
				sb.append(_toJSON((Map)value));
			}
			else if (valueClass.isArray()) {
				Object[] values = (Object[])value;

				sb.append("[");

				for (int i = 0; i < values.length; i++) {
					sb.append("\"");
					sb.append(_escape(values[i]));
					sb.append("\"");

					if ((i + 1) < values.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(entry.getValue()));
				sb.append("\"");
			}
			else {
				sb.append(String.valueOf(entry.getValue()));
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}