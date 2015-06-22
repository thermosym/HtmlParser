package ym.dev.htmlparser.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class HtmlUtil {

	public static Document getHtmlDocument(String url) throws Exception{
		Document doc = Jsoup.connect(url).get();
		return doc;
	}
}
