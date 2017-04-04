package com.definitelyscala.algoliasearch

import scala.scalajs.js

@js.native
trait AlgoliaBrowseResponse extends js.Object {
  var cursor: String = js.native
  var hits: js.Array[js.Any] = js.native
  var params: String = js.native
  var query: String = js.native
  var processingTimeMS: Double = js.native
}