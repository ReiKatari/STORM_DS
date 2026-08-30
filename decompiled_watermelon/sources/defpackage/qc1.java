package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qc1  reason: default package */
/* loaded from: classes.dex */
public final class qc1 {
    public final q76 a;
    public final uu5 b;
    public final bx6 c;
    public final kr4 d;
    public final j80 e;
    public final j80 f;

    public qc1(q76 q76Var, uu5 uu5Var, bx6 bx6Var, kr4 kr4Var, j80 j80Var, j80 j80Var2) {
        this.a = q76Var;
        this.b = uu5Var;
        this.c = bx6Var;
        this.d = kr4Var;
        this.e = j80Var;
        this.f = j80Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qc1) {
            qc1 qc1Var = (qc1) obj;
            if (b53.x(this.a, qc1Var.a) && this.b == qc1Var.b && b53.x(this.c, qc1Var.c) && this.d == qc1Var.d && this.e == qc1Var.e && this.f == qc1Var.f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        q76 q76Var = this.a;
        if (q76Var != null) {
            i = q76Var.hashCode();
        } else {
            i = 0;
        }
        int i7 = i * 31;
        uu5 uu5Var = this.b;
        if (uu5Var != null) {
            i2 = uu5Var.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 28629151;
        bx6 bx6Var = this.c;
        if (bx6Var != null) {
            i3 = bx6Var.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        kr4 kr4Var = this.d;
        if (kr4Var != null) {
            i4 = kr4Var.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 923521;
        j80 j80Var = this.e;
        if (j80Var != null) {
            i5 = j80Var.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        j80 j80Var2 = this.f;
        if (j80Var2 != null) {
            i6 = j80Var2.hashCode();
        }
        return (i11 + i6) * 31;
    }
}
