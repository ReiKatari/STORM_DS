package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f54  reason: default package */
/* loaded from: classes.dex */
public final class f54 implements java.io.Closeable {
    public final /* synthetic */ int A;
    public final boolean B;
    public final defpackage.k80 L;
    public java.lang.Object R;
    public java.io.Closeable X;

    public f54(boolean r3, int r4) {
            r2 = this;
            r2.A = r4
            switch(r4) {
                case 1: goto L22;
                default: goto L5;
            }
        L5:
            r2.<init>()
            r2.B = r3
            k80 r3 = new k80
            r3.<init>()
            r2.L = r3
            java.util.zip.Deflater r4 = new java.util.zip.Deflater
            r0 = -1
            r1 = 1
            r4.<init>(r0, r1)
            r2.R = r4
            tg1 r0 = new tg1
            r0.<init>(r3, r4)
            r2.X = r0
            return
        L22:
            r2.<init>()
            r2.B = r3
            k80 r3 = new k80
            r3.<init>()
            r2.L = r3
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            java.io.Closeable r0 = r1.X
            h53 r0 = (defpackage.h53) r0
            if (r0 == 0) goto Le
            r0.close()
        Le:
            r0 = 0
            r1.X = r0
            r1.R = r0
            return
        L14:
            java.io.Closeable r1 = r1.X
            tg1 r1 = (defpackage.tg1) r1
            r1.close()
            return
    }
}
