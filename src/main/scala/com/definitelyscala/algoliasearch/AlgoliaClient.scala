package com.definitelyscala.algoliasearch

import scala.scalajs.js
import org.scalajs.dom.raw._

@js.native
trait AlgoliaClient extends js.Object {
  /**
   * Initialization of the index
   * @param name: index name
   * return algolia index object
   * https://github.com/algolia/algoliasearch-client-js#init-index---initindex
   */
  def initIndex(name: String): AlgoliaIndex = js.native
  /**
   * Query on multiple index
   * @param queries index name, query and query parameters
   * @param cb callback(err, res)
   * https://github.com/algolia/algoliasearch-client-js#multiple-queries---multiplequeries
   */
  def search(queries: js.Any, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
   * Query on multiple index
   * @param queries index name, query and query parameters
   * return {Promise}
   * https://github.com/algolia/algoliasearch-client-js#multiple-queries---multiplequeries
   */
  def search(queries: js.Any): Promise[AlgoliaResponse] = js.native
  /**
   * clear browser cache
   * https://github.com/algolia/algoliasearch-client-js#cache
   */
  def clearCache(): Unit = js.native
  /**
   * kill alive connections
   * https://github.com/algolia/algoliasearch-client-js#keep-alive
   */
  def destroy(): Unit = js.native
  /**
   * List all your indices along with their associated information (number of entries, disk size, etc.)
   * @param cb(err, res)
   * https://github.com/algolia/algoliasearch-client-js#list-indices---listindexes
   */
  def listIndexes(cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
   * List all your indices along with their associated information (number of entries, disk size, etc.)
   * return {Promise}
   * https://github.com/algolia/algoliasearch-client-js#list-indices---listindexes
   */
  def listIndexes(): Promise[js.Any] = js.native
  /**
   * Delete a specific index
   * @param name
   * @param cb(err, res)
   * https://github.com/algolia/algoliasearch-client-js#delete-index---deleteindex
   */
  def deleteIndex(name: String, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
   * Delete a specific index
   * @param name
   * return {Promise}
   * https://github.com/algolia/algoliasearch-client-js#delete-index---deleteindex
   */
  def deleteIndex(name: String): Promise[js.Any] = js.native
  /**
   * Copy an  index from a specific index to a new one
   * @param from origin index
   * @param to destination index
   * @param cb(err, res)
   * https://github.com/algolia/algoliasearch-client-js#copy-index---copyindex
   */
  def copyIndex(from: String, to: String, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
   * Copy an  index from a specific index to a new one
   * @param from origin index
   * @param to destination index
   * return {Promise}
   * https://github.com/algolia/algoliasearch-client-js#copy-index---copyindex
   */
  def copyIndex(from: String, to: String): Promise[js.Any] = js.native
  /**
   * Move index to a new one (and will overwrite the original one)
   * @param from origin index
   * @param to destination index
   * @param cb(err, res)
   * https://github.com/algolia/algoliasearch-client-js#move-index---moveindex
   */
  def moveIndex(from: String, to: String, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
   * Move index to a new one (and will overwrite the original one)
   * @param from origin index
   * @param to destination index
   * return {Promise}
   * https://github.com/algolia/algoliasearch-client-js#move-index---moveindex
   */
  def moveIndex(from: String, to: String): Promise[js.Any] = js.native
  /**
   * Generate a public API key
   * @param key api key
   * @param filters
   * https://github.com/algolia/algoliasearch-client-js#generate-key---generatesecuredapikey
   */
  def generateSecuredApiKey(key: String, filters: AlgoliaSecuredApiOptions): Unit = js.native
  /**
   * Perform multiple operations with one API call to reduce latency
   * @param action
   * @param cb(err, res)
   * https://github.com/algolia/algoliasearch-client-js#custom-batch---batch
   */
  def batch(action: AlgoliaAction, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
   * Perform multiple operations with one API call to reduce latency
   * @param action
   * return {Promise}
   * https://github.com/algolia/algoliasearch-client-js#custom-batch---batch
   */
  def batch(action: AlgoliaAction): Promise[js.Any] = js.native
  /**
   * Lists global API Keys
   * @param cb(err, res)
   * https://github.com/algolia/algoliasearch-client-js#backup--export-an-index---browse
   */
  def listUserKeys(cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
   * Lists global API Keys
   * return {Promise}
   * https://github.com/algolia/algoliasearch-client-js#backup--export-an-index---browse
   */
  def listUserKeys(): Promise[js.Any] = js.native
  /**
   * Add global API Keys
   * @param scopes
   * @param cb(err, res)
   * https://github.com/algolia/algoliasearch-client-js#add-user-key---adduserkey
   */
  def addUserKey(scopes: js.Array[String], cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
   * Add global API Key
   * @param scopes
   * @param options
   * @param cb(err, res)
   * https://github.com/algolia/algoliasearch-client-js#add-user-key---adduserkey
   */
  def addUserKey(scopes: js.Array[String], options: AlgoliaUserKeyOptions, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
   * Add global API Keys
   * @param scopes
   * @param options
   * return {Promise}
   * https://github.com/algolia/algoliasearch-client-js#add-user-key---adduserkey
   */
  def addUserKey(scopes: js.Array[String], options: AlgoliaUserKeyOptions): Promise[js.Any] = js.native
  /**
   * Update global API key
   * @param key
   * @param scopes
   * @param cb(err, res)
   * https://github.com/algolia/algoliasearch-client-js#update-user-key---updateuserkey
   */
  def updateUserKey(key: String, scopes: js.Array[String], cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
   * Update global API key
   * @param key
   * @param scopes
   * @param options
   * @param cb(err, res)
   * https://github.com/algolia/algoliasearch-client-js#update-user-key---updateuserkey
   */
  def updateUserKey(key: String, scopes: js.Array[String], options: AlgoliaUserKeyOptions, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
   * Update global API key
   * @param key
   * @param scopes
   * @param options
   * return {Promise}
   * https://github.com/algolia/algoliasearch-client-js#update-user-key---updateuserkey
   */
  def updateUserKey(key: String, scopes: js.Array[String], options: AlgoliaUserKeyOptions): Promise[js.Any] = js.native
  /**
   * Gets the rights of a global key
   * @param key
   * @param cb(err, res)
   * https://github.com/algolia/algoliasearch-client-js#update-user-key---updateuserkey
   */
  def getUserKeyACL(key: String, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
   * Gets the rights of a global key
   * @param key
   * return {Promise}
   * https://github.com/algolia/algoliasearch-client-js#update-user-key---updateuserkey
   */
  def getUserKeyACL(key: String): Promise[js.Any] = js.native
  /**
   * Deletes a global key
   * @param key
   * @param cb(err,res)
   * https://github.com/algolia/algoliasearch-client-js#delete-user-key---deleteuserkey
   */
  def deleteUserKey(key: String, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
   * Deletes a global key
   * @param key
   * return {Promise}
   * https://github.com/algolia/algoliasearch-client-js#delete-user-key---deleteuserkey
   */
  def deleteUserKey(key: String): Promise[js.Any] = js.native
  /**
   * Get 1000 last events
   * @param options
   * @param cb(err, res)
   * https://github.com/algolia/algoliasearch-client-js#get-logs---getlogs
   */
  def getLogs(options: LogsOptions, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
   * Get 1000 last events
   * @param options
   * return {Promise}
   * https://github.com/algolia/algoliasearch-client-js#get-logs---getlogs
   */
  def getLogs(options: LogsOptions): Promise[js.Any] = js.native
}