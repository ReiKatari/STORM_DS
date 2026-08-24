package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gh6  reason: default package */
/* loaded from: classes.dex */
public final class gh6 extends u25 {
    public static final gh6 c = new u25(hh6.a);

    @Override // defpackage.m0
    public final int i(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // defpackage.ct0, defpackage.m0
    public final void k(ux0 ux0Var, int i, Object obj) {
        fh6 fh6Var = (fh6) obj;
        fh6Var.getClass();
        short C = ux0Var.C(this.b, i);
        fh6Var.b(fh6Var.d() + 1);
        short[] sArr = fh6Var.a;
        int i2 = fh6Var.b;
        fh6Var.b = i2 + 1;
        sArr[i2] = C;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fh6, java.lang.Object] */
    @Override // defpackage.m0
    public final Object l(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        ?? obj2 = new Object();
        obj2.a = sArr;
        obj2.b = sArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.u25
    public final Object o() {
        return new short[0];
    }

    @Override // defpackage.u25
    public final void p(vx0 vx0Var, Object obj, int i) {
        short[] sArr = (short[]) obj;
        vx0Var.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vx0Var.N(this.b, i2, sArr[i2]);
        }
    }
}
