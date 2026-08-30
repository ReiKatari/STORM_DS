package nd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 extends f1 {

    /* renamed from: c  reason: collision with root package name */
    public static final b0 f10270c = new f1(c0.f10274a);

    @Override // nd.a
    public final int i(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // nd.r, nd.a
    public final void k(md.a aVar, int i2, Object obj) {
        a0 a0Var = (a0) obj;
        a0Var.getClass();
        float q10 = aVar.q(this.f10304b, i2);
        a0Var.b(a0Var.d() + 1);
        float[] fArr = a0Var.f10264a;
        int i10 = a0Var.f10265b;
        a0Var.f10265b = i10 + 1;
        fArr[i10] = q10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, nd.a0] */
    @Override // nd.a
    public final Object l(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        ?? obj2 = new Object();
        obj2.f10264a = fArr;
        obj2.f10265b = fArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // nd.f1
    public final Object o() {
        return new float[0];
    }

    @Override // nd.f1
    public final void p(md.b bVar, Object obj, int i2) {
        float[] fArr = (float[]) obj;
        bVar.getClass();
        fArr.getClass();
        for (int i10 = 0; i10 < i2; i10++) {
            float f8 = fArr[i10];
            ij.a aVar = (ij.a) bVar;
            e1 e1Var = this.f10304b;
            e1Var.getClass();
            aVar.F(e1Var, i10);
            aVar.o(f8);
        }
    }
}
