package com.example.demo.service;


import com.example.demo.model.ScrapperHandler;
import com.example.demo.model.StatusEnum;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

import static com.example.demo.model.StatusEnum.UNDEFINED;

@Service
public class ScrapperService {

    ScrapperHandler generali = new ScrapperHandler("Generali", UNDEFINED, "", "");
    ScrapperHandler pzu_generate = new ScrapperHandler("PZU Generate", UNDEFINED, "", "");
    ScrapperHandler pzu_download = new ScrapperHandler("PZU Download", UNDEFINED, "", "");
    ScrapperHandler uniqua = new ScrapperHandler("Uniqua", UNDEFINED, "", "");
    ScrapperHandler tuw = new ScrapperHandler("TUW", UNDEFINED, "", "");
    ScrapperHandler tuz = new ScrapperHandler("TUZ", UNDEFINED, "", "");

    public List<ScrapperHandler> addToList() {

        List<ScrapperHandler> list;
        return list = Arrays.asList(generali, pzu_generate, pzu_download, uniqua, tuw, tuz);
    }
}
