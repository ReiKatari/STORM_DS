package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f14  reason: default package */
/* loaded from: classes.dex */
public final class f14 extends ua5 {
    public static final cw3 f;
    public static final cw3 g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public final w70 b;
    public final List c;
    public final cw3 d;
    public long e;

    static {
        h85 h85Var = cw3.d;
        f = hi2.n("multipart/mixed");
        hi2.n("multipart/alternative");
        hi2.n("multipart/digest");
        hi2.n("multipart/parallel");
        g = hi2.n("multipart/form-data");
        h = new byte[]{58, 32};
        i = new byte[]{13, 10};
        j = new byte[]{45, 45};
    }

    public f14(w70 w70Var, cw3 cw3Var, List list) {
        w70Var.getClass();
        cw3Var.getClass();
        this.b = w70Var;
        this.c = list;
        h85 h85Var = cw3.d;
        this.d = hi2.n(cw3Var + "; boundary=" + w70Var.r());
        this.e = -1L;
    }

    @Override // defpackage.ua5
    public final long a() {
        long j2 = this.e;
        if (j2 == -1) {
            long e = e(null, true);
            this.e = e;
            return e;
        }
        return j2;
    }

    @Override // defpackage.ua5
    public final cw3 b() {
        return this.d;
    }

    @Override // defpackage.ua5
    public final boolean c() {
        List<e14> list = this.c;
        if (!list.isEmpty()) {
            for (e14 e14Var : list) {
                if (e14Var.b.c()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.ua5
    public final void d(t60 t60Var) {
        e(t60Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e(t60 t60Var, boolean z) {
        f60 f60Var;
        t60 t60Var2;
        if (z) {
            Object obj = new Object();
            f60Var = obj;
            t60Var2 = obj;
        } else {
            f60Var = null;
            t60Var2 = t60Var;
        }
        List list = this.c;
        int size = list.size();
        long j2 = 0;
        int i2 = 0;
        while (true) {
            w70 w70Var = this.b;
            byte[] bArr = j;
            byte[] bArr2 = i;
            if (i2 < size) {
                e14 e14Var = (e14) list.get(i2);
                xq2 xq2Var = e14Var.a;
                ua5 ua5Var = e14Var.b;
                t60Var2.getClass();
                t60Var2.write(bArr);
                t60Var2.n(w70Var);
                t60Var2.write(bArr2);
                int size2 = xq2Var.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    t60Var2.c0(xq2Var.c(i3)).write(h).c0(xq2Var.i(i3)).write(bArr2);
                }
                cw3 b = ua5Var.b();
                if (b != null) {
                    t60Var2.c0("Content-Type: ").c0(b.a).write(bArr2);
                }
                long a = ua5Var.a();
                if (a == -1 && z) {
                    f60Var.getClass();
                    f60Var.w();
                    return -1L;
                }
                t60Var2.write(bArr2);
                if (z) {
                    j2 += a;
                } else {
                    ua5Var.d(t60Var2);
                }
                t60Var2.write(bArr2);
                i2++;
            } else {
                t60Var2.getClass();
                t60Var2.write(bArr);
                t60Var2.n(w70Var);
                t60Var2.write(bArr);
                t60Var2.write(bArr2);
                if (z) {
                    f60Var.getClass();
                    long j3 = j2 + f60Var.B;
                    f60Var.w();
                    return j3;
                }
                return j2;
            }
        }
    }
}
