package pd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x extends b {

    /* renamed from: f  reason: collision with root package name */
    public final od.e f11609f;

    /* renamed from: g  reason: collision with root package name */
    public final int f11610g;

    /* renamed from: h  reason: collision with root package name */
    public int f11611h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(od.c cVar, od.e eVar) {
        super(cVar, null);
        cVar.getClass();
        this.f11609f = eVar;
        this.f11610g = eVar.A.size();
        this.f11611h = -1;
    }

    @Override // pd.b
    public final od.l E(String str) {
        str.getClass();
        return (od.l) this.f11609f.A.get(Integer.parseInt(str));
    }

    @Override // pd.b
    public final String Q(ld.e eVar, int i2) {
        eVar.getClass();
        return String.valueOf(i2);
    }

    @Override // pd.b
    public final od.l S() {
        return this.f11609f;
    }

    @Override // md.a
    public final int g(ld.e eVar) {
        eVar.getClass();
        int i2 = this.f11611h;
        if (i2 < this.f11610g - 1) {
            int i10 = i2 + 1;
            this.f11611h = i10;
            return i10;
        }
        return -1;
    }
}
