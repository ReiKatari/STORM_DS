package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ia1  reason: default package */
/* loaded from: classes.dex */
public final class ia1 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.la1 Z;
    public final /* synthetic */ android.net.Uri d0;

    public /* synthetic */ ia1(defpackage.la1 r1, android.net.Uri r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.Z = r1
            r0.d0 = r2
            r1 = 2
            r0.<init>(r1, r3)
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
            ia1 r2 = (defpackage.ia1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            ia1 r2 = (defpackage.ia1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.X
            android.net.Uri r0 = r2.d0
            la1 r2 = r2.Z
            switch(r4) {
                case 0: goto L10;
                default: goto L9;
            }
        L9:
            ia1 r4 = new ia1
            r1 = 1
            r4.<init>(r2, r0, r3, r1)
            return r4
        L10:
            ia1 r4 = new ia1
            r1 = 0
            r4.<init>(r2, r0, r3, r1)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.X
            jg7 r1 = defpackage.jg7.a
            android.net.Uri r2 = r10.d0
            la1 r3 = r10.Z
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            r6 = 0
            switch(r0) {
                case 0: goto L35;
                default: goto Lf;
            }
        Lf:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r10.Y
            if (r7 == 0) goto L20
            if (r7 != r5) goto L1b
            defpackage.oi2.Y(r11)
            goto L34
        L1b:
            defpackage.i.m(r4)
            r1 = r6
            goto L34
        L20:
            defpackage.oi2.Y(r11)
            xe1 r11 = defpackage.xk1.a
            ia1 r4 = new ia1
            r7 = 0
            r4.<init>(r3, r2, r6, r7)
            r10.Y = r5
            java.lang.Object r10 = defpackage.hv.d0(r11, r4, r10)
            if (r10 != r0) goto L34
            r1 = r0
        L34:
            return r1
        L35:
            fg r0 = r3.b
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            int r8 = r10.Y
            r9 = 2
            if (r8 == 0) goto L4f
            if (r8 == r5) goto L4b
            if (r8 != r9) goto L46
            defpackage.oi2.Y(r11)
            goto L6b
        L46:
            defpackage.i.m(r4)
            r1 = r6
            goto L8a
        L4b:
            defpackage.oi2.Y(r11)
            goto L5b
        L4f:
            defpackage.oi2.Y(r11)
            r10.Y = r5
            java.lang.Enum r11 = r0.f(r2, r10)
            if (r11 != r7) goto L5b
            goto L69
        L5b:
            t33 r11 = (defpackage.t33) r11
            t33 r2 = defpackage.t33.SUCCESS
            if (r11 != r2) goto L7b
            r10.Y = r9
            java.io.Serializable r11 = r0.h(r10)
            if (r11 != r7) goto L6b
        L69:
            r1 = r7
            goto L8a
        L6b:
            java.util.List r11 = (java.util.List) r11
            tp6 r10 = r3.g
            ea1 r0 = new ea1
            r0.<init>(r11)
            r10.getClass()
            r10.m(r6, r0)
            goto L80
        L7b:
            of6 r10 = r3.k
            r10.k(r11)
        L80:
            tp6 r10 = r3.i
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r10.getClass()
            r10.m(r6, r11)
        L8a:
            return r1
    }
}
