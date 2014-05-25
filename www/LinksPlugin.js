var exec = require('cordova/exec');
/**
 * Constructor
 */
function LinksPlugin() {}

LinksPlugin.prototype.openlink = function(url) {
    exec(function(result){
        },
        function(error){
        },
        "LinksPlugin",
        "openlink",
        [url]
    );
}

var linksPlugin = new LinksPlugin();
module.exports = linksPlugin