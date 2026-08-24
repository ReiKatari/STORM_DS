package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lm0  reason: default package */
/* loaded from: classes.dex */
public final class lm0 extends u25 {
    public static final lm0 c = new u25(om0.a);

    @Override // defpackage.m0
    public final int i(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // defpackage.ct0, defpackage.m0
    public final void k(ux0 ux0Var, int i, Object obj) {
        im0 im0Var = (im0) obj;
        im0Var.getClass();
        char v = ux0Var.v(this.b, i);
        im0Var.b(im0Var.d() + 1);
        char[] cArr = im0Var.a;
        int i2 = im0Var.b;
        im0Var.b = i2 + 1;
        cArr[i2] = v;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, im0] */
    @Override // defpackage.m0
    public final Object l(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        ?? obj2 = new Object();
        obj2.a = cArr;
        obj2.b = cArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.u25
    public final Object o() {
        return new char[0];
    }

    @Override // defpackage.u25
    public final void p(vx0 vx0Var, Object obj, int i) {
        char[] cArr = (char[]) obj;
        vx0Var.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vx0Var.R(this.b, i2, cArr[i2]);
        }
    }
}
