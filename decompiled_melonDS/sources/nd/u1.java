package nd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u1 extends f1 {

    /* renamed from: c  reason: collision with root package name */
    public static final u1 f10372c = new f1(v1.f10376a);

    @Override // nd.a
    public final int i(Object obj) {
        return ((yb.s) obj).A.length;
    }

    @Override // nd.r, nd.a
    public final void k(md.a aVar, int i2, Object obj) {
        t1 t1Var = (t1) obj;
        t1Var.getClass();
        int u4 = aVar.k(this.f10304b, i2).u();
        t1Var.b(t1Var.d() + 1);
        int[] iArr = t1Var.f10368a;
        int i10 = t1Var.f10369b;
        t1Var.f10369b = i10 + 1;
        iArr[i10] = u4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nd.t1, java.lang.Object] */
    @Override // nd.a
    public final Object l(Object obj) {
        int[] iArr = ((yb.s) obj).A;
        ?? obj2 = new Object();
        obj2.f10368a = iArr;
        obj2.f10369b = iArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // nd.f1
    public final Object o() {
        return new yb.s(new int[0]);
    }

    @Override // nd.f1
    public final void p(md.b bVar, Object obj, int i2) {
        int[] iArr = ((yb.s) obj).A;
        bVar.getClass();
        for (int i10 = 0; i10 < i2; i10++) {
            ((ij.a) bVar).G(this.f10304b, i10).m(iArr[i10]);
        }
    }
}
