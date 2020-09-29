package com.reactnativecommunity.webview2

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.ReactApplicationContext


class RNCWebViewPackage2: ReactPackage {
  override fun createNativeModules(reactContext: ReactApplicationContext) = listOf(
    RNCWebViewModule2(reactContext)
  )

  override fun createViewManagers(reactContext: ReactApplicationContext) = listOf(
    RNCWebViewManager2(reactContext)
  )
}
