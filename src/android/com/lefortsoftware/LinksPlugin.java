    package com.lefortsoftware.linksplugin;

        import org.apache.cordova.CallbackContext;
        import org.apache.cordova.CordovaPlugin;
        import org.json.JSONArray;
        import org.json.JSONException;

        import android.speech.links.TextToSpeech;
        import java.util.Locale;

        import android.widget.Toast;

        public class LinksPlugin extends CordovaPlugin{

        TextToSpeech links;
        CallbackContext cbc;

        @Override
        public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

        cbc = callbackContext;

        if(action.equals("openlink")){
            String url = args.getString(0);
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(browserIntent);
            callbackContext.success("OK");
            return true;
        }

        callbackContext.success(action);
        return true;
        }
        }
