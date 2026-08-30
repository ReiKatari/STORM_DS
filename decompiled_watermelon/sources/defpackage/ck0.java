package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ck0  reason: default package */
/* loaded from: classes.dex */
public final class ck0 extends st4 {
    public static final ck0 c = new st4(fk0.a);

    @Override // defpackage.l0
    public final int i(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // defpackage.pq0, defpackage.l0
    public final void k(yu0 yu0Var, int i, Object obj) {
        zj0 zj0Var = (zj0) obj;
        zj0Var.getClass();
        char B = yu0Var.B(this.b, i);
        zj0Var.b(zj0Var.d() + 1);
        char[] cArr = zj0Var.a;
        int i2 = zj0Var.b;
        zj0Var.b = i2 + 1;
        cArr[i2] = B;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [zj0, java.lang.Object] */
    @Override // defpackage.l0
    public final Object l(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        ?? obj2 = new Object();
        obj2.a = cArr;
        obj2.b = cArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.st4
    public final Object o() {
        return new char[0];
    }

    @Override // defpackage.st4
    public final void p(zu0 zu0Var, Object obj, int i) {
        char[] cArr = (char[]) obj;
        zu0Var.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            zu0Var.C(this.b, i2, cArr[i2]);
        }
    }
}
