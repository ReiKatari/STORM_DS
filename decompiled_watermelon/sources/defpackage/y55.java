package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y55  reason: default package */
/* loaded from: classes.dex */
public final class y55 {
    public static final y55 e = new y55(RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public y55(float f, float f2, float f3, float f4) {
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

    public final y55 e(y55 y55Var) {
        return new y55(Math.max(this.a, y55Var.a), Math.max(this.b, y55Var.b), Math.min(this.c, y55Var.c), Math.min(this.d, y55Var.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y55)) {
            return false;
        }
        y55 y55Var = (y55) obj;
        if (Float.compare(this.a, y55Var.a) == 0 && Float.compare(this.b, y55Var.b) == 0 && Float.compare(this.c, y55Var.c) == 0 && Float.compare(this.d, y55Var.d) == 0) {
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

    public final boolean g(y55 y55Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (this.a < y55Var.c) {
            z = true;
        } else {
            z = false;
        }
        if (y55Var.a < this.c) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (this.b < y55Var.d) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (y55Var.b < this.d) {
            z4 = true;
        }
        return z6 & z4;
    }

    public final y55 h(float f, float f2) {
        return new y55(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ej6.a(this.c, ej6.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final y55 i(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new y55(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + nl2.b0(this.a) + ", " + nl2.b0(this.b) + ", " + nl2.b0(this.c) + ", " + nl2.b0(this.d) + ')';
    }
}
