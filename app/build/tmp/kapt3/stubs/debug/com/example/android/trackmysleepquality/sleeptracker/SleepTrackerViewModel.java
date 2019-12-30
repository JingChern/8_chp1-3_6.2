package com.example.android.trackmysleepquality.sleeptracker;

import java.lang.System;

/**
 * * ViewModel for SleepTrackerFragment.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u001b\u001a\u00020\u001cH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u0004\u0018\u00010\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\b\u0010\u001f\u001a\u00020\u001cH\u0002J\u0019\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0006\u0010#\u001a\u00020\u001cJ\b\u0010$\u001a\u00020\u001cH\u0014J\u0006\u0010%\u001a\u00020\u001cJ\u0006\u0010&\u001a\u00020\u001cJ\u0019\u0010\'\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R5\u0010\u0010\u001a&\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u0011 \u0012*\u0012\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u0011\u0018\u00010\u000e0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Lcom/example/android/trackmysleepquality/sleeptracker/SleepTrackerViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "database", "Lcom/example/android/trackmysleepquality/database/SleepDatabaseDao;", "application", "Landroid/app/Application;", "(Lcom/example/android/trackmysleepquality/database/SleepDatabaseDao;Landroid/app/Application;)V", "getDatabase", "()Lcom/example/android/trackmysleepquality/database/SleepDatabaseDao;", "newNight", "Lcom/example/android/trackmysleepquality/database/SleepNight;", "getNewNight", "()Lcom/example/android/trackmysleepquality/database/SleepNight;", "nights", "Landroidx/lifecycle/LiveData;", "", "nightsString", "Landroid/text/Spanned;", "kotlin.jvm.PlatformType", "getNightsString", "()Landroidx/lifecycle/LiveData;", "tonight", "Landroidx/lifecycle/MutableLiveData;", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelJob", "Lkotlinx/coroutines/Job;", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTonightFromDatabase", "initializeTonight", "insert", "night", "(Lcom/example/android/trackmysleepquality/database/SleepNight;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClear", "onCleared", "onStartTracking", "onStopTracking", "update", "app_debug"})
public final class SleepTrackerViewModel extends androidx.lifecycle.AndroidViewModel {
    private kotlinx.coroutines.Job viewModelJob;
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    private androidx.lifecycle.MutableLiveData<com.example.android.trackmysleepquality.database.SleepNight> tonight;
    private final androidx.lifecycle.LiveData<java.util.List<com.example.android.trackmysleepquality.database.SleepNight>> nights = null;
    private final androidx.lifecycle.LiveData<android.text.Spanned> nightsString = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.android.trackmysleepquality.database.SleepNight newNight = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.android.trackmysleepquality.database.SleepDatabaseDao database = null;
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    private final void initializeTonight() {
    }
    
    public final void onStartTracking() {
    }
    
    public final androidx.lifecycle.LiveData<android.text.Spanned> getNightsString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.trackmysleepquality.database.SleepNight getNewNight() {
        return null;
    }
    
    public final void onStopTracking() {
    }
    
    public final void onClear() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object clear(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.trackmysleepquality.database.SleepDatabaseDao getDatabase() {
        return null;
    }
    
    public SleepTrackerViewModel(@org.jetbrains.annotations.NotNull()
    com.example.android.trackmysleepquality.database.SleepDatabaseDao database, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}