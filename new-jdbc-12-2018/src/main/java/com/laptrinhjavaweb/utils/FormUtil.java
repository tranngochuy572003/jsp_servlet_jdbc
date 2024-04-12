package com.laptrinhjavaweb.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.codehaus.jackson.map.util.BeanUtil;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;

public class FormUtil {
  public static <T> T toModel (Class <T> clazz, HttpServletRequest request) throws InstantiationException, IllegalAccessException {
    T object = null;
    try {
      object=clazz.newInstance();
      BeanUtils.populate(object,request.getParameterMap());
    } catch (InstantiationException |IllegalAccessException |InvocationTargetException e) {
      System.out.println(e.getMessage());
    }
    return object;


  }
}
