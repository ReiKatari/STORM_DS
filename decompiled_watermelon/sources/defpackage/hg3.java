package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hg3  reason: default package */
/* loaded from: classes.dex */
public final class hg3 implements wh6 {
    public final k14 a;
    public final /* synthetic */ jg3 b;
    public final /* synthetic */ Object c;

    public hg3(jg3 jg3Var, Object obj) {
        this.b = jg3Var;
        this.c = obj;
        int[] iArr = h33.a;
        this.a = new k14();
    }

    @Override // defpackage.wh6
    public final int a() {
        vf3 vf3Var = (vf3) this.b.e0.g(this.c);
        if (vf3Var != null) {
            return ((o24) ((u14) vf3Var.n()).B).L;
        }
        return 0;
    }

    @Override // defpackage.wh6
    public final void b(j44 j44Var) {
        yy3 yy3Var;
        zc0 zc0Var;
        vf3 vf3Var = (vf3) this.b.e0.g(this.c);
        if (vf3Var != null && (zc0Var = vf3Var.A0) != null) {
            yy3Var = (yy3) zc0Var.g;
        } else {
            yy3Var = null;
        }
        if (yy3Var != null && yy3Var.i0) {
            ve2.Y(yy3Var, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", j44Var);
        }
    }

    @Override // defpackage.wh6
    public final long c(int i) {
        vf3 vf3Var = (vf3) this.b.e0.g(this.c);
        if (vf3Var != null && vf3Var.H()) {
            int i2 = ((o24) ((u14) vf3Var.n()).B).L;
            if (i < 0 || i >= i2) {
                mz2.e("Index (" + i + ") is out of bound of [0, " + i2 + ')');
            }
            if (this.a.c(i)) {
                int i3 = ((vf3) ((u14) vf3Var.n()).get(i)).B0.p.A;
                return (((vf3) ((u14) vf3Var.n()).get(i)).B0.p.B & 4294967295L) | (i3 << 32);
            }
            return 0L;
        }
        return 0L;
    }

    @Override // defpackage.wh6
    public final void d(int i, long j) {
        jg3 jg3Var = this.b;
        vf3 vf3Var = (vf3) jg3Var.e0.g(this.c);
        if (vf3Var != null && vf3Var.H()) {
            int i2 = ((o24) ((u14) vf3Var.n()).B).L;
            if (i < 0 || i >= i2) {
                mz2.e("Index (" + i + ") is out of bound of [0, " + i2 + ')');
            }
            if (vf3Var.I()) {
                mz2.a("Pre-measure called on node that is not placed");
            }
            vf3 vf3Var2 = jg3Var.A;
            vf3Var2.l0 = true;
            ((ee) yf3.a(vf3Var)).t((vf3) ((u14) vf3Var.n()).get(i), j);
            vf3Var2.l0 = false;
            this.a.a(i);
        }
    }

    @Override // defpackage.wh6
    public final void dispose() {
        jg3.c(this.b, this.c);
    }
}
