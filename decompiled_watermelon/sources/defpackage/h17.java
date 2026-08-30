package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h17  reason: default package */
/* loaded from: classes.dex */
public final class h17 extends st4 {
    public static final h17 c = new st4(i17.a);

    @Override // defpackage.l0
    public final int i(Object obj) {
        return ((f17) obj).A.length;
    }

    @Override // defpackage.pq0, defpackage.l0
    public final void k(yu0 yu0Var, int i, Object obj) {
        g17 g17Var = (g17) obj;
        g17Var.getClass();
        byte Q = yu0Var.f(this.b, i).Q();
        g17Var.b(g17Var.d() + 1);
        byte[] bArr = g17Var.a;
        int i2 = g17Var.b;
        g17Var.b = i2 + 1;
        bArr[i2] = Q;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, g17] */
    @Override // defpackage.l0
    public final Object l(Object obj) {
        byte[] bArr = ((f17) obj).A;
        ?? obj2 = new Object();
        obj2.a = bArr;
        obj2.b = bArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.st4
    public final Object o() {
        return new f17(new byte[0]);
    }

    @Override // defpackage.st4
    public final void p(zu0 zu0Var, Object obj, int i) {
        byte[] bArr = ((f17) obj).A;
        zu0Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            zu0Var.Y(this.b, i2).s(bArr[i2]);
        }
    }
}
