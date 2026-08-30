package l4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final b f8890a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8891b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8892c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8893d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8894e;

    /* renamed from: f  reason: collision with root package name */
    public final float f8895f;

    /* renamed from: g  reason: collision with root package name */
    public final float f8896g;

    public s(b bVar, int i2, int i10, int i11, int i12, float f8, float f10) {
        this.f8890a = bVar;
        this.f8891b = i2;
        this.f8892c = i10;
        this.f8893d = i11;
        this.f8894e = i12;
        this.f8895f = f8;
        this.f8896g = f10;
    }

    public final h3.c a(h3.c cVar) {
        return cVar.i((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(this.f8895f) & 4294967295L));
    }

    public final long b(long j2, boolean z10) {
        if (z10) {
            long j10 = q0.f8883b;
            if (q0.b(j2, j10)) {
                return j10;
            }
        }
        int i2 = q0.f8884c;
        int i10 = (int) (j2 >> 32);
        int i11 = this.f8891b;
        return i0.b(i10 + i11, ((int) (j2 & 4294967295L)) + i11);
    }

    public final h3.c c(h3.c cVar) {
        return cVar.i((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(-this.f8895f) & 4294967295L));
    }

    public final int d(int i2) {
        int i10 = this.f8892c;
        int i11 = this.f8891b;
        return p7.j.g(i2, i11, i10) - i11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s) {
                s sVar = (s) obj;
                if (!this.f8890a.equals(sVar.f8890a) || this.f8891b != sVar.f8891b || this.f8892c != sVar.f8892c || this.f8893d != sVar.f8893d || this.f8894e != sVar.f8894e || Float.compare(this.f8895f, sVar.f8895f) != 0 || Float.compare(this.f8896g, sVar.f8896g) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8896g) + w.d.b(this.f8895f, w.d.c(this.f8894e, w.d.c(this.f8893d, w.d.c(this.f8892c, w.d.c(this.f8891b, this.f8890a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphInfo(paragraph=");
        sb2.append(this.f8890a);
        sb2.append(", startIndex=");
        sb2.append(this.f8891b);
        sb2.append(", endIndex=");
        sb2.append(this.f8892c);
        sb2.append(", startLineIndex=");
        sb2.append(this.f8893d);
        sb2.append(", endLineIndex=");
        sb2.append(this.f8894e);
        sb2.append(", top=");
        sb2.append(this.f8895f);
        sb2.append(", bottom=");
        return w.d.o(sb2, this.f8896g, ')');
    }
}
