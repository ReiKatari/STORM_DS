package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n16  reason: default package */
/* loaded from: classes.dex */
public final class n16 implements tn1 {
    public final int a;
    public final int b;

    public n16(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.tn1
    public final void a(xn1 xn1Var) {
        boolean z;
        if (xn1Var.R != -1) {
            z = true;
        } else {
            z = false;
        }
        xz1 xz1Var = (xz1) xn1Var.Y;
        if (z) {
            xn1Var.R = -1;
            xn1Var.X = -1;
        }
        int m = io2.m(this.a, 0, xz1Var.b());
        int m2 = io2.m(this.b, 0, xz1Var.b());
        if (m != m2) {
            if (m < m2) {
                xn1Var.e(m, m2);
            } else {
                xn1Var.e(m2, m);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n16)) {
            return false;
        }
        n16 n16Var = (n16) obj;
        if (this.a == n16Var.a && this.b == n16Var.b) {
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
        return ej6.g(sb, this.b, ')');
    }
}
