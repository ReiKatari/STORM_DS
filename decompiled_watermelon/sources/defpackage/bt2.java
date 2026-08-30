package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bt2  reason: default package */
/* loaded from: classes.dex */
public abstract class bt2 implements sb6 {
    public final hu2 A;
    public final mf2 B;
    public boolean L;
    public final /* synthetic */ ht2 R;

    public bt2(ht2 ht2Var, hu2 hu2Var) {
        hu2Var.getClass();
        this.R = ht2Var;
        this.A = hu2Var;
        this.B = new mf2(((s45) ht2Var.c.L).A.f());
    }

    @Override // defpackage.sb6
    public long L(f60 f60Var, long j) {
        ht2 ht2Var = this.R;
        f60Var.getClass();
        try {
            return ((s45) ht2Var.c.L).L(f60Var, j);
        } catch (IOException e) {
            ht2Var.b.h();
            this.d(ht2.f);
            throw e;
        }
    }

    public final void d(xq2 xq2Var) {
        zb4 zb4Var;
        y60 y60Var;
        xq2Var.getClass();
        ht2 ht2Var = this.R;
        int i = ht2Var.d;
        if (i != 6) {
            if (i == 5) {
                mf2 mf2Var = this.B;
                kt6 kt6Var = mf2Var.e;
                mf2Var.e = kt6.d;
                kt6Var.a();
                kt6Var.b();
                ht2Var.d = 6;
                if (xq2Var.size() > 0 && (zb4Var = ht2Var.a) != null && (y60Var = zb4Var.j) != null) {
                    yt2.b(y60Var, this.A, xq2Var);
                    return;
                }
                return;
            }
            int i2 = ht2Var.d;
            throw new IllegalStateException("state: " + i2);
        }
    }

    @Override // defpackage.sb6
    public final kt6 f() {
        return this.B;
    }
}
