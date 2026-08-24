package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ii5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ii5 implements defpackage.qr2 {
    public static final defpackage.ii5 a = null;
    private static final defpackage.wb6 descriptor = null;

    static {
            ii5 r0 = new ii5
            r0.<init>()
            defpackage.ii5.a = r0
            ly4 r1 = new ly4
            java.lang.String r2 = "me.magnum.melonds.github.dtos.ReleaseDto"
            r3 = 9
            r1.<init>(r2, r0, r3)
            java.lang.String r0 = "tag_name"
            r2 = 1
            r1.l(r0, r2)
            java.lang.String r0 = "name"
            r1.l(r0, r2)
            java.lang.String r0 = "body"
            r1.l(r0, r2)
            java.lang.String r0 = "created_at"
            r1.l(r0, r2)
            java.lang.String r0 = "published_at"
            r1.l(r0, r2)
            java.lang.String r0 = "html_url"
            r1.l(r0, r2)
            java.lang.String r0 = "draft"
            r1.l(r0, r2)
            java.lang.String r0 = "prerelease"
            r1.l(r0, r2)
            java.lang.String r0 = "assets"
            r1.l(r0, r2)
            defpackage.ii5.descriptor = r1
            return
    }

    @Override // defpackage.qr2
    public final defpackage.gg3[] b() {
            r4 = this;
            go3[] r4 = defpackage.ki5.j
            r0 = 9
            gg3[] r0 = new defpackage.gg3[r0]
            ps6 r1 = defpackage.ps6.a
            r2 = 0
            r0[r2] = r1
            r2 = 1
            r0[r2] = r1
            r2 = 2
            r0[r2] = r1
            r2 = 3
            gg3 r3 = defpackage.q60.I(r1)
            r0[r2] = r3
            r2 = 4
            gg3 r3 = defpackage.q60.I(r1)
            r0[r2] = r3
            r2 = 5
            r0[r2] = r1
            u50 r1 = defpackage.u50.a
            r2 = 6
            r0[r2] = r1
            r2 = 7
            r0[r2] = r1
            r1 = 8
            r4 = r4[r1]
            java.lang.Object r4 = r4.getValue()
            r0[r1] = r4
            return r0
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r18) {
            r17 = this;
            wb6 r0 = defpackage.ii5.descriptor
            r1 = r18
            ux0 r1 = r1.c(r0)
            go3[] r2 = defpackage.ki5.j
            r1.getClass()
            r5 = 0
            r8 = r5
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r6 = 1
            r7 = 0
            r14 = 0
            r15 = 0
        L18:
            if (r6 == 0) goto L8c
            int r4 = r1.q(r0)
            switch(r4) {
                case -1: goto L88;
                case 0: goto L7f;
                case 1: goto L77;
                case 2: goto L6f;
                case 3: goto L62;
                case 4: goto L55;
                case 5: goto L4d;
                case 6: goto L45;
                case 7: goto L3d;
                case 8: goto L27;
                default: goto L21;
            }
        L21:
            lg7 r0 = new lg7
            r0.<init>(r4)
            throw r0
        L27:
            r4 = 8
            r16 = r2[r4]
            java.lang.Object r16 = r16.getValue()
            r3 = r16
            gg3 r3 = (defpackage.gg3) r3
            java.lang.Object r3 = r1.G(r0, r4, r3, r5)
            r5 = r3
            java.util.List r5 = (java.util.List) r5
            r7 = r7 | 256(0x100, float:3.59E-43)
            goto L18
        L3d:
            r3 = 7
            boolean r15 = r1.W(r0, r3)
            r7 = r7 | 128(0x80, float:1.8E-43)
            goto L18
        L45:
            r3 = 6
            boolean r14 = r1.W(r0, r3)
            r7 = r7 | 64
            goto L18
        L4d:
            r3 = 5
            java.lang.String r13 = r1.A(r0, r3)
            r7 = r7 | 32
            goto L18
        L55:
            ps6 r3 = defpackage.ps6.a
            r4 = 4
            java.lang.Object r3 = r1.P(r0, r4, r3, r12)
            r12 = r3
            java.lang.String r12 = (java.lang.String) r12
            r7 = r7 | 16
            goto L18
        L62:
            r3 = 3
            ps6 r4 = defpackage.ps6.a
            java.lang.Object r3 = r1.P(r0, r3, r4, r11)
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11
            r7 = r7 | 8
            goto L18
        L6f:
            r3 = 2
            java.lang.String r10 = r1.A(r0, r3)
            r7 = r7 | 4
            goto L18
        L77:
            r3 = 1
            java.lang.String r9 = r1.A(r0, r3)
            r7 = r7 | 2
            goto L18
        L7f:
            r3 = 1
            r4 = 0
            java.lang.String r8 = r1.A(r0, r4)
            r7 = r7 | 1
            goto L18
        L88:
            r3 = 1
            r4 = 0
            r6 = r4
            goto L18
        L8c:
            r1.a(r0)
            ki5 r6 = new ki5
            r16 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r6
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r12, java.lang.Object r13) {
            r11 = this;
            ki5 r13 = (defpackage.ki5) r13
            r13.getClass()
            java.util.List r11 = r13.i
            boolean r0 = r13.h
            boolean r1 = r13.g
            java.lang.String r2 = r13.f
            java.lang.String r3 = r13.e
            java.lang.String r4 = r13.d
            java.lang.String r5 = r13.c
            java.lang.String r6 = r13.b
            java.lang.String r13 = r13.a
            wb6 r7 = defpackage.ii5.descriptor
            vx0 r12 = r12.c(r7)
            go3[] r8 = defpackage.ki5.j
            boolean r9 = r12.i(r7)
            java.lang.String r10 = ""
            if (r9 == 0) goto L28
            goto L2e
        L28:
            boolean r9 = defpackage.nb3.k(r13, r10)
            if (r9 != 0) goto L32
        L2e:
            r9 = 0
            r12.Q(r7, r9, r13)
        L32:
            boolean r13 = r12.i(r7)
            if (r13 == 0) goto L39
            goto L3f
        L39:
            boolean r13 = defpackage.nb3.k(r6, r10)
            if (r13 != 0) goto L43
        L3f:
            r13 = 1
            r12.Q(r7, r13, r6)
        L43:
            boolean r13 = r12.i(r7)
            if (r13 == 0) goto L4a
            goto L50
        L4a:
            boolean r13 = defpackage.nb3.k(r5, r10)
            if (r13 != 0) goto L54
        L50:
            r13 = 2
            r12.Q(r7, r13, r5)
        L54:
            boolean r13 = r12.i(r7)
            if (r13 == 0) goto L5b
            goto L5d
        L5b:
            if (r4 == 0) goto L63
        L5d:
            ps6 r13 = defpackage.ps6.a
            r5 = 3
            r12.V(r7, r5, r13, r4)
        L63:
            boolean r13 = r12.i(r7)
            if (r13 == 0) goto L6a
            goto L6c
        L6a:
            if (r3 == 0) goto L72
        L6c:
            ps6 r13 = defpackage.ps6.a
            r4 = 4
            r12.V(r7, r4, r13, r3)
        L72:
            boolean r13 = r12.i(r7)
            if (r13 == 0) goto L79
            goto L7f
        L79:
            boolean r13 = defpackage.nb3.k(r2, r10)
            if (r13 != 0) goto L83
        L7f:
            r13 = 5
            r12.Q(r7, r13, r2)
        L83:
            boolean r13 = r12.i(r7)
            if (r13 == 0) goto L8a
            goto L8c
        L8a:
            if (r1 == 0) goto L90
        L8c:
            r13 = 6
            r12.u(r7, r13, r1)
        L90:
            boolean r13 = r12.i(r7)
            if (r13 == 0) goto L97
            goto L99
        L97:
            if (r0 == 0) goto L9d
        L99:
            r13 = 7
            r12.u(r7, r13, r0)
        L9d:
            boolean r13 = r12.i(r7)
            if (r13 == 0) goto La4
            goto Lac
        La4:
            yt1 r13 = defpackage.yt1.A
            boolean r13 = defpackage.nb3.k(r11, r13)
            if (r13 != 0) goto Lb9
        Lac:
            r13 = 8
            r0 = r8[r13]
            java.lang.Object r0 = r0.getValue()
            gg3 r0 = (defpackage.gg3) r0
            r12.w(r7, r13, r0, r11)
        Lb9:
            r12.a(r7)
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            wb6 r0 = defpackage.ii5.descriptor
            return r0
    }
}
