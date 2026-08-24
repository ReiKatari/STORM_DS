package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hh1  reason: default package */
/* loaded from: classes.dex */
public final class hh1 implements ds1 {
    public final int a;
    public final int b;

    public hh1(int i, int i2) {
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
        int i = gs1Var.L;
        m42 m42Var = (m42) gs1Var.Y;
        int i2 = this.b;
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) < 0) {
            i3 = m42Var.b();
        }
        gs1Var.a(gs1Var.L, Math.min(i3, m42Var.b()));
        int i4 = gs1Var.B;
        int i5 = this.a;
        int i6 = i4 - i5;
        if (((i5 ^ i4) & (i4 ^ i6)) < 0) {
            i6 = 0;
        }
        gs1Var.a(Math.max(0, i6), gs1Var.B);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh1)) {
            return false;
        }
        hh1 hh1Var = (hh1) obj;
        if (this.a == hh1Var.a && this.b == hh1Var.b) {
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
        return xg6.q(sb, this.b, ')');
    }
}
