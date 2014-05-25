var exec = require('cordova/exec');
/**
 * Constructor
 */
function LinksPlugin() {}

TtsPlugin.prototype.openLink = function(link) {
    exec(function(result){
        },
        function(error){
        },
        "LinksPlugin",
        "openLink",
        [link]
    );
}


var linksPlugin = new LinksPlugin();
module.exports = linksPlugin