/*
 *
 *
 *
 *
 * Scaloid: Simpler Android
 *
 * http://scaloid.org
 *
 *
 *
 *
 *
 *
 * Copyright 2013 Sung-Ho Lee and Scaloid contributors
 *
 * Sung-Ho Lee and Scaloid contributors licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

/*
 * This file is automatically generated. Any changes on this file will be OVERWRITTEN!
 * To learn how to contribute, please refer to:
 * https://github.com/pocorall/scaloid/wiki/Inside-Scaloid
 */

package org.scaloid.common

import android.app.Activity
import android.content._
import android.util.Log
import android.os._
import scala.collection.mutable.ArrayBuffer
import scala.reflect._
import scala.language.experimental.macros
import scala.reflect.macros.blackbox.{ Context => MacroCtx }

class EventSource0[T] extends ArrayBuffer[() => T] {
  def apply(e: => T) = append(() => e)

  def run() = map(_())
}

class EventSource1[Arg1, Ret] extends ArrayBuffer[Arg1 => Ret] {
  def apply(e: Arg1 => Ret) = append(e)

  def run(arg: Arg1) = map(_(arg))
}

class EventSource2[Arg1, Arg2, Ret] extends ArrayBuffer[(Arg1, Arg2) => Ret] {
  def apply(e: (Arg1, Arg2) => Ret) = append(e)

  def run(arg1: Arg1, arg2: Arg2) = map(_(arg1, arg2))
}

/**
 * Callback handler for classes that can be destroyed.
 */
trait Destroyable {
  protected val onDestroyBodies = new ArrayBuffer[() => Any]

  def onDestroy(body: => Any) = {
    val el = body _
    onDestroyBodies += el
    el
  }
}

/**
 * Callback handler for classes that can be created.
 */
trait Creatable {
  protected val onCreateBodies = new ArrayBuffer[() => Any]

  def onCreate(body: => Any) = {
    val el = body _
    onCreateBodies += el
    el
  }
}

/**
 * Callback handler for classes that can be registered and unregistered.
 */
trait Registerable {
  def onRegister(body: => Any): () => Any
  def onUnregister(body: => Any): () => Any
}

/**
 * Automatically generated enriching class of `[[https://developer.android.com/reference/android/content/Context.html android.content.Context]]`.
 */
class RichContext[This <: android.content.Context](val basis: This) extends TraitContext[This]

/**
 * Automatically generated helper trait of `[[https://developer.android.com/reference/android/content/Context.html android.content.Context]]`. This contains several property accessors.
 */
trait TraitContext[This <: android.content.Context] {

  def basis: This

