package ym.dev.htmlparser.utils;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;


public class HtmlUtilTest {
	String urlStr = "http://www.recoveryversion.com.tw/gb/read_List.php?f_BookNo=1&f_ChapterNo=1&f_VerseNo=1";
	
	@Test
		public void testGetHtmlDocument() throws Exception{
			Document doc = HtmlUtil.getHtmlDocument(urlStr);
			assertEquals("网上圣经─圣经恢复本─创世记", doc.title());
			assertEquals(urlStr, doc.baseUri());
			Elements tableBlock = doc.getElementsByAttribute("bordercolorlight");
			tableBlock.forEach(elemnt ->{
				System.out.println("It have:" + elemnt.text());;
			});
			assertEquals(13, tableBlock.size());
		}
}
