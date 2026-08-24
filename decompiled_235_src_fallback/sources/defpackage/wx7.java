package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wx7  reason: default package */
/* loaded from: classes.dex */
public final class wx7 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.xx7 Z;

    public /* synthetic */ wx7(defpackage.xx7 r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.Z = r1
            r1 = 2
            r0.<init>(r1, r2)
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
            wx7 r2 = (defpackage.wx7) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            wx7 r2 = (defpackage.wx7) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            xx7 r1 = r1.Z
            switch(r3) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            wx7 r3 = new wx7
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            wx7 r3 = new wx7
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.X
            xx7 r1 = r7.Z
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            jg7 r5 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L33;
                default: goto Ld;
            }
        Ld:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r7.Y
            if (r6 == 0) goto L1e
            if (r6 != r4) goto L1a
            defpackage.oi2.Y(r8)
        L18:
            r2 = r5
            goto L32
        L1a:
            defpackage.i.m(r3)
            goto L32
        L1e:
            defpackage.oi2.Y(r8)
            te r8 = r1.A
            r7.Y = r4
            qf r8 = r8.z0
            java.lang.Object r7 = r8.a(r7)
            if (r7 != r0) goto L2e
            goto L2f
        L2e:
            r7 = r5
        L2f:
            if (r7 != r0) goto L18
            r2 = r0
        L32:
            return r2
        L33:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r7.Y
            if (r6 == 0) goto L44
            if (r6 != r4) goto L40
            defpackage.oi2.Y(r8)
        L3e:
            r2 = r5
            goto L58
        L40:
            defpackage.i.m(r3)
            goto L58
        L44:
            defpackage.oi2.Y(r8)
            te r8 = r1.A
            r7.Y = r4
            ze r8 = r8.y0
            java.lang.Object r7 = r8.l(r7)
            if (r7 != r0) goto L54
            goto L55
        L54:
            r7 = r5
        L55:
            if (r7 != r0) goto L3e
            r2 = r0
        L58:
            return r2
    }
}
