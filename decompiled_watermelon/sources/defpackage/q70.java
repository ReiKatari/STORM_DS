package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q70  reason: default package */
/* loaded from: classes.dex */
public final class q70 extends st4 {
    public static final q70 c = new st4(r70.a);

    @Override // defpackage.l0
    public final int i(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // defpackage.pq0, defpackage.l0
    public final void k(yu0 yu0Var, int i, Object obj) {
        j70 j70Var = (j70) obj;
        j70Var.getClass();
        byte J = yu0Var.J(this.b, i);
        j70Var.b(j70Var.d() + 1);
        byte[] bArr = j70Var.a;
        int i2 = j70Var.b;
        j70Var.b = i2 + 1;
        bArr[i2] = J;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j70, java.lang.Object] */
    @Override // defpackage.l0
    public final Object l(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        ?? obj2 = new Object();
        obj2.a = bArr;
        obj2.b = bArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.st4
    public final Object o() {
        return new byte[0];
    }

    @Override // defpackage.st4
    public final void p(zu0 zu0Var, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        zu0Var.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            zu0Var.R(this.b, i2, bArr[i2]);
        }
    }
}
