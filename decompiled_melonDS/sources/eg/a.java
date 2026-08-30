package eg;

import jd.k;
import nd.c1;
import nd.d0;
import nd.o1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4482a;
    private static final ld.e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [nd.d0, java.lang.Object, eg.a] */
    static {
        ?? obj = new Object();
        f4482a = obj;
        c1 c1Var = new c1("me.magnum.melonds.parcelables.BackgroundParcelable", obj, 3);
        c1Var.l("uuid", false);
        c1Var.l("name", false);
        c1Var.l("uri", false);
        descriptor = c1Var;
    }

    @Override // jd.a
    public final Object a(md.c cVar) {
        ld.e eVar = descriptor;
        md.a a10 = cVar.a(eVar);
        String str = null;
        boolean z10 = true;
        int i2 = 0;
        String str2 = null;
        String str3 = null;
        while (z10) {
            int g10 = a10.g(eVar);
            if (g10 != -1) {
                if (g10 != 0) {
                    if (g10 != 1) {
                        if (g10 == 2) {
                            str3 = a10.m(eVar, 2);
                            i2 |= 4;
                        } else {
                            throw new k(g10);
                        }
                    } else {
                        str2 = a10.m(eVar, 1);
                        i2 |= 2;
                    }
                } else {
                    str = a10.m(eVar, 0);
                    i2 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        a10.b(eVar);
        return new c(i2, str, str2, str3);
    }

    @Override // nd.d0
    public final jd.a[] b() {
        o1 o1Var = o1.f10343a;
        return new jd.a[]{o1Var, o1Var, o1Var};
    }

    @Override // jd.a
    public final void d(md.d dVar, Object obj) {
        c cVar = (c) obj;
        cVar.getClass();
        ld.e eVar = descriptor;
        md.b a10 = dVar.a(eVar);
        ij.a aVar = (ij.a) a10;
        aVar.K(eVar, 0, cVar.A);
        aVar.K(eVar, 1, cVar.B);
        aVar.K(eVar, 2, cVar.L);
        a10.b(eVar);
    }

    @Override // jd.a
    public final ld.e e() {
        return descriptor;
    }
}
