<%--
  Created by IntelliJ IDEA.
  User: alaniz
  Date: 7/19/23
  Time: 3:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Pizza Order Form" />
    </jsp:include>
</head>
<body>
<header>
    <jsp:include page="partials/navbar.jsp" />
</header>
<main>
    <form action="/pizza-order" method="post">

        <input type="radio" name="size" value="medium" id="radioSize1">
        <label for="radioSize1"> Small (10") </label>
        <input type="radio" name="size" value="medium" id="radioSize2">
        <label for="radioSize2"> Medium (12") </label>
        <input type="radio" name="size" value="large" id="radioSize3">
        <label for="radioSize3"> Large (14") </label>

        <br>

        <input type="radio" name="crust" value="thin" id="radioCrust1">
        <label for="radioCrust1"> Thin Crust </label>
        <input type="radio" name="crust" value="hand_tossed" id="radioCrust2">
        <label for="radioCrust2"> Hand Tossed </label>
        <input type="radio" name="crust" value="original" id="radioCrust3">
        <label for="radioCrust3"> Original </label>

        <br>

        <input type="radio" name="sauce" value="marinara" id="radioSauce1">
        <label for="radioSauce1"> Marinara </label>
        <input type="radio" name="sauce" value="alfredo" id="radioSauce2">
        <label for="radioSauce2"> Alfredo </label>
        <input type="radio" name="sauce" value="bbq" id="radioSauce3">
        <label for="radioSauce3"> BBQ </label>
        <input type="radio" name="sauce" value="tomato" id="radioSauce4">
        <label for="radioSauce4"> Tomato </label>

        <br>

        <label for="pepperoni">
            <input id="pepperoni" type="checkbox" name="toppings" value="pepperoni"> Pepperoni
        </label>
        <label for="sausage">
            <input id="sausage" type="checkbox" name="toppings" value="sausage"> Sausage
        </label>
        <label for="bacon">
            <input id="bacon" type="checkbox" name="toppings" value="bacon"> Bacon
        </label>

        <br>

        <label for="green_pepper">
            <input id="green_pepper" type="checkbox" name="toppings" value="green_pepper"> Green Peppers
        </label>
        <label for="mushrooms">
            <input id="mushrooms" type="checkbox" name="toppings" value="mushrooms"> Mushrooms
        </label>
        <label for="onions">
            <input id="onions" type="checkbox" name="toppings" value="onions"> Onions
        </label>
        <label for="jalapeno_peppers">
            <input id="jalapeno_peppers" type="checkbox" name="toppings" value="jalapeno_peppers"> Jalapeno Peppers
        </label>

        <label for="delivery_address">Delivery Address:</label>
        <input type="text" name="delivery_address" id="delivery_address">

        <input type="submit">
    </form>
</main>
</body>
</html>
