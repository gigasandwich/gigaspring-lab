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
        <form action="${pageContext.request.contextPath}/employees" method="POST">
            <div>
                <label for="e.name">Name</label>
                <input type="text" id="e.name" name="e.name" value="Joe">
            </div>
            <div>
                <label for="e.dept.name">Department name</label>
                <input type="text" id="e.dept.name" name="e.dept.name" value="Mama">
            </div>
            <div>
                <label>Behaviors</label>
                <div>
                    <label><input type="checkbox" name="e.behaviors" value="calm">Calm</label>
                </div>

                <div>
                    <label><input type="checkbox" name="e.behaviors" value="strict">Strict</label>
                </div>

                <div>
                    <label><input type="checkbox" name="e.behaviors" value="kind" checked>Kind</label>
                </div>

                <div>
                    <label><input type="checkbox" name="e.behaviors" value="gentle" checked>Gentle</label>
                </div>

                <div>
                    <label><input type="checkbox" name="e.behaviors" value="strong" checked>Strong</label>
                </div>
            </div>

            
            <div>
                <label>Friends</label>
                <input type="text" name="e.friends[0].name" value="Miary Zo">
                <input type="text" name="e.friends[1].name" value="Arthur Morgan">
                <input type="text" name="e.friends[2].name" value="Aiden Pearce">
            </div>

            <div>
                <label>Projects</label>
                <input type="text" name="e.projects[0][0].name" value="Portfolio">
                <input type="text" name="e.projects[0][1].name" value="Some project">
                <input type="text" name="e.projects[1][0].name" value="Another project">
            </div>

            <button>Save employee</button>
        </form>
    </div>
</body>
</html>