package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mn2  reason: default package */
/* loaded from: classes.dex */
public final class mn2 extends defpackage.p0 {
    public final android.view.WindowManager i0;
    public final android.view.WindowManager.LayoutParams j0;
    public defpackage.on2 k0;
    public boolean l0;
    public final defpackage.vs4 m0;

    public mn2(android.view.View r3, boolean r4, java.util.UUID r5) {
            r2 = this;
            r3.getClass()
            android.content.Context r0 = r3.getContext()
            r0.getClass()
            r1 = 0
            r2.<init>(r0, r1)
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            r0.getClass()
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            r2.i0 = r0
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            r1 = 512(0x200, float:7.17E-43)
            r0.flags = r1
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.type = r1
            if (r4 == 0) goto L32
            r4 = 2132017472(0x7f140140, float:1.9673223E38)
            goto L35
        L32:
            r4 = 2132017471(0x7f14013f, float:1.9673221E38)
        L35:
            r0.windowAnimations = r4
            android.os.IBinder r4 = r3.getApplicationWindowToken()
            r0.token = r4
            r4 = -1
            r0.width = r4
            r0.height = r4
            r4 = -3
            r0.format = r4
            r2.j0 = r0
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            r2.setId(r4)
            hu3 r4 = defpackage.bl2.B(r3)
            r0 = 2131428076(0x7f0b02ec, float:1.8477786E38)
            r2.setTag(r0, r4)
            bp7 r4 = defpackage.ln2.r(r3)
            r0 = 2131428080(0x7f0b02f0, float:1.8477794E38)
            r2.setTag(r0, r4)
            g56 r3 = defpackage.kn2.C(r3)
            r4 = 2131428079(0x7f0b02ef, float:1.8477792E38)
            r2.setTag(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "CustomLayout:"
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r4 = 2131427507(0x7f0b00b3, float:1.8476632E38)
            r2.setTag(r4, r3)
            zv0 r3 = defpackage.f04.k
            vs4 r3 = defpackage.np2.Y(r3)
            r2.m0 = r3
            return
    }

    @Override // defpackage.p0
    public final void a(defpackage.px0 r6, int r7) {
            r5 = this;
            xq2 r6 = (defpackage.xq2) r6
            r0 = -266009091(0xfffffffff02505fd, float:-2.0428906E29)
            r6.d0(r0)
            boolean r0 = r6.h(r5)
            r1 = 2
            if (r0 == 0) goto L11
            r0 = 4
            goto L12
        L11:
            r0 = r1
        L12:
            r0 = r0 | r7
            r2 = r0 & 3
            r3 = 0
            r4 = 1
            if (r2 == r1) goto L1b
            r1 = r4
            goto L1c
        L1b:
            r1 = r3
        L1c:
            r0 = r0 & r4
            boolean r0 = r6.S(r0, r1)
            if (r0 == 0) goto L33
            vs4 r0 = r5.m0
            java.lang.Object r0 = r0.getValue()
            eo2 r0 = (defpackage.eo2) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.o(r6, r1)
            goto L36
        L33:
            r6.V()
        L36:
            cf5 r6 = r6.t()
            if (r6 == 0) goto L45
            z5 r0 = new z5
            r1 = 11
            r0.<init>(r5, r7, r1)
            r6.d = r0
        L45:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            if (r3 == 0) goto La
            int r0 = r3.getKeyCode()
            r1 = 4
            if (r0 != r1) goto La
            goto L14
        La:
            if (r3 == 0) goto L1d
            int r0 = r3.getKeyCode()
            r1 = 111(0x6f, float:1.56E-43)
            if (r0 != r1) goto L1d
        L14:
            on2 r2 = r2.k0
            if (r2 == 0) goto L1b
            r2.c()
        L1b:
            r2 = 1
            return r2
        L1d:
            boolean r2 = super.dispatchKeyEvent(r3)
            return r2
    }

    @Override // defpackage.p0
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
            r0 = this;
            boolean r0 = r0.l0
            return r0
    }
}
