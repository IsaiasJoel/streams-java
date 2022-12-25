package com.idsoftware.apiresponse;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;


@AllArgsConstructor
@Data
public class ApiResponse {
    private String code;
    private String message;

    public static ApiResponse findMessageCode(Map<String,String> respuestaBD) throws Exception{
        List<ApiResponse> listaMensajes = Arrays.asList(
            new ApiResponse("OK","OPERACIÓN EXITOSA"),
            new ApiResponse("E1","ERROR AL REALIZAR LA OPERACIÓN"),
            new ApiResponse("E2","LONGITUD DE CADENA FUERA DE LOS LIMITES"),
            new ApiResponse("E3","DATOS YA HAN SIDO REGISTRADOS"),
            new ApiResponse("E4","NO ES POSIBLE ELIMINAR DEBIDO A QUE EXISTE DEPENDENCIA CON OTRA ENTIDAD"),
            new ApiResponse("E5","CÓDIGO EXCEDIÓ EL LÍMITE"),
            new ApiResponse("E6","ALGUNOS DATOS SON OBLIGATORIOS")
        );

        //sacar el value
        var value = respuestaBD.get("msj");
        Predicate<ApiResponse> equalsPredicate = apiResponse -> apiResponse.getCode().equals(value);

        var response = listaMensajes.stream()
                .filter(equalsPredicate)
                .findFirst();

        System.out.println(response.orElse(null));
        return response.orElse(null);
    }
}