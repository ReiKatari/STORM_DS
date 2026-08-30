package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fr5  reason: default package */
/* loaded from: classes.dex */
public final class fr5 implements y26 {
    public final z21 a;
    public final z21 b;
    public final z21 c;
    public final z21 d;

    public fr5(z21 z21Var, z21 z21Var2, z21 z21Var3, z21 z21Var4) {
        this.a = z21Var;
        this.b = z21Var2;
        this.c = z21Var3;
        this.d = z21Var4;
    }

    @Override // defpackage.y26
    public final jk2 a(long j, sd3 sd3Var, od1 od1Var) {
        float f;
        float f2;
        float a = this.a.a(j, od1Var);
        float a2 = this.b.a(j, od1Var);
        float a3 = this.c.a(j, od1Var);
        float a4 = this.d.a(j, od1Var);
        float d = i76.d(j);
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
        if (a < RecyclerView.A1 || a2 < RecyclerView.A1 || a3 < RecyclerView.A1 || a4 < RecyclerView.A1) {
            pz2.a("Corner size in Px can't be negative(topStart = " + a + ", topEnd = " + a2 + ", bottomEnd = " + a3 + ", bottomStart = " + a4 + ")!");
        }
        if (a + a2 + a3 + a4 == RecyclerView.A1) {
            return new of4(yf2.b(0L, j));
        }
        y55 b = yf2.b(0L, j);
        sd3 sd3Var2 = sd3.Ltr;
        if (sd3Var == sd3Var2) {
            f = a;
        } else {
            f = a2;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
        if (sd3Var == sd3Var2) {
            a = a2;
        }
        long floatToRawIntBits2 = (Float.floatToRawIntBits(a) << 32) | (Float.floatToRawIntBits(a) & 4294967295L);
        if (sd3Var == sd3Var2) {
            f2 = a3;
        } else {
            f2 = a4;
        }
        long floatToRawIntBits3 = (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
        if (sd3Var != sd3Var2) {
            a4 = a3;
        }
        return new pf4(new ar5(b.a, b.b, b.c, b.d, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (Float.floatToRawIntBits(a4) << 32) | (Float.floatToRawIntBits(a4) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fr5) {
                fr5 fr5Var = (fr5) obj;
                if (!this.a.equals(fr5Var.a) || !this.b.equals(fr5Var.b) || !this.c.equals(fr5Var.c) || !this.d.equals(fr5Var.d)) {
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
