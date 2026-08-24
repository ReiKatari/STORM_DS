package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yl5  reason: default package */
/* loaded from: classes.dex */
public abstract class yl5 implements Closeable {
    public static final xl5 A;

    /* JADX WARN: Type inference failed for: r1v0, types: [k80, java.lang.Object] */
    static {
        da0 da0Var = da0.R;
        da0Var.getClass();
        ?? obj = new Object();
        obj.k0(da0Var);
        A = new xl5(null, da0Var.A.length, obj);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        yy7.b(n());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final byte[] e() {
        long h = h();
        byte[] th = null;
        if (h <= 2147483647L) {
            z80 n = n();
            try {
                byte[] q = n.q();
                try {
                    n.close();
                } catch (Throwable th2) {
                    th = th2;
                }
                byte[] bArr = th;
                th = q;
                th = bArr;
            } catch (Throwable th3) {
                th = th3;
                if (n != null) {
                    try {
                        n.close();
                    } catch (Throwable th4) {
                        mb3.q(th, th4);
                    }
                }
            }
            if (th == 0) {
                int length = th.length;
                if (h != -1 && h != length) {
                    throw new IOException("Content-Length (" + h + ") and stream length (" + length + ") disagree");
                }
                return th;
            }
            throw th;
        }
        e41.i(lb1.h(h, "Cannot buffer entire body for content length: "));
        return null;
    }

    public abstract long h();

    public abstract n34 k();

    public abstract z80 n();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final String r() {
        Charset charset;
        z80 n = n();
        String th = null;
        try {
            n34 k = k();
            if (k == null || (charset = n34.a(k)) == null) {
                charset = qm0.a;
            }
            String M = n.M(az7.f(n, charset));
            try {
                n.close();
            } catch (Throwable th2) {
                th = th2;
            }
            String str = th;
            th = M;
            th = str;
        } catch (Throwable th3) {
            th = th3;
            if (n != null) {
                try {
                    n.close();
                } catch (Throwable th4) {
                    mb3.q(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }
}
