package n1;

import c8.c0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends p1.l {

    /* renamed from: b  reason: collision with root package name */
    public final c0 f9765b = new c0();

    public i(mc.l lVar) {
        lVar.k(this);
    }

    public static void p(i iVar, String str, v2.c cVar, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        iVar.f9765b.a(1, new f(null, new g(0, str), new v2.c(-857469575, true, new h(0, cVar))));
    }

    @Override // p1.l
    public final c0 k() {
        return this.f9765b;
    }

    public final void q(int i2, mc.l lVar, mc.l lVar2, v2.c cVar) {
        this.f9765b.a(i2, new f(lVar, lVar2, cVar));
    }
}
