package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sa1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sa1 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.pr3 B;

    public /* synthetic */ sa1(defpackage.pr3 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r5 = this;
            int r0 = r5.A
            pr3 r5 = r5.B
            switch(r0) {
                case 0: goto L12;
                default: goto L7;
            }
        L7:
            jr3 r5 = r5.j()
            int r5 = r5.n
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L12:
            jr3 r5 = r5.j()
            java.util.List r0 = r5.k
            int r1 = r5.n
            if (r1 != 0) goto L1d
            goto L44
        L1d:
            java.lang.Object r2 = defpackage.gt0.H0(r0)
            kr3 r2 = (defpackage.kr3) r2
            java.lang.Object r0 = defpackage.gt0.Q0(r0)
            kr3 r0 = (defpackage.kr3) r0
            int r3 = r5.m
            int r5 = r5.l
            int r3 = r3 + r5
            int r5 = r2.a
            r4 = 1
            if (r5 != 0) goto L45
            int r5 = r2.l
            if (r5 != 0) goto L45
            int r5 = r0.a
            int r5 = r5 + r4
            if (r5 != r1) goto L45
            int r5 = r0.l
            int r0 = r0.m
            int r5 = r5 + r0
            if (r5 <= r3) goto L44
            goto L45
        L44:
            r4 = 0
        L45:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
    }
}
