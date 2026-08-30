package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p16  reason: default package */
/* loaded from: classes.dex */
public final class p16 implements tn1 {
    public final int a;
    public final int b;

    public p16(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.tn1
    public final void a(xn1 xn1Var) {
        int m = io2.m(this.a, 0, ((xz1) xn1Var.Y).b());
        int m2 = io2.m(this.b, 0, ((xz1) xn1Var.Y).b());
        if (m < m2) {
            xn1Var.f(m, m2);
        } else {
            xn1Var.f(m2, m);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p16)) {
            return false;
        }
        p16 p16Var = (p16) obj;
        if (this.a == p16Var.a && this.b == p16Var.b) {
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
        return ej6.g(sb, this.b, ')');
    }
}
