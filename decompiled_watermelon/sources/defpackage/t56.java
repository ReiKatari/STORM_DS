package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t56  reason: default package */
/* loaded from: classes.dex */
public final class t56 extends st4 {
    public static final t56 c = new st4(u56.a);

    @Override // defpackage.l0
    public final int i(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // defpackage.pq0, defpackage.l0
    public final void k(yu0 yu0Var, int i, Object obj) {
        s56 s56Var = (s56) obj;
        s56Var.getClass();
        short M = yu0Var.M(this.b, i);
        s56Var.b(s56Var.d() + 1);
        short[] sArr = s56Var.a;
        int i2 = s56Var.b;
        s56Var.b = i2 + 1;
        sArr[i2] = M;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [s56, java.lang.Object] */
    @Override // defpackage.l0
    public final Object l(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        ?? obj2 = new Object();
        obj2.a = sArr;
        obj2.b = sArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.st4
    public final Object o() {
        return new short[0];
    }

    @Override // defpackage.st4
    public final void p(zu0 zu0Var, Object obj, int i) {
        short[] sArr = (short[]) obj;
        zu0Var.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            zu0Var.m(this.b, i2, sArr[i2]);
        }
    }
}
