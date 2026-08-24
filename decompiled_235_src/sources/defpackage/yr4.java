package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yr4  reason: default package */
/* loaded from: classes.dex */
public final class yr4 {
    public final cj a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public yr4(cj cjVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = cjVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final of5 a(of5 of5Var) {
        return of5Var.i((Float.floatToRawIntBits(RecyclerView.B1) << 32) | (Float.floatToRawIntBits(this.f) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = k47.b;
            if (k47.b(j, j2)) {
                return j2;
            }
        }
        int i = k47.c;
        int i2 = this.b;
        return jx2.f(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final of5 c(of5 of5Var) {
        return of5Var.i((Float.floatToRawIntBits(RecyclerView.B1) << 32) | (Float.floatToRawIntBits(-this.f) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return gi2.q(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yr4) {
                yr4 yr4Var = (yr4) obj;
                if (this.a == yr4Var.a && this.b == yr4Var.b && this.c == yr4Var.c && this.d == yr4Var.d && this.e == yr4Var.e && Float.compare(this.f, yr4Var.f) == 0 && Float.compare(this.g, yr4Var.g) == 0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + xg6.a(this.f, lb1.a(this.e, lb1.a(this.d, lb1.a(this.c, lb1.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        sb.append(this.c);
        sb.append(", startLineIndex=");
        sb.append(this.d);
        sb.append(", endLineIndex=");
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        return xg6.p(sb, this.g, ')');
    }
}
