package com.definitelyscala.algoliasearch

import scala.scalajs.js
import org.scalajs.dom.raw._

@js.native
trait AlgoliaIndex extends js.Object {
  /**
         * Gets a specific object
         * @param objectID
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#find-by-ids---getobjects
         */
  def getObject(objectID: String, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Gets specific attributes from an object
         * @param objectID
         * @param attributes
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#find-by-ids---getobjects
         */
  def getObject(objectID: String, attributes: js.Array[String], cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Gets a list of objects
         * @param objectIDs
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#find-by-ids---getobjects
         */
  def getObjects(objectIDs: js.Array[String], cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Add a specific object
         * @param object without objectID
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#add-objects---addobjects
         */
  def addObject(`object`: js.Any, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Add a list of objects
         * @param object with objectID
         * @param objectID
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#add-objects---addobjects
         */
  def addObject(`object`: js.Any, objectID: String, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Add list of objects
         * @param objects
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#add-objects---addobjects
         */
  def addObjects(objects: js.Any, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Add or replace a specific object
         * @param object
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#update-objects---saveobjects
         */
  def saveObject(`object`: js.Any, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Add or replace several objects
         * @param objects
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#update-objects---saveobjects
         */
  def saveObjects(objects: js.Any, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Update parameters of a specific object
         * @param object
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#update-objects---saveobjects
         */
  def partialUpdateObject(`object`: js.Any, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Update parameters of a list of objects
         * @param objects
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#update-objects---saveobjects
         */
  def partialUpdateObjects(objects: js.Any, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Delete a specific object
         * @param objectID
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#delete-objects---deleteobjects
         */
  def deleteObject(objectID: String, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Delete a list of objects
         * @param objectIDs
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#delete-objects---deleteobjects
         */
  def deleteObjects(objectIDs: js.Array[String], cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Delete objects that matches the query
         * @param query
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#delete-by-query---deletebyquery
         */
  def deleteByQuery(query: String, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Delete objects that matches the query
         * @param query
         * @param params of the object
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#delete-by-query---deletebyquery
         */
  def deleteByQuery(query: String, params: js.Any, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Wait for an indexing task to be compete
         * @param taskID
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#wait-for-operations---waittask
         */
  def waitTask(taskID: Double, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Get an index settings
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#get-settings---getsettings
         */
  def getSettings(cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Set an index settings
         * @param settings
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#set-settings---setsettings
         */
  def setSettings(settings: AlgoliaIndexSettings, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Clear cache of an index
         * https://github.com/algolia/algoliasearch-client-js#cache
         */
  def clearCache(): Unit = js.native
  /**
         * Clear an index content
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#clear-index---clearindex
         */
  def clearIndex(cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Save a synonym object
         * @param synonym
         * @param options
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#save-synonym---savesynonym
         */
  def saveSynonym(synonym: AlgoliaSynonym, option: SynonymOption, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Save a synonym object
         * @param synonyms
         * @param options
         * @param cb(err, res)
         */
  def batchSynonyms(synonyms: js.Array[AlgoliaSynonym], options: SynonymOption, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Delete a specific synonym
         * @param identifier
         * @param options
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#batch-synonyms---batchsynonyms
         */
  def deleteSynonym(identifier: String, options: SynonymOption, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Clear all synonyms of an index
         * @param options
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#clear-all-synonyms---clearsynonyms
         */
  def clearSynonyms(options: SynonymOption, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Get a specific synonym
         * @param identifier
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#get-synonym---getsynonym
         */
  def getSynonym(identifier: String, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Search a synonyms
         * @param options
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#search-synonyms---searchsynonyms
         */
  def searchSynonyms(options: SearchSynonymOptions, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * List index user keys
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#list-api-keys---listapikeys
         */
  def listUserKeys(cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Add key for this index
         * @param scopes
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#add-user-key---adduserkey
         */
  def addUserKey(scopes: js.Array[String], cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Add key for this index
         * @param scopes
         * @param options
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#add-user-key---adduserkey
         */
  def addUserKey(scopes: js.Array[String], options: AlgoliaUserKeyOptions, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Update a key for this index
         * @param key
         * @param scopes
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#update-user-key---updateuserkey
         */
  def updateUserKey(key: String, scopes: js.Array[String], cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Update a key for this index
         * @param key
         * @param scopes
         * @param options
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#update-user-key---updateuserkey
         */
  def updateUserKey(key: String, scopes: js.Array[String], options: AlgoliaUserKeyOptions, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Gets the rights of an index specific key
         * @param key
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#get-key-permissions---getuserkeyacl
         */
  def getUserKeyACL(key: String, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Deletes an index specific key
         * @param key
         * @param cb(err, res)
         * https://github.com/algolia/algoliasearch-client-js#delete-user-key---deleteuserkey
         */
  def deleteUserKey(key: String, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Gets specific attributes from an object
         * @param objectID
         * @param attributes
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#find-by-ids---getobjects
         */
  def getObject(objectID: String, attributes: js.Array[String]): Promise[js.Any] = js.native
  /**
         * Gets a list of objects
         * @param objectIDs
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#find-by-ids---getobjects
         */
  def getObjects(objectIDs: js.Array[String]): Promise[js.Any] = js.native
  /**
         * Add a list of objects
         * @param object with objectID
         * @param objectID
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#add-objects---addobjects
         */
  def addObject(`object`: js.Any, objectID: String): Promise[js.Any] = js.native
  /**
         * Add list of objects
         * @param objects
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#add-objects---addobjects
         */
  def addObjects(objects: js.Any): Promise[js.Any] = js.native
  /**
         * Add or replace a specific object
         * @param object
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#update-objects---saveobjects
         */
  def saveObject(`object`: js.Any): Promise[js.Any] = js.native
  /**
         * Add or replace several objects
         * @param objects
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#update-objects---saveobjects
         */
  def saveObjects(objects: js.Any): Promise[js.Any] = js.native
  /**
         * Update parameters of a specific object
         * @param object
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#update-objects---saveobjects
         */
  def partialUpdateObject(`object`: js.Any): Promise[js.Any] = js.native
  /**
         * Update parameters of a list of objects
         * @param objects
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#update-objects---saveobjects
         */
  def partialUpdateObjects(objects: js.Any): Promise[js.Any] = js.native
  /**
         * Delete a specific object
         * @param objectID
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#delete-objects---deleteobjects
         */
  def deleteObject(objectID: String): Promise[js.Any] = js.native
  /**
         * Delete a list of objects
         * @param objectIDs
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#delete-objects---deleteobjects
         */
  def deleteObjects(objectIDs: js.Array[String]): Promise[js.Any] = js.native
  /**
         * Delete objects that matches the query
         * @param query
         * @param params of the object
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#delete-by-query---deletebyquery
         */
  def deleteByQuery(query: String, params: js.Any): Promise[js.Any] = js.native
  /**
         * Wait for an indexing task to be compete
         * @param taskID
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#wait-for-operations---waittask
         */
  def waitTask(taskID: Double): Promise[js.Any] = js.native
  /**
         * Get an index settings
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#get-settings---getsettings
         */
  def getSettings(): Promise[js.Any] = js.native
  /**
         * Set an index settings
         * @param settings
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#set-settings---setsettings
         */
  def setSettings(settings: AlgoliaIndexSettings): Promise[js.Any] = js.native
  /**
         * Search in an index
         * @param params query parameter
         * return {Promise}
         * @param err() error callback
         * https://github.com/algolia/algoliasearch-client-js#search-in-an-index---search
         */
  def search(params: AlgoliaQueryParameters): Promise[js.Any] = js.native
  /**
         * Search in an index
         * @param params query parameter
         * @param cb(err, res)
         * @param err() error callback
         * https://github.com/algolia/algoliasearch-client-js#search-in-an-index---search
         */
  def search(params: AlgoliaQueryParameters, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Browse an index
         * @param query
         * @param cb(err, content)
         * https://github.com/algolia/algoliasearch-client-js#backup--export-an-index---browse
         */
  def browse(query: String, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Browse an index
         * @param query
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#backup--export-an-index---browse
         */
  def browse(query: String): Promise[AlgoliaBrowseResponse] = js.native
  /**
         * Browse an index from a cursor
         * @param cursor
         * @param cb(err, content)
         * https://github.com/algolia/algoliasearch-client-js#backup--export-an-index---browse
         */
  def browseFrom(cursor: String, cb: js.Function2[Error, js.Any, Unit]): Unit = js.native
  /**
         * Browse an index from a cursor
         * @param cursor
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#backup--export-an-index---browse
         */
  def browseFrom(cursor: String): Promise[AlgoliaBrowseResponse] = js.native
  /**
         * Browse an entire index
         * return Promise
         * https://github.com/algolia/algoliasearch-client-js#backup--export-an-index---browse
         */
  def browseAll(): Promise[AlgoliaResponse] = js.native
  /**
         * Clear an index content
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#clear-index---clearindex
         */
  def clearIndex(): Promise[js.Any] = js.native
  /**
         * Save a synonym object
         * @param synonym
         * @param options
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#save-synonym---savesynonym
         */
  def saveSynonym(synonym: AlgoliaSynonym, option: SynonymOption): Promise[js.Any] = js.native
  /**
         * Save a synonym object
         * @param synonyms
         * @param options
         * return {Promise}
         */
  def batchSynonyms(synonyms: js.Array[AlgoliaSynonym], options: SynonymOption): Promise[js.Any] = js.native
  /**
         * Delete a specific synonym
         * @param identifier
         * @param options
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#batch-synonyms---batchsynonyms
         */
  def deleteSynonym(identifier: String, options: SynonymOption): Promise[js.Any] = js.native
  /**
         * Clear all synonyms of an index
         * @param options
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#clear-all-synonyms---clearsynonyms
         */
  def clearSynonyms(options: SynonymOption): Promise[js.Any] = js.native
  /**
         * Get a specific synonym
         * @param identifier
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#get-synonym---getsynonym
         */
  def getSynonym(identifier: String): Promise[js.Any] = js.native
  /**
         * Search a synonyms
         * @param options
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#search-synonyms---searchsynonyms
         */
  def searchSynonyms(options: SearchSynonymOptions): Promise[js.Any] = js.native
  /**
         * List index user keys
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#list-api-keys---listapikeys
         */
  def listUserKeys(): Promise[js.Any] = js.native
  /**
         * Add key for this index
         * @param scopes
         * @param options
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#add-user-key---adduserkey
         */
  def addUserKey(scopes: js.Array[String], options: AlgoliaUserKeyOptions): Promise[js.Any] = js.native
  /**
         * Update a key for this index
         * @param key
         * @param scopes
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#update-user-key---updateuserkey
         */
  def updateUserKey(key: String, scopes: js.Array[String]): Promise[js.Any] = js.native
  /**
         * Update a key for this index
         * @param key
         * @param scopes
         * @param options
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#update-user-key---updateuserkey
         */
  def updateUserKey(key: String, scopes: js.Array[String], options: AlgoliaUserKeyOptions): Promise[js.Any] = js.native
  /**
         * Gets the rights of an index specific key
         * @param key
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#get-key-permissions---getuserkeyacl
         */
  def getUserKeyACL(key: String): Promise[js.Any] = js.native
  /**
         * Deletes an index specific key
         * @param key
         * return {Promise}
         * https://github.com/algolia/algoliasearch-client-js#delete-user-key---deleteuserkey
         */
  def deleteUserKey(key: String): Promise[js.Any] = js.native
}