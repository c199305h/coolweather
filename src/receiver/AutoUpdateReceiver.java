package receiver;

import service.AutoUpdateService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AutoUpdateReceiver extends BroadcastReceiver{

	public void onReceive(Context context,Intent intent){
		Intent i=new Intent(context,AutoUpdateService.class);
		context.startActivity(i);
	}
}
