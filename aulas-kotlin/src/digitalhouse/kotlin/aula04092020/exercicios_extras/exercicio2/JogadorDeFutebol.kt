package digitalhouse.kotlincomobjetos.aula04092020.exercicios_extras.exercicio2

class JogadorDeFutebol(val nome: String, var energia: Float, var alegria: Float, var gols: Int, var experiencia: Int){

    fun fazerGol(){
        energia -=5
        alegria +=10
        gols +=1
        println("GOOOOL")
    }

    fun correr(){
        energia-=10
        println("Cansei")
    }


}