package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cf7  reason: default package */
/* loaded from: classes.dex */
public final class cf7 extends u25 {
    public static final cf7 c = new u25(df7.a);

    @Override // defpackage.m0
    public final int i(Object obj) {
        return ((af7) obj).A.length;
    }

    @Override // defpackage.ct0, defpackage.m0
    public final void k(ux0 ux0Var, int i, Object obj) {
        bf7 bf7Var = (bf7) obj;
        bf7Var.getClass();
        byte Y = ux0Var.e(this.b, i).Y();
        bf7Var.b(bf7Var.d() + 1);
        byte[] bArr = bf7Var.a;
        int i2 = bf7Var.b;
        bf7Var.b = i2 + 1;
        bArr[i2] = Y;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [bf7, java.lang.Object] */
    @Override // defpackage.m0
    public final Object l(Object obj) {
        byte[] bArr = ((af7) obj).A;
        ?? obj2 = new Object();
        obj2.a = bArr;
        obj2.b = bArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.u25
    public final Object o() {
        return new af7(new byte[0]);
    }

    @Override // defpackage.u25
    public final void p(vx0 vx0Var, Object obj, int i) {
        byte[] bArr = ((af7) obj).A;
        vx0Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vx0Var.a0(this.b, i2).o(bArr[i2]);
        }
    }
}
