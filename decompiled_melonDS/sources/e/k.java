package e;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends h.c {

    /* renamed from: a  reason: collision with root package name */
    public final a f4145a;

    public k(a aVar) {
        this.f4145a = aVar;
    }

    @Override // h.c
    public final void a(Object obj) {
        h.g gVar = this.f4145a.f4131a;
        if (gVar != null) {
            gVar.a(obj);
        } else {
            a0.j.p("Launcher has not been initialized");
        }
    }
}
