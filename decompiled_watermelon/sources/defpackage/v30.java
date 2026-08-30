package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v30  reason: default package */
/* loaded from: classes.dex */
public final class v30 extends st4 {
    public static final v30 c = new st4(w30.a);

    @Override // defpackage.l0
    public final int i(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // defpackage.pq0, defpackage.l0
    public final void k(yu0 yu0Var, int i, Object obj) {
        t30 t30Var = (t30) obj;
        t30Var.getClass();
        boolean O = yu0Var.O(this.b, i);
        t30Var.b(t30Var.d() + 1);
        boolean[] zArr = t30Var.a;
        int i2 = t30Var.b;
        t30Var.b = i2 + 1;
        zArr[i2] = O;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [t30, java.lang.Object] */
    @Override // defpackage.l0
    public final Object l(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        ?? obj2 = new Object();
        obj2.a = zArr;
        obj2.b = zArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.st4
    public final Object o() {
        return new boolean[0];
    }

    @Override // defpackage.st4
    public final void p(zu0 zu0Var, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        zu0Var.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            zu0Var.A(this.b, i2, zArr[i2]);
        }
    }
}
