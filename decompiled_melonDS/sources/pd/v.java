package pd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v extends b {

    /* renamed from: f  reason: collision with root package name */
    public final od.l f11604f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(od.c cVar, od.l lVar, String str) {
        super(cVar, str);
        cVar.getClass();
        lVar.getClass();
        this.f11604f = lVar;
        this.f11559a.add("primitive");
    }

    @Override // pd.b
    public final od.l E(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.f11604f;
        }
        a0.j.h("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // pd.b
    public final od.l S() {
        return this.f11604f;
    }

    @Override // md.a
    public final int g(ld.e eVar) {
        eVar.getClass();
        return 0;
    }
}
