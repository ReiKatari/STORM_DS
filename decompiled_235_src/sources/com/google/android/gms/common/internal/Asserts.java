package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class Asserts {
    private Asserts() {
        throw new AssertionError("Uninstantiable");
    }

    public static void checkMainThread(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        Log.e("Asserts", lb1.n("checkMainThread: current thread ", String.valueOf(Thread.currentThread()), " IS NOT the main thread ", String.valueOf(Looper.getMainLooper().getThread()), "!"));
        i.m(str);
    }

    public static void checkNotMainThread(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        Log.e("Asserts", lb1.n("checkNotMainThread: current thread ", String.valueOf(Thread.currentThread()), " IS the main thread ", String.valueOf(Looper.getMainLooper().getThread()), "!"));
        i.m(str);
    }

    @EnsuresNonNull({"#1"})
    public static void checkNotNull(Object obj, Object obj2) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj2));
    }

    public static void checkNull(Object obj, Object obj2) {
        if (obj == null) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj2));
    }

    public static void checkState(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    @EnsuresNonNull({"#1"})
    public static void checkNotNull(Object obj) {
        if (obj != null) {
            return;
        }
        i.h("null reference");
    }

    public static void checkNull(Object obj) {
        if (obj == null) {
            return;
        }
        i.h("non-null reference");
    }

    public static void checkState(boolean z) {
        if (z) {
            return;
        }
        e41.m();
    }
}
