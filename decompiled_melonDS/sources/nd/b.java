package nd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b implements jd.a {
    @Override // jd.a
    public final Object a(md.c cVar) {
        ld.e e6 = e();
        md.a a10 = cVar.a(e6);
        Object obj = null;
        String str = null;
        while (true) {
            int g10 = a10.g(e());
            if (g10 != -1) {
                if (g10 != 0) {
                    if (g10 != 1) {
                        StringBuilder sb2 = new StringBuilder("Invalid index in polymorphic deserialization of ");
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb2.append(str);
                        sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb2.append(g10);
                        throw new IllegalArgumentException(sb2.toString());
                    } else if (str != null) {
                        obj = a10.o(e(), g10, a.a.r(this, a10, str), null);
                    } else {
                        a0.j.h("Cannot read polymorphic value before its type token");
                        return null;
                    }
                } else {
                    str = a10.m(e(), g10);
                }
            } else if (obj != null) {
                a10.b(e6);
                return obj;
            } else {
                fj.j.t(str, "Polymorphic value has not been read for class ");
                return null;
            }
        }
    }

    @Override // jd.a
    public final void d(md.d dVar, Object obj) {
        obj.getClass();
        jd.a s10 = a.a.s(this, dVar, obj);
        ld.e e6 = e();
        ij.a aVar = (ij.a) dVar.a(e6);
        aVar.K(e(), 0, s10.e().b());
        aVar.J(e(), 1, s10, obj);
        aVar.b(e6);
    }

    public jd.a f(md.a aVar, String str) {
        k0.g c4 = aVar.c();
        nc.e h2 = h();
        c4.getClass();
        h2.getClass();
        return null;
    }

    public jd.a g(md.d dVar, Object obj) {
        obj.getClass();
        k0.g c4 = dVar.c();
        nc.e h2 = h();
        c4.getClass();
        h2.getClass();
        h2.d(obj);
        return null;
    }

    public abstract nc.e h();
}
