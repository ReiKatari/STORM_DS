package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 implements y {

    /* renamed from: a  reason: collision with root package name */
    public final int f3511a;

    /* renamed from: b  reason: collision with root package name */
    public final v f3512b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3513c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3514d;

    public a0(int i2, int i10, v vVar) {
        this.f3511a = i2;
        this.f3512b = vVar;
        this.f3513c = i2 * 1000000;
        this.f3514d = i10 * 1000000;
    }

    @Override // d1.y
    public final float b(long j2, float f8, float f10, float f11) {
        float f12;
        long j10 = j2 - this.f3514d;
        if (j10 < 0) {
            j10 = 0;
        }
        long j11 = this.f3513c;
        if (j10 > j11) {
            j10 = j11;
        }
        if (this.f3511a == 0) {
            f12 = 1.0f;
        } else {
            f12 = ((float) j10) / ((float) j11);
        }
        float a10 = this.f3512b.a(f12);
        return (f10 * a10) + ((1 - a10) * f8);
    }

    @Override // d1.y
    public final float c(long j2, float f8, float f10, float f11) {
        long j10;
        long j11 = j2 - this.f3514d;
        if (j11 < 0) {
            j11 = 0;
        }
        long j12 = this.f3513c;
        if (j11 > j12) {
            j10 = j12;
        } else {
            j10 = j11;
        }
        if (j10 == 0) {
            return f11;
        }
        return (b(j10, f8, f10, f11) - b(j10 - 1000000, f8, f10, f11)) * 1000.0f;
    }

    @Override // d1.y
    public final long d(float f8, float f10, float f11) {
        return this.f3514d + this.f3513c;
    }
}
