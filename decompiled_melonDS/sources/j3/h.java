package j3;

import a1.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final x f7380a;

    static {
        q qVar = d.f7353e;
        int i2 = qVar.f7348c;
        g gVar = new g(qVar, qVar, 1);
        int i10 = qVar.f7348c;
        l lVar = d.f7371x;
        int i11 = (lVar.f7348c << 6) | i10;
        g gVar2 = new g(qVar, lVar, 0);
        int i12 = (i10 << 6) | lVar.f7348c;
        g gVar3 = new g(lVar, qVar, 0);
        x xVar = a1.m.f66a;
        x xVar2 = new x();
        xVar2.i(i2 | (i2 << 6), gVar);
        xVar2.i(i11, gVar2);
        xVar2.i(i12, gVar3);
        f7380a = xVar2;
    }
}