  implicit val ctx = basis

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getApplicationContext() getApplicationContext()]]`
   */
  @inline def applicationContext = basis.getApplicationContext

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getApplicationInfo() getApplicationInfo()]]`
   */
  @inline def applicationInfo = basis.getApplicationInfo

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getAssets() getAssets()]]`
   */
  @inline def assets = basis.getAssets

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getCacheDir() getCacheDir()]]`
   */
  @inline def cacheDir = basis.getCacheDir

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getClassLoader() getClassLoader()]]`
   */
  @inline def classLoader = basis.getClassLoader

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getContentResolver() getContentResolver()]]`
   */
  @inline def contentResolver = basis.getContentResolver

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getExternalCacheDir() getExternalCacheDir()]]`
   */
  @inline def externalCacheDir = basis.getExternalCacheDir

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getFilesDir() getFilesDir()]]`
   */
  @inline def filesDir = basis.getFilesDir

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getMainLooper() getMainLooper()]]`
   */
  @inline def mainLooper = basis.getMainLooper

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getObbDir() getObbDir()]]`
   */
  @inline def obbDir = basis.getObbDir

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getPackageCodePath() getPackageCodePath()]]`
   */
  @inline def packageCodePath = basis.getPackageCodePath

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getPackageManager() getPackageManager()]]`
   */
  @inline def packageManager = basis.getPackageManager

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getPackageName() getPackageName()]]`
   */
  @inline def packageName = basis.getPackageName

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getPackageResourcePath() getPackageResourcePath()]]`
   */
  @inline def packageResourcePath = basis.getPackageResourcePath

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getResources() getResources()]]`
   */
  @inline def resources = basis.getResources

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getTheme() getTheme()]]`
   */
  @inline def theme = basis.getTheme

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#setTheme(int) setTheme(int)]]`
   */
  @inline def theme(p: Int) = theme_=(p)

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#setTheme(int) setTheme(int)]]`
   */
  @inline def theme_=(p: Int) = { basis.setTheme(p); basis }

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getWallpaper() getWallpaper()]]`
   */
  @deprecated("", "") @inline def wallpaper = basis.getWallpaper

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#setWallpaper(android.graphics.Bitmap) setWallpaper(android.graphics.Bitmap)]]`
   */
  @deprecated("", "") @inline def wallpaper(p: android.graphics.Bitmap) = wallpaper_=(p)

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#setWallpaper(android.graphics.Bitmap) setWallpaper(android.graphics.Bitmap)]]`
   */
  @deprecated("", "") @inline def wallpaper_=(p: android.graphics.Bitmap) = { basis.setWallpaper(p); basis }

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#setWallpaper(java.io.InputStream) setWallpaper(java.io.InputStream)]]`
   */
  @deprecated("", "") @inline def wallpaper(p: java.io.InputStream) = wallpaper_=(p)

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#setWallpaper(java.io.InputStream) setWallpaper(java.io.InputStream)]]`
   */
  @deprecated("", "") @inline def wallpaper_=(p: java.io.InputStream) = { basis.setWallpaper(p); basis }

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getWallpaperDesiredMinimumHeight() getWallpaperDesiredMinimumHeight()]]`
   */
  @deprecated("", "") @inline def wallpaperDesiredMinimumHeight = basis.getWallpaperDesiredMinimumHeight

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/Context.html#getWallpaperDesiredMinimumWidth() getWallpaperDesiredMinimumWidth()]]`
   */
  @deprecated("", "") @inline def wallpaperDesiredMinimumWidth = basis.getWallpaperDesiredMinimumWidth

  @inline def bindService[T: ClassTag](p1: android.content.ServiceConnection, p2: Int)(implicit context: Context): Boolean = basis.bindService(SIntent[T], p1, p2)

  @inline def removeStickyBroadcast[T: ClassTag](implicit context: Context): Unit = basis.removeStickyBroadcast(SIntent[T])

  @inline def sendBroadcast[T: ClassTag](implicit context: Context): Unit = basis.sendBroadcast(SIntent[T])

  @inline def sendBroadcast[T: ClassTag](p: java.lang.String)(implicit context: Context): Unit = basis.sendBroadcast(SIntent[T], p)

  @inline def sendOrderedBroadcast[T: ClassTag](p: java.lang.String)(implicit context: Context): Unit = basis.sendOrderedBroadcast(SIntent[T], p)

  @inline def sendOrderedBroadcast[T: ClassTag](p1: java.lang.String, p2: android.content.BroadcastReceiver, p3: android.os.Handler, p4: Int, p5: java.lang.String, p6: android.os.Bundle)(implicit context: Context): Unit = basis.sendOrderedBroadcast(SIntent[T], p1, p2, p3, p4, p5, p6)

  @inline def sendStickyBroadcast[T: ClassTag](implicit context: Context): Unit = basis.sendStickyBroadcast(SIntent[T])

  @inline def sendStickyOrderedBroadcast[T: ClassTag](p1: android.content.BroadcastReceiver, p2: android.os.Handler, p3: Int, p4: java.lang.String, p5: android.os.Bundle)(implicit context: Context): Unit = basis.sendStickyOrderedBroadcast(SIntent[T], p1, p2, p3, p4, p5)

  @inline def startActivity[T: ClassTag](implicit context: Context): Unit = basis.startActivity(SIntent[T])

  @inline def startActivity[T: ClassTag](p: android.os.Bundle)(implicit context: Context): Unit = basis.startActivity(SIntent[T], p)

  @inline def startService[T: ClassTag](implicit context: Context): android.content.ComponentName = basis.startService(SIntent[T])

  @inline def stopService[T: ClassTag](implicit context: Context): Boolean = basis.stopService(SIntent[T])
}

/**
 * Enriched trait of the class android.content.Context. To enable Scaloid support for subclasses android.content.Context, extend this trait.
 *
 * Refer the URL below for more details.
 *
 * [[https://github.com/pocorall/scaloid/?134#trait-scontext]]
 *
 */
trait SContext extends Context with TraitContext[SContext] with TagUtil {
  def basis: SContext = this
}

/**
 * Automatically generated enriching class of `[[https://developer.android.com/reference/android/content/ContextWrapper.html android.content.ContextWrapper]]`.
 */
class RichContextWrapper[This <: android.content.ContextWrapper](val basis: This) extends TraitContextWrapper[This]

/**
 * Automatically generated helper trait of `[[https://developer.android.com/reference/android/content/ContextWrapper.html android.content.ContextWrapper]]`. This contains several property accessors.
 */
trait TraitContextWrapper[This <: android.content.ContextWrapper] extends TraitContext[This] {

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/content/ContextWrapper.html#getBaseContext() getBaseContext()]]`
   */
  @inline def baseContext = basis.getBaseContext

}

/**
 * Automatically generated concrete helper class of `[[https://developer.android.com/reference/android/content/ContextWrapper.html android.content.ContextWrapper]]`.
 */
class SContextWrapper()(implicit base: android.content.Context)
    extends android.content.ContextWrapper(base) with TraitContextWrapper[SContextWrapper] {

  def basis = this

}

object SContextWrapper {
  def apply()(implicit base: android.content.Context): SContextWrapper = {
    val v = new SContextWrapper

    v
  }

}

/**
 * When you register BroadcastReceiver with Context.registerReceiver() you have to unregister it to prevent memory leak.
 * Trait UnregisterReceiver handles these chores for you.
 * All you need to do is append the trait to your class.
 *
 * {{{
 * class MyService extends SService with UnregisterReceiver {
 * def func() {
 * // ...
 * registerReceiver(receiver, intentFilter)
 * // Done! automatically unregistered at UnregisterReceiverService.onDestroy()
 * }
 * }
 * }}}
 * See also: [[https://github.com/pocorall/scaloid/wiki/Basics#trait-unregisterreceiver]]
 */
