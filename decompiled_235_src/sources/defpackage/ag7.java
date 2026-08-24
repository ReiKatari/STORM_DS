package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ag7  reason: default package */
/* loaded from: classes.dex */
public final class ag7 extends u25 {
    public static final ag7 c = new u25(bg7.a);

    @Override // defpackage.m0
    public final int i(Object obj) {
        return ((yf7) obj).A.length;
    }

    @Override // defpackage.ct0, defpackage.m0
    public final void k(ux0 ux0Var, int i, Object obj) {
        zf7 zf7Var = (zf7) obj;
        zf7Var.getClass();
        short Z = ux0Var.e(this.b, i).Z();
        zf7Var.b(zf7Var.d() + 1);
        short[] sArr = zf7Var.a;
        int i2 = zf7Var.b;
        zf7Var.b = i2 + 1;
        sArr[i2] = Z;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, zf7] */
    @Override // defpackage.m0
    public final Object l(Object obj) {
        short[] sArr = ((yf7) obj).A;
        ?? obj2 = new Object();
        obj2.a = sArr;
        obj2.b = sArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.u25
    public final Object o() {
        return new yf7(new short[0]);
    }

    @Override // defpackage.u25
    public final void p(vx0 vx0Var, Object obj, int i) {
        short[] sArr = ((yf7) obj).A;
        vx0Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vx0Var.a0(this.b, i2).m(sArr[i2]);
        }
    }
}
