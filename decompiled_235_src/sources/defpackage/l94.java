package defpackage;

import com.github.junrar.unpack.vm.VMCmdFlags;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l94  reason: default package */
/* loaded from: classes.dex */
public final class l94 extends mk5 {
    public static final n34 f;
    public static final n34 g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public final da0 b;
    public final List c;
    public final n34 d;
    public long e;

    static {
        xh5 xh5Var = n34.d;
        f = xk2.k("multipart/mixed");
        xk2.k("multipart/alternative");
        xk2.k("multipart/digest");
        xk2.k("multipart/parallel");
        g = xk2.k("multipart/form-data");
        h = new byte[]{58, VMCmdFlags.VMCF_USEFLAGS};
        i = new byte[]{13, 10};
        j = new byte[]{45, 45};
    }

    public l94(da0 da0Var, n34 n34Var, List list) {
        da0Var.getClass();
        n34Var.getClass();
        this.b = da0Var;
        this.c = list;
        xh5 xh5Var = n34.d;
        this.d = xk2.k(n34Var + "; boundary=" + da0Var.s());
        this.e = -1L;
    }

    @Override // defpackage.mk5
    public final long a() {
        long j2 = this.e;
        if (j2 == -1) {
            long e = e(null, true);
            this.e = e;
            return e;
        }
        return j2;
    }

    @Override // defpackage.mk5
    public final n34 b() {
        return this.d;
    }

    @Override // defpackage.mk5
    public final boolean c() {
        List<k94> list = this.c;
        if (!list.isEmpty()) {
            for (k94 k94Var : list) {
                if (k94Var.b.c()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.mk5
    public final void d(y80 y80Var) {
        e(y80Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e(y80 y80Var, boolean z) {
        k80 k80Var;
        y80 y80Var2;
        if (z) {
            Object obj = new Object();
            k80Var = obj;
            y80Var2 = obj;
        } else {
            k80Var = null;
            y80Var2 = y80Var;
        }
        List list = this.c;
        int size = list.size();
        long j2 = 0;
        int i2 = 0;
        while (true) {
            da0 da0Var = this.b;
            byte[] bArr = j;
            byte[] bArr2 = i;
            if (i2 < size) {
                k94 k94Var = (k94) list.get(i2);
                yw2 yw2Var = k94Var.a;
                mk5 mk5Var = k94Var.b;
                y80Var2.getClass();
                y80Var2.write(bArr);
                y80Var2.P(da0Var);
                y80Var2.write(bArr2);
                int size2 = yw2Var.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    y80Var2.H(yw2Var.b(i3)).write(h).H(yw2Var.d(i3)).write(bArr2);
                }
                n34 b = mk5Var.b();
                if (b != null) {
                    y80Var2.H("Content-Type: ").H(b.a).write(bArr2);
                }
                long a = mk5Var.a();
                if (a == -1 && z) {
                    k80Var.getClass();
                    k80Var.e();
                    return -1L;
                }
                y80Var2.write(bArr2);
                if (z) {
                    j2 += a;
                } else {
                    mk5Var.d(y80Var2);
                }
                y80Var2.write(bArr2);
                i2++;
            } else {
                y80Var2.getClass();
                y80Var2.write(bArr);
                y80Var2.P(da0Var);
                y80Var2.write(bArr);
                y80Var2.write(bArr2);
                if (z) {
                    k80Var.getClass();
                    long j3 = j2 + k80Var.B;
                    k80Var.e();
                    return j3;
                }
                return j2;
            }
        }
    }
}
