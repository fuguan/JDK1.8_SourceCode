package org.omg.IOP.CodecPackage;


/**
* org/omg/IOP/CodecPackage/InvalidTypeForEncoding.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u261/295/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Thursday, June 18, 2020 6:58:19 AM UTC
*/

public final class InvalidTypeForEncoding extends org.omg.CORBA.UserException
{

  public InvalidTypeForEncoding ()
  {
    super(InvalidTypeForEncodingHelper.id());
  } // ctor


  public InvalidTypeForEncoding (String $reason)
  {
    super(InvalidTypeForEncodingHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidTypeForEncoding
