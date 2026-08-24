package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pd6  reason: default package */
/* loaded from: classes.dex */
public final class pd6 extends java.io.FilterInputStream {
    public pd6(defpackage.sd6 r1, java.io.BufferedInputStream r2) {
            r0 = this;
            r0.<init>(r2)
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
            r0 = this;
            java.io.InputStream r0 = r0.in
            int r0 = r0.read()
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            int r2 = r2.read(r3, r0, r1)
            return r2
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r1, int r2, int r3) {
            r0 = this;
            if (r3 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.io.InputStream r0 = r0.in
            int r0 = r0.read(r1, r2, r3)
            return r0
    }
}
