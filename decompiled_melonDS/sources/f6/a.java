package f6;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f4900a;

    /* renamed from: b  reason: collision with root package name */
    public int f4901b;

    /* renamed from: c  reason: collision with root package name */
    public float f4902c;

    /* renamed from: d  reason: collision with root package name */
    public float f4903d;

    /* renamed from: e  reason: collision with root package name */
    public long f4904e;

    /* renamed from: f  reason: collision with root package name */
    public long f4905f;

    /* renamed from: g  reason: collision with root package name */
    public long f4906g;

    /* renamed from: h  reason: collision with root package name */
    public float f4907h;

    /* renamed from: i  reason: collision with root package name */
    public int f4908i;

    public final float a(long j2) {
        long j10 = this.f4904e;
        if (j2 < j10) {
            return 0.0f;
        }
        long j11 = this.f4906g;
        if (j11 >= 0 && j2 >= j11) {
            float f8 = this.f4907h;
            return (d.b(((float) (j2 - j11)) / this.f4908i, 0.0f, 1.0f) * f8) + (1.0f - f8);
        }
        return d.b(((float) (j2 - j10)) / this.f4900a, 0.0f, 1.0f) * 0.5f;
    }
}
