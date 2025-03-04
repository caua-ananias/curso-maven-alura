package br.com.alura.service;

import br.com.alura.model.Product;
import space.dynomake.libretranslate.Language;
import space.dynomake.libretranslate.Translator;

public class TranslateProductService {

    public void translate(Product product) {
        String name = Translator.translate(Language.ENGLISH, Language.PORTUGUESE, product.getName());
        String description = Translator.translate(Language.ENGLISH, Language.PORTUGUESE, product.getDescription());
        String category = Translator.translate(Language.ENGLISH, Language.PORTUGUESE, product.getCategory());

        product.setName(name);
        product.setDescription(description);
        product.setCategory(category);

    }
}
