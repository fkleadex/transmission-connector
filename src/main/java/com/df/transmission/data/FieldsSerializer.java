package com.df.transmission.data;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.ser.std.SerializerBase;


public class FieldsSerializer extends SerializerBase<Fields>{

    public FieldsSerializer() {
        this(null);
    }
   
    public FieldsSerializer(Class<Fields> t) {
        super(t);
    }
 
    @Override
	public void serialize(Fields value, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonGenerationException {
		jgen.writeStartArray();
		List<String> mainList=value.toList();
		for(String mainString: mainList) {
			jgen.writeString(mainString);
		}
		jgen.writeEndArray();		
	}
}
