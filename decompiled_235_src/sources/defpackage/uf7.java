package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uf7  reason: default package */
/* loaded from: classes.dex */
public final class uf7 extends u25 {
    public static final uf7 c = new u25(vf7.a);

    @Override // defpackage.m0
    public final int i(Object obj) {
        return ((sf7) obj).A.length;
    }

    @Override // defpackage.ct0, defpackage.m0
    public final void k(ux0 ux0Var, int i, Object obj) {
        tf7 tf7Var = (tf7) obj;
        tf7Var.getClass();
        long L = ux0Var.e(this.b, i).L();
        tf7Var.b(tf7Var.d() + 1);
        long[] jArr = tf7Var.a;
        int i2 = tf7Var.b;
        tf7Var.b = i2 + 1;
        jArr[i2] = L;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [tf7, java.lang.Object] */
    @Override // defpackage.m0
    public final Object l(Object obj) {
        long[] jArr = ((sf7) obj).A;
        ?? obj2 = new Object();
        obj2.a = jArr;
        obj2.b = jArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.u25
    public final Object o() {
        return new sf7(new long[0]);
    }

    @Override // defpackage.u25
    public final void p(vx0 vx0Var, Object obj, int i) {
        long[] jArr = ((sf7) obj).A;
        vx0Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vx0Var.a0(this.b, i2).X(jArr[i2]);
        }
    }
}
