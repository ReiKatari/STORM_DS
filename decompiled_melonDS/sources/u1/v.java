package u1;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v implements y3.v0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p0 f13454a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ mc.l f13455b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q4.x f13456c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ q4.q f13457d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ x4.c f13458e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f13459f;

    public v(p0 p0Var, mc.l lVar, q4.x xVar, q4.q qVar, x4.c cVar, int i2) {
        this.f13454a = p0Var;
        this.f13455b = lVar;
        this.f13456c = xVar;
        this.f13457d = qVar;
        this.f13458e = cVar;
        this.f13459f = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f3  */
    @Override // y3.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y3.w0 a(y3.x0 r30, java.util.List r31, long r32) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.v.a(y3.x0, java.util.List, long):y3.w0");
    }

    @Override // y3.v0
    public final int d(y3.v vVar, List list, int i2) {
        p0 p0Var = this.f13454a;
        p0Var.f13379a.a(vVar.getLayoutDirection());
        a7.v vVar2 = p0Var.f13379a.f13452j;
        if (vVar2 != null) {
            return l0.o(vVar2.c());
        }
        a0.j.p("layoutIntrinsics must be called first");
        return 0;
    }
}
