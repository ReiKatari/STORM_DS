package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gd1  reason: default package */
/* loaded from: classes.dex */
public final class gd1 implements tn1 {
    public final int a;
    public final int b;

    public gd1(int i, int i2) {
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
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.a) {
                int i4 = i3 + 1;
                int i5 = xn1Var.B;
                if (i5 > i4) {
                    char b = xn1Var.b((i5 - i4) - 1);
                    char b2 = xn1Var.b(xn1Var.B - i4);
                    if (Character.isHighSurrogate(b) && Character.isLowSurrogate(b2)) {
                        i3 += 2;
                    } else {
                        i3 = i4;
                    }
                    i2++;
                } else {
                    i3 = i5;
                    break;
                }
            } else {
                break;
            }
        }
        int i6 = 0;
        while (true) {
            if (i >= this.b) {
                break;
            }
            int i7 = i6 + 1;
            int i8 = xn1Var.L;
            xz1 xz1Var = (xz1) xn1Var.Y;
            if (i8 + i7 < xz1Var.b()) {
                char b3 = xn1Var.b((xn1Var.L + i7) - 1);
                char b4 = xn1Var.b(xn1Var.L + i7);
                if (Character.isHighSurrogate(b3) && Character.isLowSurrogate(b4)) {
                    i6 += 2;
                } else {
                    i6 = i7;
                }
                i++;
            } else {
                i6 = xz1Var.b() - xn1Var.L;
                break;
            }
        }
        int i9 = xn1Var.L;
        xn1Var.a(i9, i6 + i9);
        int i10 = xn1Var.B;
        xn1Var.a(i10 - i3, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd1)) {
            return false;
        }
        gd1 gd1Var = (gd1) obj;
        if (this.a == gd1Var.a && this.b == gd1Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return ej6.g(sb, this.b, ')');
    }
}
