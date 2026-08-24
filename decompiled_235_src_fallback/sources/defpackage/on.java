package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: on  reason: default package */
/* loaded from: classes.dex */
public final class on extends defpackage.aj3 implements defpackage.eo2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.ga7 L;
    public final /* synthetic */ defpackage.qn2 R;
    public final /* synthetic */ defpackage.a74 X;
    public final /* synthetic */ defpackage.zv0 Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ java.lang.Object d0;
    public final /* synthetic */ java.lang.Object e0;

    public on(defpackage.ga7 r2, defpackage.a74 r3, defpackage.qn2 r4, defpackage.ic r5, defpackage.qn2 r6, defpackage.zv0 r7, int r8) {
            r1 = this;
            r0 = 0
            r1.B = r0
            r1.L = r2
            r1.X = r3
            r1.R = r4
            r1.e0 = r5
            r1.d0 = r6
            r1.Y = r7
            r1.Z = r8
            r2 = 2
            r1.<init>(r2)
            return
    }

    public on(defpackage.ga7 r2, defpackage.qn2 r3, defpackage.a74 r4, defpackage.o52 r5, defpackage.z72 r6, defpackage.zv0 r7, int r8) {
            r1 = this;
            r0 = 1
            r1.B = r0
            r1.L = r2
            r1.R = r3
            r1.X = r4
            r1.d0 = r5
            r1.e0 = r6
            r1.Y = r7
            r1.Z = r8
            r2 = 2
            r1.<init>(r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r23, java.lang.Object r24) {
            r22 = this;
            r0 = r22
            int r1 = r0.B
            jg7 r2 = defpackage.jg7.a
            int r3 = r0.Z
            java.lang.Object r4 = r0.e0
            java.lang.Object r5 = r0.d0
            switch(r1) {
                case 0: goto L32;
                default: goto Lf;
            }
        Lf:
            r12 = r23
            px0 r12 = (defpackage.px0) r12
            r1 = r24
            java.lang.Number r1 = (java.lang.Number) r1
            r1.intValue()
            r9 = r5
            o52 r9 = (defpackage.o52) r9
            r10 = r4
            z72 r10 = (defpackage.z72) r10
            r1 = r3 | 1
            int r13 = defpackage.ii2.a0(r1)
            ga7 r6 = r0.L
            qn2 r7 = r0.R
            a74 r8 = r0.X
            zv0 r11 = r0.Y
            defpackage.g04.g(r6, r7, r8, r9, r10, r11, r12, r13)
            return r2
        L32:
            r20 = r23
            px0 r20 = (defpackage.px0) r20
            r1 = r24
            java.lang.Number r1 = (java.lang.Number) r1
            r1.intValue()
            r17 = r4
            ic r17 = (defpackage.ic) r17
            r18 = r5
            qn2 r18 = (defpackage.qn2) r18
            r1 = r3 | 1
            int r21 = defpackage.ii2.a0(r1)
            ga7 r14 = r0.L
            a74 r15 = r0.X
            qn2 r1 = r0.R
            zv0 r0 = r0.Y
            r19 = r0
            r16 = r1
            defpackage.f04.b(r14, r15, r16, r17, r18, r19, r20, r21)
            return r2
    }
}
