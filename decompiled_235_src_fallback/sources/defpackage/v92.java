package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v92  reason: default package */
/* loaded from: classes.dex */
public final class v92 extends defpackage.jk2 {
    public final /* synthetic */ int B;
    public boolean L;
    public final defpackage.qn2 R;

    public v92(defpackage.ui6 r2, defpackage.k0 r3) {
            r1 = this;
            r0 = 1
            r1.B = r0
            r1.<init>(r2)
            r1.R = r3
            return
    }

    public v92(defpackage.ui6 r2, defpackage.qn2 r3) {
            r1 = this;
            r0 = 0
            r1.B = r0
            r2.getClass()
            r1.<init>(r2)
            r1.R = r3
            return
    }

    @Override // defpackage.jk2, defpackage.ui6
    public final void O(defpackage.k80 r5, long r6) {
            r4 = this;
            int r0 = r4.B
            qn2 r1 = r4.R
            r2 = 1
            ui6 r3 = r4.A
            switch(r0) {
                case 0: goto L1f;
                default: goto La;
            }
        La:
            boolean r0 = r4.L
            if (r0 == 0) goto L12
            r5.skip(r6)
            goto L1e
        L12:
            r3.O(r5, r6)     // Catch: java.io.IOException -> L16
            goto L1e
        L16:
            r5 = move-exception
            r4.L = r2
            k0 r1 = (defpackage.k0) r1
            r1.g(r5)
        L1e:
            return
        L1f:
            boolean r0 = r4.L
            if (r0 == 0) goto L27
            r5.skip(r6)
            goto L31
        L27:
            r3.O(r5, r6)     // Catch: java.io.IOException -> L2b
            goto L31
        L2b:
            r5 = move-exception
            r4.L = r2
            r1.g(r5)
        L31:
            return
    }

    @Override // defpackage.jk2, defpackage.ui6, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            int r0 = r2.B
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            super.close()     // Catch: java.io.IOException -> L9
            goto L14
        L9:
            r0 = move-exception
            r1 = 1
            r2.L = r1
            qn2 r2 = r2.R
            k0 r2 = (defpackage.k0) r2
            r2.g(r0)
        L14:
            return
        L15:
            super.close()     // Catch: java.io.IOException -> L19
            goto L22
        L19:
            r0 = move-exception
            r1 = 1
            r2.L = r1
            qn2 r2 = r2.R
            r2.g(r0)
        L22:
            return
    }

    @Override // defpackage.jk2, defpackage.ui6, java.io.Flushable
    public final void flush() {
            r2 = this;
            int r0 = r2.B
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            super.flush()     // Catch: java.io.IOException -> L9
            goto L14
        L9:
            r0 = move-exception
            r1 = 1
            r2.L = r1
            qn2 r2 = r2.R
            k0 r2 = (defpackage.k0) r2
            r2.g(r0)
        L14:
            return
        L15:
            boolean r0 = r2.L
            if (r0 == 0) goto L1a
            goto L27
        L1a:
            super.flush()     // Catch: java.io.IOException -> L1e
            goto L27
        L1e:
            r0 = move-exception
            r1 = 1
            r2.L = r1
            qn2 r2 = r2.R
            r2.g(r0)
        L27:
            return
    }
}
