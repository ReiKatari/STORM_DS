package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y16  reason: default package */
/* loaded from: classes.dex */
public final class y16 implements ke6 {
    public final g61 a;
    public final g61 b;
    public final g61 c;
    public final g61 d;

    public y16(g61 g61Var, g61 g61Var2, g61 g61Var3, g61 g61Var4) {
        this.a = g61Var;
        this.b = g61Var2;
        this.c = g61Var3;
        this.d = g61Var4;
    }

    @Override // defpackage.ke6
    public final mp2 a(long j, kk3 kk3Var, qh1 qh1Var) {
        float f;
        float f2;
        float a = this.a.a(j, qh1Var);
        float a2 = this.b.a(j, qh1Var);
        float a3 = this.c.a(j, qh1Var);
        float a4 = this.d.a(j, qh1Var);
        float d = xi6.d(j);
        float f3 = a + a4;
        if (f3 > d) {
            float f4 = d / f3;
            a *= f4;
            a4 *= f4;
        }
        float f5 = a2 + a3;
        if (f5 > d) {
            float f6 = d / f5;
            a2 *= f6;
            a3 *= f6;
        }
        if (a < RecyclerView.B1 || a2 < RecyclerView.B1 || a3 < RecyclerView.B1 || a4 < RecyclerView.B1) {
            s53.a("Corner size in Px can't be negative(topStart = " + a + ", topEnd = " + a2 + ", bottomEnd = " + a3 + ", bottomStart = " + a4 + ")!");
        }
        if (a + a2 + a3 + a4 == RecyclerView.B1) {
            return new qo4(kj2.b(0L, j));
        }
        of5 b = kj2.b(0L, j);
        kk3 kk3Var2 = kk3.Ltr;
        if (kk3Var == kk3Var2) {
            f = a;
        } else {
            f = a2;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
        if (kk3Var == kk3Var2) {
            a = a2;
        }
        long floatToRawIntBits2 = (Float.floatToRawIntBits(a) << 32) | (Float.floatToRawIntBits(a) & 4294967295L);
        if (kk3Var == kk3Var2) {
            f2 = a3;
        } else {
            f2 = a4;
        }
        long floatToRawIntBits3 = (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
        if (kk3Var != kk3Var2) {
            a4 = a3;
        }
        return new ro4(new u16(b.a, b.b, b.c, b.d, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (Float.floatToRawIntBits(a4) << 32) | (Float.floatToRawIntBits(a4) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof y16) {
                y16 y16Var = (y16) obj;
                if (!this.a.equals(y16Var.a) || !this.b.equals(y16Var.b) || !this.c.equals(y16Var.c) || !this.d.equals(y16Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
