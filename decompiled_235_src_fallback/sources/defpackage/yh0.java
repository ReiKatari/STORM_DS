package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yh0  reason: default package */
/* loaded from: classes.dex */
public final class yh0 extends defpackage.hw6 implements defpackage.qn2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ java.lang.Object Y;
    public final /* synthetic */ java.io.Serializable Z;
    public final /* synthetic */ java.lang.Object d0;

    public /* synthetic */ yh0(java.lang.Object r1, java.io.Serializable r2, java.lang.Object r3, defpackage.r41 r4, int r5) {
            r0 = this;
            r0.X = r5
            r0.Y = r1
            r0.Z = r2
            r0.d0 = r3
            r1 = 1
            r0.<init>(r1, r4)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.X
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r2 = r10.d0
            java.io.Serializable r3 = r10.Z
            java.lang.Object r10 = r10.Y
            switch(r0) {
                case 0: goto L24;
                default: goto Ld;
            }
        Ld:
            r8 = r11
            r41 r8 = (defpackage.r41) r8
            yh0 r4 = new yh0
            r5 = r10
            ft4 r5 = (defpackage.ft4) r5
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            r7 = r2
            qn2 r7 = (defpackage.qn2) r7
            r9 = 1
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r10 = r4.s(r1)
            return r10
        L24:
            r6 = r11
            r41 r6 = (defpackage.r41) r6
            r11 = r2
            yh0 r2 = new yh0
            dh5 r10 = (defpackage.dh5) r10
            r4 = r3
            dh5 r4 = (defpackage.dh5) r4
            r5 = r11
            vd r5 = (defpackage.vd) r5
            r7 = 0
            r3 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r10 = r2.s(r1)
            return r10
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.X
            r1 = 0
            java.lang.Object r2 = r4.d0
            java.io.Serializable r3 = r4.Z
            java.lang.Object r4 = r4.Y
            switch(r0) {
                case 0: goto L2c;
                default: goto Lc;
            }
        Lc:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r5)
            ft4 r4 = (defpackage.ft4) r4
            e36 r4 = r4.b
            java.lang.String r3 = (java.lang.String) r3
            j36 r4 = r4.i0(r3)
            qn2 r2 = (defpackage.qn2) r2
            java.lang.Object r5 = r2.g(r4)     // Catch: java.lang.Throwable -> L25
            defpackage.lb4.p(r4, r1)
            return r5
        L25:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L27
        L27:
            r0 = move-exception
            defpackage.lb4.p(r4, r5)
            throw r0
        L2c:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r5)
            java.lang.String r5 = "tryOpenCamera: 3000ms elapsed"
            java.lang.String r0 = "CXCP"
            android.util.Log.d(r0, r5)
            dh5 r4 = (defpackage.dh5) r4
            r4.A = r1
            dh5 r3 = (defpackage.dh5) r3
            java.lang.Object r4 = r3.A
            if (r4 == 0) goto L5a
            java.lang.String r4 = "tryOpenCamera: openCamera() timed out"
            android.util.Log.e(r0, r4)
            vd r2 = (defpackage.vd) r2
            r2.a()
            lm4 r4 = new lm4
            df0 r5 = new df0
            r0 = 13
            r5.<init>(r0)
            r0 = 1
            r4.<init>(r1, r5, r0)
            r1 = r4
        L5a:
            return r1
    }
}
