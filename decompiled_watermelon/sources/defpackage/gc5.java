package defpackage;

import java.io.Closeable;
import java.nio.charset.Charset;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gc5  reason: default package */
/* loaded from: classes.dex */
public abstract class gc5 implements Closeable {
    public static final fc5 A;

    /* JADX WARN: Type inference failed for: r1v0, types: [f60, java.lang.Object] */
    static {
        w70 w70Var = w70.R;
        w70Var.getClass();
        ?? obj = new Object();
        obj.k0(w70Var);
        A = new fc5(null, w70Var.A.length, obj);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        gk7.b(p());
    }

    public abstract long d();

    public abstract cw3 i();

    public abstract u60 p();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final String w() {
        Charset charset;
        u60 p = p();
        String th = null;
        try {
            cw3 i = i();
            if (i == null || (charset = cw3.a(i)) == null) {
                charset = hk0.a;
            }
            String h0 = p.h0(ik7.e(p, charset));
            try {
                p.close();
            } catch (Throwable th2) {
                th = th2;
            }
            String str = th;
            th = h0;
            th = str;
        } catch (Throwable th3) {
            th = th3;
            if (p != null) {
                try {
                    p.close();
                } catch (Throwable th4) {
                    pu.k(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }
}
