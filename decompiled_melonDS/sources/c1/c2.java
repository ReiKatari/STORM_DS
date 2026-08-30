package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c2 {

    /* renamed from: a  reason: collision with root package name */
    public static final d1.a1 f2398a = d1.d.q(1, d1.h2.f3584a);

    /* renamed from: b  reason: collision with root package name */
    public static final z1 f2399b = new Object();

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, c1.z1] */
    static {
        new a1.m0();
    }

    public static final void a(b3.p pVar, v2.c cVar, n2.m mVar, int i2) {
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(646379026);
        int i10 = i2 | 6;
        if ((i10 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            b(v2.h.c(1948801580, new a2(cVar), rVar), rVar, 6);
            pVar = b3.m.f1770a;
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new a4.p1(pVar, cVar, i2, 2);
        }
    }

    public static final void b(v2.c cVar, n2.m mVar, int i2) {
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1908320054);
        if ((i2 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i2 & 1, z10)) {
            y3.c0.a(v2.h.c(2062852661, new b2(0, cVar), rVar), rVar, 6);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new h(cVar, i2);
        }
    }
}
