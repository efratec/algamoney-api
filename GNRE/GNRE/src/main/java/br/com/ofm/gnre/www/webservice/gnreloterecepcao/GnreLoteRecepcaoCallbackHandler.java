
/**
 * GnreLoteRecepcaoCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

    package br.com.ofm.gnre.www.webservice.gnreloterecepcao;

    /**
     *  GnreLoteRecepcaoCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class GnreLoteRecepcaoCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public GnreLoteRecepcaoCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public GnreLoteRecepcaoCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for processar method
            * override this method for handling normal response from processar operation
            */
           public void receiveResultprocessar(
                    br.com.ofm.gnre.www.webservice.gnreloterecepcao.GnreLoteRecepcaoStub.ProcessarResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from processar operation
           */
            public void receiveErrorprocessar(java.lang.Exception e) {
            }
                


    }
    