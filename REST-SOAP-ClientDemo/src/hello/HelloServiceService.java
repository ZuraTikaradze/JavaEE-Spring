/**
 * HelloServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package hello;

public interface HelloServiceService extends javax.xml.rpc.Service {
    public java.lang.String getHelloServicePortAddress();

    public hello.HelloService getHelloServicePort() throws javax.xml.rpc.ServiceException;

    public hello.HelloService getHelloServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
