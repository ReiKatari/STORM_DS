package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: an3  reason: default package */
/* loaded from: classes.dex */
public final class an3 implements defpackage.qt6 {
    public defpackage.kk3 A;
    public float B;
    public float L;
    public final /* synthetic */ defpackage.gn3 R;

    public an3(defpackage.gn3 r1) {
            r0 = this;
            r0.<init>()
            r0.R = r1
            kk3 r1 = defpackage.kk3.Rtl
            r0.A = r1
            return
    }

    @Override // defpackage.qh1
    public final float Y() {
            r0 = this;
            float r0 = r0.L
            return r0
    }

    @Override // defpackage.qh1
    public final float a() {
            r0 = this;
            float r0 = r0.B
            return r0
    }

    @Override // defpackage.eb3
    public final boolean a0() {
            r1 = this;
            gn3 r1 = r1.R
            sm3 r1 = r1.A
            wm3 r1 = r1.C0
            om3 r1 = r1.d
            om3 r0 = defpackage.om3.LookaheadLayingOut
            if (r1 == r0) goto L13
            om3 r0 = defpackage.om3.LookaheadMeasuring
            if (r1 != r0) goto L11
            goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    @Override // defpackage.eb3
    public final defpackage.kk3 getLayoutDirection() {
            r0 = this;
            kk3 r0 = r0.A
            return r0
    }

    @Override // defpackage.g34
    public final defpackage.f34 o0(int r10, int r11, java.util.Map r12, defpackage.qn2 r13, defpackage.qn2 r14) {
            r9 = this;
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r10 & r0
            if (r1 != 0) goto La
            r0 = r0 & r11
            if (r0 != 0) goto La
            goto L28
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Size("
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r1 = " x "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = ") is out of range. Each dimension must be between 0 and 16777215."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            defpackage.p53.c(r0)
        L28:
            zm3 r1 = new zm3
            gn3 r7 = r9.R
            r6 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
    }

    @Override // defpackage.qt6
    public final java.util.List v(defpackage.eo2 r10, java.lang.Object r11) {
            r9 = this;
            gn3 r9 = r9.R
            r9.h()
            sm3 r0 = r9.A
            wm3 r1 = r0.C0
            om3 r1 = r1.d
            om3 r2 = defpackage.om3.Measuring
            if (r1 == r2) goto L21
            om3 r3 = defpackage.om3.LayingOut
            if (r1 == r3) goto L21
            om3 r3 = defpackage.om3.LookaheadMeasuring
            if (r1 == r3) goto L21
            om3 r3 = defpackage.om3.LookaheadLayingOut
            if (r1 != r3) goto L1c
            goto L21
        L1c:
            java.lang.String r3 = "subcompose can only be used inside the measure or layout blocks"
            defpackage.p53.c(r3)
        L21:
            ja4 r3 = r9.Z
            java.lang.Object r4 = r3.g(r11)
            r5 = 0
            r6 = 1
            if (r4 != 0) goto L67
            ja4 r4 = r9.f0
            java.lang.Object r4 = r4.k(r11)
            sm3 r4 = (defpackage.sm3) r4
            if (r4 == 0) goto L4e
            ja4 r7 = r9.Y
            java.lang.Object r7 = r7.g(r4)
            ym3 r7 = (defpackage.ym3) r7
            int r7 = r9.k0
            if (r7 <= 0) goto L42
            goto L47
        L42:
            java.lang.String r7 = "Check failed."
            defpackage.p53.c(r7)
        L47:
            int r7 = r9.k0
            int r7 = r7 + (-1)
            r9.k0 = r7
            goto L64
        L4e:
            sm3 r4 = r9.n(r11)
            if (r4 != 0) goto L64
            int r4 = r9.R
            sm3 r7 = new sm3
            r8 = 2
            r7.<init>(r8)
            r0.m0 = r6
            r0.B(r4, r7)
            r0.m0 = r5
            r4 = r7
        L64:
            r3.m(r11, r4)
        L67:
            sm3 r4 = (defpackage.sm3) r4
            java.util.List r3 = r0.o()
            int r7 = r9.R
            java.lang.Object r3 = defpackage.gt0.K0(r7, r3)
            if (r3 == r4) goto La5
            java.util.List r0 = r0.o()
            aa4 r0 = (defpackage.aa4) r0
            java.lang.Object r0 = r0.B
            ua4 r0 = (defpackage.ua4) r0
            int r0 = r0.i(r4)
            int r3 = r9.R
            if (r0 < r3) goto L88
            goto L9e
        L88:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "Key \""
            r3.<init>(r7)
            r3.append(r11)
            java.lang.String r7 = "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            defpackage.p53.a(r3)
        L9e:
            int r3 = r9.R
            if (r3 == r0) goto La5
            r9.j(r0, r3)
        La5:
            int r0 = r9.R
            int r0 = r0 + r6
            r9.R = r0
            r9.m(r4, r11, r5, r10)
            if (r1 == r2) goto Lb9
            om3 r9 = defpackage.om3.LayingOut
            if (r1 != r9) goto Lb4
            goto Lb9
        Lb4:
            java.util.List r9 = r4.l()
            return r9
        Lb9:
            java.util.List r9 = r4.m()
            return r9
    }
}
