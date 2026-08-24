package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g53  reason: default package */
/* loaded from: classes.dex */
public final class g53 {
    public final defpackage.ua4 a;
    public final defpackage.vs4 b;
    public long c;
    public final defpackage.vs4 d;

    public g53() {
            r2 = this;
            r2.<init>()
            ua4 r0 = new ua4
            r1 = 16
            e53[] r1 = new defpackage.e53[r1]
            r0.<init>(r1)
            r2.a = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            vs4 r0 = defpackage.np2.Y(r0)
            r2.b = r0
            r0 = -9223372036854775808
            r2.c = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            vs4 r0 = defpackage.np2.Y(r0)
            r2.d = r0
            return
    }

    public final void a(defpackage.px0 r7, int r8) {
            r6 = this;
            xq2 r7 = (defpackage.xq2) r7
            r0 = -318043801(0xffffffffed0b0967, float:-2.6893614E27)
            r7.d0(r0)
            boolean r0 = r7.h(r6)
            r1 = 2
            if (r0 == 0) goto L11
            r0 = 4
            goto L12
        L11:
            r0 = r1
        L12:
            r0 = r0 | r8
            r2 = r0 & 3
            r3 = 1
            r4 = 0
            if (r2 == r1) goto L1b
            r1 = r3
            goto L1c
        L1b:
            r1 = r4
        L1c:
            r0 = r0 & r3
            boolean r0 = r7.S(r0, r1)
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r7.P()
            r1 = 0
            vs0 r2 = defpackage.ox0.a
            if (r0 != r2) goto L33
            vs4 r0 = defpackage.np2.Y(r1)
            r7.l0(r0)
        L33:
            qa4 r0 = (defpackage.qa4) r0
            vs4 r3 = r6.d
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L5c
            vs4 r3 = r6.b
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L52
            goto L5c
        L52:
            r0 = -143455237(0xfffffffff7730bfb, float:-4.9295747E33)
            r7.b0(r0)
            r7.p(r4)
            goto L82
        L5c:
            r3 = -144841960(0xfffffffff75de318, float:-4.5004047E33)
            r7.b0(r3)
            boolean r3 = r7.h(r6)
            java.lang.Object r5 = r7.P()
            if (r3 != 0) goto L6e
            if (r5 != r2) goto L76
        L6e:
            l5 r5 = new l5
            r5.<init>(r0, r6, r1)
            r7.l0(r5)
        L76:
            eo2 r5 = (defpackage.eo2) r5
            defpackage.mb3.i(r7, r5, r6)
            r7.p(r4)
            goto L82
        L7f:
            r7.V()
        L82:
            cf5 r7 = r7.t()
            if (r7 == 0) goto L91
            z5 r0 = new z5
            r1 = 13
            r0.<init>(r6, r8, r1)
            r7.d = r0
        L91:
            return
    }
}