@deprecated("Use ContentHelper.registerReceiver instead", "4.0")
trait UnregisterReceiver extends ContextWrapper with Destroyable {
  /**
   * Internal implementation for (un)registering the receiver. You do not need to call this method.
   */
  override def registerReceiver(receiver: BroadcastReceiver, filter: IntentFilter): android.content.Intent = {
    onDestroy {
      Log.i("ScalaUtils", "Unregister BroadcastReceiver: " + receiver)
      try {
        unregisterReceiver(receiver)
      } catch {
        // Suppress "Receiver not registered" exception
        // Refer to http://stackoverflow.com/questions/2682043/how-to-check-if-receiver-is-registered-in-android
        case e: IllegalArgumentException => e.printStackTrace()
      }
    }

    super.registerReceiver(receiver, filter)
  }
}

/**
 * Provides shortcuts for intent creation.
 *
 * {{{
 *   SIntent[MyActivity]
 * }}}
 *
 */
object SIntent {
  @inline def apply[T](implicit context: Context, mt: ClassTag[T]) = new Intent(context, mt.runtimeClass)

  @inline def apply[T](action: String)(implicit context: Context, mt: ClassTag[T]): Intent = SIntent[T].setAction(action)
}

class RichIntent(val intent: Intent) {
  @inline def start[T <: Activity](implicit context: Context, mt: ClassTag[T]) = {
    val clazz = mt.runtimeClass
    intent.setClass(context, clazz)
    clazz match {
      case c if classOf[Activity].isAssignableFrom(c) =>
        context.startActivity(intent)
      case c if classOf[android.app.Service].isAssignableFrom(c) =>
        context.startService(intent)
    }
  }

  def put(values: Any*): Intent = macro org.scaloid.util.MacroImpl.put_impl
}

/**
 * An in-process service connector that can bound [[LocalService]]. This yields far more concise code than that uses plain-old Android API.
 *
 * Please refer to the URL below for more details.
 *
 * [[http://blog.scaloid.org/2013/03/introducing-localservice.html]]
 */
class LocalServiceConnection[S <: LocalService](bindFlag: Int = Context.BIND_AUTO_CREATE)(implicit ctx: Context, reg: Registerable, mf: ClassTag[S]) extends ServiceConnection {
  var service: Option[S] = None
  var componentName: ComponentName = _
  var binder: IBinder = _
  var onConnected = new EventSource1[S, Unit]
  var onDisconnected = new EventSource1[S, Unit]

  @deprecated("Use apply(f: S => Unit) instead.", "3.6")
  def run(f: S => Unit) {
    service.fold(onConnected(f))(f)
  }

  /**
   * Execute given function with the connected service. If the service is not connected yet, the function
   * is enqueued and be called when the service is connected.
   * For example:
   * val service = new LocalServiceConnection[MyService]
   * //...
   * service(_.doSomeJob())
   */
  def apply[T](f: S => Unit): Unit = service.fold(onConnected(f))(f)

  /**
   * Execute given function with the connected service. If the service is not connected yet,
   * this returns ifEmpty value
   * for example:
   * val service = new LocalServiceConnection[MyService]
   * //...
   * val foo = service(_.foo, defaultVal)
   */
  def apply[T](f: S => T, ifEmpty: => T): T = service.fold(ifEmpty)(f)

  /**
   * Execute given function with the connected service. If the service is not connected yet,
   * this does nothing
   * for example:
   * val service = new LocalServiceConnection[MyService]
   * //...
   * val foo = service.ifAvailable(_.foo)
   */
  def ifAvailable[T](f: S => T): Unit = if (service.nonEmpty) f(service.get)

  /**
   * for example:
   * val service = new LocalServiceConnection[MyService]
   * //...
   * val result = service(_.foo > 3, "3 < " + _.foo, "fail")
   */
  def apply[T](test: S => Boolean, ifTrue: S => T, ifFalse: => T) = if (service.nonEmpty && test(service.get)) ifTrue(service.get) else ifFalse

  /**
   * Internal implementation for handling the service connection. You do not need to call this method.
   */
  def onServiceConnected(p1: ComponentName, b: IBinder) {
    val svc = b.asInstanceOf[LocalService#ScaloidServiceBinder].service.asInstanceOf[S]
    service = Option(svc)
    componentName = p1
    binder = b
    onConnected.run(svc)
    onConnected.clear()
  }

  /**
   * Internal implementation for handling the service connection. You do not need to call this method.
   */
  def onServiceDisconnected(p1: ComponentName) {
    val svc = service.get
    service = None
    onDisconnected.run(svc)
    onDisconnected.clear()
  }

  /**
   * Returns true if the service is currently connected.
   */
  def connected: Boolean = !service.isEmpty

  reg.onRegister {
    ctx.bindService(SIntent[S], this, bindFlag)
  }

  reg.onUnregister {
    ctx.unbindService(this)
    onConnected.clear() // not to be called at the next binding
  }
}
