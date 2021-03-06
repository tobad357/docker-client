package de.gesellix.docker.client.network

import de.gesellix.docker.engine.EngineResponse

interface ManageNetwork {

//    connect     Connect a container to a network

    def connectNetwork(network, container)

//    create      Create a network

    def createNetwork(name)

    def createNetwork(name, config)

//    disconnect  Disconnect a container from a network

    def disconnectNetwork(network, container)

//    inspect     Display detailed information on one or more networks

    EngineResponse inspectNetwork(name)

//    ls          List networks

    EngineResponse networks()

    EngineResponse networks(query)

//    prune       Remove all unused networks

    def pruneNetworks()

    def pruneNetworks(query)

//    rm          Remove one or more networks

    def rmNetwork(name)
}
