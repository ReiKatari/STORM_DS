package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z17  reason: default package */
/* loaded from: classes.dex */
public final class z17 extends st4 {
    public static final z17 c = new st4(a27.a);

    @Override // defpackage.l0
    public final int i(Object obj) {
        return ((x17) obj).A.length;
    }

    @Override // defpackage.pq0, defpackage.l0
    public final void k(yu0 yu0Var, int i, Object obj) {
        y17 y17Var = (y17) obj;
        y17Var.getClass();
        long e = yu0Var.f(this.b, i).e();
        y17Var.b(y17Var.d() + 1);
        long[] jArr = y17Var.a;
        int i2 = y17Var.b;
        y17Var.b = i2 + 1;
        jArr[i2] = e;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, y17] */
    @Override // defpackage.l0
    public final Object l(Object obj) {
        long[] jArr = ((x17) obj).A;
        ?? obj2 = new Object();
        obj2.a = jArr;
        obj2.b = jArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.st4
    public final Object o() {
        return new x17(new long[0]);
    }

    @Override // defpackage.st4
    public final void p(zu0 zu0Var, Object obj, int i) {
        long[] jArr = ((x17) obj).A;
        zu0Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            zu0Var.Y(this.b, i2).P(jArr[i2]);
        }
    }
}
