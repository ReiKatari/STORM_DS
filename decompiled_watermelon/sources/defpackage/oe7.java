package defpackage;

import android.content.Context;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oe7  reason: default package */
/* loaded from: classes.dex */
public final class oe7 {
    public static final /* synthetic */ oe7 a = new Object();
    public static final il6 b;
    public static final iq0 c;

    /* JADX WARN: Type inference failed for: r0v0, types: [oe7, java.lang.Object] */
    static {
        q75.a(pe7.class).c();
        b = new il6(new zv5(14));
        c = iq0.e0;
    }

    public static u57 a(Context context) {
        context.getClass();
        ee7 ee7Var = (ee7) b.getValue();
        if (ee7Var == null) {
            l66 l66Var = l66.c;
            if (l66.c == null) {
                ReentrantLock reentrantLock = l66.d;
                reentrantLock.lock();
                try {
                    if (l66.c == null) {
                        j66 j66Var = null;
                        try {
                            d87 b2 = h66.b();
                            if (b2 != null) {
                                d87 d87Var = d87.Y;
                                d87Var.getClass();
                                Object value = b2.X.getValue();
                                value.getClass();
                                Object value2 = d87Var.X.getValue();
                                value2.getClass();
                                if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                    j66 j66Var2 = new j66(context);
                                    if (j66Var2.e()) {
                                        j66Var = j66Var2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        l66.c = new l66(j66Var);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            ee7Var = l66.c;
            ee7Var.getClass();
        }
        og7 og7Var = new og7();
        vn1 vn1Var = new vn1(29);
        a42.a();
        u57 u57Var = new u57(og7Var, ee7Var, vn1Var);
        c.getClass();
        return u57Var;
    }
}
