/* Explicacion en: 
*   http://openbravo3.foroactivo.com/t16-recuperando-parametros-de-la-ventana-en-un-proceso-dal#23
*/
package com.ages.ejemplos;

import org.apache.log4j.*;
import org.openbravo.scheduling.ProcessBundle;

/**
 *
 * @author rccardero
 */
public class GetWindowsParams implements org.openbravo.scheduling.Process {

  private static Logger log = Logger.getLogger(GetWindowsParams.class);

  public void execute(ProcessBundle bundle) throws Exception {
         
         try {

            String tadId=(String) bundle.getParams().get("tabId");
            bundle.getParamsDeflated();
         }
 
        catch(Exception e){
        }
 
  }
}