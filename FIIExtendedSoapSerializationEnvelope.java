package com.example.demo.core;




import com.fasterxml.jackson.databind.util.JSONPObject;

import netscape.javascript.JSObject;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Properties;
import java.util.UUID;
import java.util.Vector;
import java.io.StringReader;
import java.io.StringWriter;


//If you have a compilation error here then you have to add a reference to ExKsoap2.jar to your project (you can find it in Libs folder in the generated zip file)
@SuppressWarnings("rawtypes")
public class FIIExtendedSoapSerializationEnvelope  extends FIIKPSPublicSoap {
	@SuppressWarnings("rawtypes")
	static HashMap< java.lang.String,java.lang.Class> classNames = new HashMap< java.lang.String, java.lang.Class>();
	public static String TAG="easyWSDL";

	protected static final int QNAME_NAMESPACE = 0;
	private static final String TYPE_LABEL = "type";
	public static final String xsd = null;
	private static final String NULL_LABEL = null;
	public boolean enableLogging;

	public static void setDateTimeConverter(FIIDateTimeConverter converter)
	{
		if(converter==null)
		{
			dateTimeConverter = new FIIStandardDateTimeConverter();
		}
		dateTimeConverter=converter;
	}

	public static FIIDateTimeConverter getDateTimeConverter()
	{
		return dateTimeConverter;
	}

	private static FIIDateTimeConverter dateTimeConverter = new FIIStandardDateTimeConverter();
	private String xsd2;
	private String string;
	private Class<UUID> class1;








	//super.writeProperty(writer,obj,type);

	//!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
	//!!!!! You can find a correct version in Lib folder from generated zip file!!!!!






	private String getInfo(Object object, Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	private Object createObject(Object soap, Class cl) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		Object obj=cl.newInstance();
		Method ctor = obj.getClass().getMethod("loadFromSoap",Object.class,FIIExtendedSoapSerializationEnvelope.class);
		ctor.invoke(obj,soap,this);
		return obj;
	}




	public static java.lang.Object getXSDType(java.lang.Object param)
	{
		if(param==null)
		{
			return null;
		}
		java.lang.Class obj=param.getClass();
		if(obj.equals(java.lang.String.class))
		{
			return "string";
		}
		if(obj.equals(int.class) || obj.equals(java.lang.Integer.class))
		{
			return "int";
		}
		if(obj.equals(float.class) || obj.equals(java.lang.Float.class))
		{
			return "float";
		}
		if(obj.equals(double.class) || obj.equals(java.lang.Double.class))
		{
			return "double";
		}
		if(obj.equals(java.math.BigDecimal.class))
		{
			return "decimal";
		}
		if(obj.equals(short.class) || obj.equals(java.lang.Short.class))
		{
			return "short";
		}
		if(obj.equals(long.class) || obj.equals(java.lang.Long.class))
		{
			return "long";
		}
		if(obj.equals(boolean.class) || obj.equals(java.lang.Boolean.class))
		{
			return "boolean";
		}
		java.lang.String xmlName=FIIHelper.getKeyByValue(classNames,obj);
		if(xmlName==null)
		{
			return obj;
		}
		return xmlName;
	}

}