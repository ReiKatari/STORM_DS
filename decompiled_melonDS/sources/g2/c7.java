package g2;

import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class c7 implements mc.p {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ b3.p B;
    public final /* synthetic */ long L;
    public final /* synthetic */ long R;
    public final /* synthetic */ p4.j X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ long Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ int f5076b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ boolean f5077c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ int f5078d0;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ int f5079e0;

    /* renamed from: f0  reason: collision with root package name */
    public final /* synthetic */ mc.l f5080f0;

    /* renamed from: g0  reason: collision with root package name */
    public final /* synthetic */ l4.r0 f5081g0;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f5082h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f5083i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f5084j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ CharSequence f5085k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Object f5086l0;

    public /* synthetic */ c7(String str, b3.p pVar, long j2, long j10, p4.j jVar, long j11, w4.k kVar, long j12, int i2, boolean z10, int i10, int i11, mc.l lVar, l4.r0 r0Var, int i12, int i13, int i14) {
        this.f5085k0 = str;
        this.B = pVar;
        this.L = j2;
        this.R = j10;
        this.X = jVar;
        this.Y = j11;
        this.f5086l0 = kVar;
        this.Z = j12;
        this.f5076b0 = i2;
        this.f5077c0 = z10;
        this.f5078d0 = i10;
        this.f5079e0 = i11;
        this.f5080f0 = lVar;
        this.f5081g0 = r0Var;
        this.f5082h0 = i12;
        this.f5083i0 = i13;
        this.f5084j0 = i14;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int F = n2.s.F(this.f5082h0 | 1);
                int F2 = n2.s.F(this.f5083i0);
                e7.b((String) this.f5085k0, this.B, this.L, this.R, this.X, this.Y, (w4.k) this.f5086l0, this.Z, this.f5076b0, this.f5077c0, this.f5078d0, this.f5079e0, this.f5080f0, this.f5081g0, (n2.m) obj, F, F2, this.f5084j0);
                break;
            default:
                ((Integer) obj2).getClass();
                int F3 = n2.s.F(this.f5082h0 | 1);
                int F4 = n2.s.F(this.f5083i0);
                e7.c((l4.h) this.f5085k0, this.B, this.L, this.R, this.X, this.Y, this.Z, this.f5076b0, this.f5077c0, this.f5078d0, this.f5079e0, (Map) this.f5086l0, this.f5080f0, this.f5081g0, (n2.m) obj, F3, F4, this.f5084j0);
                break;
        }
        return yb.y.f14813a;
    }

    public /* synthetic */ c7(l4.h hVar, b3.p pVar, long j2, long j10, p4.j jVar, long j11, long j12, int i2, boolean z10, int i10, int i11, Map map, mc.l lVar, l4.r0 r0Var, int i12, int i13, int i14) {
        this.f5085k0 = hVar;
        this.B = pVar;
        this.L = j2;
        this.R = j10;
        this.X = jVar;
        this.Y = j11;
        this.Z = j12;
        this.f5076b0 = i2;
        this.f5077c0 = z10;
        this.f5078d0 = i10;
        this.f5079e0 = i11;
        this.f5086l0 = map;
        this.f5080f0 = lVar;
        this.f5081g0 = r0Var;
        this.f5082h0 = i12;
        this.f5083i0 = i13;
        this.f5084j0 = i14;
    }
}
