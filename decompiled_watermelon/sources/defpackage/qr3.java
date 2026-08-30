package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qr3  reason: default package */
/* loaded from: classes.dex */
public final class qr3 extends st4 {
    public static final qr3 c = new st4(as3.a);

    @Override // defpackage.l0
    public final int i(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // defpackage.pq0, defpackage.l0
    public final void k(yu0 yu0Var, int i, Object obj) {
        or3 or3Var = (or3) obj;
        or3Var.getClass();
        long a0 = yu0Var.a0(this.b, i);
        or3Var.b(or3Var.d() + 1);
        long[] jArr = or3Var.a;
        int i2 = or3Var.b;
        or3Var.b = i2 + 1;
        jArr[i2] = a0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [or3, java.lang.Object] */
    @Override // defpackage.l0
    public final Object l(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        ?? obj2 = new Object();
        obj2.a = jArr;
        obj2.b = jArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.st4
    public final Object o() {
        return new long[0];
    }

    @Override // defpackage.st4
    public final void p(zu0 zu0Var, Object obj, int i) {
        long[] jArr = (long[]) obj;
        zu0Var.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            zu0Var.r(this.b, i2, jArr[i2]);
        }
    }
}
