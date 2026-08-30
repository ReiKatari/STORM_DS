package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f27  reason: default package */
/* loaded from: classes.dex */
public final class f27 extends st4 {
    public static final f27 c = new st4(g27.a);

    @Override // defpackage.l0
    public final int i(Object obj) {
        return ((d27) obj).A.length;
    }

    @Override // defpackage.pq0, defpackage.l0
    public final void k(yu0 yu0Var, int i, Object obj) {
        e27 e27Var = (e27) obj;
        e27Var.getClass();
        short W = yu0Var.f(this.b, i).W();
        e27Var.b(e27Var.d() + 1);
        short[] sArr = e27Var.a;
        int i2 = e27Var.b;
        e27Var.b = i2 + 1;
        sArr[i2] = W;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, e27] */
    @Override // defpackage.l0
    public final Object l(Object obj) {
        short[] sArr = ((d27) obj).A;
        ?? obj2 = new Object();
        obj2.a = sArr;
        obj2.b = sArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.st4
    public final Object o() {
        return new d27(new short[0]);
    }

    @Override // defpackage.st4
    public final void p(zu0 zu0Var, Object obj, int i) {
        short[] sArr = ((d27) obj).A;
        zu0Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            zu0Var.Y(this.b, i2).p(sArr[i2]);
        }
    }
}
