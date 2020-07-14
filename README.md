# Daf-Yomi-Calculator. Android
# get the Daf Yomi by day

 Daf-Yomi-Calculator is a Library that you can get the current Daf Yomi or the Daf yomi by any day;
 
 
 install:
 
 Step 1. Add the JitPack repository to your build file

 ```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
};
```
 
 
Step 2. Add the dependency

 ```
dependencies {
	implementation 'com.github.adavidd:Daf-Yomi-Calculator:Tag' // current Tag: v1.0
}
```
 



create daf yomi instance:

```
DafYomiCalculator dafYomiCalculator = new DafYomiCalculator();
```



get by current day:

```
DafYomiDetailes todayDafYomiDetailes = dafYomiCalculator.getTodayDafYomi(this);
```




get by a given day:

```
DafYomiCalculator dafYomiCalculator = new DafYomiCalculator();
DafYomiDetailes anyDayDafYomiDetailes = dafYomiCalculator.getDafYomiByDay(this, 2020, 5, 25); // year, month, day
```



get daf yomi detailes:

```
dafYomiDetailes.getMasechetName();
dafYomiDetailes.getMasechetPage();
```


