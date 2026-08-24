package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i1  reason: default package */
/* loaded from: classes.dex */
public abstract class i1 extends defpackage.md5 {
    @Override // defpackage.md5
    public final int a(int r2) {
            r1 = this;
            java.util.Random r1 = r1.e()
            int r1 = r1.nextInt()
            int r0 = 32 - r2
            int r1 = r1 >>> r0
            int r2 = -r2
            int r2 = r2 >> 31
            r1 = r1 & r2
            return r1
    }

    @Override // defpackage.md5
    public final byte[] b(byte[] r1) {
            r0 = this;
            java.util.Random r0 = r0.e()
            r0.nextBytes(r1)
            return r1
    }

    @Override // defpackage.md5
    public final int d() {
            r0 = this;
            java.util.Random r0 = r0.e()
            int r0 = r0.nextInt()
            return r0
    }

    public abstract java.util.Random e();
}
