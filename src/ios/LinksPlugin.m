#import "LinksPlugin.h"
#import <Cordova/CDV.h>

@implementation LinksPlugin

- (void)openLink:(CDVInvokedUrlCommand*)command{
    NSString* link = [command.arguments objectAtIndex:0];
    [[UIApplication sharedApplication] openURL:[NSURL URLWithString:link]];
    CDVPluginResult* pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:link];
    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end