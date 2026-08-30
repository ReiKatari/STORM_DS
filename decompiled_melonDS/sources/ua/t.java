package ua;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t extends u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f13539a;

    public t(u uVar) {
        this.f13539a = uVar;
    }

    @Override // ua.u
    public final Object b(cb.a aVar) {
        if (aVar.d0() == cb.b.NULL) {
            aVar.Z();
            return null;
        }
        return this.f13539a.b(aVar);
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        if (obj == null) {
            cVar.F();
        } else {
            this.f13539a.c(cVar, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.f13539a + "]";
    }
}
