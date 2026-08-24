package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zl0  reason: default package */
/* loaded from: classes.dex */
public final class zl0 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ defpackage.cm0 d0;
    public final /* synthetic */ defpackage.ne2 e0;

    public zl0(defpackage.cm0 r2, defpackage.ne2 r3, java.lang.Object r4, defpackage.r41 r5) {
            r1 = this;
            r0 = 0
            r1.X = r0
            r1.d0 = r2
            r1.e0 = r3
            r1.Z = r4
            r2 = 2
            r1.<init>(r2, r5)
            return
    }

    public zl0(defpackage.cm0 r2, defpackage.ne2 r3, defpackage.r41 r4) {
            r1 = this;
            r0 = 1
            r1.X = r0
            r1.d0 = r2
            r1.e0 = r3
            r2 = 2
            r1.<init>(r2, r4)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            zl0 r2 = (defpackage.zl0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            zl0 r2 = (defpackage.zl0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.X
            ne2 r1 = r3.e0
            cm0 r2 = r3.d0
            switch(r0) {
                case 0: goto L11;
                default: goto L9;
            }
        L9:
            zl0 r3 = new zl0
            r3.<init>(r2, r1, r4)
            r3.Z = r5
            return r3
        L11:
            zl0 r5 = new zl0
            java.lang.Object r3 = r3.Z
            r5.<init>(r2, r1, r3, r4)
            return r5
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.X
            jg7 r1 = defpackage.jg7.a
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            switch(r0) {
                case 0: goto L3f;
                default: goto Lb;
            }
        Lb:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r11.Y
            if (r5 == 0) goto L1c
            if (r5 != r4) goto L17
            defpackage.oi2.Y(r12)
            goto L3e
        L17:
            defpackage.i.m(r3)
            r1 = r2
            goto L3e
        L1c:
            defpackage.oi2.Y(r12)
            java.lang.Object r12 = r11.Z
            r7 = r12
            w61 r7 = (defpackage.w61) r7
            dh5 r6 = new dh5
            r6.<init>()
            cm0 r8 = r11.d0
            le2 r12 = r8.R
            bm0 r5 = new bm0
            ne2 r9 = r11.e0
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r11.Y = r4
            java.lang.Object r11 = r12.b(r5, r11)
            if (r11 != r0) goto L3e
            r1 = r0
        L3e:
            return r1
        L3f:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r11.Y
            if (r5 == 0) goto L50
            if (r5 != r4) goto L4b
            defpackage.oi2.Y(r12)
            goto L64
        L4b:
            defpackage.i.m(r3)
            r1 = r2
            goto L64
        L50:
            defpackage.oi2.Y(r12)
            cm0 r12 = r11.d0
            fo2 r12 = r12.X
            java.lang.Object r2 = r11.Z
            r11.Y = r4
            ne2 r3 = r11.e0
            java.lang.Object r11 = r12.e(r3, r2, r11)
            if (r11 != r0) goto L64
            r1 = r0
        L64:
            return r1
    }
}
