package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dd6  reason: default package */
/* loaded from: classes.dex */
public final class dd6 implements ds1 {
    public final int a;
    public final int b;

    public dd6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ds1
    public final void a(gs1 gs1Var) {
        int q = gi2.q(this.a, 0, ((m42) gs1Var.Y).b());
        int q2 = gi2.q(this.b, 0, ((m42) gs1Var.Y).b());
        if (q < q2) {
            gs1Var.f(q, q2);
        } else {
            gs1Var.f(q2, q);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd6)) {
            return false;
        }
        dd6 dd6Var = (dd6) obj;
        if (this.a == dd6Var.a && this.b == dd6Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return xg6.q(sb, this.b, ')');
    }
}
