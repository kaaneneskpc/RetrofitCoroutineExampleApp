# RetrofitCoroutineExampleApp

This apps include what is simply and theoretically coroutine? and explai the use of coroutine in retrofit structure

## What's Coroutine?

A coroutine is a concurrency design pattern that you can use on Android to simplify code that executes asynchronously. Coroutines were added to Kotlin in version 1.3 and are based 
on established concepts from other languages.
On Android, coroutines help to manage long-running tasks that might otherwise block the main thread and cause your app to become unresponsive. 
Over 50% of professional developers who use coroutines have reported seeing increased productivity. 
This topic describes how you can use Kotlin coroutines to address these problems, enabling you to write cleaner and more concise app code.

## Features

Coroutines is our recommended solution for asynchronous programming on Android. Noteworthy features include the following:

--Lightweight: You can run many coroutines on a single thread due to support for suspension, which doesn't block the thread where the coroutine is running.
Suspending saves memory over blocking while supporting many concurrent operations.<br>
--Fewer memory leaks: Use structured concurrency to run operations within a scope.<br>
--Built-in cancellation support: Cancellation is propagated automatically through the running coroutine hierarchy.<br>
--Jetpack integration: Many Jetpack libraries include extensions that provide full coroutines support. Some libraries also provide their own coroutine scope that you can use for structured concurrency.

## How To Implementation?

![image](https://user-images.githubusercontent.com/32849662/103749170-35f9d480-5016-11eb-8e98-49138823559d.png)

More Information : https://developer.android.com/kotlin/coroutines

