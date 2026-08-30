package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t23  reason: default package */
/* loaded from: classes.dex */
public final class t23 extends st4 {
    public static final t23 c = new st4(g33.a);

    @Override // defpackage.l0
    public final int i(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // defpackage.pq0, defpackage.l0
    public final void k(yu0 yu0Var, int i, Object obj) {
        r23 r23Var = (r23) obj;
        r23Var.getClass();
        int V = yu0Var.V(this.b, i);
        r23Var.b(r23Var.d() + 1);
        int[] iArr = r23Var.a;
        int i2 = r23Var.b;
        r23Var.b = i2 + 1;
        iArr[i2] = V;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [r23, java.lang.Object] */
    @Override // defpackage.l0
    public final Object l(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        ?? obj2 = new Object();
        obj2.a = iArr;
        obj2.b = iArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.st4
    public final Object o() {
        return new int[0];
    }

    @Override // defpackage.st4
    public final void p(zu0 zu0Var, Object obj, int i) {
        int[] iArr = (int[]) obj;
        zu0Var.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            zu0Var.q(i2, iArr[i2], this.b);
        }
    }
}
