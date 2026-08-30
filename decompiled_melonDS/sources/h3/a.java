package h3;

import k7.w;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6045a;

    /* renamed from: b  reason: collision with root package name */
    public float f6046b;

    /* renamed from: c  reason: collision with root package name */
    public float f6047c;

    /* renamed from: d  reason: collision with root package name */
    public float f6048d;

    /* renamed from: e  reason: collision with root package name */
    public float f6049e;

    public a() {
        this.f6045a = 0;
        this.f6046b = 0.0f;
        this.f6047c = 0.0f;
        this.f6048d = 0.0f;
        this.f6049e = 0.0f;
    }

    public float a() {
        return this.f6049e;
    }

    public float b() {
        return this.f6047c;
    }

    public float c() {
        return this.f6048d;
    }

    public float d() {
        return this.f6046b;
    }

    public void e(float f8, float f10, float f11, float f12) {
        this.f6046b = Math.max(f8, this.f6046b);
        this.f6047c = Math.max(f10, this.f6047c);
        this.f6048d = Math.min(f11, this.f6048d);
        this.f6049e = Math.min(f12, this.f6049e);
    }

    public boolean f() {
        boolean z10;
        boolean z11 = false;
        if (this.f6046b >= this.f6048d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f6047c >= this.f6049e) {
            z11 = true;
        }
        return z10 | z11;
    }

    public void g() {
        float f8 = this.f6048d;
        float f10 = this.f6047c;
        float f11 = 1.0f;
        int i2 = (1.0f > f10 ? 1 : (1.0f == f10 ? 0 : -1));
        if (i2 <= 0 && 1.0f >= f8) {
            this.f6046b = 1.0f;
            if (f10 != f8) {
                if (i2 != 0) {
                    if (1.0f != f8) {
                        float f12 = 1.0f / f8;
                        f11 = (1.0f - f12) / ((1.0f / f10) - f12);
                    }
                }
                this.f6049e = f11;
                return;
            }
            f11 = 0.0f;
            this.f6049e = f11;
            return;
        }
        throw new IllegalArgumentException("Requested zoomRatio 1.0 is not within valid range [" + f8 + " , " + f10 + "]");
    }

    public void h(long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        this.f6046b += intBitsToFloat;
        this.f6047c += intBitsToFloat2;
        this.f6048d += intBitsToFloat;
        this.f6049e += intBitsToFloat2;
    }

    public String toString() {
        switch (this.f6045a) {
            case 0:
                return "MutableRect(" + w.J(this.f6046b) + ", " + w.J(this.f6047c) + ", " + w.J(this.f6048d) + ", " + w.J(this.f6049e) + ')';
            default:
                return super.toString();
        }
    }

    public a(float f8, float f10) {
        this.f6045a = 1;
        this.f6047c = f8;
        this.f6048d = f10;
    }
}
