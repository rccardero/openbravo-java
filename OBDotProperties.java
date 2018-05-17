/* Explicacion en: 
*   http://openbravo3.foroactivo.com/t15-recuperando-propiedades-de-openbravo-properties-usando-dal#22
*/
package com.ages.ejemplos;

import org.apache.log4j.*;
import org.openbravo.scheduling.ProcessBundle;
import org.openbravo.base.session.OBPropertiesProvider;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author rccardero
 */
public class OBDotProperties implements org.openbravo.scheduling.Process {

  private static Logger log = Logger.getLogger(OBDotProperties.class);

  public void execute(ProcessBundle bundle) throws Exception {
         
         try {

            String attachmentFolderPath = OBPropertiesProvider.getInstance().getOpenbravoProperties().getProperty("attach.path");
            String sourcepath = OBPropertiesProvider.getInstance().getOpenbravoProperties().getProperty("source.path");
            String dburl= OBPropertiesProvider.getInstance().getOpenbravoProperties().getProperty("bbdd.url");
            String database = OBPropertiesProvider.getInstance().getOpenbravoProperties().getProperty("bbdd.sid");
            String systemUser = OBPropertiesProvider.getInstance().getOpenbravoProperties().getProperty("bbdd.systemUser");
            String systemPassword = OBPropertiesProvider.getInstance().getOpenbravoProperties().getProperty("bbdd.systemPassword");
            String sqlDateFormat = OBPropertiesProvider.getInstance().getOpenbravoProperties().getProperty("dateFormat.sql");

            //Formatear fecha
            String strDate = "01-01-2000";
            String format = OBPropertiesProvider.getInstance().getOpenbravoProperties().getProperty("dateFormat.java");
            SimpleDateFormat outputFormat = new SimpleDateFormat(format);
            Date date = outputFormat.parse(strDate);
         }
 
        catch(Exception e){
        }
 
  }
}