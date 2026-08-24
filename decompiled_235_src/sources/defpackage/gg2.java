package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gg2  reason: default package */
/* loaded from: classes.dex */
public final class gg2 {
    public final cg2 a;
    public x24 b;
    public dx4 c;
    public x24 d;
    public dx4 e;
    public d93 f;
    public d93 g;

    public gg2(cg2 cg2Var) {
        this.a = cg2Var;
    }

    public final d93 a(int i, boolean z, int i2) {
        int i3 = fg2.a[this.a.ordinal()];
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                if (i3 == 4) {
                    if (z) {
                        return this.f;
                    }
                    if (i + 1 >= 0 && i2 >= 0) {
                        return this.g;
                    }
                    return null;
                }
                i.d();
                return null;
            } else if (z) {
                return this.f;
            } else {
                return null;
            }
        }
        return null;
    }

    public final void b(x24 x24Var, x24 x24Var2, long j) {
        long q = qo2.q(j, hn3.Horizontal);
        if (x24Var != null) {
            int n = x24Var.n(q21.g(q));
            this.f = new d93(d93.a(n, x24Var.V(n)));
            this.b = x24Var;
            this.c = null;
        }
        if (x24Var2 != null) {
            int n2 = x24Var2.n(q21.g(q));
            this.g = new d93(d93.a(n2, x24Var2.V(n2)));
            this.d = x24Var2;
            this.e = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gg2) && this.a == ((gg2) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + lb1.a(0, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + this.a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
