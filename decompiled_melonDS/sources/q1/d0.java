package q1;

import h1.n1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f12126a = 56;

    /* renamed from: b  reason: collision with root package name */
    public static final c0 f12127b;

    /* renamed from: c  reason: collision with root package name */
    public static final s f12128c;

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, y3.w0] */
    /* JADX WARN: Type inference failed for: r12v0, types: [q1.c0, x4.c, java.lang.Object] */
    static {
        ?? obj = new Object();
        f12127b = obj;
        f12128c = new s(0, 0, 0, n1.Horizontal, 0, 0, 0, i1.k.f6613a, new Object(), zc.x.a(cc.h.A), obj, x4.b.b(0, 0, 15));
    }

    public static final long a(s sVar, int i2) {
        long g10;
        int i10 = sVar.f12175c;
        long j2 = (((i2 * (sVar.f12174b + i10)) + (-sVar.f12178f)) + sVar.f12176d) - i10;
        if (sVar.f12177e == n1.Horizontal) {
            g10 = sVar.g() >> 32;
        } else {
            g10 = sVar.g() & 4294967295L;
        }
        int i11 = (int) g10;
        sVar.f12185n.getClass();
        long g11 = j2 - (i11 - p7.j.g(0, 0, i11));
        if (g11 < 0) {
            return 0L;
        }
        return g11;
    }

    public static final b b(int i2, mc.a aVar, n2.m mVar) {
        Object[] objArr = new Object[0];
        p1.a0 a0Var = b.J;
        boolean c4 = ((n2.r) mVar).c(0.0f);
        n2.r rVar = (n2.r) mVar;
        Object L = rVar.L();
        if (c4 || L == n2.l.f9953a) {
            L = new f2.x(i2, aVar);
            rVar.h0(L);
        }
        b bVar = (b) y2.k.d(objArr, a0Var, (mc.a) L, rVar, 0);
        bVar.I.setValue(aVar);
        return bVar;
    }
}
