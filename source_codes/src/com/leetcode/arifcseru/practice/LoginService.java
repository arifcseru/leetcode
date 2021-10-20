/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru.practice;

/**
 *
 * @author Arifur Rahman
 */
public class LoginService {

    public boolean isValidPassword(String password) {
        boolean hasSpecialCharacters = false;
        boolean uppercaseFound = false;
        boolean lowercaseFound = false;
        boolean miminum6DigitsLong = false;
        Character[] specialCharacters = {'!','@','#','$','%','^','&','*','(',')','_','+'};
        /* password holds minimum 1 number, 
        1 special characters, 
        1 uppercase and 1 lowercase character
        minimum length is 6
         */
        return hasSpecialCharacters & uppercaseFound & lowercaseFound & miminum6DigitsLong;
    }
}
