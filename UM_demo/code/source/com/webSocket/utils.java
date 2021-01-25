package com.webSocket;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.util.Timer;
// --- <<IS-END-IMPORTS>> ---

public final class utils

{
	// ---( internal utility methods )---

	final static utils _instance = new utils();

	static utils _newInstance() { return new utils(); }

	static utils _cast(Object o) { return (utils)o; }

	// ---( server methods )---




	public static final void delay (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(delay)>> ---
		// @sigtype java 3.5
		// [i] field:0:required time
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	time = IDataUtil.getString( pipelineCursor, "time" );
		pipelineCursor.destroy();
		
		try {
			Thread.sleep(Integer.parseInt(time)*1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
		// pipeline
			
		// --- <<IS-END>> ---

                
	}
}

