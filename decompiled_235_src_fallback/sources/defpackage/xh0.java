package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xh0  reason: default package */
/* loaded from: classes.dex */
public final class xh0 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ java.lang.Object Y;
    public final /* synthetic */ defpackage.dh5 Z;
    public final /* synthetic */ java.lang.String d0;

    public /* synthetic */ xh0(defpackage.dh5 r1, java.lang.String r2, defpackage.r41 r3, int r4) {
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
            lm4 r3 = (defpackage.lm4) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            xh0 r2 = (defpackage.xh0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            xh0 r2 = (defpackage.xh0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.X
            java.lang.String r1 = r3.d0
            dh5 r3 = r3.Z
            switch(r0) {
                case 0: goto L12;
                default: goto L9;
            }
        L9:
            xh0 r0 = new xh0
            r2 = 1
            r0.<init>(r3, r1, r4, r2)
            r0.Y = r5
            return r0
        L12:
            xh0 r0 = new xh0
            r2 = 0
            r0.<init>(r3, r1, r4, r2)
            r0.Y = r5
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.X
            r1 = 0
            dh5 r2 = r5.Z
            java.lang.String r3 = "CXCP"
            java.lang.String r4 = r5.d0
            switch(r0) {
                case 0: goto L32;
                default: goto Lc;
            }
        Lc:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r6)
            java.lang.Object r5 = r5.Y
            lm4 r5 = (defpackage.lm4) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "tryOpenCamera: "
            r6.<init>(r0)
            java.lang.String r0 = defpackage.xf0.b(r4)
            r6.append(r0)
            java.lang.String r0 = " opened"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r3, r6)
            r2.A = r1
            return r5
        L32:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r6)
            java.lang.Object r5 = r5.Y
            lm4 r5 = (defpackage.lm4) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "tryOpenCamera: openCamera() for "
            r6.<init>(r0)
            java.lang.String r0 = defpackage.xf0.b(r4)
            r6.append(r0)
            java.lang.String r0 = " returned"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r3, r6)
            r2.A = r1
            return r5
    }
}
