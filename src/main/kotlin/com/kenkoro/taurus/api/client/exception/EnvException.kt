package com.kenkoro.taurus.api.client.exception

/**
 * An exception class which is used when a local environment
 * variable is not provided.
 */
class EnvException(message: String) : Exception(message)