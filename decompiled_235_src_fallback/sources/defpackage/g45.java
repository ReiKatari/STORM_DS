package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g45  reason: default package */
/* loaded from: classes.dex */
public final class g45 extends java.io.FilterInputStream {
    public int A;

    public g45(java.io.InputStream r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r1, int r2, int r3) {
            r0 = this;
            int r1 = super.read(r1, r2, r3)
            int r2 = r0.A
            int r2 = r2 + r1
            r0.A = r2
            return r1
    }
}
