<<<<<<< HEAD
#cordova3-links open plugin
=======================

Used to open links in related application with Cordova3 / Ios


##INSTALLATION

In your Cordova project directory : 
cordova plugin add https://github.com/steevelefort/cordova3-ios-tts-plugin

Verify if you config.xml file contains :

&lt;feature name="TtsPlugin"&gt;
	    &lt;param name="ios-package" value="TtsPlugin" /&gt;
&lt;/feature&gt;

##USE IT

ttsPlugin.setRate(rate); // Set voice speed : default is "0.2"

ttsPlugin.setLanguage(lang); // Set voice language : default is "en-US"

ttsPlugin.initTTS(successCallBack, failCallBack); // Init Plugin : failCallBack doesn't work yet

ttsPlugin.speak("Hello"); // Say Hello

ttsPlugin.stopSpeaking(); // Try to stop speaking
=======
cordova-links-plugin
====================

A cordova plugin for opening links with required application
>>>>>>> 2e78e9806f5c0dae3c6924c5c9ef5eadfe4c35ef
