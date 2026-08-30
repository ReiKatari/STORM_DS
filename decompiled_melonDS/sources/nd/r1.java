package nd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r1 extends f1 {

    /* renamed from: c  reason: collision with root package name */
    public static final r1 f10357c = new f1(s1.f10364a);

    @Override // nd.a
    public final int i(Object obj) {
        return ((yb.q) obj).A.length;
    }

    @Override // nd.r, nd.a
    public final void k(md.a aVar, int i2, Object obj) {
        q1 q1Var = (q1) obj;
        q1Var.getClass();
        byte v10 = aVar.k(this.f10304b, i2).v();
        q1Var.b(q1Var.d() + 1);
        byte[] bArr = q1Var.f10354a;
        int i10 = q1Var.f10355b;
        q1Var.f10355b = i10 + 1;
        bArr[i10] = v10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nd.q1, java.lang.Object] */
    @Override // nd.a
    public final Object l(Object obj) {
        byte[] bArr = ((yb.q) obj).A;
        ?? obj2 = new Object();
        obj2.f10354a = bArr;
        obj2.f10355b = bArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // nd.f1
    public final Object o() {
        return new yb.q(new byte[0]);
    }

    @Override // nd.f1
    public final void p(md.b bVar, Object obj, int i2) {
        byte[] bArr = ((yb.q) obj).A;
        bVar.getClass();
        for (int i10 = 0; i10 < i2; i10++) {
            ((ij.a) bVar).G(this.f10304b, i10).k(bArr[i10]);
        }
    }
}
