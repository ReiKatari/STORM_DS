package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jy0  reason: default package */
/* loaded from: classes.dex */
public final class jy0 extends defpackage.aj3 implements defpackage.eo2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.eo2 L;
    public final /* synthetic */ java.lang.Object R;
    public final /* synthetic */ java.lang.Object X;

    public jy0(defpackage.xx7 r2, defpackage.mx0 r3, defpackage.eo2 r4) {
            r1 = this;
            r0 = 1
            r1.B = r0
            r1.R = r2
            r1.X = r3
            r1.L = r4
            r2 = 2
            r1.<init>(r2)
            return
    }

    public jy0(defpackage.zp4 r1, defpackage.vm r2, defpackage.eo2 r3, int r4) {
            r0 = this;
            r4 = 0
            r0.B = r4
            r0.R = r1
            r0.X = r2
            r0.L = r3
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r10, java.lang.Object r11) {
            r9 = this;
            int r0 = r9.B
            jg7 r1 = defpackage.jg7.a
            eo2 r2 = r9.L
            java.lang.Object r3 = r9.X
            java.lang.Object r9 = r9.R
            r4 = 1
            switch(r0) {
                case 0: goto L6b;
                default: goto Le;
            }
        Le:
            px0 r10 = (defpackage.px0) r10
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            xx7 r9 = (defpackage.xx7) r9
            r0 = r11 & 3
            r5 = 2
            r6 = 0
            if (r0 == r5) goto L20
            r0 = r4
            goto L21
        L20:
            r0 = r6
        L21:
            r11 = r11 & r4
            xq2 r10 = (defpackage.xq2) r10
            boolean r11 = r10.S(r11, r0)
            if (r11 == 0) goto L67
            te r11 = r9.A
            boolean r0 = r10.h(r9)
            java.lang.Object r5 = r10.P()
            r7 = 0
            vs0 r8 = defpackage.ox0.a
            if (r0 != 0) goto L3b
            if (r5 != r8) goto L43
        L3b:
            wx7 r5 = new wx7
            r5.<init>(r9, r7, r6)
            r10.l0(r5)
        L43:
            eo2 r5 = (defpackage.eo2) r5
            defpackage.mb3.i(r10, r5, r11)
            boolean r0 = r10.h(r9)
            java.lang.Object r5 = r10.P()
            if (r0 != 0) goto L54
            if (r5 != r8) goto L5c
        L54:
            wx7 r5 = new wx7
            r5.<init>(r9, r7, r4)
            r10.l0(r5)
        L5c:
            eo2 r5 = (defpackage.eo2) r5
            defpackage.mb3.i(r10, r5, r11)
            mx0 r3 = (defpackage.mx0) r3
            r3.a(r11, r2, r10, r6)
            goto L6a
        L67:
            r10.V()
        L6a:
            return r1
        L6b:
            px0 r10 = (defpackage.px0) r10
            java.lang.Number r11 = (java.lang.Number) r11
            r11.intValue()
            zp4 r9 = (defpackage.zp4) r9
            vm r3 = (defpackage.vm) r3
            int r11 = defpackage.ii2.a0(r4)
            defpackage.ky0.a(r9, r3, r2, r10, r11)
            return r1
    }
}
