package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zw1  reason: default package */
/* loaded from: classes.dex */
public final class zw1 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.s9 Z;

    public /* synthetic */ zw1(defpackage.s9 r1, defpackage.r41 r2, int r3) {
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
            zw1 r2 = (defpackage.zw1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            zw1 r2 = (defpackage.zw1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            s9 r1 = r1.Z
            switch(r3) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            zw1 r3 = new zw1
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            zw1 r3 = new zw1
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.X
            jg7 r1 = defpackage.jg7.a
            s9 r2 = r8.Z
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L39;
                default: goto Ld;
            }
        Ld:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r8.Y
            if (r6 == 0) goto L1e
            if (r6 != r4) goto L19
            defpackage.oi2.Y(r9)
            goto L38
        L19:
            defpackage.i.m(r3)
            r1 = r5
            goto L38
        L1e:
            defpackage.oi2.Y(r9)
            java.lang.Object r9 = r2.a
            jq r9 = (defpackage.jq) r9
            ku3 r9 = r9.A
            tt3 r3 = defpackage.tt3.CREATED
            zw1 r6 = new zw1
            r7 = 0
            r6.<init>(r2, r5, r7)
            r8.Y = r4
            java.lang.Object r8 = defpackage.np2.c0(r9, r3, r6, r8)
            if (r8 != r0) goto L38
            r1 = r0
        L38:
            return r1
        L39:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r8.Y
            if (r6 == 0) goto L4a
            if (r6 != r4) goto L45
            defpackage.oi2.Y(r9)
            goto L64
        L45:
            defpackage.i.m(r3)
            r1 = r5
            goto L64
        L4a:
            defpackage.oi2.Y(r9)
            vw1 r9 = r2.A()
            be5 r9 = r9.e
            y6 r3 = new y6
            r5 = 6
            r3.<init>(r2, r5)
            r8.Y = r4
            kf6 r9 = r9.A
            java.lang.Object r8 = r9.b(r3, r8)
            if (r8 != r0) goto L64
            r1 = r0
        L64:
            return r1
    }
}
