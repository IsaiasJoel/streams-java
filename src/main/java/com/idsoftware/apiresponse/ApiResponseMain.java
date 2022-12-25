package com.idsoftware.apiresponse;

import java.util.HashMap;
import java.util.Map;

public class ApiResponseMain {
    public static void main(String[] args) throws Exception{
        //función única que reciba un mapa (String,String) -> msj,OK
        //y devuelva el objeto completo

        Map<String,String> mapaRespuesta = new HashMap<>();
        mapaRespuesta.put("msj","E4");

        ApiResponse.findMessageCode(mapaRespuesta);
    }
}
