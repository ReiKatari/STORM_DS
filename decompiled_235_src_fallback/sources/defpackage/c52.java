package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c52  reason: default package */
/* loaded from: classes.dex */
public final class c52 extends defpackage.aj3 implements defpackage.qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.o52 L;
    public final /* synthetic */ defpackage.z72 R;

    public /* synthetic */ c52(defpackage.o52 r1, defpackage.z72 r2, int r3) {
            r0 = this;
            r0.B = r3
            r0.L = r1
            r0.R = r2
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.B
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 1065353216(0x3f800000, float:1.0)
            o52 r6 = r7.L
            z72 r7 = r7.R
            switch(r0) {
                case 0: goto L92;
                case 1: goto L69;
                case 2: goto L3a;
                default: goto Lf;
            }
        Lf:
            z42 r8 = (defpackage.z42) r8
            int[] r0 = defpackage.e52.a
            int r8 = r8.ordinal()
            r8 = r0[r8]
            if (r8 == r4) goto L35
            r0 = 1064011039(0x3f6b851f, float:0.92)
            if (r8 == r3) goto L2e
            if (r8 != r2) goto L2a
            ha7 r7 = r7.a
            z56 r7 = r7.d
            if (r7 == 0) goto L35
        L28:
            r5 = r0
            goto L35
        L2a:
            defpackage.i.d()
            goto L39
        L2e:
            ha7 r7 = r6.a
            z56 r7 = r7.d
            if (r7 == 0) goto L35
            goto L28
        L35:
            java.lang.Float r1 = java.lang.Float.valueOf(r5)
        L39:
            return r1
        L3a:
            aa7 r8 = (defpackage.aa7) r8
            z42 r0 = defpackage.z42.PreEnter
            z42 r1 = defpackage.z42.Visible
            boolean r0 = r8.b(r0, r1)
            if (r0 == 0) goto L52
            ha7 r7 = r6.a
            z56 r7 = r7.d
            if (r7 == 0) goto L4f
            sc7 r7 = r7.b
            goto L68
        L4f:
            io6 r7 = defpackage.i52.b
            goto L68
        L52:
            z42 r0 = defpackage.z42.PostExit
            boolean r8 = r8.b(r1, r0)
            if (r8 == 0) goto L66
            ha7 r7 = r7.a
            z56 r7 = r7.d
            if (r7 == 0) goto L63
            sc7 r7 = r7.b
            goto L68
        L63:
            io6 r7 = defpackage.i52.b
            goto L68
        L66:
            io6 r7 = defpackage.i52.b
        L68:
            return r7
        L69:
            z42 r8 = (defpackage.z42) r8
            int[] r0 = defpackage.d52.a
            int r8 = r8.ordinal()
            r8 = r0[r8]
            if (r8 == r4) goto L8d
            r0 = 0
            if (r8 == r3) goto L86
            if (r8 != r2) goto L82
            ha7 r7 = r7.a
            i92 r7 = r7.a
            if (r7 == 0) goto L8d
        L80:
            r5 = r0
            goto L8d
        L82:
            defpackage.i.d()
            goto L91
        L86:
            ha7 r7 = r6.a
            i92 r7 = r7.a
            if (r7 == 0) goto L8d
            goto L80
        L8d:
            java.lang.Float r1 = java.lang.Float.valueOf(r5)
        L91:
            return r1
        L92:
            aa7 r8 = (defpackage.aa7) r8
            z42 r0 = defpackage.z42.PreEnter
            z42 r1 = defpackage.z42.Visible
            boolean r0 = r8.b(r0, r1)
            if (r0 == 0) goto Lab
            ha7 r7 = r6.a
            i92 r7 = r7.a
            if (r7 == 0) goto La8
            rc2 r7 = r7.a
            if (r7 != 0) goto Lc2
        La8:
            io6 r7 = defpackage.i52.b
            goto Lc2
        Lab:
            z42 r0 = defpackage.z42.PostExit
            boolean r8 = r8.b(r1, r0)
            if (r8 == 0) goto Lc0
            ha7 r7 = r7.a
            i92 r7 = r7.a
            if (r7 == 0) goto Lbd
            rc2 r7 = r7.a
            if (r7 != 0) goto Lc2
        Lbd:
            io6 r7 = defpackage.i52.b
            goto Lc2
        Lc0:
            io6 r7 = defpackage.i52.b
        Lc2:
            return r7
    }
}
