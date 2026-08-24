package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
        throw new AssertionError("Uninstantiable");
    }

    public static void checkArgument(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static double checkArgumentInRange(double d, double d2, double d3, String str) {
        if (d >= d2) {
            if (d <= d3) {
                return d;
            }
            i.h(zza("%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d2), Double.valueOf(d3)));
            return 0.0d;
        }
        i.h(zza("%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d2), Double.valueOf(d3)));
        return 0.0d;
    }

    public static void checkHandlerThread(Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            i.m(lb1.n("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", str, "."));
        }
    }

    public static void checkMainThread(String str) {
        if (com.google.android.gms.common.util.zzb.zza()) {
            return;
        }
        i.m(str);
    }

    @EnsuresNonNull({"#1"})
    public static String checkNotEmpty(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void checkNotGoogleApiHandlerThread(String str) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            String name = myLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                i.m(str);
            }
        }
    }

    public static void checkNotMainThread(String str) {
        if (!com.google.android.gms.common.util.zzb.zza()) {
            return;
        }
        i.m(str);
    }

    @EnsuresNonNull({"#1"})
    public static <T> T checkNotNull(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static long checkNotZero(long j, Object obj) {
        if (j != 0) {
            return j;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void checkState(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    public static String zza(String str, Object... objArr) {
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + 48);
        int i = 0;
        int i2 = 0;
        while (i < 3 && (indexOf = str.indexOf("%s", i2)) != -1) {
            sb.append(str.substring(i2, indexOf));
            sb.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb.append(str.substring(i2));
        if (i < 3) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < 3; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append("]");
        }
        return sb.toString();
    }

    public static void checkMainThread() {
        checkMainThread("Must be called on the main application thread");
    }

    public static void checkNotMainThread() {
        checkNotMainThread("Must not be called on the main application thread");
    }

    public static void checkArgument(boolean z) {
        if (z) {
            return;
        }
        u34.t();
    }

    @EnsuresNonNull({"#1"})
    public static <T> T checkNotNull(T t) {
        if (t != null) {
            return t;
        }
        u34.x("null reference");
        return null;
    }

    public static void checkState(boolean z) {
        if (z) {
            return;
        }
        e41.m();
    }

    public static void checkArgument(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void checkState(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    @EnsuresNonNull({"#1"})
    public static String checkNotEmpty(String str) {
        if (TextUtils.isEmpty(str)) {
            i.h("Given String is empty or null");
            return null;
        }
        return str;
    }

    public static int checkNotZero(int i, Object obj) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static long checkNotZero(long j) {
        if (j != 0) {
            return j;
        }
        i.h("Given Long is zero");
        return 0L;
    }

    public static int checkNotZero(int i) {
        if (i != 0) {
            return i;
        }
        i.h("Given Integer is zero");
        return 0;
    }

    public static void checkNotGoogleApiHandlerThread() {
        checkNotGoogleApiHandlerThread("Must not be called on GoogleApiHandler thread.");
    }

    public static void checkHandlerThread(Handler handler, String str) {
        if (Looper.myLooper() == handler.getLooper()) {
            return;
        }
        i.m(str);
    }

    public static float checkArgumentInRange(float f, float f2, float f3, String str) {
        if (f < f2) {
            i.h(zza("%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f2), Float.valueOf(f3)));
            return RecyclerView.B1;
        } else if (f <= f3) {
            return f;
        } else {
            i.h(zza("%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f2), Float.valueOf(f3)));
            return RecyclerView.B1;
        }
    }

    public static int checkArgumentInRange(int i, int i2, int i3, String str) {
        if (i < i2) {
            i.h(zza("%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
            return 0;
        } else if (i <= i3) {
            return i;
        } else {
            i.h(zza("%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
            return 0;
        }
    }

    public static long checkArgumentInRange(long j, long j2, long j3, String str) {
        if (j < j2) {
            i.h(zza("%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j2), Long.valueOf(j3)));
            return 0L;
        } else if (j <= j3) {
            return j;
        } else {
            i.h(zza("%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j2), Long.valueOf(j3)));
            return 0L;
        }
    }
}
