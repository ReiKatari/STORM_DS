package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sf7  reason: default package */
/* loaded from: classes.dex */
public abstract class sf7 {
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
        if (r2.b(r10, r0) == r1) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0054, B:29:0x0069, B:31:0x0071, B:20:0x0045, B:24:0x0050), top: B:50:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:14:0x0032). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.w92 r7, defpackage.lj0 r8, boolean r9, defpackage.j11 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.ba2
            if (r0 == 0) goto L13
            r0 = r10
            ba2 r0 = (defpackage.ba2) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            ba2 r0 = new ba2
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.c0
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3d
            if (r2 != r4) goto L37
            boolean r9 = r0.Z
            i60 r7 = r0.Y
            lj0 r8 = r0.X
            w92 r2 = r0.R
            defpackage.me2.a0(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r2
            goto L54
        L35:
            r7 = move-exception
            goto L8e
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r7)
            return r3
        L3d:
            boolean r9 = r0.Z
            i60 r7 = r0.Y
            lj0 r8 = r0.X
            w92 r2 = r0.R
            defpackage.me2.a0(r10)     // Catch: java.lang.Throwable -> L35
            goto L69
        L49:
            defpackage.me2.a0(r10)
            boolean r10 = r7 instanceof defpackage.ft6
            if (r10 != 0) goto La9
            i60 r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L54:
            r0.R = r7     // Catch: java.lang.Throwable -> L35
            r0.X = r8     // Catch: java.lang.Throwable -> L35
            r0.Y = r10     // Catch: java.lang.Throwable -> L35
            r0.Z = r9     // Catch: java.lang.Throwable -> L35
            r0.d0 = r5     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r10.a(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L65
            goto L85
        L65:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L69:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L86
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.R = r2     // Catch: java.lang.Throwable -> L35
            r0.X = r8     // Catch: java.lang.Throwable -> L35
            r0.Y = r7     // Catch: java.lang.Throwable -> L35
            r0.Z = r9     // Catch: java.lang.Throwable -> L35
            r0.d0 = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r2.b(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r1) goto L32
        L85:
            return r1
        L86:
            if (r9 == 0) goto L8b
            r8.i(r3)
        L8b:
            o27 r7 = defpackage.o27.a
            return r7
        L8e:
            throw r7     // Catch: java.lang.Throwable -> L8f
        L8f:
            r10 = move-exception
            if (r9 == 0) goto La8
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L99
            r3 = r7
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L99:
            if (r3 != 0) goto La5
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r3.<init>(r9)
            r3.initCause(r7)
        La5:
            r8.i(r3)
        La8:
            throw r10
        La9:
            ft6 r7 = (defpackage.ft6) r7
            java.lang.Throwable r7 = r7.A
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sf7.a(w92, lj0, boolean, j11):java.lang.Object");
    }

    public static int b(int i) {
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i != 8) {
                if (i == 16) {
                    return 4;
                }
                if (i != 32) {
                    if (i != 64) {
                        if (i != 128) {
                            if (i == 256) {
                                return 8;
                            }
                            if (i == 512) {
                                return 9;
                            }
                            i.i(wh1.g(i, "type needs to be >= FIRST and <= LAST, type="));
                            return 0;
                        }
                        return 7;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 0;
    }
}
