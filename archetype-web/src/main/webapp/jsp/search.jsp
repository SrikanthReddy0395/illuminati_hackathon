<html>
<head>
    <title>Search Trades</title>
    <style>
        #search_container {
            margin-left: auto;
		    margin-right: auto;
		    width: 350px;
		    margin-top: 30px;
        }
        .row {
            width:300px;
            padding:5px;
            text-align:center;
        }
        .label {
            float:left
        }
        .element {
            float:right
        }
        .clear {
            clear:both
        }
    </style>
</head>
<body>
<form>
<div id="search_container">
    <div class="row">
        <div><h2 style="text-align: center;">Search Trades</h2></div>
    </div>
    <div class="row">
        <div class="label">Trader Name:</div><div class="element"><input name="employeeName"/></div>
        <div class="clear"></div>
    </div>
    <div class="row">
        <div class="label">Trade Id:</div><div class="element"><input name="employeeId"/></div>
        <div class="clear"></div>
    </div>
    <div class="row">
        <div style="display:inline"><input type="button" value="Search"/></div>
        <div class="clear"></div>
    </div>
</div>
</form>
</body>
</html>