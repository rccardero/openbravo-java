package com.ages.ejemplos;

import org.apache.log4j.*;
import org.openbravo.scheduling.ProcessBundle;
import org.openbravo.base.session.OBPropertiesProvider;

/**
 *
 * @author rccardero
 */
public class OBDotProperties implements org.openbravo.scheduling.Process {

  private static Logger log = Logger.getLogger(OBDotProperties.class);

  public void execute(ProcessBundle bundle) throws Exception {
         
         try{

            String attachmentFolderPath = OBPropertiesProvider.getInstance().getOpenbravoProperties().getProperty("attach.path");
            String sourcepath = OBPropertiesProvider.getInstance().getOpenbravoProperties().getProperty("source.path");
            String dburl= OBPropertiesProvider.getInstance().getOpenbravoProperties().getProperty("bbdd.url");
            String database = OBPropertiesProvider.getInstance().getOpenbravoProperties().getProperty("bbdd.sid");
            String systemUser = OBPropertiesProvider.getInstance().getOpenbravoProperties().getProperty("bbdd.systemUser");
            String systemPassword = OBPropertiesProvider.getInstance().getOpenbravoProperties().getProperty("bbdd.systemPassword");
            String sqlDateFormat = OBPropertiesProvider.getInstance().getOpenbravoProperties().getProperty("dateFormat.sql");

         }
 
        catch(Exception e){
        }
 
  }
}