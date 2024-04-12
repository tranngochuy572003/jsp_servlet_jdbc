package com.laptrinhjavaweb.utils;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class MessageUtil {
  public static void showMessage(HttpServletRequest request){
    if(request.getParameter("message")!=null){

      String messageReponse="";
      String alert ="";
      String message=request.getParameter("message");

      if(message.equals("insert_sucess")){

        messageReponse="Insert sucess";
        alert="sucess";

      } else if ( message.equals("update_sucess")) {
        messageReponse="Update sucess";
        alert="sucess";

      }else if ( message.equals("delete_sucess")) {
        messageReponse = "Delete sucess";
        alert = "sucess";
      }else if ( message.equals("error_system")) {
        messageReponse = "Error system";
        alert = "danger";
      }
      {


      }
    }



  }

}
