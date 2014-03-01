
modules = {
   jqueryUiTimePicker {
      dependsOn("jquery", "jquery-ui", "jquery-theme")
      resource url: [plugin: 'jqueryUiTimepicker', dir:'js', file: "jquery-ui-timepicker-addon.js"], disposition: "head"
      resource url: [plugin: 'jqueryUiTimepicker', dir:'css', file: "jquery-ui-timepicker-addon.css"], disposition: "head"
   }
}
