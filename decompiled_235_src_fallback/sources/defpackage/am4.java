package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: am4  reason: default package */
/* loaded from: classes.dex */
public final class am4 extends defpackage.aj3 implements defpackage.qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.vh2 L;
    public final /* synthetic */ defpackage.vh2 R;
    public final /* synthetic */ int X;
    public final /* synthetic */ defpackage.ln Y;
    public final /* synthetic */ java.lang.Object Z;

    public /* synthetic */ am4(defpackage.vh2 r1, defpackage.vh2 r2, java.lang.Object r3, int r4, defpackage.ln r5, int r6) {
            r0 = this;
            r0.B = r6
            r0.L = r1
            r0.R = r2
            r0.Z = r3
            r0.X = r4
            r0.Y = r5
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.B
            r1 = 0
            ln r2 = r6.Y
            int r3 = r6.X
            java.lang.Object r4 = r6.Z
            vh2 r5 = r6.R
            vh2 r6 = r6.L
            switch(r0) {
                case 0: goto L3b;
                default: goto L10;
            }
        L10:
            z30 r7 = (defpackage.z30) r7
            zp4 r0 = defpackage.nc1.g0(r5)
            te r0 = (defpackage.te) r0
            ah2 r0 = r0.getFocusOwner()
            eh2 r0 = (defpackage.eh2) r0
            vh2 r0 = r0.f()
            if (r6 == r0) goto L27
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L3a
        L27:
            of5 r4 = (defpackage.of5) r4
            boolean r6 = defpackage.uj2.b0(r3, r2, r5, r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            if (r6 != 0) goto L39
            boolean r6 = r7.a()
            if (r6 != 0) goto L3a
        L39:
            r1 = r0
        L3a:
            return r1
        L3b:
            z30 r7 = (defpackage.z30) r7
            zp4 r0 = defpackage.nc1.g0(r5)
            te r0 = (defpackage.te) r0
            ah2 r0 = r0.getFocusOwner()
            eh2 r0 = (defpackage.eh2) r0
            vh2 r0 = r0.f()
            if (r6 == r0) goto L52
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L65
        L52:
            vh2 r4 = (defpackage.vh2) r4
            boolean r6 = defpackage.ej2.T(r5, r4, r3, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            if (r6 != 0) goto L64
            boolean r6 = r7.a()
            if (r6 != 0) goto L65
        L64:
            r1 = r0
        L65:
            return r1
    }
}
