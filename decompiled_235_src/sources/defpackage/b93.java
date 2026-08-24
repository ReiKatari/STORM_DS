package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b93  reason: default package */
/* loaded from: classes.dex */
public final class b93 extends u25 {
    public static final b93 c = new u25(o93.a);

    @Override // defpackage.m0
    public final int i(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // defpackage.ct0, defpackage.m0
    public final void k(ux0 ux0Var, int i, Object obj) {
        z83 z83Var = (z83) obj;
        z83Var.getClass();
        int H = ux0Var.H(this.b, i);
        z83Var.b(z83Var.d() + 1);
        int[] iArr = z83Var.a;
        int i2 = z83Var.b;
        z83Var.b = i2 + 1;
        iArr[i2] = H;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [z83, java.lang.Object] */
    @Override // defpackage.m0
    public final Object l(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        ?? obj2 = new Object();
        obj2.a = iArr;
        obj2.b = iArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.u25
    public final Object o() {
        return new int[0];
    }

    @Override // defpackage.u25
    public final void p(vx0 vx0Var, Object obj, int i) {
        int[] iArr = (int[]) obj;
        vx0Var.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vx0Var.O(i2, iArr[i2], this.b);
        }
    }
}
