package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ck4  reason: default package */
/* loaded from: classes.dex */
public final class ck4 {
    public final defpackage.wi a;
    public final defpackage.hb4 b;

    public ck4(defpackage.wi r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            hb4 r1 = new hb4
            r1.<init>()
            r0.b = r1
            return
    }

    public final java.lang.Object a(java.lang.String r9, java.lang.String r10, defpackage.s41 r11) {
            r8 = this;
            boolean r0 = r11 instanceof defpackage.zj4
            if (r0 == 0) goto L13
            r0 = r11
            zj4 r0 = (defpackage.zj4) r0
            int r1 = r0.f0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f0 = r1
            goto L18
        L13:
            zj4 r0 = new zj4
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.d0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.f0
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L48
            if (r2 == r4) goto L39
            if (r2 != r3) goto L33
            fb4 r8 = r0.Y
            defpackage.oi2.Y(r11)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L30 java.lang.Exception -> L9d
            goto L88
        L2d:
            r9 = move-exception
            goto Lb9
        L30:
            r9 = move-exception
            goto Lb8
        L33:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r5
        L39:
            int r9 = r0.Z
            fb4 r10 = r0.Y
            java.lang.String r2 = r0.X
            java.lang.String r6 = r0.R
            defpackage.oi2.Y(r11)
            r11 = r2
            r2 = r9
            r9 = r6
            goto L62
        L48:
            defpackage.oi2.Y(r11)
            r0.R = r9
            r0.X = r10
            hb4 r11 = r8.b
            r0.Y = r11
            r2 = 0
            r0.Z = r2
            r0.f0 = r4
            java.lang.Object r6 = r11.e(r0)
            if (r6 != r1) goto L5f
            goto L86
        L5f:
            r7 = r11
            r11 = r10
            r10 = r7
        L62:
            wi r8 = r8.a     // Catch: java.lang.Exception -> L93 java.lang.Throwable -> L99 java.util.concurrent.CancellationException -> L9b
            r0.R = r5     // Catch: java.lang.Exception -> L93 java.lang.Throwable -> L99 java.util.concurrent.CancellationException -> L9b
            r0.X = r5     // Catch: java.lang.Exception -> L93 java.lang.Throwable -> L99 java.util.concurrent.CancellationException -> L9b
            r0.Y = r10     // Catch: java.lang.Exception -> L93 java.lang.Throwable -> L99 java.util.concurrent.CancellationException -> L9b
            r0.Z = r2     // Catch: java.lang.Exception -> L93 java.lang.Throwable -> L99 java.util.concurrent.CancellationException -> L9b
            r0.f0 = r3     // Catch: java.lang.Exception -> L93 java.lang.Throwable -> L99 java.util.concurrent.CancellationException -> L9b
            kh r2 = r8.a     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L95
            java.io.File r8 = r8.a(r9, r11)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L95
            r2.getClass()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L95
            xe1 r9 = defpackage.xk1.a     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L95
            de1 r9 = defpackage.de1.L     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L95
            m5 r11 = new m5     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L95
            r11.<init>(r8, r2, r5, r4)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L95
            java.lang.Object r11 = defpackage.hv.d0(r9, r11, r0)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L95
            if (r11 != r1) goto L87
        L86:
            return r1
        L87:
            r8 = r10
        L88:
            byte[] r11 = (byte[]) r11     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L30 java.lang.Exception -> L9d
            goto L9e
        L8b:
            r9 = r8
            goto L91
        L8d:
            r9 = r8
            goto L97
        L8f:
            r8 = move-exception
            goto L8b
        L91:
            r8 = r10
            goto Lb9
        L93:
            r8 = r10
            goto L9d
        L95:
            r8 = move-exception
            goto L8d
        L97:
            r8 = r10
            goto Lb8
        L99:
            r9 = move-exception
            goto L91
        L9b:
            r9 = move-exception
            goto L97
        L9d:
            r11 = r5
        L9e:
            if (r11 != 0) goto La2
        La0:
            r9 = r5
            goto Lb2
        La2:
            p45 r9 = defpackage.pi4.a     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> La0 java.util.concurrent.CancellationException -> Lb6
            uj4 r10 = defpackage.vj4.Companion     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> La0 java.util.concurrent.CancellationException -> Lb6
            gg3 r10 = r10.serializer()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> La0 java.util.concurrent.CancellationException -> Lb6
            gg3 r10 = (defpackage.gg3) r10     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> La0 java.util.concurrent.CancellationException -> Lb6
            java.lang.Object r9 = r9.a(r10, r11)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> La0 java.util.concurrent.CancellationException -> Lb6
            vj4 r9 = (defpackage.vj4) r9     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> La0 java.util.concurrent.CancellationException -> Lb6
        Lb2:
            r8.h(r5)
            return r9
        Lb6:
            r9 = move-exception
            throw r9     // Catch: java.lang.Throwable -> L2d
        Lb8:
            throw r9     // Catch: java.lang.Throwable -> L2d
        Lb9:
            r8.h(r5)
            throw r9
    }

