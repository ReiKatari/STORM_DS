package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i92  reason: default package */
/* loaded from: classes.dex */
public final class i92 extends st4 {
    public static final i92 c = new st4(j92.a);

    @Override // defpackage.l0
    public final int i(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // defpackage.pq0, defpackage.l0
    public final void k(yu0 yu0Var, int i, Object obj) {
        g92 g92Var = (g92) obj;
        g92Var.getClass();
        float t = yu0Var.t(this.b, i);
        g92Var.b(g92Var.d() + 1);
        float[] fArr = g92Var.a;
        int i2 = g92Var.b;
        g92Var.b = i2 + 1;
        fArr[i2] = t;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [g92, java.lang.Object] */
    @Override // defpackage.l0
    public final Object l(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        ?? obj2 = new Object();
        obj2.a = fArr;
        obj2.b = fArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.st4
    public final Object o() {
        return new float[0];
    }

    @Override // defpackage.st4
    public final void p(zu0 zu0Var, Object obj, int i) {
        float[] fArr = (float[]) obj;
        zu0Var.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            zu0Var.e0(this.b, i2, fArr[i2]);
        }
    }
}
