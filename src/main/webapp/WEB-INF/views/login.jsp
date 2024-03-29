 <!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Login Form</title>
  <link rel="stylesheet" href='resources/css/style.css'>
</head>
<body>
  <section class="container">
    <div class="login">
      <h1>Login</h1>
      <c:url var="loginUrl" value="/login" />
      <form action="${loginUrl}" method="POST"  >
        <p><input type="text" name="login" value="" placeholder="Username"></p>
        <p><input type="password" name="password" value="" placeholder="Password"></p>
        <p class="remember_me">
         <input type="hidden" name="${_csrf.parameterName}"
                                value="${_csrf.token}" />
          <label>
            <input type="checkbox" name="remember_me" id="remember_me">
            Remember me on this computer
          </label>
        </p>
        <p class="submit"><input type="submit" name="commit" value="Login"></p>
      </form>
    </div>
  </section>
</body>
</html>