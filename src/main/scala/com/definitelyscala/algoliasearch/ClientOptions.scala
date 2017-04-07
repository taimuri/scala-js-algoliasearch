package com.definitelyscala.algoliasearch

import scala.scalajs.js

@js.native
trait ClientOptions extends js.Object {
  /**
         * Timeout for requests to our servers, in milliseconds
         * default: 15s (node), 2s (browser)
         * https://github.com/algolia/algoliasearch-client-js#client-options
         */
  var timeout: Double = js.native
  /**
         * Protocol to use when communicating with algolia
         * default: current protocol(browser), https(node)
         * https://github.com/algolia/algoliasearch-client-js#client-options
         */
  var protocol: String = js.native
  /**
         * (node only) httpAgent instance to use when communicating with Algolia servers.
         * https://github.com/algolia/algoliasearch-client-js#client-options
         */
  var httpAgent: js.Any = js.native
  /**
         * read: array of read hosts to use to call Algolia servers, computed automatically
         * write: array of read hosts to use to call Algolia servers, computed automatically
         * https://github.com/algolia/algoliasearch-client-js#client-options
         */
  var hosts: js.Any = js.native
}