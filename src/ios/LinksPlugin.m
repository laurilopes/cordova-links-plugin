#import "LinksPlugin.h"
#import <Cordova/CDV.h>

@implementation LinksPlugin

- (void)openlink:(CDVInvokedUrlCommand*)command{
    NSString* url = [command.arguments objectAtIndex:0];
    [[UIApplication sharedApplication] openURL:[NSURL URLWithString:url]];
    CDVPluginResult* pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:url];
    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end