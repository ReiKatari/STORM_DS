package m7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k implements d0, k7.n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9323a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9324b;

    public /* synthetic */ k(int i2, Object obj) {
        this.f9323a = i2;
        this.f9324b = obj;
    }

    @Override // k7.n
    public final Object a(String str, mc.l lVar, ec.c cVar) {
        switch (this.f9323a) {
            case 0:
                return ((p) this.f9324b).a(str, lVar, cVar);
            default:
                return ((c0) this.f9324b).a(str, lVar, cVar);
        }
    }

    @Override // m7.d0
    public final t7.a b() {
        switch (this.f9323a) {
            case 0:
                return ((p) this.f9324b).f9328b;
            default:
                return ((c0) this.f9324b).f9313b;
        }
    }
}
