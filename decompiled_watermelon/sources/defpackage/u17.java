package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u17  reason: default package */
/* loaded from: classes.dex */
public final class u17 extends st4 {
    public static final u17 c = new st4(v17.a);

    @Override // defpackage.l0
    public final int i(Object obj) {
        return ((s17) obj).A.length;
    }

    @Override // defpackage.pq0, defpackage.l0
    public final void k(yu0 yu0Var, int i, Object obj) {
        t17 t17Var = (t17) obj;
        t17Var.getClass();
        int L = yu0Var.f(this.b, i).L();
        t17Var.b(t17Var.d() + 1);
        int[] iArr = t17Var.a;
        int i2 = t17Var.b;
        t17Var.b = i2 + 1;
        iArr[i2] = L;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, t17] */
    @Override // defpackage.l0
    public final Object l(Object obj) {
        int[] iArr = ((s17) obj).A;
        ?? obj2 = new Object();
        obj2.a = iArr;
        obj2.b = iArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.st4
    public final Object o() {
        return new s17(new int[0]);
    }

    @Override // defpackage.st4
    public final void p(zu0 zu0Var, Object obj, int i) {
        int[] iArr = ((s17) obj).A;
        zu0Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            zu0Var.Y(this.b, i2).E(iArr[i2]);
        }
    }
}
