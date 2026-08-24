package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dj1  reason: default package */
/* loaded from: classes.dex */
public final class dj1 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;

    public /* synthetic */ dj1(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.<init>()
            return
    }

    public dj1(defpackage.sb4 r2, defpackage.sn r3) {
            r1 = this;
            r0 = 2
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.B = r3
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
            int r0 = r5.A
            jg7 r1 = defpackage.jg7.a
            r2 = 0
            java.lang.Object r3 = r5.B
            r4 = 2
            java.lang.Object r5 = r5.L
            switch(r0) {
                case 0: goto L5e;
                case 1: goto L3c;
                default: goto Ld;
            }
        Ld:
            px0 r6 = (defpackage.px0) r6
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            sb4 r5 = (defpackage.sb4) r5
            r7 = r7 & 3
            if (r7 != r4) goto L29
            r7 = r6
            xq2 r7 = (defpackage.xq2) r7
            boolean r0 = r7.E()
            if (r0 != 0) goto L25
            goto L29
        L25:
            r7.V()
            goto L3b
        L29:
            ic4 r7 = r5.B
            r7.getClass()
            tw0 r7 = (defpackage.tw0) r7
            go2 r7 = r7.Y
            sn r3 = (defpackage.sn) r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r7.l(r3, r5, r6, r0)
        L3b:
            return r1
        L3c:
            px0 r6 = (defpackage.px0) r6
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r7 = r7 & 3
            if (r7 != r4) goto L56
            r7 = r6
            xq2 r7 = (defpackage.xq2) r7
            boolean r0 = r7.E()
            if (r0 != 0) goto L52
            goto L56
        L52:
            r7.V()
            goto L5d
        L56:
            o46 r3 = (defpackage.o46) r3
            zv0 r5 = (defpackage.zv0) r5
            defpackage.kn2.g(r3, r5, r6, r2)
        L5d:
            return r1
        L5e:
            px0 r6 = (defpackage.px0) r6
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r7 = r7 & 3
            if (r7 != r4) goto L78
            r7 = r6
            xq2 r7 = (defpackage.xq2) r7
            boolean r0 = r7.E()
            if (r0 != 0) goto L74
            goto L78
        L74:
            r7.V()
            goto L85
        L78:
            hj1 r3 = (defpackage.hj1) r3
            zv0 r7 = r3.Z
            sb4 r5 = (defpackage.sb4) r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r7.e(r5, r6, r0)
        L85:
            return r1
    }
}
