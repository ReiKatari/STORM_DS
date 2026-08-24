package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: of5  reason: default package */
/* loaded from: classes.dex */
public final class of5 {
    public static final of5 e = new of5(RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public of5(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean a(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        boolean z4 = false;
        if (intBitsToFloat >= this.a) {
            z = true;
        } else {
            z = false;
        }
        if (intBitsToFloat < this.c) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (intBitsToFloat2 >= this.b) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (intBitsToFloat2 < this.d) {
            z4 = true;
        }
        return z6 & z4;
    }

    public final long b() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long c() {
        float f = this.c - this.a;
        float f2 = this.d - this.b;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final long d() {
        return (Float.floatToRawIntBits(this.a) << 32) | (Float.floatToRawIntBits(this.b) & 4294967295L);
    }

    public final of5 e(of5 of5Var) {
        return new of5(Math.max(this.a, of5Var.a), Math.max(this.b, of5Var.b), Math.min(this.c, of5Var.c), Math.min(this.d, of5Var.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of5)) {
            return false;
        }
        of5 of5Var = (of5) obj;
        if (Float.compare(this.a, of5Var.a) == 0 && Float.compare(this.b, of5Var.b) == 0 && Float.compare(this.c, of5Var.c) == 0 && Float.compare(this.d, of5Var.d) == 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        boolean z;
        boolean z2 = false;
        if (this.a >= this.c) {
            z = true;
        } else {
            z = false;
        }
        if (this.b >= this.d) {
            z2 = true;
        }
        return z | z2;
    }

    public final boolean g(of5 of5Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (this.a < of5Var.c) {
            z = true;
        } else {
            z = false;
        }
        if (of5Var.a < this.c) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (this.b < of5Var.d) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (of5Var.b < this.d) {
            z4 = true;
        }
        return z6 & z4;
    }

    public final of5 h(float f, float f2) {
        return new of5(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + xg6.a(this.c, xg6.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final of5 i(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new of5(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + gi2.Q(this.a) + ", " + gi2.Q(this.b) + ", " + gi2.Q(this.c) + ", " + gi2.Q(this.d) + ')';
    }
}
