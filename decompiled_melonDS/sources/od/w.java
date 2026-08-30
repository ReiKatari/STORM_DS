package od;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w implements jd.a {

    /* renamed from: a  reason: collision with root package name */
    public static final w f10903a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final ld.f f10904b = aj.g.i("kotlinx.serialization.json.JsonNull", ld.i.f9043o, new ld.e[0]);

    @Override // jd.a
    public final Object a(md.c cVar) {
        k0.d.k(cVar);
        if (!cVar.i()) {
            return v.INSTANCE;
        }
        throw new IllegalArgumentException("Expected 'null' literal");
    }

    @Override // jd.a
    public final void d(md.d dVar, Object obj) {
        ((v) obj).getClass();
        k0.d.i(dVar);
        dVar.f();
    }

    @Override // jd.a
    public final ld.e e() {
        return f10904b;
    }
}
