package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fg  reason: default package */
/* loaded from: classes.dex */
public final class fg {
    public final android.content.Context a;
    public final defpackage.kd6 b;
    public final defpackage.fb2 c;
    public final defpackage.db1 d;
    public final defpackage.hb4 e;
    public final java.util.concurrent.atomic.AtomicInteger f;
    public final java.util.concurrent.atomic.AtomicBoolean g;

    public fg(android.content.Context r1, defpackage.kd6 r2, defpackage.nh4 r3, defpackage.fb2 r4, defpackage.db1 r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            r0.d = r5
            hb4 r1 = new hb4
            r1.<init>()
            r0.e = r1
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r2 = 0
            r1.<init>(r2)
            r0.f = r1
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>(r2)
            r0.g = r1
            return
    }

    public static final java.lang.String a(defpackage.fg r4, int r5) {
            r4 = 16
            defpackage.g04.y(r4)
            long r0 = (long) r5
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            java.lang.String r4 = defpackage.jx2.R(r4, r0)
            r5 = 8
            java.lang.String r4 = defpackage.qs6.B0(r5, r4)
            return r4
    }

    public final void b() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.f
            int r0 = r0.decrementAndGet()
            if (r0 != 0) goto L13
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.g
            r0 = 0
            r1.set(r0)
            me.magnum.melonds.MelonDSiNand r1 = me.magnum.melonds.MelonDSiNand.a
            r1.closeNand()
        L13:
            return
    }

    public final java.lang.Object c(me.magnum.melonds.domain.model.DSiWareTitle r8, defpackage.s41 r9) {
            r7 = this;
            boolean r0 = r9 instanceof defpackage.wf
            if (r0 == 0) goto L13
            r0 = r9
            wf r0 = (defpackage.wf) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            wf r0 = new wf
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.Y
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            hb4 r8 = r0.X
            me.magnum.melonds.domain.model.DSiWareTitle r0 = r0.R
            defpackage.oi2.Y(r9)
            r9 = r8
            r8 = r0
            goto L46
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            return r4
        L34:
            defpackage.oi2.Y(r9)
            r0.R = r8
            hb4 r9 = r7.e
            r0.X = r9
            r0.d0 = r3
            java.lang.Object r0 = r9.e(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            java.util.concurrent.atomic.AtomicBoolean r7 = r7.g     // Catch: java.lang.Throwable -> L68
            boolean r7 = r7.get()     // Catch: java.lang.Throwable -> L68
            jg7 r0 = defpackage.jg7.a
            if (r7 != 0) goto L54
            r9.h(r4)
            return r0
        L54:
            me.magnum.melonds.MelonDSiNand r7 = me.magnum.melonds.MelonDSiNand.a     // Catch: java.lang.Throwable -> L68
            long r1 = r8.getTitleId()     // Catch: java.lang.Throwable -> L68
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r5
            int r8 = (int) r1     // Catch: java.lang.Throwable -> L68
            r7.deleteTitle(r8)     // Catch: java.lang.Throwable -> L68
            r9.h(r4)
            return r0
        L68:
            r7 = move-exception
            r9.h(r4)
            throw r7
    }

    public final java.lang.Object d(long r6, java.lang.String r8, defpackage.s41 r9) {
            r5 = this;
            boolean r0 = r9 instanceof defpackage.xf
            if (r0 == 0) goto L13
            r0 = r9
            xf r0 = (defpackage.xf) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e0 = r1
            goto L18
        L13:
            xf r0 = new xf
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.Z
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.e0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            long r6 = r0.R
            hb4 r8 = r0.Y
            java.lang.String r0 = r0.X
            defpackage.oi2.Y(r9)
            r9 = r8
            r8 = r0
            goto L4a
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r4
        L36:
            defpackage.oi2.Y(r9)
            r0.X = r8
            hb4 r9 = r5.e
            r0.Y = r9
            r0.R = r6
            r0.e0 = r3
            java.lang.Object r0 = r9.e(r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.g     // Catch: java.lang.Throwable -> L58
            boolean r5 = r5.get()     // Catch: java.lang.Throwable -> L58
            if (r5 != 0) goto L5a
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L58
            r9.h(r4)
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
            r9.h(r4)
            return r5
        L6f:
            r9.h(r4)
            throw r5
    }

    public final java.lang.Object e(me.magnum.melonds.domain.model.DSiWareTitle r6, defpackage.bb1 r7, android.net.Uri r8, defpackage.s41 r9) {
            r5 = this;
            boolean r0 = r9 instanceof defpackage.yf
            if (r0 == 0) goto L13
            r0 = r9
            yf r0 = (defpackage.yf) r0
            int r1 = r0.f0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f0 = r1
            goto L18
        L13:
            yf r0 = new yf
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.d0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.f0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L32
            hb4 r6 = r0.Z
            android.net.Uri r8 = r0.Y
            bb1 r7 = r0.X
            me.magnum.melonds.domain.model.DSiWareTitle r0 = r0.R
            defpackage.oi2.Y(r9)
            r9 = r6
            r6 = r0
            goto L4e
        L32:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r4
        L38:
            defpackage.oi2.Y(r9)
            r0.R = r6
            r0.X = r7
            r0.Y = r8
            hb4 r9 = r5.e
            r0.Z = r9
            r0.f0 = r3
            java.lang.Object r0 = r9.e(r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.g     // Catch: java.lang.Throwable -> L5c
            boolean r5 = r5.get()     // Catch: java.lang.Throwable -> L5c
            if (r5 != 0) goto L5e
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L5c
            r9.h(r4)
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
            r9.h(r4)
            return r5
        L82:
            r9.h(r4)
            throw r5
    }

    public final java.lang.Enum f(android.net.Uri r10, defpackage.s41 r11) {
            r9 = this;
            boolean r0 = r11 instanceof defpackage.zf
            if (r0 == 0) goto L13
            r0 = r11
            zf r0 = (defpackage.zf) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e0 = r1
            goto L18
        L13:
            zf r0 = new zf
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.Z
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.e0
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L43
            if (r2 == r5) goto L36
            if (r2 != r4) goto L30
            fb4 r9 = r0.X
            defpackage.oi2.Y(r11)     // Catch: java.lang.Throwable -> L2e
            goto L73
        L2e:
            r10 = move-exception
            goto L7f
        L30:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r9)
            return r6
        L36:
            int r10 = r0.Y
            fb4 r2 = r0.X
            android.net.Uri r5 = r0.R
            defpackage.oi2.Y(r11)
            r11 = r2
            r2 = r10
            r10 = r5
            goto L58
        L43:
            defpackage.oi2.Y(r11)
            r0.R = r10
            hb4 r11 = r9.e
            r0.X = r11
            r0.Y = r3
            r0.e0 = r5
            java.lang.Object r2 = r11.e(r0)
            if (r2 != r1) goto L57
            goto L6f
        L57:
            r2 = r3
        L58:
            xe1 r5 = defpackage.xk1.a     // Catch: java.lang.Throwable -> L7c
            de1 r5 = defpackage.de1.L     // Catch: java.lang.Throwable -> L7c
            ag r7 = new ag     // Catch: java.lang.Throwable -> L79
            r7.<init>(r9, r10, r6, r3)     // Catch: java.lang.Throwable -> L79
            r0.R = r6     // Catch: java.lang.Throwable -> L79
            r0.X = r11     // Catch: java.lang.Throwable -> L79
            r0.Y = r2     // Catch: java.lang.Throwable -> L79
            r0.e0 = r4     // Catch: java.lang.Throwable -> L79
            java.lang.Object r9 = defpackage.hv.d0(r5, r7, r0)     // Catch: java.lang.Throwable -> L79
            if (r9 != r1) goto L70
        L6f:
            return r1
        L70:
            r8 = r11
            r11 = r9
            r9 = r8
        L73:
            t33 r11 = (defpackage.t33) r11     // Catch: java.lang.Throwable -> L2e
            r9.h(r6)
            return r11
        L79:
            r10 = move-exception
        L7a:
            r9 = r11
            goto L7f
        L7c:
            r9 = move-exception
            r10 = r9
            goto L7a
        L7f:
            r9.h(r6)
            throw r10
    }

    public final java.lang.Object g(me.magnum.melonds.domain.model.DSiWareTitle r11, defpackage.bb1 r12, android.net.Uri r13, defpackage.s41 r14) {
            r10 = this;
            android.content.Context r0 = r10.a
            java.lang.String r1 = "dsiware_import_data_"
            boolean r2 = r14 instanceof defpackage.bg
            if (r2 == 0) goto L17
            r2 = r14
            bg r2 = (defpackage.bg) r2
            int r3 = r2.f0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f0 = r3
            goto L1c
        L17:
            bg r2 = new bg
            r2.<init>(r10, r14)
        L1c:
            java.lang.Object r14 = r2.d0
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.f0
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L3a
            if (r4 != r5) goto L34
            hb4 r11 = r2.Z
            android.net.Uri r13 = r2.Y
            bb1 r12 = r2.X
            me.magnum.melonds.domain.model.DSiWareTitle r2 = r2.R
            defpackage.oi2.Y(r14)
            goto L52
        L34:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            return r6
        L3a:
            defpackage.oi2.Y(r14)
            r2.R = r11
            r2.X = r12
            r2.Y = r13
            hb4 r14 = r10.e
            r2.Z = r14
            r2.f0 = r5
            java.lang.Object r2 = r14.e(r2)
            if (r2 != r3) goto L50
            return r3
        L50:
            r2 = r11
            r11 = r14
        L52:
            java.util.concurrent.atomic.AtomicBoolean r10 = r10.g     // Catch: java.lang.Throwable -> L60
            boolean r10 = r10.get()     // Catch: java.lang.Throwable -> L60
            if (r10 != 0) goto L63
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L60
            r11.h(r6)
            return r10
        L60:
            r10 = move-exception
            goto L127
        L63:
            java.lang.String r10 = r13.getScheme()     // Catch: java.lang.Throwable -> L60
            java.lang.String r14 = "content"
            boolean r10 = defpackage.nb3.k(r10, r14)     // Catch: java.lang.Throwable -> L60
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            me.magnum.melonds.MelonDSiNand r14 = me.magnum.melonds.MelonDSiNand.a
            if (r10 == 0) goto L104
            java.io.File r10 = new java.io.File     // Catch: java.lang.Throwable -> L60
            java.io.File r5 = r0.getCacheDir()     // Catch: java.lang.Throwable -> L60
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L60
            r9.append(r7)     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = ".bin"
            r9.append(r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = r9.toString()     // Catch: java.lang.Throwable -> L60
            r10.<init>(r5, r1)     // Catch: java.lang.Throwable -> L60
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> Lb3
            java.io.InputStream r13 = r0.openInputStream(r13)     // Catch: java.lang.Throwable -> Lb3
            if (r13 == 0) goto Lc4
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lb5
            r0.<init>(r10)     // Catch: java.lang.Throwable -> Lb5
            long r7 = defpackage.f04.w(r13, r0)     // Catch: java.lang.Throwable -> Lb7
            r0.close()     // Catch: java.lang.Throwable -> Lb5
            r13.close()     // Catch: java.lang.Throwable -> Lb3
            java.lang.Long r13 = new java.lang.Long     // Catch: java.lang.Throwable -> Lb3
            r13.<init>(r7)     // Catch: java.lang.Throwable -> Lb3
            goto Ld2
        Lb3:
            r13 = move-exception
            goto Lcc
        Lb5:
            r0 = move-exception
            goto Lbe
        Lb7:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> Lb9
        Lb9:
            r5 = move-exception
            defpackage.ge7.t(r0, r1)     // Catch: java.lang.Throwable -> Lb5
            throw r5     // Catch: java.lang.Throwable -> Lb5
        Lbe:
            throw r0     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            r1 = move-exception
            defpackage.ge7.t(r13, r0)     // Catch: java.lang.Throwable -> Lb3
            throw r1     // Catch: java.lang.Throwable -> Lb3
        Lc4:
            java.io.EOFException r13 = new java.io.EOFException     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r0 = "Unable to open content URI"
            r13.<init>(r0)     // Catch: java.lang.Throwable -> Lb3
            throw r13     // Catch: java.lang.Throwable -> Lb3
        Lcc:
            em5 r0 = new em5     // Catch: java.lang.Throwable -> L60
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L60
            r13 = r0
        Ld2:
            boolean r13 = r13 instanceof defpackage.em5     // Catch: java.lang.Throwable -> L60
            if (r13 == 0) goto Ldf
            r10.delete()     // Catch: java.lang.Throwable -> Ld9
        Ld9:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L60
            r11.h(r6)
            return r10
        Ldf:
            long r0 = r2.getTitleId()     // Catch: java.lang.Throwable -> Lff
            long r0 = r0 & r3
            int r13 = (int) r0     // Catch: java.lang.Throwable -> Lff
            int r12 = r12.ordinal()     // Catch: java.lang.Throwable -> Lff
            java.lang.String r0 = r10.getAbsolutePath()     // Catch: java.lang.Throwable -> Lff
            r0.getClass()     // Catch: java.lang.Throwable -> Lff
            boolean r12 = r14.importTitleFile(r13, r12, r0)     // Catch: java.lang.Throwable -> Lff
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch: java.lang.Throwable -> Lff
            r10.delete()     // Catch: java.lang.Throwable -> Lfb
        Lfb:
            r11.h(r6)
            return r12
        Lff:
            r12 = move-exception
            r10.delete()     // Catch: java.lang.Throwable -> L103
        L103:
            throw r12     // Catch: java.lang.Throwable -> L60
        L104:
            java.lang.String r10 = r13.getPath()     // Catch: java.lang.Throwable -> L60
            if (r10 != 0) goto L111
            java.lang.String r10 = r13.toString()     // Catch: java.lang.Throwable -> L60
            r10.getClass()     // Catch: java.lang.Throwable -> L60
        L111:
            long r0 = r2.getTitleId()     // Catch: java.lang.Throwable -> L60
            long r0 = r0 & r3
            int r13 = (int) r0     // Catch: java.lang.Throwable -> L60
            int r12 = r12.ordinal()     // Catch: java.lang.Throwable -> L60
            boolean r10 = r14.importTitleFile(r13, r12, r10)     // Catch: java.lang.Throwable -> L60
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L60
            r11.h(r6)
            return r10
        L127:
            r11.h(r6)
            throw r10
    }

    public final java.io.Serializable h(defpackage.s41 r24) {
            r23 = this;
            r0 = r23
            r1 = r24
            boolean r2 = r1 instanceof defpackage.cg
            if (r2 == 0) goto L17
            r2 = r1
            cg r2 = (defpackage.cg) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Z = r3
            goto L1c
        L17:
            cg r2 = new cg
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.X
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.Z
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L34
            if (r4 != r5) goto L2e
            hb4 r2 = r2.R
            defpackage.oi2.Y(r1)
            goto L45
        L2e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r6
        L34:
            defpackage.oi2.Y(r1)
            hb4 r1 = r0.e
            r2.R = r1
            r2.Z = r5
            java.lang.Object r2 = r1.e(r2)
            if (r2 != r3) goto L44
            return r3
        L44:
            r2 = r1
        L45:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.g     // Catch: java.lang.Throwable -> L53
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L55
            yt1 r0 = defpackage.yt1.A     // Catch: java.lang.Throwable -> L53
            r2.h(r6)
            return r0
        L53:
            r0 = move-exception
            goto Lb3
        L55:
            me.magnum.melonds.MelonDSiNand r1 = me.magnum.melonds.MelonDSiNand.a     // Catch: java.lang.Throwable -> L53
            java.util.ArrayList r1 = r1.listTitles()     // Catch: java.lang.Throwable -> L53
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L53
            r4 = 10
            int r4 = defpackage.ht0.v0(r1, r4)     // Catch: java.lang.Throwable -> L53
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L53
            int r4 = r1.size()     // Catch: java.lang.Throwable -> L53
            r5 = 0
        L6b:
            if (r5 >= r4) goto Laf
            java.lang.Object r7 = r1.get(r5)     // Catch: java.lang.Throwable -> L53
            int r5 = r5 + 1
            me.magnum.melonds.domain.model.DSiWareTitle r7 = (me.magnum.melonds.domain.model.DSiWareTitle) r7     // Catch: java.lang.Throwable -> L53
            db1 r8 = r0.d     // Catch: java.lang.Throwable -> L53
            long r9 = r7.getTitleId()     // Catch: java.lang.Throwable -> L53
            java.lang.String r11 = r7.getName()     // Catch: java.lang.Throwable -> L53
            java.lang.String r13 = r8.a(r9, r11)     // Catch: java.lang.Throwable -> L53
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Throwable -> L53
            boolean r8 = r13.equals(r8)     // Catch: java.lang.Throwable -> L53
            if (r8 != 0) goto Lab
            me.magnum.melonds.domain.model.DSiWareTitle r12 = new me.magnum.melonds.domain.model.DSiWareTitle     // Catch: java.lang.Throwable -> L53
            java.lang.String r14 = r7.getProducer()     // Catch: java.lang.Throwable -> L53
            long r15 = r7.getTitleId()     // Catch: java.lang.Throwable -> L53
            byte[] r17 = r7.getIcon()     // Catch: java.lang.Throwable -> L53
            long r18 = r7.getPublicSavSize()     // Catch: java.lang.Throwable -> L53
            long r20 = r7.getPrivateSavSize()     // Catch: java.lang.Throwable -> L53
            int r22 = r7.getAppFlags()     // Catch: java.lang.Throwable -> L53
            r12.<init>(r13, r14, r15, r17, r18, r20, r22)     // Catch: java.lang.Throwable -> L53
            r7 = r12
        Lab:
            r3.add(r7)     // Catch: java.lang.Throwable -> L53
            goto L6b
        Laf:
            r2.h(r6)
            return r3
        Lb3:
            r2.h(r6)
            throw r0
    }

    public final java.lang.Enum i(defpackage.s41 r11) {
            r10 = this;
            boolean r0 = r11 instanceof defpackage.dg
            if (r0 == 0) goto L13
            r0 = r11
            dg r0 = (defpackage.dg) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e0 = r1
            goto L18
        L13:
            dg r0 = new dg
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.Z
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.e0
            java.util.concurrent.atomic.AtomicInteger r3 = r10.f
            java.util.concurrent.atomic.AtomicBoolean r4 = r10.g
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L45
            if (r2 == r6) goto L3c
            if (r2 != r5) goto L36
            me.magnum.melonds.MelonDSiNand r10 = r0.X
            fb4 r0 = r0.R
            defpackage.oi2.Y(r11)     // Catch: java.lang.Throwable -> L33
            goto L94
        L33:
            r10 = move-exception
            goto Lc4
        L36:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            return r7
        L3c:
            int r2 = r0.Y
            fb4 r8 = r0.R
            defpackage.oi2.Y(r11)
            r11 = r8
            goto L58
        L45:
            defpackage.oi2.Y(r11)
            hb4 r11 = r10.e
            r0.R = r11
            r2 = 0
            r0.Y = r2
            r0.e0 = r6
            java.lang.Object r8 = r11.e(r0)
            if (r8 != r1) goto L58
            goto L90
        L58:
            boolean r8 = r4.get()     // Catch: java.lang.Throwable -> L67
            if (r8 == 0) goto L6a
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L67
            mm4 r10 = defpackage.mm4.NAND_ALREADY_OPEN     // Catch: java.lang.Throwable -> L67
            r11.h(r7)
            return r10
        L67:
            r10 = move-exception
            r0 = r11
            goto Lc4
        L6a:
            fb2 r8 = r10.c     // Catch: java.lang.Throwable -> L67
            dz0 r8 = r8.c()     // Catch: java.lang.Throwable -> L67
            cz0 r8 = r8.b     // Catch: java.lang.Throwable -> L67
            cz0 r9 = defpackage.cz0.VALID     // Catch: java.lang.Throwable -> L67
            if (r8 == r9) goto L7c
            mm4 r10 = defpackage.mm4.INVALID_DSI_SETUP     // Catch: java.lang.Throwable -> L67
            r11.h(r7)
            return r10
        L7c:
            me.magnum.melonds.MelonDSiNand r8 = me.magnum.melonds.MelonDSiNand.a     // Catch: java.lang.Throwable -> L67
            kd6 r10 = r10.b     // Catch: java.lang.Throwable -> L67
            r0.R = r11     // Catch: java.lang.Throwable -> L67
            r0.X = r8     // Catch: java.lang.Throwable -> L67
            r0.Y = r2     // Catch: java.lang.Throwable -> L67
            r0.e0 = r5     // Catch: java.lang.Throwable -> L67
            ng6 r10 = (defpackage.ng6) r10     // Catch: java.lang.Throwable -> L67
            java.lang.Object r10 = r10.k(r0)     // Catch: java.lang.Throwable -> L67
            if (r10 != r1) goto L91
        L90:
            return r1
        L91:
            r0 = r11
            r11 = r10
            r10 = r8
        L94:
            me.magnum.melonds.domain.model.EmulatorConfiguration r11 = (me.magnum.melonds.domain.model.EmulatorConfiguration) r11     // Catch: java.lang.Throwable -> L33
            int r10 = r10.openNand(r11)     // Catch: java.lang.Throwable -> L33
            if (r10 == 0) goto Laf
            if (r10 == r6) goto Lac
            if (r10 == r5) goto La9
            r11 = 3
            if (r10 == r11) goto La6
            mm4 r10 = defpackage.mm4.UNKNOWN     // Catch: java.lang.Throwable -> L33
            goto Lb1
        La6:
            mm4 r10 = defpackage.mm4.NAND_OPEN_FAILED     // Catch: java.lang.Throwable -> L33
            goto Lb1
        La9:
            mm4 r10 = defpackage.mm4.BIOS7_NOT_FOUND     // Catch: java.lang.Throwable -> L33
            goto Lb1
        Lac:
            mm4 r10 = defpackage.mm4.NAND_ALREADY_OPEN     // Catch: java.lang.Throwable -> L33
            goto Lb1
        Laf:
            mm4 r10 = defpackage.mm4.SUCCESS     // Catch: java.lang.Throwable -> L33
        Lb1:
            boolean r11 = r10.isFailure()     // Catch: java.lang.Throwable -> L33
            if (r11 != 0) goto Lc0
            int r11 = r3.getAndIncrement()     // Catch: java.lang.Throwable -> L33
            if (r11 != 0) goto Lc0
            r4.set(r6)     // Catch: java.lang.Throwable -> L33
        Lc0:
            r0.h(r7)
            return r10
        Lc4:
            r0.h(r7)
            throw r10
    }

    public final java.lang.Object j(long r6, defpackage.s41 r8) {
            r5 = this;
            boolean r0 = r8 instanceof defpackage.eg
            if (r0 == 0) goto L13
            r0 = r8
            eg r0 = (defpackage.eg) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            eg r0 = new eg
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.Y
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2c
            long r6 = r0.R
            hb4 r0 = r0.X
            defpackage.oi2.Y(r8)
            goto L45
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r4
        L32:
            defpackage.oi2.Y(r8)
            hb4 r8 = r5.e
            r0.X = r8
            r0.R = r6
            r0.d0 = r3
            java.lang.Object r0 = r8.e(r0)
            if (r0 != r1) goto L44
            return r1
        L44:
            r0 = r8
        L45:
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.g     // Catch: java.lang.Throwable -> L53
            boolean r5 = r5.get()     // Catch: java.lang.Throwable -> L53
            if (r5 != 0) goto L55
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L53
            r0.h(r4)
            return r5
        L53:
            r5 = move-exception
            goto L6a
        L55:
            me.magnum.melonds.MelonDSiNand r5 = me.magnum.melonds.MelonDSiNand.a     // Catch: java.lang.Throwable -> L53
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r1
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L53
            boolean r5 = r5.repairTitleSaves(r6)     // Catch: java.lang.Throwable -> L53
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L53
            r0.h(r4)
            return r5
        L6a:
            r0.h(r4)
            throw r5
    }
}
