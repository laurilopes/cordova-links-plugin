    package com.lefortsoftware.linksplugin;

        import org.apache.cordova.CallbackContext;
        import org.apache.cordova.CordovaPlugin;
        import org.json.JSONArray;
        import org.json.JSONException;
        import android.content.Intent;
        import android.net.Uri;
        import android.app.Activity;

        public class LinksPlugin extends CordovaPlugin{

        CallbackContext cbc;

        @Override
        public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

        cbc = callbackContext;

        if(action.equals("openlink")){
            String url = args.getString(0);
            
            Context context=this.cordova.getActivity().getApplicationContext();
            
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            context.startActivity(browserIntent);
            
            callbackContext.success("OK");
            return true;
        }

        callbackContext.success(action);
        return true;
        }
        }
