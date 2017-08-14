
Toolchain
---------

You need to android SDK installed.
How to do this depends on your system, but look around your package manager if you have one

### TODO: links, Windows, OS X, Arch, Debian, Ubuntu, etc


Building
--------

```
gradle assembleDebug
```


Testing
-------


```
adb logcat -s xxx.helloworld
```


If you're connected with adb you can install the app with

```
gradle assembleDebug
adb install -r build/outputs/apk/app-debug.apk  
```

or the shortcut
```
gradle installDebug
```

### Wireless ADB

You can do adb over the LAN too, which should be secure enough so long as you don't trust random keys.
There are a few different ways to arrange this; sometimes there's an option to enable TCP/IP ADB inside
of your phone's Developer Settings and sometimes you have to
```
adb tcpip 5556
adb kill-server
adb connect 192.168.???.???:5556
```


Signing
-------

To build a proper release that can go on the Play Store ...

