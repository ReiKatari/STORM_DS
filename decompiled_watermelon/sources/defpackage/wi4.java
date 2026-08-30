package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wi4  reason: default package */
/* loaded from: classes.dex */
public final class wi4 {
    public final qi a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public wi4(qi qiVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = qiVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final y55 a(y55 y55Var) {
        return y55Var.i((Float.floatToRawIntBits(RecyclerView.A1) << 32) | (Float.floatToRawIntBits(this.f) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = vr6.b;
            if (vr6.b(j, j2)) {
                return j2;
            }
        }
        int i = vr6.c;
        int i2 = this.b;
        return ve2.g(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final y55 c(y55 y55Var) {
        return y55Var.i((Float.floatToRawIntBits(RecyclerView.A1) << 32) | (Float.floatToRawIntBits(-this.f) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return io2.m(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wi4) {
                wi4 wi4Var = (wi4) obj;
                if (this.a == wi4Var.a && this.b == wi4Var.b && this.c == wi4Var.c && this.d == wi4Var.d && this.e == wi4Var.e && Float.compare(this.f, wi4Var.f) == 0 && Float.compare(this.g, wi4Var.g) == 0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + ej6.a(this.f, wh1.a(this.e, wh1.a(this.d, wh1.a(this.c, wh1.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
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
        return ej6.f(sb, this.g, ')');
    }
}
