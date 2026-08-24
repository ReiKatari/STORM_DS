package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ih1  reason: default package */
/* loaded from: classes.dex */
public final class ih1 implements ds1 {
    public final int a;
    public final int b;

    public ih1(int i, int i2) {
        boolean z;
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            q53.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
        }
    }

    @Override // defpackage.ds1
    public final void a(gs1 gs1Var) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.a) {
                int i4 = i3 + 1;
                int i5 = gs1Var.B;
                if (i5 > i4) {
                    char b = gs1Var.b((i5 - i4) - 1);
                    char b2 = gs1Var.b(gs1Var.B - i4);
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
            int i8 = gs1Var.L;
            m42 m42Var = (m42) gs1Var.Y;
            if (i8 + i7 < m42Var.b()) {
                char b3 = gs1Var.b((gs1Var.L + i7) - 1);
                char b4 = gs1Var.b(gs1Var.L + i7);
                if (Character.isHighSurrogate(b3) && Character.isLowSurrogate(b4)) {
                    i6 += 2;
                } else {
                    i6 = i7;
                }
                i++;
            } else {
                i6 = m42Var.b() - gs1Var.L;
                break;
            }
        }
        int i9 = gs1Var.L;
        gs1Var.a(i9, i6 + i9);
        int i10 = gs1Var.B;
        gs1Var.a(i10 - i3, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih1)) {
            return false;
        }
        ih1 ih1Var = (ih1) obj;
        if (this.a == ih1Var.a && this.b == ih1Var.b) {
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
        return xg6.q(sb, this.b, ')');
    }
}
