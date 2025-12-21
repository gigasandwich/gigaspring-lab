<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>File upload</title>
    <link rel="stylesheet" href="../assets/style.css">
    <style>
        .container { max-width:800px; margin:24px auto; font-family:Arial,Helvetica,sans-serif }
        section { border:1px solid #ddd; padding:12px; margin:12px 0 }
        .result { background:#f7f7f7; padding:8px; min-height:36px }
        label { display:block; margin:6px 0 }
    </style>
</head>
<body>
<main class="container">
    <section>
        <h2>Upload as byte[]</h2>
        <form id="form-bytes" action="${pageContext.request.contextPath}/file-upload/input-single-upload" enctype="multipart/form-data" method="post">
            <label>File: <input type="file" name="file"></label>
            <button type="submit">Upload</button>
        </form>
    </section>

    <section>
        <h2>Upload multiple files as List&lt;Byte[]&gt;</h2>
        <form id="form-list" action="${pageContext.request.contextPath}/file-upload/input-multiple-upload" enctype="multipart/form-data" method="post">
            <label>Files: <input type="file" name="files" multiple></label>
            <button type="submit">Upload</button>
        </form>
    </section>
</main>

</body>
</html>