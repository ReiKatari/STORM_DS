package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ce1  reason: default package */
/* loaded from: classes.dex */
public final class ce1 implements x24 {
    public final /* synthetic */ int A;
    public final x24 B;
    public final Enum L;
    public final Enum R;

    public /* synthetic */ ce1(x24 x24Var, Enum r2, Enum r3, int i) {
        this.A = i;
        this.B = x24Var;
        this.L = r2;
        this.R = r3;
    }

    @Override // defpackage.x24
    public final Object B() {
        switch (this.A) {
            case 0:
                return this.B.B();
            case 1:
                return this.B.B();
            default:
                return this.B.B();
        }
    }

    @Override // defpackage.x24
    public final int V(int i) {
        switch (this.A) {
            case 0:
                return this.B.V(i);
            case 1:
                return this.B.V(i);
            default:
                return this.B.V(i);
        }
    }

    @Override // defpackage.x24
    public final int c(int i) {
        switch (this.A) {
            case 0:
                return this.B.c(i);
            case 1:
                return this.B.c(i);
            default:
                return this.B.c(i);
        }
    }

    @Override // defpackage.x24
    public final int n(int i) {
        switch (this.A) {
            case 0:
                return this.B.n(i);
            case 1:
                return this.B.n(i);
            default:
                return this.B.n(i);
        }
    }

    @Override // defpackage.x24
    public final int u(int i) {
        switch (this.A) {
            case 0:
                return this.B.u(i);
            case 1:
                return this.B.u(i);
            default:
                return this.B.u(i);
        }
    }

    @Override // defpackage.x24
    public final dx4 y(long j) {
        int V;
        int n;
        int V2;
        int n2;
        int V3;
        int n3;
        switch (this.A) {
            case 0:
                jb3 jb3Var = (jb3) this.R;
                jb3 jb3Var2 = jb3.Width;
                fb3 fb3Var = (fb3) this.L;
                int i = 32767;
                x24 x24Var = this.B;
                if (jb3Var == jb3Var2) {
                    if (fb3Var == fb3.Max) {
                        n = x24Var.u(q21.g(j));
                    } else {
                        n = x24Var.n(q21.g(j));
                    }
                    if (q21.c(j)) {
                        i = q21.g(j);
                    }
                    return new kd2(n, i, 0);
                }
                if (fb3Var == fb3.Max) {
                    V = x24Var.c(q21.h(j));
                } else {
                    V = x24Var.V(q21.h(j));
                }
                if (q21.d(j)) {
                    i = q21.h(j);
                }
                return new kd2(i, V, 0);
            case 1:
                l34 l34Var = (l34) this.R;
                l34 l34Var2 = l34.Width;
                k34 k34Var = (k34) this.L;
                int i2 = 32767;
                x24 x24Var2 = this.B;
                if (l34Var == l34Var2) {
                    if (k34Var == k34.Max) {
                        n2 = x24Var2.u(q21.g(j));
                    } else {
                        n2 = x24Var2.n(q21.g(j));
                    }
                    if (q21.c(j)) {
                        i2 = q21.g(j);
                    }
                    return new kd2(n2, i2, 1);
                }
                if (k34Var == k34.Max) {
                    V2 = x24Var2.c(q21.h(j));
                } else {
                    V2 = x24Var2.V(q21.h(j));
                }
                if (q21.d(j)) {
                    i2 = q21.h(j);
                }
                return new kd2(i2, V2, 1);
            default:
                ig4 ig4Var = (ig4) this.R;
                ig4 ig4Var2 = ig4.Width;
                hg4 hg4Var = (hg4) this.L;
                int i3 = 32767;
                x24 x24Var3 = this.B;
                if (ig4Var == ig4Var2) {
                    if (hg4Var == hg4.Max) {
                        n3 = x24Var3.u(q21.g(j));
                    } else {
                        n3 = x24Var3.n(q21.g(j));
                    }
                    if (q21.c(j)) {
                        i3 = q21.g(j);
                    }
                    return new kd2(n3, i3, 2);
                }
                if (hg4Var == hg4.Max) {
                    V3 = x24Var3.c(q21.h(j));
                } else {
                    V3 = x24Var3.V(q21.h(j));
                }
                if (q21.d(j)) {
                    i3 = q21.h(j);
                }
                return new kd2(i3, V3, 2);
        }
    }
}
