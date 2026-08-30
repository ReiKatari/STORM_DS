package b3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements d {

    /* renamed from: a  reason: collision with root package name */
    public final float f1765a;

    /* renamed from: b  reason: collision with root package name */
    public final float f1766b;

    public h(float f8, float f10) {
        this.f1765a = f8;
        this.f1766b = f10;
    }

    @Override // b3.d
    public final long a(long j2, long j10, x4.m mVar) {
        float f8 = (((int) (j10 >> 32)) - ((int) (j2 >> 32))) / 2.0f;
        float f10 = (((int) (j10 & 4294967295L)) - ((int) (j2 & 4294967295L))) / 2.0f;
        x4.m mVar2 = x4.m.Ltr;
        float f11 = this.f1765a;
        if (mVar != mVar2) {
            f11 *= -1;
        }
        float f12 = 1;
        float f13 = (f12 + this.f1766b) * f10;
        return (Math.round(f13) & 4294967295L) | (Math.round((f11 + f12) * f8) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (Float.compare(this.f1765a, hVar.f1765a) == 0 && Float.compare(this.f1766b, hVar.f1766b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1766b) + (Float.hashCode(this.f1765a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb2.append(this.f1765a);
        sb2.append(", verticalBias=");
        return w.d.o(sb2, this.f1766b, ')');
    }
}