    public final java.lang.Object b(java.lang.String r6, java.lang.String r7, defpackage.s41 r8) {
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ak4
            if (r0 == 0) goto L13
            r0 = r8
            ak4 r0 = (defpackage.ak4) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ak4 r0 = new ak4
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L2a
            java.lang.String r7 = r0.R
            defpackage.oi2.Y(r8)
            goto L3e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r4
        L30:
            defpackage.oi2.Y(r8)
            r0.R = r7
            r0.Z = r3
            java.lang.Object r8 = r5.a(r6, r7, r0)
            if (r8 != r1) goto L3e
            return r1
        L3e:
            vj4 r8 = (defpackage.vj4) r8
            if (r8 != 0) goto L43
            goto L54
        L43:
            long r5 = r8.b
            r0 = 0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 != 0) goto L4c
            goto L54
        L4c:
            java.lang.String r5 = r8.a
            boolean r5 = defpackage.nb3.k(r5, r7)
            if (r5 != 0) goto L55
        L54:
            return r4
        L55:
            return r8
    }

    public final java.lang.Object c(java.lang.String r14, java.lang.String r15, defpackage.vj4 r16, defpackage.s41 r17) {
            r13 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.bk4
            if (r1 == 0) goto L15
            r1 = r0
            bk4 r1 = (defpackage.bk4) r1
            int r2 = r1.g0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.g0 = r2
            goto L1a
        L15:
            bk4 r1 = new bk4
            r1.<init>(r13, r0)
        L1a:
            java.lang.Object r0 = r1.e0
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.g0
            jg7 r4 = defpackage.jg7.a
            r5 = 2
            r6 = 1
            r11 = 0
            if (r3 == 0) goto L4f
            if (r3 == r6) goto L3d
            if (r3 != r5) goto L36
            fb4 r13 = r1.Z
            defpackage.oi2.Y(r0)     // Catch: java.lang.Throwable -> L32
            goto Laf
        L32:
            r0 = move-exception
            r14 = r0
            goto Lc0
        L36:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r13)
            r13 = 0
            return r13
        L3d:
            int r14 = r1.d0
            fb4 r3 = r1.Z
            vj4 r6 = r1.Y
            java.lang.String r7 = r1.X
            java.lang.String r8 = r1.R
            defpackage.oi2.Y(r0)
            r0 = r8
            r8 = r14
            r14 = r0
            r0 = r7
            goto L6d
        L4f:
            defpackage.oi2.Y(r0)
            r1.R = r14
            r1.X = r15
            r3 = r16
            r1.Y = r3
            hb4 r7 = r13.b
            r1.Z = r7
            r8 = 0
            r1.d0 = r8
            r1.g0 = r6
            java.lang.Object r6 = r7.e(r1)
            if (r6 != r2) goto L6a
            goto Lad
        L6a:
            r0 = r15
            r6 = r3
            r3 = r7
        L6d:
            wi r13 = r13.a     // Catch: java.lang.Throwable -> Lba
            r6.getClass()     // Catch: java.lang.Throwable -> Lbd
            p45 r7 = defpackage.pi4.a     // Catch: java.lang.Throwable -> Lbd
            uj4 r9 = defpackage.vj4.Companion     // Catch: java.lang.Throwable -> Lbd
            gg3 r9 = r9.serializer()     // Catch: java.lang.Throwable -> Lbd
            gg3 r9 = (defpackage.gg3) r9     // Catch: java.lang.Throwable -> Lbd
            byte[] r10 = r7.b(r9, r6)     // Catch: java.lang.Throwable -> Lbd
            r1.R = r11     // Catch: java.lang.Throwable -> Lba
            r1.X = r11     // Catch: java.lang.Throwable -> Lba
            r1.Y = r11     // Catch: java.lang.Throwable -> Lba
            r1.Z = r3     // Catch: java.lang.Throwable -> Lba
            r1.d0 = r8     // Catch: java.lang.Throwable -> Lba
            r1.g0 = r5     // Catch: java.lang.Throwable -> Lba
            kh r9 = r13.a     // Catch: java.lang.Throwable -> Lb5
            java.io.File r8 = r13.a(r14, r0)     // Catch: java.lang.Throwable -> Lb5
            r9.getClass()     // Catch: java.lang.Throwable -> Lb5
            xe1 r13 = defpackage.xk1.a     // Catch: java.lang.Throwable -> Lb5
            de1 r13 = defpackage.de1.L     // Catch: java.lang.Throwable -> Lb5
            ag r7 = new ag     // Catch: java.lang.Throwable -> Lb5
            r12 = 2
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r13 = defpackage.hv.d0(r13, r7, r1)     // Catch: java.lang.Throwable -> Lb5
            if (r13 != r2) goto La6
            goto La7
        La6:
            r13 = r4
        La7:
            if (r13 != r2) goto Laa
            goto Lab
        Laa:
            r13 = r4
        Lab:
            if (r13 != r2) goto Lae
        Lad:
            return r2
        Lae:
            r13 = r3
        Laf:
            r13.h(r11)
            return r4
        Lb3:
            r14 = r13
            goto Lb8
        Lb5:
            r0 = move-exception
            r13 = r0
            goto Lb3
        Lb8:
            r13 = r3
            goto Lc0
        Lba:
            r0 = move-exception
            r14 = r0
            goto Lb8
        Lbd:
            r0 = move-exception
            r13 = r0
            goto Lb3
        Lc0:
            r13.h(r11)
            throw r14
    }
}
