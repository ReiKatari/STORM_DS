package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z04  reason: default package */
/* loaded from: classes.dex */
public final class z04 extends ku0 {
    public final d24 b;
    public final ArrayList c;
    public final e24 d;
    public final d24 e;
    public final a31 f;

    public z04() {
        super(2);
        this.b = oo2.y();
        this.c = new ArrayList();
        e24 e24Var = xu5.a;
        this.d = new e24();
        this.e = new d24();
        z5 z5Var = new z5(19, this);
        ma6.e(ma6.a);
        synchronized (ma6.c) {
            ma6.h = tq0.Y0(ma6.h, z5Var);
        }
        this.f = new a31(21, z5Var);
    }

    @Override // defpackage.ku0
    public final void c(zz5 zz5Var) {
        this.c.add(new x04(zz5Var));
    }

    @Override // defpackage.ku0
    public final void d() {
        synchronized (this.a) {
            try {
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    y04 y04Var = (y04) arrayList.get(i);
                    if (y04Var instanceof w04) {
                        oo2.q(this.b, ((w04) y04Var).a, ((w04) y04Var).b);
                    } else if (y04Var instanceof x04) {
                        oo2.R(this.b, ((x04) y04Var).a);
                    } else {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c.clear();
    }

    @Override // defpackage.ku0
    public final void e() {
        this.f.g();
        this.c.clear();
        this.e.a();
        synchronized (this.a) {
            this.b.a();
        }
    }

    @Override // defpackage.ku0
    public final mi2 j(zz5 zz5Var) {
        d24 d24Var = this.e;
        mi2 mi2Var = (mi2) d24Var.g(zz5Var);
        if (mi2Var == null) {
            mi2Var = new gi2(18, this, zz5Var);
            int f = d24Var.f(zz5Var);
            if (f < 0) {
                f = ~f;
            }
            Object[] objArr = d24Var.c;
            Object obj = objArr[f];
            d24Var.b[f] = zz5Var;
            objArr[f] = mi2Var;
        }
        return mi2Var;
    }

    @Override // defpackage.ku0
    public final void k(lj0 lj0Var) {
        this.e.k(lj0Var);
        c(lj0Var);
        d();
    }
}
