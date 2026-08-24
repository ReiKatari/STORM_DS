package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: og4  reason: default package */
/* loaded from: classes.dex */
public abstract class og4 implements defpackage.xr6 {
    @Override // defpackage.xr6
    public final java.io.InputStream a(java.io.InputStream r2, byte[] r3) {
            r1 = this;
            zr6 r0 = new zr6
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // defpackage.xr6
    public final java.io.OutputStream b(java.io.FileOutputStream r2, byte[] r3) {
            r1 = this;
            as6 r0 = new as6
            r0.<init>(r1, r2, r3)
            return r0
    }

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract defpackage.mr6 g();

    public abstract defpackage.nr6 h(byte[] r1);
}
