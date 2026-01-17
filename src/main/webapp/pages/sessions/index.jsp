<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Object handling</title>
    <link rel="stylesheet" href="../assets/style.css">
</head>
<body>
    <div>
        <form action="${pageContext.request.contextPath}/sessions" method="POST">
            <div>
                <label for="key">Key</label>
                <input type="text" id="key" name="key" value="main-character">
            </div>
            <div>
                <label for="value">Value</label>
                <input type="text" id="value" name="value" value="Miary Zo">
            </div>
            <button>Save to session</button>
        </form>
    </div>
</body>
</html>