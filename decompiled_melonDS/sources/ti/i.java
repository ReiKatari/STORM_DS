package ti;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends si.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ t f13214e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f13215f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, t tVar, j jVar) {
        super(str);
        this.f13214e = tVar;
        this.f13215f = jVar;
    }

    @Override // si.a
    public final long a() {
        s sVar;
        t tVar = this.f13214e;
        try {
            sVar = tVar.f();
        } catch (Throwable th2) {
            sVar = new s(tVar, th2, 2);
        }
        j jVar = this.f13215f;
        if (jVar.R.contains(tVar)) {
            jVar.X.put(sVar);
            return -1L;
        }
        return -1L;
    }
}
