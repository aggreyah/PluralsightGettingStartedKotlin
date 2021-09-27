import com.aggreyah.Providers
import java.security.Security

fun main(args: Array<String>) {
//    val providers = Providers()
    getAllProviders{ key, value ->
        println("\t --- $key: $value")
    }
}

fun getAllProviders(myFun: (String, String) -> Unit) {
    val allProviders = Providers.getProviders()

    val it = allProviders.iterator()
    while (it.hasNext()) {
        val provider = it.next()
        println(provider.name)

        provider.forEach { key, value -> myFun(key.toString(), value.toString()) }
    }
}

fun listProviders(){
    val providers = Security.getProviders()
    val it = providers.iterator()

    while (it.hasNext()){
        val provider = it.next()
        println(provider.name)

        provider.forEach{key, value -> println("\t$key: $value")}
    }
}