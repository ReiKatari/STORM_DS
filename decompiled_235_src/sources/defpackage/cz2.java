package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cz2  reason: default package */
/* loaded from: classes.dex */
public abstract class cz2 implements in6 {
    public final i03 A;
    public final lk2 B;
    public boolean L;
    public final /* synthetic */ hz2 R;

    public cz2(hz2 hz2Var, i03 i03Var) {
        i03Var.getClass();
        this.R = hz2Var;
        this.A = i03Var;
        this.B = new lk2(((fe5) hz2Var.c.L).A.b());
    }

    @Override // defpackage.in6
    public final b67 b() {
        return this.B;
    }

    @Override // defpackage.in6
    public long b0(k80 k80Var, long j) {
        hz2 hz2Var = this.R;
        k80Var.getClass();
        try {
            return ((fe5) hz2Var.c.L).b0(k80Var, j);
        } catch (IOException e) {
            hz2Var.b.e();
            this.e(hz2.f);
            throw e;
        }
    }

    public final void e(yw2 yw2Var) {
        xk4 xk4Var;
        vs0 vs0Var;
        yw2Var.getClass();
        hz2 hz2Var = this.R;
        int i = hz2Var.d;
        if (i != 6) {
            if (i == 5) {
                lk2 lk2Var = this.B;
                b67 b67Var = lk2Var.e;
                lk2Var.e = b67.d;
                b67Var.a();
                b67Var.b();
                hz2Var.d = 6;
                if (yw2Var.size() > 0 && (xk4Var = hz2Var.a) != null && (vs0Var = xk4Var.j) != null) {
                    zz2.b(vs0Var, this.A, yw2Var);
                    return;
                }
                return;
            }
            int i2 = hz2Var.d;
            throw new IllegalStateException("state: " + i2);
        }
    }
}
