package com.aggreyah

import java.security.Provider
import java.security.Security

data class ProviderDetails(val providerName: String, val name: String)
class Providers {
    fun getProviders() : List<Provider> {
        val providers = Security.getProviders()
        val  listOfProviders: List<Provider> = providers.asList()
        return listOfProviders
    }

    fun getAllProviders(): List<ProviderDetails>{
        val providers = Security.getProviders()
        val listOfProviders = mutableListOf<ProviderDetails>()
        providers.forEach {
            it ->
                val providerDetails = it.entries.map { entry -> ProviderDetails(it.name, entry.key.toString()) }
            listOfProviders.addAll(providerDetails)
        }
        return listOfProviders
    }

    companion object{
        fun getProviders() : List<Provider> {
            val providers = Security.getProviders()
            val  listOfProviders: List<Provider> = providers.asList()
            return listOfProviders
        }
    }
}