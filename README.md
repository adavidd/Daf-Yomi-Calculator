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
	implementation 'com.github.adavidd:Daf-Yomi-Calculator:Tag' // current Tag: V3.0
}
```
 



step 3. create daf yomi instance:

```
DafYomiCalculator dafYomiCalculator = new DafYomiCalculator();
```



step 4. get by current day:

```
DafYomiDetailes todayDafYomiDetailes = dafYomiCalculator.getTodayDafYomi(this, language); for English write "En"; for Hebrew write "He"; for Spanish write "Es";

```




step 4. get by a given day:

```
DafYomiCalculator dafYomiCalculator = new DafYomiCalculator();
DafYomiDetailes anyDayDafYomiDetailes = dafYomiCalculator.getDafYomiByDay(this, 2020, 5, 25, language); // year, month, day.  for English write "En"; for Hebrew write "He"; for Spanish write "Es";
```



step 5. get daf yomi detailes:

```
dafYomiDetailes.getMasechetName();
dafYomiDetailes.getMasechetPage();
```


