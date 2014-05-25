#cordova3-ios-links-plugin
=======================

A very small text to speech plugin for Cordova3 / Ios


##INSTALLATION

In your Cordova project directory : 
cordova plugin add https://github.com/steevelefort/cordova3-ios-links-plugin

Verify if you config.xml file contains :

&lt;feature name="LinksPlugin"&gt;
	    &lt;param name="ios-package" value="LinksPlugin" /&gt;
&lt;/feature&gt;

##USE IT

linksPlugin.setRate(rate); // Set voice speed : default is "0.2"

linksPlugin.setLanguage(lang); // Set voice language : default is "en-US"

linksPlugin.initTTS(successCallBack, failCallBack); // Init Plugin : failCallBack doesn't work yet

linksPlugin.speak("Hello"); // Say Hello

linksPlugin.stopSpeaking(); // Try to stop speaking