package br.com.softplan.sider.mat.poc.price.comparator.crawler;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import br.com.softplan.sider.mat.poc.price.comparator.controller.CatalogoDTO;

public class BuscapeCrawler {

	public BuscapeCrawler() {
	}
	
	public  List<CatalogoDTO> extrair(String descricaoMaterial) throws UnsupportedEncodingException  {
		
	    String pagina = CrawlerUtils.openURLtoString("http://www.buscape.com.br/"+descricaoMaterial.replace("", "-"));
	    
        Document doc = Jsoup.parse(pagina);
        
        List<Element> elements = doc.getElementsByClass("inner");
        
        List<CatalogoDTO> catalogos = new ArrayList<CatalogoDTO>();
        
        for(Element element : elements){
            String precoProduto = element.getElementsByClass("bui-price__value").text();
            if(precoProduto == null || precoProduto.trim().equals("")){
                continue;
            }
            
            String nomeProduto = Jsoup.parse(element.getElementsByTag("a").attr("data-galabel")).text();
            String nomeFornecedor = element.getElementsByClass("bui-price__url-com").text();
            String linkImagemProduto = element.getElementsByClass("bui-product__rich-media").select("a img").attr("src");
            
            System.out.println("---------------- OFERTA ----------------");
            System.out.println(precoProduto);
            System.out.println(nomeProduto);
            System.out.println(nomeFornecedor);
            System.out.println(linkImagemProduto);
            catalogos.add(new CatalogoDTO(nomeProduto, precoProduto, nomeFornecedor, linkImagemProduto));
        }
        return catalogos;
	}
}
