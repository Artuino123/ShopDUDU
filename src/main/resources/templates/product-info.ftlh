<!DOCTYPE html>
<html>
<head>
    <title>ShopDUDU </title>
</head>
<body>
<h1>ShopDUDU</h1>
<h4>Подробная информация о товаре</h4>
<b>Название товара: </b>${product.title}<br>
<b>Описание товара: </b>${product.description}<br>
<b>Цена товара: </b>${product.price}<br>
<b>Страна производства товара: </b>${product.city}<br>
<hr>
<form action="/product/delete/${product.id}" method="post">
    <input type="submit" value="Удалить товар">
</form>
</body>
</html>