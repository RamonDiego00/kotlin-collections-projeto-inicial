package br.com.alura



fun testaComportamentoMap() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 64.0),
        3 to 50.0,
        4 to 100.0,
        5 to 100.0
    )

//    val valorPedido = pedidos.getValue(5)
//    println(valorPedido)
    println(pedidos.getOrElse(0, {
        "Não tem pedido"
    }))
    println(pedidos.getOrDefault(1, -1.0))
    println(pedidos.getOrDefault(2, -1.0))

    println(pedidos.keys)

    for (numero in pedidos.keys) {
        println("Pedido $numero")
    }

    println(pedidos.values)

    for (valor in pedidos.values) {
        println("Valor do pedido: $valor")
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }
    println(pedidosFiltrados)

    val pedidosAcima = pedidos.filterKeys { valor ->
        valor > 70.0
    }
    println(pedidosAcima)

    val pedidosPares = pedidos.filterValues { numero ->
        numero % 2 == 0.0
    }
    println(pedidosPares)

    println(pedidos + mapOf(7 to 90.0, 8 to 20.0))
    println(pedidos)

    println(pedidos - listOf(1, 2))
    println(pedidos)

//    pedidos.putAll(mapOf(7 to 90.0, 8 to 20.0))
    pedidos += (mapOf(7 to 90.0, 8 to 20.0))// TBM atualiza
    println(pedidos)

    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(50.0)

    pedidos.values.remove(100.0)
    println(pedidos)

    pedidos -= 6
    println(pedidos)
}

fun testaMap(pedidos: MutableMap<Int, Double>) {
    println(pedidos)
    val pedido = pedidos[1]
    pedido.let {
        println("pedidos $it")
    }
    for (p in pedidos) {
        println("numero do pedidos: ${p.key}")
        println("valor do pedidos: ${p.value}")
    }
    pedidos[4] = 70.0
    println(pedidos)
    pedidos.put(5, 85.0)
    println(pedidos)
    pedidos[1] = 100.0
    println(pedidos)
    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)

    pedidos.remove(6)
    println(pedidos)
    pedidos.remove(3, 30.0) //só remove se o value for 30
}