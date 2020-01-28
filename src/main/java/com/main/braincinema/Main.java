package com.main.braincinema;

import com.main.braincinema.repository.utils.H2Utils;

/**
 * Created by OFedorenko on 01/16/20 braincinema.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("initializing db");
        H2Utils.initializeDb();
    }
}
