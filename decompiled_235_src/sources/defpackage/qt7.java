package defpackage;

import android.content.Context;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qt7  reason: default package */
/* loaded from: classes.dex */
public final class qt7 {
    public static final /* synthetic */ qt7 a = new Object();
    public static final ex6 b;
    public static final xd5 c;

    /* JADX WARN: Type inference failed for: r0v0, types: [qt7, java.lang.Object] */
    static {
        gh5.a(rt7.class).c();
        b = new ex6(new kt5(20));
        c = xd5.e0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [yj7, java.lang.Object] */
    public static j97 a(Context context) {
        context.getClass();
        gt7 gt7Var = (gt7) b.getValue();
        if (gt7Var == null) {
            zh6 zh6Var = zh6.c;
            if (zh6.c == null) {
                ReentrantLock reentrantLock = zh6.d;
                reentrantLock.lock();
                try {
                    if (zh6.c == null) {
                        xh6 xh6Var = null;
                        try {
                            cm7 b2 = vh6.b();
                            if (b2 != null) {
                                cm7 cm7Var = cm7.Y;
                                cm7Var.getClass();
                                Object value = b2.X.getValue();
                                value.getClass();
                                Object value2 = cm7Var.X.getValue();
                                value2.getClass();
                                if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                    xh6 xh6Var2 = new xh6(context);
                                    if (xh6Var2.e()) {
                                        xh6Var = xh6Var2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        zh6.c = new zh6(xh6Var);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            gt7Var = zh6.c;
            gt7Var.getClass();
        }
        ov7 ov7Var = new ov7();
        ?? obj = new Object();
        s82.a();
        j97 j97Var = new j97(ov7Var, gt7Var, (yj7) obj);
        c.getClass();
        return j97Var;
    }
}
