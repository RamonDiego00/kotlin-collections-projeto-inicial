package br.com.alura

fun testaSet() {
    val assistiramCursoAndroid: Set<String> = setOf("Ramon", "Diego", "Maria", "Gui")
    val assistiramCursoKotlin: Set<String> = setOf("Ramon", "Diego", "Maria, Paulo")
//    val assistiramAmbos:Set<String> = assistiramCursoAndroid + assistiramCursoKotlin
    val assistiramAmbos = mutableSetOf<String>()

    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Ana")
    assistiramAmbos.add("Ana")
    println(assistiramAmbos)

    println(assistiramCursoAndroid + assistiramCursoKotlin)
    println(assistiramCursoKotlin union assistiramCursoAndroid)

    println(assistiramCursoKotlin - assistiramCursoAndroid)
    println(assistiramCursoKotlin subtract assistiramCursoAndroid)

    println(assistiramCursoKotlin intersect assistiramCursoAndroid)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Ramon")
    println(assistiramList)
    println(assistiramList.toSet())
}
