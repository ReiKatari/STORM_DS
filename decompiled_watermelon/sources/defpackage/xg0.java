package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.SparseArray;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xg0  reason: default package */
/* loaded from: classes.dex */
public final class xg0 {
    public static final Object s = new Object();
    public static final SparseArray t = new SparseArray();
    public final zg0 c;
    public final Executor d;
    public final Handler e;
    public final HandlerThread f;
    public zc0 g;
    public dg0 h;
    public rg0 i;
    public ci3 j;
    public q9 k;
    public final nf5 l;
    public final l90 m;
    public final xe0 n;
    public final il6 o;
    public wg0 p;
    public final Integer r;
    public final bf0 a = new bf0();
    public final Object b = new Object();
    public fq3 q = jx2.L;

    /* JADX WARN: Code restructure failed: missing block: B:131:0x028f, code lost:
        r5 = r9;
        r9 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Type inference failed for: r0v32, types: [pb5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21, types: [i90, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xg0(android.content.Context r10, defpackage.um3 r11) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg0.<init>(android.content.Context, um3):void");
    }

    public static void a(Integer num) {
        synchronized (s) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray sparseArray = t;
                int intValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
                if (intValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(intValue));
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(wt wtVar) {
        int i;
        if (io2.R()) {
            if (wtVar != null) {
                i = wtVar.a;
            } else {
                i = -1;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                fp.s(i, io2.p0("CX:CameraProvider-RetryStatus"));
                return;
            }
            String p0 = io2.p0("CX:CameraProvider-RetryStatus");
            try {
                if (io2.h == null) {
                    io2.h = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
                }
                Method method = io2.h;
                if (method != null) {
                    method.invoke(null, Long.valueOf(io2.d), p0, Integer.valueOf(i));
                    return;
                }
                throw new IllegalArgumentException("Required value was null.");
            } catch (Exception e) {
                io2.O("traceCounter", e);
            }
        }
    }

    public static void c() {
        SparseArray sparseArray = t;
        if (sparseArray.size() == 0) {
            ve2.c = 3;
        } else if (sparseArray.get(3) != null) {
            ve2.c = 3;
        } else if (sparseArray.get(4) != null) {
            ve2.c = 4;
        } else if (sparseArray.get(5) != null) {
            ve2.c = 5;
        } else if (sparseArray.get(6) != null) {
            ve2.c = 6;
        }
    }
}
