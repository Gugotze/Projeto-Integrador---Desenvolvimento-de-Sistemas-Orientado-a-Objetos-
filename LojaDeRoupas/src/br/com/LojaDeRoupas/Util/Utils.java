/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.LojaDeRoupas.Util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Utils {
    
    public static void mostrarTelaErro(Exception ex, 
            HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String msgErro = ex.getMessage();
        request.setAttribute("msgErro", msgErro);
        RequestDispatcher requestDispatcher = request
                 .getRequestDispatcher("/erro.jsp");
        requestDispatcher.forward(request, response);
    }
    
    public static void mostrarTelaSucesso(HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("sucesso.jsp");
    }
    
    public static String convertToMd5(final String md5) throws UnsupportedEncodingException {
        StringBuffer sb=null;
        try {
            final java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            final byte[] array = md.digest(md5.getBytes("UTF-8"));
            sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString();
        } catch (final java.security.NoSuchAlgorithmException e) {
        }
        return sb.toString();
    }
}
