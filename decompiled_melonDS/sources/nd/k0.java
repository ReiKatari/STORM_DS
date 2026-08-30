package nd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k0 extends f1 {

    /* renamed from: c  reason: collision with root package name */
    public static final k0 f10327c = new f1(l0.f10328a);

    @Override // nd.a
    public final int i(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // nd.r, nd.a
    public final void k(md.a aVar, int i2, Object obj) {
        j0 j0Var = (j0) obj;
        j0Var.getClass();
        int n10 = aVar.n(this.f10304b, i2);
        j0Var.b(j0Var.d() + 1);
        int[] iArr = j0Var.f10321a;
        int i10 = j0Var.f10322b;
        j0Var.f10322b = i10 + 1;
        iArr[i10] = n10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nd.j0, java.lang.Object] */
    @Override // nd.a
    public final Object l(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        ?? obj2 = new Object();
        obj2.f10321a = iArr;
        obj2.f10322b = iArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // nd.f1
    public final Object o() {
        return new int[0];
    }

    @Override // nd.f1
    public final void p(md.b bVar, Object obj, int i2) {
        int[] iArr = (int[]) obj;
        bVar.getClass();
        iArr.getClass();
        for (int i10 = 0; i10 < i2; i10++) {
            ((ij.a) bVar).H(i10, iArr[i10], this.f10304b);
        }
    }
}
