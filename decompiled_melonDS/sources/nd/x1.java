package nd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x1 extends f1 {

    /* renamed from: c  reason: collision with root package name */
    public static final x1 f10389c = new f1(y1.f10394a);

    @Override // nd.a
    public final int i(Object obj) {
        return ((yb.u) obj).A.length;
    }

    @Override // nd.r, nd.a
    public final void k(md.a aVar, int i2, Object obj) {
        w1 w1Var = (w1) obj;
        w1Var.getClass();
        long e6 = aVar.k(this.f10304b, i2).e();
        w1Var.b(w1Var.d() + 1);
        long[] jArr = w1Var.f10385a;
        int i10 = w1Var.f10386b;
        w1Var.f10386b = i10 + 1;
        jArr[i10] = e6;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, nd.w1] */
    @Override // nd.a
    public final Object l(Object obj) {
        long[] jArr = ((yb.u) obj).A;
        ?? obj2 = new Object();
        obj2.f10385a = jArr;
        obj2.f10386b = jArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // nd.f1
    public final Object o() {
        return new yb.u(new long[0]);
    }

    @Override // nd.f1
    public final void p(md.b bVar, Object obj, int i2) {
        long[] jArr = ((yb.u) obj).A;
        bVar.getClass();
        for (int i10 = 0; i10 < i2; i10++) {
            ((ij.a) bVar).G(this.f10304b, i10).p(jArr[i10]);
        }
    }
}
