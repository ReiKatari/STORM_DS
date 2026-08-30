package od;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 implements jd.a {

    /* renamed from: a  reason: collision with root package name */
    public static final e0 f10888a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final ld.f f10889b = aj.g.i("kotlinx.serialization.json.JsonPrimitive", ld.d.f9029w, new ld.e[0]);

    @Override // jd.a
    public final Object a(md.c cVar) {
        l s10 = k0.d.k(cVar).s();
        if (s10 instanceof d0) {
            return (d0) s10;
        }
        throw pd.t.e(-1, "Unexpected JSON element, expected JsonPrimitive, had " + nc.u.a(s10.getClass()), s10.toString());
    }

    @Override // jd.a
    public final void d(md.d dVar, Object obj) {
        d0 d0Var = (d0) obj;
        d0Var.getClass();
        k0.d.i(dVar);
        if (d0Var instanceof v) {
            dVar.n(w.f10903a, v.INSTANCE);
        } else {
            dVar.n(t.f10901a, (s) d0Var);
        }
    }

    @Override // jd.a
    public final ld.e e() {
        return f10889b;
    }
}
