package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pf7  reason: default package */
/* loaded from: classes.dex */
public final class pf7 extends u25 {
    public static final pf7 c = new u25(qf7.a);

    @Override // defpackage.m0
    public final int i(Object obj) {
        return ((nf7) obj).A.length;
    }

    @Override // defpackage.ct0, defpackage.m0
    public final void k(ux0 ux0Var, int i, Object obj) {
        of7 of7Var = (of7) obj;
        of7Var.getClass();
        int B = ux0Var.e(this.b, i).B();
        of7Var.b(of7Var.d() + 1);
        int[] iArr = of7Var.a;
        int i2 = of7Var.b;
        of7Var.b = i2 + 1;
        iArr[i2] = B;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [of7, java.lang.Object] */
    @Override // defpackage.m0
    public final Object l(Object obj) {
        int[] iArr = ((nf7) obj).A;
        ?? obj2 = new Object();
        obj2.a = iArr;
        obj2.b = iArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.u25
    public final Object o() {
        return new nf7(new int[0]);
    }

    @Override // defpackage.u25
    public final void p(vx0 vx0Var, Object obj, int i) {
        int[] iArr = ((nf7) obj).A;
        vx0Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vx0Var.a0(this.b, i2).T(iArr[i2]);
        }
    }
}
