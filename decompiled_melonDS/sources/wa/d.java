package wa;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends ua.u {

    /* renamed from: a  reason: collision with root package name */
    public volatile ua.u f14175a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f14176b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f14177c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ua.h f14178d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ bb.a f14179e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e f14180f;

    public d(e eVar, boolean z10, boolean z11, ua.h hVar, bb.a aVar) {
        this.f14180f = eVar;
        this.f14176b = z10;
        this.f14177c = z11;
        this.f14178d = hVar;
        this.f14179e = aVar;
    }

    @Override // ua.u
    public final Object b(cb.a aVar) {
        if (this.f14176b) {
            aVar.k0();
            return null;
        }
        ua.u uVar = this.f14175a;
        if (uVar == null) {
            uVar = this.f14178d.d(this.f14180f, this.f14179e);
            this.f14175a = uVar;
        }
        return uVar.b(aVar);
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        if (this.f14177c) {
            cVar.F();
            return;
        }
        ua.u uVar = this.f14175a;
        if (uVar == null) {
            uVar = this.f14178d.d(this.f14180f, this.f14179e);
            this.f14175a = uVar;
        }
        uVar.c(cVar, obj);
    }
}
