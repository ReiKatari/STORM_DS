package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yg0  reason: default package */
/* loaded from: classes.dex */
public final class yg0 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.zg0 Z;

    public /* synthetic */ yg0(defpackage.zg0 r1, defpackage.r41 r2, int r3) {
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
            yg0 r2 = (defpackage.yg0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            yg0 r2 = (defpackage.yg0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            zg0 r1 = r1.Z
            switch(r3) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            yg0 r3 = new yg0
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            yg0 r3 = new yg0
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.X
            zg0 r1 = r6.Z
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L31;
                default: goto Lb;
            }
        Lb:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r6.Y
            if (r5 == 0) goto L1c
            if (r5 != r3) goto L17
            defpackage.oi2.Y(r7)
            goto L30
        L17:
            defpackage.i.m(r2)
            r7 = r4
            goto L30
        L1c:
            defpackage.oi2.Y(r7)
            yg0 r7 = new yg0
            r2 = 0
            r7.<init>(r1, r4, r2)
            r6.Y = r3
            r1 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r7 = defpackage.xk2.N(r1, r7, r6)
            if (r7 != r0) goto L30
            r7 = r0
        L30:
            return r7
        L31:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r6.Y
            if (r5 == 0) goto L41
            if (r5 != r3) goto L3d
            defpackage.oi2.Y(r7)
            goto L57
        L3d:
            defpackage.i.m(r2)
            goto L59
        L41:
            defpackage.oi2.Y(r7)
            java.lang.String r7 = "CXCP"
            java.lang.String r2 = "Cancelling CameraPipe root Job..."
            android.util.Log.d(r7, r2)
            rc3 r7 = r1.a
            r6.Y = r3
            java.lang.Object r6 = defpackage.yh2.n(r7, r6)
            if (r6 != r0) goto L57
            r4 = r0
            goto L59
        L57:
            jg7 r4 = defpackage.jg7.a
        L59:
            return r4
    }
}
