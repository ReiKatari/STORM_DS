package h3;

import k7.w;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final c f6051e = new c(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f6052a;

    /* renamed from: b  reason: collision with root package name */
    public final float f6053b;

    /* renamed from: c  reason: collision with root package name */
    public final float f6054c;

    /* renamed from: d  reason: collision with root package name */
    public final float f6055d;

    public c(float f8, float f10, float f11, float f12) {
        this.f6052a = f8;
        this.f6053b = f10;
        this.f6054c = f11;
        this.f6055d = f12;
    }

    public final boolean a(long j2) {
        boolean z10;
        boolean z11;
        boolean z12;
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        boolean z13 = false;
        if (intBitsToFloat >= this.f6052a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (intBitsToFloat < this.f6054c) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z14 = z10 & z11;
        if (intBitsToFloat2 >= this.f6053b) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean z15 = z14 & z12;
        if (intBitsToFloat2 < this.f6055d) {
            z13 = true;
        }
        return z15 & z13;
    }

    public final long b() {
        float f8 = this.f6054c;
        float f10 = this.f6052a;
        float f11 = ((f8 - f10) / 2.0f) + f10;
        float f12 = this.f6055d;
        float f13 = this.f6053b;
        return (Float.floatToRawIntBits(((f12 - f13) / 2.0f) + f13) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
    }

    public final long c() {
        float f8 = this.f6054c - this.f6052a;
        float f10 = this.f6055d - this.f6053b;
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
    }

    public final long d() {
        return (Float.floatToRawIntBits(this.f6052a) << 32) | (Float.floatToRawIntBits(this.f6053b) & 4294967295L);
    }

    public final c e(c cVar) {
        return new c(Math.max(this.f6052a, cVar.f6052a), Math.max(this.f6053b, cVar.f6053b), Math.min(this.f6054c, cVar.f6054c), Math.min(this.f6055d, cVar.f6055d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Float.compare(this.f6052a, cVar.f6052a) == 0 && Float.compare(this.f6053b, cVar.f6053b) == 0 && Float.compare(this.f6054c, cVar.f6054c) == 0 && Float.compare(this.f6055d, cVar.f6055d) == 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        boolean z10;
        boolean z11 = false;
        if (this.f6052a >= this.f6054c) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f6053b >= this.f6055d) {
            z11 = true;
        }
        return z10 | z11;
    }

    public final boolean g(c cVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (this.f6052a < cVar.f6054c) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (cVar.f6052a < this.f6054c) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z14 = z10 & z11;
        if (this.f6053b < cVar.f6055d) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean z15 = z14 & z12;
        if (cVar.f6053b < this.f6055d) {
            z13 = true;
        }
        return z15 & z13;
    }

    public final c h(float f8, float f10) {
        return new c(this.f6052a + f8, this.f6053b + f10, this.f6054c + f8, this.f6055d + f10);
    }

    public final int hashCode() {
        return Float.hashCode(this.f6055d) + w.d.b(this.f6054c, w.d.b(this.f6053b, Float.hashCode(this.f6052a) * 31, 31), 31);
    }

    public final c i(long j2) {
        int i2 = (int) (j2 >> 32);
        int i10 = (int) (j2 & 4294967295L);
        return new c(Float.intBitsToFloat(i2) + this.f6052a, Float.intBitsToFloat(i10) + this.f6053b, Float.intBitsToFloat(i2) + this.f6054c, Float.intBitsToFloat(i10) + this.f6055d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + w.J(this.f6052a) + ", " + w.J(this.f6053b) + ", " + w.J(this.f6054c) + ", " + w.J(this.f6055d) + ')';
    }
}
