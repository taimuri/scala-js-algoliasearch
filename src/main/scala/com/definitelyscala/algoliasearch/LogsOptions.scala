package com.definitelyscala.algoliasearch

import scala.scalajs.js

@js.native
trait LogsOptions extends js.Object {
  /**
   * Specify the first entry to retrieve (0-based, 0 is the most recent log entry).
   * default: 0
   * https://github.com/algolia/algoliasearch-client-js#get-logs---getlogs
   */
  var offset: Double = js.native
  /**
   * Specify the maximum number of entries to retrieve starting at the offset.
   * default: 10
   * maximum: 1000
   * https://github.com/algolia/algoliasearch-client-js#get-logs---getlogs
   */
  var length: Double = js.native
  /**
   * @deprecated
   * Retrieve only logs with an HTTP code different than 200 or 201
   * https://github.com/algolia/algoliasearch-client-js#get-logs---getlogs
   */
  var onlyErrors: Boolean = js.native
  /**
   * Specify the type of logs to retrieve
   * 'query' Retrieve only the queries
   * 'build' Retrieve only the build operations
   * 'error' Retrieve only the errors (same as onlyErrors parameters)
   * https://github.com/algolia/algoliasearch-client-js#get-logs---getlogs
   */
  var `type`: String = js.native
}