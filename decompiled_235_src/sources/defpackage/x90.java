package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x90  reason: default package */
/* loaded from: classes.dex */
public final class x90 extends u25 {
    public static final x90 c = new u25(y90.a);

    @Override // defpackage.m0
    public final int i(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // defpackage.ct0, defpackage.m0
    public final void k(ux0 ux0Var, int i, Object obj) {
        q90 q90Var = (q90) obj;
        q90Var.getClass();
        byte z = ux0Var.z(this.b, i);
        q90Var.b(q90Var.d() + 1);
        byte[] bArr = q90Var.a;
        int i2 = q90Var.b;
        q90Var.b = i2 + 1;
        bArr[i2] = z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [q90, java.lang.Object] */
    @Override // defpackage.m0
    public final Object l(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        ?? obj2 = new Object();
        obj2.a = bArr;
        obj2.b = bArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.u25
    public final Object o() {
        return new byte[0];
    }

    @Override // defpackage.u25
    public final void p(vx0 vx0Var, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        vx0Var.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vx0Var.D(this.b, i2, bArr[i2]);
        }
    }
}
