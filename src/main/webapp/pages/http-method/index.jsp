<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HttpMethod</title>
    <link rel="stylesheet" href="../assets/style.css">
</head>
<body>
    <div>
        <form action="${pageContext.request.contextPath}/courses" method="GET">
            <button>GET</button>
        </form>
    </div>
    
    <div>
        <form action="${pageContext.request.contextPath}/courses" method="POST">
            <button>POST</button>
        </form>
    </div>
</body>
</html>