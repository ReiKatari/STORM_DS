package gf;

import java.util.List;
import jd.k;
import nd.c1;
import nd.d0;
import nd.o1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final d f5663a;
    private static final ld.e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [gf.d, nd.d0, java.lang.Object] */
    static {
        ?? obj = new Object();
        f5663a = obj;
        c1 c1Var = new c1("me.magnum.melonds.github.dtos.ReleaseDto", obj, 5);
        c1Var.l("tag_name", false);
        c1Var.l("name", false);
        c1Var.l("body", false);
        c1Var.l("created_at", false);
        c1Var.l("assets", false);
        descriptor = c1Var;
    }

    @Override // jd.a
    public final Object a(md.c cVar) {
        ld.e eVar = descriptor;
        md.a a10 = cVar.a(eVar);
        yb.f[] fVarArr = f.f5664f;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        boolean z10 = true;
        while (z10) {
            int g10 = a10.g(eVar);
            if (g10 != -1) {
                if (g10 != 0) {
                    if (g10 != 1) {
                        if (g10 != 2) {
                            if (g10 != 3) {
                                if (g10 == 4) {
                                    list = (List) a10.o(eVar, 4, (jd.a) fVarArr[4].getValue(), list);
                                    i2 |= 16;
                                } else {
                                    throw new k(g10);
                                }
                            } else {
                                str4 = a10.m(eVar, 3);
                                i2 |= 8;
                            }
                        } else {
                            str3 = a10.m(eVar, 2);
                            i2 |= 4;
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
        return new f(i2, str, str2, str3, str4, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nd.d0
    public final jd.a[] b() {
        yb.f[] fVarArr = f.f5664f;
        o1 o1Var = o1.f10343a;
        return new jd.a[]{o1Var, o1Var, o1Var, o1Var, fVarArr[4].getValue()};
    }

    @Override // jd.a
    public final void d(md.d dVar, Object obj) {
        f fVar = (f) obj;
        fVar.getClass();
        ld.e eVar = descriptor;
        md.b a10 = dVar.a(eVar);
        yb.f[] fVarArr = f.f5664f;
        ij.a aVar = (ij.a) a10;
        aVar.K(eVar, 0, fVar.f5665a);
        aVar.K(eVar, 1, fVar.f5666b);
        aVar.K(eVar, 2, fVar.f5667c);
        aVar.K(eVar, 3, fVar.f5668d);
        aVar.J(eVar, 4, (jd.a) fVarArr[4].getValue(), fVar.f5669e);
        a10.b(eVar);
    }

    @Override // jd.a
    public final ld.e e() {
        return descriptor;
    }
}
