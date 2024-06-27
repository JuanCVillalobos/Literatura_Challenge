package com.aluracursos.JC.service;

public interface IConvierteDatos {
    <T> T convertirDatos(String json, Class<T> clase);
}
