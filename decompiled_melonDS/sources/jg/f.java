package jg;

import nd.c1;
import nd.d0;
import nd.o1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final f f7869a;
    private static final ld.e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [jg.f, nd.d0, java.lang.Object] */
    static {
        ?? obj = new Object();
        f7869a = obj;
        c1 c1Var = new c1("me.magnum.melonds.ui.cheats.CheatsNavigation.FolderCheats", obj, 1);
        c1Var.l("folderName", false);
        descriptor = c1Var;
    }

    @Override // jd.a
    public final Object a(md.c cVar) {
        ld.e eVar = descriptor;
        md.a a10 = cVar.a(eVar);
        String str = null;
        boolean z10 = true;
        int i2 = 0;
        while (z10) {
            int g10 = a10.g(eVar);
            if (g10 != -1) {
                if (g10 == 0) {
                    str = (String) a10.r(eVar, 0, o1.f10343a, str);
                    i2 = 1;
                } else {
                    throw new jd.k(g10);
                }
            } else {
                z10 = false;
            }
        }
        a10.b(eVar);
        return new h(i2, str);
    }

    @Override // nd.d0
    public final jd.a[] b() {
        return new jd.a[]{a.a.C(o1.f10343a)};
    }

    @Override // jd.a
    public final void d(md.d dVar, Object obj) {
        h hVar = (h) obj;
        hVar.getClass();
        ld.e eVar = descriptor;
        md.b a10 = dVar.a(eVar);
        a10.g(eVar, 0, o1.f10343a, hVar.f7870e);
        a10.b(eVar);
    }

    @Override // jd.a
    public final ld.e e() {
        return descriptor;
    }
}
