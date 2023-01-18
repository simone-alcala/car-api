package com.aceleracao.cars.dto;

public record CarDTO(
  String modelo, 
  String fabricante, 
  String dataFabricacao, 
  Double valor, 
  Integer anoModelo) {
  
}
