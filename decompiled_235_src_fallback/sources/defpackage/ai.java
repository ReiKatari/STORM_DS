package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ai  reason: default package */
/* loaded from: classes.dex */
public final class ai implements defpackage.s23 {
    public final android.media.Image A;
    public final defpackage.os0[] B;
    public final defpackage.ly L;

    public ai(android.media.Image r9) {
            r8 = this;
            r8.<init>()
            r8.A = r9
            android.media.Image$Plane[] r0 = r9.getPlanes()
            r1 = 0
            if (r0 == 0) goto L24
            int r2 = r0.length
            os0[] r2 = new defpackage.os0[r2]
            r8.B = r2
        L11:
            int r2 = r0.length
            if (r1 >= r2) goto L28
            os0[] r2 = r8.B
            os0 r3 = new os0
            r4 = r0[r1]
            r5 = 9
            r3.<init>(r4, r5)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L11
        L24:
            os0[] r0 = new defpackage.os0[r1]
            r8.B = r0
        L28:
            sy6 r2 = defpackage.sy6.b
            long r3 = r9.getTimestamp()
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            ly r1 = new ly
            r5 = 0
            r7 = 0
            r1.<init>(r2, r3, r5, r6, r7)
            r8.L = r1
            return
    }

    @Override // defpackage.s23
    public final defpackage.i23 S() {
            r0 = this;
            ly r0 = r0.L
            return r0
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            android.media.Image r0 = r0.A
            r0.close()
            return
    }

    @Override // defpackage.s23
    public final int getFormat() {
            r0 = this;
            android.media.Image r0 = r0.A
            int r0 = r0.getFormat()
            return r0
    }

    @Override // defpackage.s23
    public final int getHeight() {
            r0 = this;
            android.media.Image r0 = r0.A
            int r0 = r0.getHeight()
            return r0
    }

    @Override // defpackage.s23
    public final int getWidth() {
            r0 = this;
            android.media.Image r0 = r0.A
            int r0 = r0.getWidth()
            return r0
    }

    @Override // defpackage.s23
    public final defpackage.r23[] j() {
            r0 = this;
            os0[] r0 = r0.B
            return r0
    }
}
