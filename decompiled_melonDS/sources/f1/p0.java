package f1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p0 implements i3.n0 {

    /* renamed from: b  reason: collision with root package name */
    public static final p0 f4637b = new p0(0);

    /* renamed from: c  reason: collision with root package name */
    public static final p0 f4638c = new p0(1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4639a;

    public /* synthetic */ p0(int i2) {
        this.f4639a = i2;
    }

    @Override // i3.n0
    public final i3.z a(long j2, x4.m mVar, x4.c cVar) {
        switch (this.f4639a) {
            case 0:
                float O = cVar.O(a0.f4519a);
                return new i3.g0(new h3.c(0.0f, -O, Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) + O));
            default:
                float O2 = cVar.O(a0.f4519a);
                return new i3.g0(new h3.c(-O2, 0.0f, Float.intBitsToFloat((int) (j2 >> 32)) + O2, Float.intBitsToFloat((int) (j2 & 4294967295L))));
        }
    }
}
