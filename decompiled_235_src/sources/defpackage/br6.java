package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: br6  reason: default package */
/* loaded from: classes.dex */
public final class br6 {
    public static final ReentrantLock c = new ReentrantLock();
    public static br6 d;
    public final ReentrantLock a = new ReentrantLock();
    public final SharedPreferences b;

    public br6(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static br6 a(Context context) {
        Preconditions.checkNotNull(context);
        ReentrantLock reentrantLock = c;
        reentrantLock.lock();
        try {
            if (d == null) {
                d = new br6(context.getApplicationContext());
            }
            br6 br6Var = d;
            reentrantLock.unlock();
            return br6Var;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String d(String str, String str2) {
        return lb1.m(str, ":", str2);
    }

    public final String b(String str) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void c(String str) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            this.b.edit().remove(str).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
