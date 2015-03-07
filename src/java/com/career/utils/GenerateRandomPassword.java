/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.utils;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 *
 * @author emam
 */
public class GenerateRandomPassword {

    private SecureRandom random = new SecureRandom();

    private String Resetpassword() {
        return new BigInteger(50, random).toString(32);
    }
}
