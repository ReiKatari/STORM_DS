package p1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final int f11212a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11213b;

    /* renamed from: c  reason: collision with root package name */
    public final s f11214c;

    public h(int i2, int i10, s sVar) {
        this.f11212a = i2;
        this.f11213b = i10;
        this.f11214c = sVar;
        if (i2 < 0) {
            k1.b.a("startIndex should be >= 0");
        }
        if (i10 > 0) {
            return;
        }
        k1.b.a("size should be > 0");
    }
}
