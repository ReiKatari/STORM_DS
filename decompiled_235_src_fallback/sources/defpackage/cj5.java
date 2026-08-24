package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cj5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cj5 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;
    public final /* synthetic */ java.io.Serializable X;
    public final /* synthetic */ java.lang.Object Y;
    public final /* synthetic */ java.lang.Object Z;

    public /* synthetic */ cj5(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.io.Serializable r4, java.lang.Object r5, java.lang.Object r6, int r7) {
            r0 = this;
            r0.A = r7
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.X = r4
            r0.Y = r5
            r0.Z = r6
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r12 = this;
            int r0 = r12.A
            java.lang.Object r1 = r12.Z
            java.lang.Object r2 = r12.Y
            java.io.Serializable r3 = r12.X
            java.lang.Object r4 = r12.R
            java.lang.Object r5 = r12.L
            java.lang.Object r12 = r12.B
            switch(r0) {
                case 0: goto L2c;
                default: goto L11;
            }
        L11:
            r6 = r12
            dv6 r6 = (defpackage.dv6) r6
            r7 = r5
            bv6 r7 = (defpackage.bv6) r7
            r8 = r4
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r9 = r3
            java.util.LinkedHashMap r9 = (java.util.LinkedHashMap) r9
            r10 = r2
            java.util.List r10 = (java.util.List) r10
            r11 = r1
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            boolean r12 = r6.a(r7, r8, r9, r10, r11)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        L2c:
            n46 r12 = (defpackage.n46) r12
            j56 r5 = (defpackage.j56) r5
            q46 r4 = (defpackage.q46) r4
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            q46 r0 = r12.B
            r6 = 1
            if (r0 == r4) goto L3f
            r12.B = r4
            r0 = r6
            goto L40
        L3f:
            r0 = 0
        L40:
            java.lang.String r4 = r12.L
            boolean r4 = defpackage.nb3.k(r4, r3)
            if (r4 != 0) goto L4b
            r12.L = r3
            goto L4c
        L4b:
            r6 = r0
        L4c:
            r12.A = r5
            r12.R = r2
            r12.X = r1
            m44 r0 = r12.Y
            if (r0 == 0) goto L61
            if (r6 == 0) goto L61
            r0.I()
            r0 = 0
            r12.Y = r0
            r12.d()
        L61:
            jg7 r12 = defpackage.jg7.a
            return r12
    }
}
