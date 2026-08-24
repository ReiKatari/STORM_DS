package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u16  reason: default package */
/* loaded from: classes.dex */
public final class u16 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        mp2.c(RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 0L);
    }

    public u16(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u16) {
                u16 u16Var = (u16) obj;
                if (Float.compare(this.a, u16Var.a) != 0 || Float.compare(this.b, u16Var.b) != 0 || Float.compare(this.c, u16Var.c) != 0 || Float.compare(this.d, u16Var.d) != 0 || !hv.A(this.e, u16Var.e) || !hv.A(this.f, u16Var.f) || !hv.A(this.g, u16Var.g) || !hv.A(this.h, u16Var.h)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + i61.c(this.g, i61.c(this.f, i61.c(this.e, xg6.a(this.d, xg6.a(this.c, xg6.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String str = gi2.Q(this.a) + ", " + gi2.Q(this.b) + ", " + gi2.Q(this.c) + ", " + gi2.Q(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean A = hv.A(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (A && hv.A(j2, j3) && hv.A(j3, j4)) {
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
                StringBuilder t = i61.t("RoundRect(rect=", str, ", radius=");
                t.append(gi2.Q(Float.intBitsToFloat(i)));
                t.append(')');
                return t.toString();
            }
            StringBuilder t2 = i61.t("RoundRect(rect=", str, ", x=");
            t2.append(gi2.Q(Float.intBitsToFloat(i)));
            t2.append(", y=");
            t2.append(gi2.Q(Float.intBitsToFloat(i2)));
            t2.append(')');
            return t2.toString();
        }
        StringBuilder t3 = i61.t("RoundRect(rect=", str, ", topLeft=");
        t3.append((Object) hv.c0(j));
        t3.append(", topRight=");
        t3.append((Object) hv.c0(j2));
        t3.append(", bottomRight=");
        t3.append((Object) hv.c0(j3));
        t3.append(", bottomLeft=");
        t3.append((Object) hv.c0(j4));
        t3.append(')');
        return t3.toString();
    }
}
