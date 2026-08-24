package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: di  reason: default package */
/* loaded from: classes.dex */
public final class di implements android.media.ImageWriter.OnImageReleasedListener, defpackage.hh7, java.lang.AutoCloseable {
    public final android.media.ImageWriter A;
    public final int B;
    public final defpackage.xw L;

    public di(android.media.ImageWriter r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r2 = 0
            xw r2 = defpackage.g04.u(r2)
            r0.L = r2
            r1.getMaxImages()
            r1.getFormat()
            return
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            android.media.ImageWriter r0 = r0.A
            r0.close()
            return
    }

    @Override // defpackage.hh7
    public final java.lang.Object e(defpackage.ar0 r2) {
            r1 = this;
            java.lang.Class<android.media.ImageWriter> r0 = android.media.ImageWriter.class
            ar0 r0 = defpackage.gh5.a(r0)
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lf
            android.media.ImageWriter r1 = r1.A
            return r1
        Lf:
            r1 = 0
            return r1
    }

    @Override // android.media.ImageWriter.OnImageReleasedListener
    public final void onImageReleased(android.media.ImageWriter r1) {
            r0 = this;
            xw r0 = r0.L
            java.lang.Object r0 = r0.a
            if (r0 != 0) goto L7
            return
        L7:
            defpackage.u34.a()
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ImageWriter-"
            r0.<init>(r1)
            android.media.ImageWriter r1 = r3.A
            int r1 = r1.getFormat()
            java.lang.String r1 = defpackage.fr6.a(r1)
            r0.append(r1)
            r1 = 45
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Input-"
            r1.<init>(r2)
            int r3 = r3.B
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
