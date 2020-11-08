package com.example.demo.service;


import com.example.demo.model.ScrapperHandler;
import com.example.demo.model.StatusEnum;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

import static com.example.demo.model.StatusEnum.*;

@Service
public class ScrapperService {

    private StatusEnum setStatus(String param){

        if(param.equals("UNDEFINED"))
            return UNDEFINED;
        if(param.equals("FAILED"))
            return FAILED;
        if(param.equals("SUCCEED"))
            return SUCCEED;
        return null;
        // to jest do poprawy najlepij na switch..
    }

    private StatusEnum setLastRun(String param){

        if(param.equals("UNDEFINED"))
            return UNDEFINED;
        if(param.equals("FAILED"))
            return FAILED;
        if(param.equals("SUCCEED"))
            return SUCCEED;
        return null;
        // to jest do poprawy najlepij na switch..
    }


    ScrapperHandler generali = new ScrapperHandler("Generali", setStatus("SUCCEED"), "", "");
    ScrapperHandler pzu_generate = new ScrapperHandler("PZU Generate", setStatus("UNDEFINED"), "", "");
    ScrapperHandler pzu_download = new ScrapperHandler("PZU Download", setStatus("UNDEFINED"), "", "");
    ScrapperHandler uniqua = new ScrapperHandler("Uniqua", setStatus("FAILED"), "", "");
    ScrapperHandler tuw = new ScrapperHandler("TUW", setStatus("UNDEFINED"), "", "");
    ScrapperHandler tuz = new ScrapperHandler("TUZ", setStatus("SUCCEED"), "", "");

    public List<ScrapperHandler> addToList() {

        List<ScrapperHandler> list;
        return list = Arrays.asList(generali, pzu_generate, pzu_download, uniqua, tuw, tuz);
    }
}
