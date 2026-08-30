package defpackage;

import android.content.Context;
import java.io.EOFException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import me.magnum.melonds.MelonDSiNand;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qf  reason: default package */
/* loaded from: classes.dex */
public final class qf {
    public final Context a;
    public final w16 b;
    public final l62 c;
    public final b34 d = new b34();
    public final AtomicInteger e = new AtomicInteger(0);
    public final AtomicBoolean f = new AtomicBoolean(false);

    public qf(Context context, w16 w16Var, w84 w84Var, l62 l62Var) {
        this.a = context;
        this.b = w16Var;
        this.c = l62Var;
    }

    public static final int a(qf qfVar, byte[] bArr, int i) {
        if (i >= 0 && i + 4 <= bArr.length) {
            return ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
        }
        throw new EOFException(wh1.g(i, "Not enough bytes to read UInt at offset "));
    }

    public static final int b(qf qfVar, InputStream inputStream) {
        return n(inputStream) | (n(inputStream) << 8) | (n(inputStream) << 16) | (n(inputStream) << 24);
    }

    public static final String c(qf qfVar, int i) {
        qfVar.getClass();
        return zg6.H0(8, nl2.Z(i));
    }

    public static int n(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException("Reached EOF while reading title id");
    }

    public final void d() {
        if (this.e.decrementAndGet() == 0) {
            this.f.set(false);
            MelonDSiNand.a.closeNand();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054 A[Catch: all -> 0x0068, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0068, blocks: (B:17:0x0046, B:22:0x0054), top: B:28:0x0046 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(me.magnum.melonds.domain.model.DSiWareTitle r8, defpackage.k11 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.gf
            if (r0 == 0) goto L13
            r0 = r9
            gf r0 = (defpackage.gf) r0
            int r1 = r0.c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c0 = r1
            goto L18
        L13:
            gf r0 = new gf
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.Y
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.c0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            b34 r8 = r0.X
            me.magnum.melonds.domain.model.DSiWareTitle r0 = r0.R
            defpackage.me2.a0(r9)
            r9 = r8
            r8 = r0
            goto L46
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r7)
            return r4
        L34:
            defpackage.me2.a0(r9)
            r0.R = r8
            b34 r9 = r7.d
            r0.X = r9
            r0.c0 = r3
            java.lang.Object r0 = r9.i(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            java.util.concurrent.atomic.AtomicBoolean r7 = r7.f     // Catch: java.lang.Throwable -> L68
            boolean r7 = r7.get()     // Catch: java.lang.Throwable -> L68
            o27 r0 = defpackage.o27.a
            if (r7 != 0) goto L54
            r9.d(r4)
            return r0
        L54:
            me.magnum.melonds.MelonDSiNand r7 = me.magnum.melonds.MelonDSiNand.a     // Catch: java.lang.Throwable -> L68
            long r1 = r8.getTitleId()     // Catch: java.lang.Throwable -> L68
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r5
            int r8 = (int) r1     // Catch: java.lang.Throwable -> L68
            r7.deleteTitle(r8)     // Catch: java.lang.Throwable -> L68
            r9.d(r4)
            return r0
        L68:
            r7 = move-exception
            r9.d(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qf.e(me.magnum.melonds.domain.model.DSiWareTitle, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #0 {all -> 0x0058, blocks: (B:17:0x004a, B:19:0x0052, B:24:0x005a), top: B:29:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[Catch: all -> 0x0058, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0058, blocks: (B:17:0x004a, B:19:0x0052, B:24:0x005a), top: B:29:0x004a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(long r6, java.lang.String r8, defpackage.k11 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.hf
            if (r0 == 0) goto L13
            r0 = r9
            hf r0 = (defpackage.hf) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            hf r0 = new hf
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.Z
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            long r6 = r0.R
            b34 r8 = r0.Y
            java.lang.String r0 = r0.X
            defpackage.me2.a0(r9)
            r9 = r8
            r8 = r0
            goto L4a
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            return r4
        L36:
            defpackage.me2.a0(r9)
            r0.X = r8
            b34 r9 = r5.d
            r0.Y = r9
            r0.R = r6
            r0.d0 = r3
            java.lang.Object r0 = r9.i(r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.f     // Catch: java.lang.Throwable -> L58
            boolean r5 = r5.get()     // Catch: java.lang.Throwable -> L58
            if (r5 != 0) goto L5a
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L58
            r9.d(r4)
            return r5
        L58:
            r5 = move-exception
            goto L6f
        L5a:
            me.magnum.melonds.MelonDSiNand r5 = me.magnum.melonds.MelonDSiNand.a     // Catch: java.lang.Throwable -> L58
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r0
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L58
            boolean r5 = r5.exportTitleExecutable(r6, r8)     // Catch: java.lang.Throwable -> L58
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L58
            r9.d(r4)
            return r5
        L6f:
            r9.d(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qf.f(long, java.lang.String, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #0 {all -> 0x005c, blocks: (B:17:0x004e, B:19:0x0056, B:24:0x005e), top: B:29:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[Catch: all -> 0x005c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x005c, blocks: (B:17:0x004e, B:19:0x0056, B:24:0x005e), top: B:29:0x004e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(me.magnum.melonds.domain.model.DSiWareTitle r6, defpackage.m71 r7, android.net.Uri r8, defpackage.k11 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.jf
            if (r0 == 0) goto L13
            r0 = r9
            jf r0 = (defpackage.jf) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e0 = r1
            goto L18
        L13:
            jf r0 = new jf
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.c0
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.e0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L32
            b34 r6 = r0.Z
            android.net.Uri r8 = r0.Y
            m71 r7 = r0.X
            me.magnum.melonds.domain.model.DSiWareTitle r0 = r0.R
            defpackage.me2.a0(r9)
            r9 = r6
            r6 = r0
            goto L4e
        L32:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            return r4
        L38:
            defpackage.me2.a0(r9)
            r0.R = r6
            r0.X = r7
            r0.Y = r8
            b34 r9 = r5.d
            r0.Z = r9
            r0.e0 = r3
            java.lang.Object r0 = r9.i(r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.f     // Catch: java.lang.Throwable -> L5c
            boolean r5 = r5.get()     // Catch: java.lang.Throwable -> L5c
            if (r5 != 0) goto L5e
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L5c
            r9.d(r4)
            return r5
        L5c:
            r5 = move-exception
            goto L82
        L5e:
            me.magnum.melonds.MelonDSiNand r5 = me.magnum.melonds.MelonDSiNand.a     // Catch: java.lang.Throwable -> L5c
            long r0 = r6.getTitleId()     // Catch: java.lang.Throwable -> L5c
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r6 = (int) r0     // Catch: java.lang.Throwable -> L5c
            int r7 = r7.ordinal()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L5c
            r8.getClass()     // Catch: java.lang.Throwable -> L5c
            boolean r5 = r5.exportTitleFile(r6, r7, r8)     // Catch: java.lang.Throwable -> L5c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L5c
            r9.d(r4)
            return r5
        L82:
            r9.d(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qf.g(me.magnum.melonds.domain.model.DSiWareTitle, m71, android.net.Uri, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #0 {all -> 0x005c, blocks: (B:17:0x004e, B:19:0x0056, B:24:0x005e), top: B:29:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[Catch: all -> 0x005c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x005c, blocks: (B:17:0x004e, B:19:0x0056, B:24:0x005e), top: B:29:0x004e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(long r6, defpackage.m71 r8, java.lang.String r9, defpackage.k11 r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof defpackage.kf
            if (r0 == 0) goto L13
            r0 = r10
            kf r0 = (defpackage.kf) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e0 = r1
            goto L18
        L13:
            kf r0 = new kf
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.c0
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.e0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L32
            long r6 = r0.R
            b34 r8 = r0.Z
            java.lang.String r9 = r0.Y
            m71 r0 = r0.X
            defpackage.me2.a0(r10)
            r10 = r8
            r8 = r0
            goto L4e
        L32:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            return r4
        L38:
            defpackage.me2.a0(r10)
            r0.X = r8
            r0.Y = r9
            b34 r10 = r5.d
            r0.Z = r10
            r0.R = r6
            r0.e0 = r3
            java.lang.Object r0 = r10.i(r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.f     // Catch: java.lang.Throwable -> L5c
            boolean r5 = r5.get()     // Catch: java.lang.Throwable -> L5c
            if (r5 != 0) goto L5e
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L5c
            r10.d(r4)
            return r5
        L5c:
            r5 = move-exception
            goto L77
        L5e:
            me.magnum.melonds.MelonDSiNand r5 = me.magnum.melonds.MelonDSiNand.a     // Catch: java.lang.Throwable -> L5c
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r0
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L5c
            int r7 = r8.ordinal()     // Catch: java.lang.Throwable -> L5c
            boolean r5 = r5.exportTitleFile(r6, r7, r9)     // Catch: java.lang.Throwable -> L5c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L5c
            r10.d(r4)
            return r5
        L77:
            r10.d(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qf.h(long, m71, java.lang.String, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r11.i(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Type inference failed for: r2v3, types: [z24] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v5, types: [z24] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [z24] */
    /* JADX WARN: Type inference failed for: r9v9, types: [z24] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum i(android.net.Uri r10, defpackage.k11 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.lf
            if (r0 == 0) goto L13
            r0 = r11
            lf r0 = (defpackage.lf) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            lf r0 = new lf
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.Z
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            z24 r9 = r0.X
            defpackage.me2.a0(r11)     // Catch: java.lang.Throwable -> L2d
            goto L72
        L2d:
            r10 = move-exception
            goto L7e
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r9)
            return r5
        L35:
            int r10 = r0.Y
            z24 r2 = r0.X
            android.net.Uri r6 = r0.R
            defpackage.me2.a0(r11)
            r11 = r2
            r2 = r10
            r10 = r6
            goto L57
        L42:
            defpackage.me2.a0(r11)
            r0.R = r10
            b34 r11 = r9.d
            r0.X = r11
            r2 = 0
            r0.Y = r2
            r0.d0 = r4
            java.lang.Object r6 = r11.i(r0)
            if (r6 != r1) goto L57
            goto L6e
        L57:
            bb1 r6 = defpackage.tg1.a     // Catch: java.lang.Throwable -> L7b
            ha1 r6 = defpackage.ha1.L     // Catch: java.lang.Throwable -> L7b
            m5 r7 = new m5     // Catch: java.lang.Throwable -> L78
            r7.<init>(r9, r10, r5, r4)     // Catch: java.lang.Throwable -> L78
            r0.R = r5     // Catch: java.lang.Throwable -> L78
            r0.X = r11     // Catch: java.lang.Throwable -> L78
            r0.Y = r2     // Catch: java.lang.Throwable -> L78
            r0.d0 = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r9 = defpackage.tq5.G(r6, r7, r0)     // Catch: java.lang.Throwable -> L78
            if (r9 != r1) goto L6f
        L6e:
            return r1
        L6f:
            r8 = r11
            r11 = r9
            r9 = r8
        L72:
            px2 r11 = (defpackage.px2) r11     // Catch: java.lang.Throwable -> L2d
            r9.d(r5)
            return r11
        L78:
            r10 = move-exception
        L79:
            r9 = r11
            goto L7e
        L7b:
            r9 = move-exception
            r10 = r9
            goto L79
        L7e:
            r9.d(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qf.i(android.net.Uri, k11):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #0 {all -> 0x005c, blocks: (B:17:0x004e, B:19:0x0056, B:24:0x005e), top: B:29:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[Catch: all -> 0x005c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x005c, blocks: (B:17:0x004e, B:19:0x0056, B:24:0x005e), top: B:29:0x004e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(me.magnum.melonds.domain.model.DSiWareTitle r6, defpackage.m71 r7, android.net.Uri r8, defpackage.k11 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.mf
            if (r0 == 0) goto L13
            r0 = r9
            mf r0 = (defpackage.mf) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e0 = r1
            goto L18
        L13:
            mf r0 = new mf
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.c0
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.e0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L32
            b34 r6 = r0.Z
            android.net.Uri r8 = r0.Y
            m71 r7 = r0.X
            me.magnum.melonds.domain.model.DSiWareTitle r0 = r0.R
            defpackage.me2.a0(r9)
            r9 = r6
            r6 = r0
            goto L4e
        L32:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            return r4
        L38:
            defpackage.me2.a0(r9)
            r0.R = r6
            r0.X = r7
            r0.Y = r8
            b34 r9 = r5.d
            r0.Z = r9
            r0.e0 = r3
            java.lang.Object r0 = r9.i(r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.f     // Catch: java.lang.Throwable -> L5c
            boolean r5 = r5.get()     // Catch: java.lang.Throwable -> L5c
            if (r5 != 0) goto L5e
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L5c
            r9.d(r4)
            return r5
        L5c:
            r5 = move-exception
            goto L82
        L5e:
            me.magnum.melonds.MelonDSiNand r5 = me.magnum.melonds.MelonDSiNand.a     // Catch: java.lang.Throwable -> L5c
            long r0 = r6.getTitleId()     // Catch: java.lang.Throwable -> L5c
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r6 = (int) r0     // Catch: java.lang.Throwable -> L5c
            int r7 = r7.ordinal()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L5c
            r8.getClass()     // Catch: java.lang.Throwable -> L5c
            boolean r5 = r5.importTitleFile(r6, r7, r8)     // Catch: java.lang.Throwable -> L5c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L5c
            r9.d(r4)
            return r5
        L82:
            r9.d(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qf.j(me.magnum.melonds.domain.model.DSiWareTitle, m71, android.net.Uri, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #0 {all -> 0x005c, blocks: (B:17:0x004e, B:19:0x0056, B:24:0x005e), top: B:29:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[Catch: all -> 0x005c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x005c, blocks: (B:17:0x004e, B:19:0x0056, B:24:0x005e), top: B:29:0x004e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(long r6, defpackage.m71 r8, java.lang.String r9, defpackage.k11 r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof defpackage.nf
            if (r0 == 0) goto L13
            r0 = r10
            nf r0 = (defpackage.nf) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e0 = r1
            goto L18
        L13:
            nf r0 = new nf
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.c0
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.e0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L32
            long r6 = r0.R
            b34 r8 = r0.Z
            java.lang.String r9 = r0.Y
            m71 r0 = r0.X
            defpackage.me2.a0(r10)
            r10 = r8
            r8 = r0
            goto L4e
        L32:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            return r4
        L38:
            defpackage.me2.a0(r10)
            r0.X = r8
            r0.Y = r9
            b34 r10 = r5.d
            r0.Z = r10
            r0.R = r6
            r0.e0 = r3
            java.lang.Object r0 = r10.i(r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.f     // Catch: java.lang.Throwable -> L5c
            boolean r5 = r5.get()     // Catch: java.lang.Throwable -> L5c
            if (r5 != 0) goto L5e
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L5c
            r10.d(r4)
            return r5
        L5c:
            r5 = move-exception
            goto L77
        L5e:
            me.magnum.melonds.MelonDSiNand r5 = me.magnum.melonds.MelonDSiNand.a     // Catch: java.lang.Throwable -> L5c
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r0
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L5c
            int r7 = r8.ordinal()     // Catch: java.lang.Throwable -> L5c
            boolean r5 = r5.importTitleFile(r6, r7, r9)     // Catch: java.lang.Throwable -> L5c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L5c
            r10.d(r4)
            return r5
        L77:
            r10.d(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qf.k(long, m71, java.lang.String, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #0 {all -> 0x004f, blocks: (B:18:0x0041, B:20:0x0049, B:25:0x0051), top: B:30:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051 A[Catch: all -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x004f, blocks: (B:18:0x0041, B:20:0x0049, B:25:0x0051), top: B:30:0x0041 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable l(defpackage.k11 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.of
            if (r0 == 0) goto L13
            r0 = r6
            of r0 = (defpackage.of) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            of r0 = new of
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L2a
            b34 r0 = r0.R
            defpackage.me2.a0(r6)
            goto L41
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            return r4
        L30:
            defpackage.me2.a0(r6)
            b34 r6 = r5.d
            r0.R = r6
            r0.Z = r3
            java.lang.Object r0 = r6.i(r0)
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r6
        L41:
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.f     // Catch: java.lang.Throwable -> L4f
            boolean r5 = r5.get()     // Catch: java.lang.Throwable -> L4f
            if (r5 != 0) goto L51
            pp1 r5 = defpackage.pp1.A     // Catch: java.lang.Throwable -> L4f
            r0.d(r4)
            return r5
        L4f:
            r5 = move-exception
            goto L5b
        L51:
            me.magnum.melonds.MelonDSiNand r5 = me.magnum.melonds.MelonDSiNand.a     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayList r5 = r5.listTitles()     // Catch: java.lang.Throwable -> L4f
            r0.d(r4)
            return r5
        L5b:
            r0.d(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qf.l(k11):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (r11.i(r0) == r1) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #1 {all -> 0x0067, blocks: (B:23:0x0058, B:25:0x005e, B:30:0x006a, B:32:0x0076, B:35:0x007c), top: B:61:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a A[Catch: all -> 0x0067, TRY_ENTER, TryCatch #1 {all -> 0x0067, blocks: (B:23:0x0058, B:25:0x005e, B:30:0x006a, B:32:0x0076, B:35:0x007c), top: B:61:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:39:0x0094, B:45:0x00a3, B:50:0x00b1, B:52:0x00b7, B:54:0x00bd, B:46:0x00a6, B:47:0x00a9, B:48:0x00ac, B:49:0x00af), top: B:59:0x002f }] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v5, types: [z24] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [z24] */
    /* JADX WARN: Type inference failed for: r0v8, types: [z24] */
    /* JADX WARN: Type inference failed for: r8v6, types: [z24] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum m(defpackage.k11 r11) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qf.m(k11):java.lang.Enum");
    }
}
