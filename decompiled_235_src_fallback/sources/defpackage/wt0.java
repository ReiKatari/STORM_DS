package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wt0  reason: default package */
/* loaded from: classes.dex */
public abstract class wt0 {
    public static final defpackage.yt0 a = null;

    static {
            yt0 r0 = new yt0
            eu r1 = defpackage.ju.c
            c40 r2 = defpackage.d90.k0
            r0.<init>(r1, r2)
            defpackage.wt0.a = r0
            return
    }

    public static final defpackage.yt0 a(defpackage.iu r5, defpackage.c40 r6, defpackage.px0 r7, int r8) {
            eu r0 = defpackage.ju.c
            boolean r0 = r5.equals(r0)
            r1 = 0
            if (r0 == 0) goto L1f
            c40 r0 = defpackage.d90.k0
            boolean r0 = defpackage.nb3.k(r6, r0)
            if (r0 == 0) goto L1f
            xq2 r7 = (defpackage.xq2) r7
            r5 = -1446604504(0xffffffffa9c69128, float:-8.818147E-14)
            r7.b0(r5)
            r7.p(r1)
            yt0 r5 = defpackage.wt0.a
            return r5
        L1f:
            xq2 r7 = (defpackage.xq2) r7
            r0 = -1446550657(0xffffffffa9c7637f, float:-8.854635E-14)
            r7.b0(r0)
            r0 = r8 & 14
            r0 = r0 ^ 6
            r2 = 1
            r3 = 4
            if (r0 <= r3) goto L35
            boolean r0 = r7.f(r5)
            if (r0 != 0) goto L39
        L35:
            r0 = r8 & 6
            if (r0 != r3) goto L3b
        L39:
            r0 = r2
            goto L3c
        L3b:
            r0 = r1
        L3c:
            r3 = r8 & 112(0x70, float:1.57E-43)
            r3 = r3 ^ 48
            r4 = 32
            if (r3 <= r4) goto L4a
            boolean r3 = r7.f(r6)
            if (r3 != 0) goto L50
        L4a:
            r8 = r8 & 48
            if (r8 != r4) goto L4f
            goto L50
        L4f:
            r2 = r1
        L50:
            r8 = r0 | r2
            java.lang.Object r0 = r7.P()
            if (r8 != 0) goto L5c
            vs0 r8 = defpackage.ox0.a
            if (r0 != r8) goto L64
        L5c:
            yt0 r0 = new yt0
            r0.<init>(r5, r6)
            r7.l0(r0)
        L64:
            yt0 r0 = (defpackage.yt0) r0
            r7.p(r1)
            return r0
    }
}
