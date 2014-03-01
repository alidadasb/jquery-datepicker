<!DOCTYPE html>
<html>
	<head>

		<meta name="layout" content="main"/>
		<title>Welcome to Grails</title>

        <r:script>
            $('#timezone_example_3').datetimepicker({
                timeFormat: 'HH:mm z',
                timezone: 'MT',
                timezoneList: [
                    { value: 'ET', label: 'Eastern'},
                    { value: 'CT', label: 'Central' },
                    { value: 'MT', label: 'Mountain' },
                    { value: 'PT', label: 'Pacific' }
                ]
            });

        </r:script>
	</head>
	<body>

    <g:form controller="calender" action="save">
        <input name="endDate" id="timezone_example_3" type="text"/>
        <button >Save</button>
    </g:form>




	</body>
</html>
