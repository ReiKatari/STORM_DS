package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ie2  reason: default package */
/* loaded from: classes.dex */
public final class ie2 {
    public final defpackage.gn a;
    public defpackage.t93 b;
    public defpackage.t93 c;

    public ie2() {
            r5 = this;
            r5.<init>()
            gn r0 = new gn
            om1 r1 = new om1
            r2 = 1086324736(0x40c00000, float:6.0)
            r1.<init>(r2)
            wc7 r2 = defpackage.nw7.g0
            r3 = 0
            r4 = 12
            r0.<init>(r1, r2, r3, r4)
            r5.a = r0
            return
    }

    public final java.lang.Object a(defpackage.t93 r6, defpackage.s41 r7) {
            r5 = this;
            gn r0 = r5.a
            boolean r1 = r7 instanceof defpackage.ge2
            if (r1 == 0) goto L15
            r1 = r7
            ge2 r1 = (defpackage.ge2) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Z = r2
            goto L1a
        L15:
            ge2 r1 = new ge2
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.X
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.Z
            r4 = 1
            if (r3 == 0) goto L34
            if (r3 != r4) goto L2d
            t93 r6 = r1.R
            defpackage.oi2.Y(r7)     // Catch: java.lang.Throwable -> L2b
            goto L6c
        L2b:
            r7 = move-exception
            goto L71
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            r5 = 0
            return r5
        L34:
            defpackage.oi2.Y(r7)
            boolean r7 = r6 instanceof defpackage.l25
            if (r7 == 0) goto L3e
            r7 = 1094713344(0x41400000, float:12.0)
            goto L4d
        L3e:
            boolean r7 = r6 instanceof defpackage.oy2
            r3 = 1090519040(0x41000000, float:8.0)
            if (r7 == 0) goto L46
        L44:
            r7 = r3
            goto L4d
        L46:
            boolean r7 = r6 instanceof defpackage.sg2
            if (r7 == 0) goto L4b
            goto L44
        L4b:
            r7 = 1086324736(0x40c00000, float:6.0)
        L4d:
            r5.c = r6
            vs4 r3 = r0.e     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L2b
            om1 r3 = (defpackage.om1) r3     // Catch: java.lang.Throwable -> L2b
            float r3 = r3.A     // Catch: java.lang.Throwable -> L2b
            boolean r3 = defpackage.om1.b(r3, r7)     // Catch: java.lang.Throwable -> L2b
            if (r3 != 0) goto L6c
            t93 r3 = r5.b     // Catch: java.lang.Throwable -> L2b
            r1.R = r6     // Catch: java.lang.Throwable -> L2b
            r1.Z = r4     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = defpackage.ms1.a(r0, r7, r3, r6, r1)     // Catch: java.lang.Throwable -> L2b
            if (r7 != r2) goto L6c
            return r2
        L6c:
            r5.b = r6
            jg7 r5 = defpackage.jg7.a
            return r5
        L71:
            r5.b = r6
            throw r7
    }

    public final java.lang.Object b(defpackage.s41 r6) {
            r5 = this;
            boolean r0 = r6 instanceof defpackage.he2
            if (r0 == 0) goto L13
            r0 = r6
            he2 r0 = (defpackage.he2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            he2 r0 = new he2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            defpackage.oi2.Y(r6)     // Catch: java.lang.Throwable -> L27
            goto L6b
        L27:
            r6 = move-exception
            goto L70
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            r5 = 0
            return r5
        L30:
            defpackage.oi2.Y(r6)
            t93 r6 = r5.c
            boolean r2 = r6 instanceof defpackage.l25
            if (r2 == 0) goto L3c
            r6 = 1094713344(0x41400000, float:12.0)
            goto L4b
        L3c:
            boolean r2 = r6 instanceof defpackage.oy2
            r4 = 1090519040(0x41000000, float:8.0)
            if (r2 == 0) goto L44
        L42:
            r6 = r4
            goto L4b
        L44:
            boolean r6 = r6 instanceof defpackage.sg2
            if (r6 == 0) goto L49
            goto L42
        L49:
            r6 = 1086324736(0x40c00000, float:6.0)
        L4b:
            gn r2 = r5.a
            vs4 r4 = r2.e
            java.lang.Object r4 = r4.getValue()
            om1 r4 = (defpackage.om1) r4
            float r4 = r4.A
            boolean r4 = defpackage.om1.b(r4, r6)
            if (r4 != 0) goto L75
            om1 r4 = new om1     // Catch: java.lang.Throwable -> L27
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L27
            r0.Y = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r2.e(r0, r4)     // Catch: java.lang.Throwable -> L27
            if (r6 != r1) goto L6b
            return r1
        L6b:
            t93 r6 = r5.c
            r5.b = r6
            goto L75
        L70:
            t93 r0 = r5.c
            r5.b = r0
            throw r6
        L75:
            jg7 r5 = defpackage.jg7.a
            return r5
    }
}
