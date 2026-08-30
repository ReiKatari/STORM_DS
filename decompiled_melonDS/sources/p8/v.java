package p8;

import android.util.Log;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f11507b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static volatile v f11508c;

    /* renamed from: a  reason: collision with root package name */
    public final int f11509a;

    public v(int i2) {
        this.f11509a = i2;
    }

    public static v e() {
        v vVar;
        synchronized (f11507b) {
            try {
                if (f11508c == null) {
                    f11508c = new v(3);
                }
                vVar = f11508c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return vVar;
    }

    public static String g(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public final void a(String str, String str2) {
        if (this.f11509a <= 3) {
            Log.d(str, str2);
        }
    }

    public final void b(String str, String str2, Throwable th2) {
        if (this.f11509a <= 3) {
            Log.d(str, str2, th2);
        }
    }

    public final void c(String str, String str2) {
        if (this.f11509a <= 6) {
            Log.e(str, str2);
        }
    }

    public final void d(String str, String str2, Throwable th2) {
        if (this.f11509a <= 6) {
            Log.e(str, str2, th2);
        }
    }

    public final void f(String str, String str2) {
        if (this.f11509a <= 4) {
            Log.i(str, str2);
        }
    }

    public final void h(String str, String str2) {
        if (this.f11509a <= 5) {
            Log.w(str, str2);
        }
    }
}
