#import <Cordova/CDV.h>
#import <AVFoundation/AVFoundation.h>

@interface LinksPlugin : CDVPlugin

- (void)openLink:(CDVInvokedUrlCommand*)command;

@end