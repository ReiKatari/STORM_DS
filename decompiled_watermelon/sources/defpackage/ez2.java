package defpackage;

import java.util.zip.Inflater;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ez2  reason: default package */
/* loaded from: classes.dex */
public final class ez2 implements sb6 {
    public final s45 A;
    public final Inflater B;
    public int L;
    public boolean R;

    public ez2(s45 s45Var, Inflater inflater) {
        this.A = s45Var;
        this.B = inflater;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0082 A[SYNTHETIC] */
    @Override // defpackage.sb6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long L(defpackage.f60 r11, long r12) {
        /*
            r10 = this;
            r11.getClass()
        L3:
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 < 0) goto Lb0
            boolean r3 = r10.R
            if (r3 != 0) goto Laa
            s45 r3 = r10.A
            java.util.zip.Inflater r4 = r10.B
            if (r2 != 0) goto L15
        L13:
            r8 = r0
            goto L7e
        L15:
            r2 = 1
            cy5 r2 = r11.f0(r2)     // Catch: java.util.zip.DataFormatException -> La3
            int r5 = r2.c     // Catch: java.util.zip.DataFormatException -> La3
            int r5 = 8192 - r5
            long r5 = (long) r5     // Catch: java.util.zip.DataFormatException -> La3
            long r5 = java.lang.Math.min(r12, r5)     // Catch: java.util.zip.DataFormatException -> La3
            int r5 = (int) r5     // Catch: java.util.zip.DataFormatException -> La3
            boolean r6 = r4.needsInput()     // Catch: java.util.zip.DataFormatException -> La3
            if (r6 != 0) goto L2b
            goto L45
        L2b:
            boolean r6 = r3.d()     // Catch: java.util.zip.DataFormatException -> La3
            if (r6 == 0) goto L32
            goto L45
        L32:
            f60 r6 = r3.B     // Catch: java.util.zip.DataFormatException -> La3
            cy5 r6 = r6.A     // Catch: java.util.zip.DataFormatException -> La3
            r6.getClass()     // Catch: java.util.zip.DataFormatException -> La3
            int r7 = r6.c     // Catch: java.util.zip.DataFormatException -> La3
            int r8 = r6.b     // Catch: java.util.zip.DataFormatException -> La3
            int r7 = r7 - r8
            r10.L = r7     // Catch: java.util.zip.DataFormatException -> La3
            byte[] r6 = r6.a     // Catch: java.util.zip.DataFormatException -> La3
            r4.setInput(r6, r8, r7)     // Catch: java.util.zip.DataFormatException -> La3
        L45:
            byte[] r6 = r2.a     // Catch: java.util.zip.DataFormatException -> La3
            int r7 = r2.c     // Catch: java.util.zip.DataFormatException -> La3
            int r5 = r4.inflate(r6, r7, r5)     // Catch: java.util.zip.DataFormatException -> La3
            int r6 = r10.L     // Catch: java.util.zip.DataFormatException -> La3
            if (r6 != 0) goto L52
            goto L60
        L52:
            int r7 = r4.getRemaining()     // Catch: java.util.zip.DataFormatException -> La3
            int r6 = r6 - r7
            int r7 = r10.L     // Catch: java.util.zip.DataFormatException -> La3
            int r7 = r7 - r6
            r10.L = r7     // Catch: java.util.zip.DataFormatException -> La3
            long r6 = (long) r6     // Catch: java.util.zip.DataFormatException -> La3
            r3.skip(r6)     // Catch: java.util.zip.DataFormatException -> La3
        L60:
            if (r5 <= 0) goto L6e
            int r6 = r2.c     // Catch: java.util.zip.DataFormatException -> La3
            int r6 = r6 + r5
            r2.c = r6     // Catch: java.util.zip.DataFormatException -> La3
            long r6 = r11.B     // Catch: java.util.zip.DataFormatException -> La3
            long r8 = (long) r5     // Catch: java.util.zip.DataFormatException -> La3
            long r6 = r6 + r8
            r11.B = r6     // Catch: java.util.zip.DataFormatException -> La3
            goto L7e
        L6e:
            int r5 = r2.b     // Catch: java.util.zip.DataFormatException -> La3
            int r6 = r2.c     // Catch: java.util.zip.DataFormatException -> La3
            if (r5 != r6) goto L13
            cy5 r5 = r2.a()     // Catch: java.util.zip.DataFormatException -> La3
            r11.A = r5     // Catch: java.util.zip.DataFormatException -> La3
            defpackage.fy5.a(r2)     // Catch: java.util.zip.DataFormatException -> La3
            goto L13
        L7e:
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L83
            return r8
        L83:
            boolean r0 = r4.finished()
            if (r0 != 0) goto La0
            boolean r0 = r4.needsDictionary()
            if (r0 == 0) goto L90
            goto La0
        L90:
            boolean r0 = r3.d()
            if (r0 != 0) goto L98
            goto L3
        L98:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r11 = "source exhausted prematurely"
            r10.<init>(r11)
            throw r10
        La0:
            r10 = -1
            return r10
        La3:
            r10 = move-exception
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r10)
            throw r11
        Laa:
            java.lang.String r10 = "closed"
            defpackage.i.n(r10)
            return r0
        Lb0:
            java.lang.String r10 = "byteCount < 0: "
            java.lang.String r10 = defpackage.wh1.h(r12, r10)
            defpackage.i.g(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez2.L(f60, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.R) {
            return;
        }
        this.B.end();
        this.R = true;
        this.A.close();
    }

    @Override // defpackage.sb6
    public final kt6 f() {
        return this.A.A.f();
    }
}
