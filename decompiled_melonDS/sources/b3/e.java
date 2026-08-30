package b3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public final float f1762a;

    public e(float f8) {
        this.f1762a = f8;
    }

    @Override // b3.d
    public final long a(long j2, long j10, x4.m mVar) {
        long j11 = ((((int) (j10 >> 32)) - ((int) (j2 >> 32))) << 32) | ((((int) (j10 & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L);
        float f8 = 1;
        float f10 = this.f1762a + f8;
        float f11 = (f8 - 1.0f) * (((int) (j11 & 4294967295L)) / 2.0f);
        return (Math.round(f11) & 4294967295L) | (Math.round(f10 * (((int) (j11 >> 32)) / 2.0f)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof e) || Float.compare(this.f1762a, ((e) obj).f1762a) != 0 || Float.compare(-1.0f, -1.0f) != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f1762a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f1762a + ", verticalBias=-1.0)";
    }
}
