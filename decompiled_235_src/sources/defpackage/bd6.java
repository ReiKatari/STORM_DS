package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bd6  reason: default package */
/* loaded from: classes.dex */
public final class bd6 implements ds1 {
    public final int a;
    public final int b;

    public bd6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ds1
    public final void a(gs1 gs1Var) {
        boolean z;
        if (gs1Var.R != -1) {
            z = true;
        } else {
            z = false;
        }
        m42 m42Var = (m42) gs1Var.Y;
        if (z) {
            gs1Var.R = -1;
            gs1Var.X = -1;
        }
        int q = gi2.q(this.a, 0, m42Var.b());
        int q2 = gi2.q(this.b, 0, m42Var.b());
        if (q != q2) {
            if (q < q2) {
                gs1Var.e(q, q2);
            } else {
                gs1Var.e(q2, q);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd6)) {
            return false;
        }
        bd6 bd6Var = (bd6) obj;
        if (this.a == bd6Var.a && this.b == bd6Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return xg6.q(sb, this.b, ')');
    }
}
