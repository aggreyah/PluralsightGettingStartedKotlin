import java.security.Provider
import java.security.Security

fun getProvider(): List<Provider> {
    val providers = Security.getProviders() //returns an array of providers
    val listOfProviders: List<Provider> = providers.asList()
    return  listOfProviders
}