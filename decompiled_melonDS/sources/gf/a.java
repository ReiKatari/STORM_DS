package gf;

import jd.k;
import nd.c1;
import nd.d0;
import nd.o1;
import nd.q0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5657a;
    private static final ld.e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [gf.a, nd.d0, java.lang.Object] */
    static {
        ?? obj = new Object();
        f5657a = obj;
        c1 c1Var = new c1("me.magnum.melonds.github.dtos.AssetDto", obj, 5);
        c1Var.l("id", false);
        c1Var.l("browser_download_url", false);
        c1Var.l("name", false);
        c1Var.l("size", false);
        c1Var.l("content_type", false);
        descriptor = c1Var;
    }

    @Override // jd.a
    public final Object a(md.c cVar) {
        ld.e eVar = descriptor;
        md.a a10 = cVar.a(eVar);
        int i2 = 0;
        long j2 = 0;
        long j10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z10 = true;
        while (z10) {
            int g10 = a10.g(eVar);
            if (g10 != -1) {
                if (g10 != 0) {
                    if (g10 != 1) {
                        if (g10 != 2) {
                            if (g10 != 3) {
                                if (g10 == 4) {
                                    str3 = a10.m(eVar, 4);
                                    i2 |= 16;
                                } else {
                                    throw new k(g10);
                                }
                            } else {
                                j10 = a10.f(eVar, 3);
                                i2 |= 8;
                            }
                        } else {
                            str2 = a10.m(eVar, 2);
                            i2 |= 4;
                        }
                    } else {
                        str = a10.m(eVar, 1);
                        i2 |= 2;
                    }
                } else {
                    j2 = a10.f(eVar, 0);
                    i2 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        a10.b(eVar);
        return new c(i2, j2, str, str2, j10, str3);
    }

    @Override // nd.d0
    public final jd.a[] b() {
        q0 q0Var = q0.f10352a;
        o1 o1Var = o1.f10343a;
        return new jd.a[]{q0Var, o1Var, o1Var, q0Var, o1Var};
    }

    @Override // jd.a
    public final void d(md.d dVar, Object obj) {
        c cVar = (c) obj;
        cVar.getClass();
        ld.e eVar = descriptor;
        md.b a10 = dVar.a(eVar);
        ij.a aVar = (ij.a) a10;
        aVar.I(eVar, 0, cVar.f5658a);
        aVar.K(eVar, 1, cVar.f5659b);
        aVar.K(eVar, 2, cVar.f5660c);
        aVar.I(eVar, 3, cVar.f5661d);
        aVar.K(eVar, 4, cVar.f5662e);
        a10.b(eVar);
    }

    @Override // jd.a
    public final ld.e e() {
        return descriptor;
    }
}
