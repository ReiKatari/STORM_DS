package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nv  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nv implements defpackage.qr2 {
    public static final defpackage.nv a = null;
    private static final defpackage.wb6 descriptor = null;

    static {
            nv r0 = new nv
            r0.<init>()
            defpackage.nv.a = r0
            ly4 r1 = new ly4
            java.lang.String r2 = "me.magnum.melonds.github.dtos.AssetDto"
            r3 = 5
            r1.<init>(r2, r0, r3)
            java.lang.String r0 = "id"
            r2 = 1
            r1.l(r0, r2)
            java.lang.String r0 = "browser_download_url"
            r1.l(r0, r2)
            java.lang.String r0 = "name"
            r1.l(r0, r2)
            java.lang.String r0 = "size"
            r1.l(r0, r2)
            java.lang.String r0 = "content_type"
            r1.l(r0, r2)
            defpackage.nv.descriptor = r1
            return
    }

    @Override // defpackage.qr2
    public final defpackage.gg3[] b() {
            r3 = this;
            r3 = 5
            gg3[] r3 = new defpackage.gg3[r3]
            fz3 r0 = defpackage.fz3.a
            r1 = 0
            r3[r1] = r0
            ps6 r1 = defpackage.ps6.a
            r2 = 1
            r3[r2] = r1
            r2 = 2
            r3[r2] = r1
            r2 = 3
            r3[r2] = r0
            r0 = 4
            r3[r0] = r1
            return r3
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r15) {
            r14 = this;
            wb6 r14 = defpackage.nv.descriptor
            ux0 r15 = r15.c(r14)
            r15.getClass()
            r0 = 1
            r1 = 0
            r2 = 0
            r4 = 0
            r6 = r1
            r7 = r2
            r11 = r7
            r9 = r4
            r10 = r9
            r13 = r10
            r2 = r0
        L15:
            if (r2 == 0) goto L56
            int r3 = r15.q(r14)
            r4 = -1
            if (r3 == r4) goto L54
            if (r3 == 0) goto L4d
            if (r3 == r0) goto L46
            r4 = 2
            if (r3 == r4) goto L3f
            r4 = 3
            if (r3 == r4) goto L38
            r4 = 4
            if (r3 != r4) goto L32
            java.lang.String r13 = r15.A(r14, r4)
            r6 = r6 | 16
            goto L15
        L32:
            lg7 r14 = new lg7
            r14.<init>(r3)
            throw r14
        L38:
            long r11 = r15.c0(r14, r4)
            r6 = r6 | 8
            goto L15
        L3f:
            java.lang.String r10 = r15.A(r14, r4)
            r6 = r6 | 4
            goto L15
        L46:
            java.lang.String r9 = r15.A(r14, r0)
            r6 = r6 | 2
            goto L15
        L4d:
            long r7 = r15.c0(r14, r1)
            r6 = r6 | 1
            goto L15
        L54:
            r2 = r1
            goto L15
        L56:
            r15.a(r14)
            pv r5 = new pv
            r5.<init>(r6, r7, r9, r10, r11, r13)
            return r5
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r10, java.lang.Object r11) {
            r9 = this;
            pv r11 = (defpackage.pv) r11
            r11.getClass()
            java.lang.String r9 = r11.e
            long r0 = r11.d
            java.lang.String r2 = r11.c
            java.lang.String r3 = r11.b
            long r4 = r11.a
            wb6 r11 = defpackage.nv.descriptor
            vx0 r10 = r10.c(r11)
            boolean r6 = r10.i(r11)
            r7 = 0
            if (r6 == 0) goto L1e
            goto L22
        L1e:
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 == 0) goto L26
        L22:
            r6 = 0
            r10.n(r11, r6, r4)
        L26:
            boolean r4 = r10.i(r11)
            java.lang.String r5 = ""
            if (r4 == 0) goto L2f
            goto L35
        L2f:
            boolean r4 = defpackage.nb3.k(r3, r5)
            if (r4 != 0) goto L39
        L35:
            r4 = 1
            r10.Q(r11, r4, r3)
        L39:
            boolean r3 = r10.i(r11)
            if (r3 == 0) goto L40
            goto L46
        L40:
            boolean r3 = defpackage.nb3.k(r2, r5)
            if (r3 != 0) goto L4a
        L46:
            r3 = 2
            r10.Q(r11, r3, r2)
        L4a:
            boolean r2 = r10.i(r11)
            if (r2 == 0) goto L51
            goto L55
        L51:
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L59
        L55:
            r2 = 3
            r10.n(r11, r2, r0)
        L59:
            boolean r0 = r10.i(r11)
            if (r0 == 0) goto L60
            goto L66
        L60:
            boolean r0 = defpackage.nb3.k(r9, r5)
            if (r0 != 0) goto L6a
        L66:
            r0 = 4
            r10.Q(r11, r0, r9)
        L6a:
            r10.a(r11)
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            wb6 r0 = defpackage.nv.descriptor
            return r0
    }
}
