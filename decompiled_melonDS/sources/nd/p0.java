package nd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p0 extends f1 {

    /* renamed from: c  reason: collision with root package name */
    public static final p0 f10347c = new f1(q0.f10352a);

    @Override // nd.a
    public final int i(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // nd.r, nd.a
    public final void k(md.a aVar, int i2, Object obj) {
        o0 o0Var = (o0) obj;
        o0Var.getClass();
        long f8 = aVar.f(this.f10304b, i2);
        o0Var.b(o0Var.d() + 1);
        long[] jArr = o0Var.f10341a;
        int i10 = o0Var.f10342b;
        o0Var.f10342b = i10 + 1;
        jArr[i10] = f8;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nd.o0, java.lang.Object] */
    @Override // nd.a
    public final Object l(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        ?? obj2 = new Object();
        obj2.f10341a = jArr;
        obj2.f10342b = jArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // nd.f1
    public final Object o() {
        return new long[0];
    }

    @Override // nd.f1
    public final void p(md.b bVar, Object obj, int i2) {
        long[] jArr = (long[]) obj;
        bVar.getClass();
        jArr.getClass();
        for (int i10 = 0; i10 < i2; i10++) {
            ((ij.a) bVar).I(this.f10304b, i10, jArr[i10]);
        }
    }
}
