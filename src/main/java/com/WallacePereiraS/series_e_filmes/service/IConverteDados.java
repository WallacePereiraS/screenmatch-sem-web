package com.WallacePereiraS.series_e_filmes.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
