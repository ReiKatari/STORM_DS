package nd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: e  reason: collision with root package name */
    public static final long[] f10378e = new long[0];

    /* renamed from: a  reason: collision with root package name */
    public final ld.e f10379a;

    /* renamed from: b  reason: collision with root package name */
    public final f1.k0 f10380b;

    /* renamed from: c  reason: collision with root package name */
    public long f10381c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f10382d;

    public w(ld.e eVar, f1.k0 k0Var) {
        eVar.getClass();
        this.f10379a = eVar;
        this.f10380b = k0Var;
        int d4 = eVar.d();
        if (d4 <= 64) {
            this.f10381c = d4 != 64 ? (-1) << d4 : 0L;
            this.f10382d = f10378e;
            return;
        }
        this.f10381c = 0L;
        int i2 = (d4 - 1) >>> 6;
        long[] jArr = new long[i2];
        if ((d4 & 63) != 0) {
            jArr[i2 - 1] = (-1) << d4;
        }
        this.f10382d = jArr;
    }
}
