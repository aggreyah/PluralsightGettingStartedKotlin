import com.aggreyah.Providers
import java.security.Security

fun main(args: Array<String>) {
//    val providers = Providers()
    val allProviders = Providers.getProviders()

    val it = allProviders.iterator()
    while (it.hasNext()){
        val provider = it.next()
        println(provider.name)

        provider.forEach{key, value -> println("\t$key: $value")}
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