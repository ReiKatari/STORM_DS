package pd;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y extends w {

    /* renamed from: j  reason: collision with root package name */
    public final od.z f11612j;

    /* renamed from: k  reason: collision with root package name */
    public final List f11613k;

    /* renamed from: l  reason: collision with root package name */
    public final int f11614l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(od.c cVar, od.z zVar) {
        super(cVar, zVar, (String) null, 12);
        cVar.getClass();
        this.f11612j = zVar;
        List p0 = zb.l.p0(zVar.A.keySet());
        this.f11613k = p0;
        this.f11614l = p0.size() * 2;
        this.m = -1;
    }

    @Override // pd.w, pd.b
    public final od.l E(String str) {
        str.getClass();
        if (this.m % 2 == 0) {
            nd.g0 g0Var = od.m.f10897a;
            return new od.s(true, str);
        }
        return (od.l) zb.v.D(str, this.f11612j);
    }

    @Override // pd.w, pd.b
    public final String Q(ld.e eVar, int i2) {
        eVar.getClass();
        return (String) this.f11613k.get(i2 / 2);
    }

    @Override // pd.w, pd.b
    public final od.l S() {
        return this.f11612j;
    }

    @Override // pd.w
    public final od.z X() {
        return this.f11612j;
    }

    @Override // pd.w, pd.b, md.a
    public final void b(ld.e eVar) {
        eVar.getClass();
    }

    @Override // pd.w, md.a
    public final int g(ld.e eVar) {
        eVar.getClass();
        int i2 = this.m;
        if (i2 < this.f11614l - 1) {
            int i10 = i2 + 1;
            this.m = i10;
            return i10;
        }
        return -1;
    }
}
