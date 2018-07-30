package br.com.softplan.sider.mat.poc.price.comparator.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.softplan.sider.mat.poc.price.comparator.crawler.BuscapeCrawler;

@CrossOrigin
@RestController
@RequestMapping(path = "/v1.0/comparator", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
public class PriceComparatorController {

    @RequestMapping(method = RequestMethod.POST)
    public Holder<CatalogoDTO> compararPrecos(@RequestBody String descricaoMaterial) throws UnsupportedEncodingException {
        BuscapeCrawler crawler = new BuscapeCrawler();
        Holder<CatalogoDTO> holder = new Holder<>(crawler.extrair(descricaoMaterial));
        return holder;
    }
}
