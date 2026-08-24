package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pd5  reason: default package */
/* loaded from: classes.dex */
public final class pd5 extends defpackage.ao4 {
    public final java.io.DataInputStream d;

    public pd5(java.io.InputStream r2) {
            r1 = this;
            r1.<init>()
            java.io.DataInputStream r0 = new java.io.DataInputStream
            r0.<init>(r2)
            r1.d = r0
            int r2 = r0.readUnsignedByte()
            if (r2 != 0) goto L1a
            int r2 = r0.readInt()
            r1.c = r2
            r2 = -1
            r1.b = r2
            return
        L1a:
            e71 r1 = new e71
            r1.<init>()
            throw r1
    }

    @Override // defpackage.ao4
    public final void f() {
            r2 = this;
            int r0 = r2.b
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r1
            if (r0 != 0) goto L1a
            int r0 = r2.c
            int r0 = r0 << 8
            java.io.DataInputStream r1 = r2.d
            int r1 = r1.readUnsignedByte()
            r0 = r0 | r1
            r2.c = r0
            int r0 = r2.b
            int r0 = r0 << 8
            r2.b = r0
        L1a:
            return
    }
}
