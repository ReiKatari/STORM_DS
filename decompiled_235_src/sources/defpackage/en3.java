package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: en3  reason: default package */
/* loaded from: classes.dex */
public final class en3 implements nt6 {
    public final q94 a;
    public final /* synthetic */ gn3 b;
    public final /* synthetic */ Object c;

    public en3(gn3 gn3Var, Object obj) {
        this.b = gn3Var;
        this.c = obj;
        int[] iArr = p93.a;
        this.a = new q94();
    }

    @Override // defpackage.nt6
    public final int a() {
        sm3 sm3Var = (sm3) this.b.f0.g(this.c);
        if (sm3Var != null) {
            return ((ua4) ((aa4) sm3Var.n()).B).L;
        }
        return 0;
    }

    @Override // defpackage.nt6
    public final void b(pc4 pc4Var) {
        z64 z64Var;
        if0 if0Var;
        sm3 sm3Var = (sm3) this.b.f0.g(this.c);
        if (sm3Var != null && (if0Var = sm3Var.B0) != null) {
            z64Var = (z64) if0Var.g;
        } else {
            z64Var = null;
        }
        if (z64Var != null && z64Var.j0) {
            ii2.X(z64Var, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", pc4Var);
        }
    }

    @Override // defpackage.nt6
    public final long c(int i) {
        sm3 sm3Var = (sm3) this.b.f0.g(this.c);
        if (sm3Var != null && sm3Var.H()) {
            int i2 = ((ua4) ((aa4) sm3Var.n()).B).L;
            if (i < 0 || i >= i2) {
                p53.e("Index (" + i + ") is out of bound of [0, " + i2 + ')');
            }
            if (this.a.c(i)) {
                int i3 = ((sm3) ((aa4) sm3Var.n()).get(i)).C0.p.A;
                return (((sm3) ((aa4) sm3Var.n()).get(i)).C0.p.B & 4294967295L) | (i3 << 32);
            }
            return 0L;
        }
        return 0L;
    }

    @Override // defpackage.nt6
    public final void d(int i, long j) {
        gn3 gn3Var = this.b;
        sm3 sm3Var = (sm3) gn3Var.f0.g(this.c);
        if (sm3Var != null && sm3Var.H()) {
            int i2 = ((ua4) ((aa4) sm3Var.n()).B).L;
            if (i < 0 || i >= i2) {
                p53.e("Index (" + i + ") is out of bound of [0, " + i2 + ')');
            }
            if (sm3Var.I()) {
                p53.a("Pre-measure called on node that is not placed");
            }
            sm3 sm3Var2 = gn3Var.A;
            sm3Var2.m0 = true;
            ((te) vm3.a(sm3Var)).t((sm3) ((aa4) sm3Var.n()).get(i), j);
            sm3Var2.m0 = false;
            this.a.a(i);
        }
    }

    @Override // defpackage.nt6
    public final void dispose() {
        gn3.c(this.b, this.c);
    }
}
