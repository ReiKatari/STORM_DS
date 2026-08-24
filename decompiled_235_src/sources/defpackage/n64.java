package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n64  reason: default package */
/* loaded from: classes.dex */
public final class n64 extends z64 implements fy0, jm3 {
    @Override // defpackage.jm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        boolean z;
        if (this.j0 && ((Boolean) hf.K(this, u93.a)).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        long j2 = u93.b;
        dx4 y = x24Var.y(j);
        int i = y.A;
        if (z) {
            i = Math.max(i, g34Var.r0(sm1.b(j2)));
        }
        int i2 = y.B;
        if (z) {
            i2 = Math.max(i2, g34Var.r0(sm1.a(j2)));
        }
        return g34Var.K(i, i2, zt1.A, new m83(i, y, i2));
    }
}
