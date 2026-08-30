package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fd1  reason: default package */
/* loaded from: classes.dex */
public final class fd1 implements tn1 {
    public final int a;
    public final int b;

    public fd1(int i, int i2) {
        boolean z;
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            nz2.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
        }
    }

    @Override // defpackage.tn1
    public final void a(xn1 xn1Var) {
        int i = xn1Var.L;
        xz1 xz1Var = (xz1) xn1Var.Y;
        int i2 = this.b;
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) < 0) {
            i3 = xz1Var.b();
        }
        xn1Var.a(xn1Var.L, Math.min(i3, xz1Var.b()));
        int i4 = xn1Var.B;
        int i5 = this.a;
        int i6 = i4 - i5;
        if (((i5 ^ i4) & (i4 ^ i6)) < 0) {
            i6 = 0;
        }
        xn1Var.a(Math.max(0, i6), xn1Var.B);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd1)) {
            return false;
        }
        fd1 fd1Var = (fd1) obj;
        if (this.a == fd1Var.a && this.b == fd1Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return ej6.g(sb, this.b, ')');
    }
}
