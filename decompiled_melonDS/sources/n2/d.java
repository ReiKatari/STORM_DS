package n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends v2.b {

    /* renamed from: a  reason: collision with root package name */
    public zc.h f9878a;

    /* renamed from: b  reason: collision with root package name */
    public mc.l f9879b;

    @Override // v2.b
    public final void a() {
        this.f9879b = null;
        this.f9878a = null;
    }

    @Override // v2.b
    public final void b(Throwable th2) {
        zc.h hVar = this.f9878a;
        if (hVar != null) {
            hVar.h(p7.j.o(th2));
        }
    }
}
