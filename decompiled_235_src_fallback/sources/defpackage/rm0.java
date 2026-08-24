package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rm0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rm0 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.vm0 B;
    public final /* synthetic */ java.util.ArrayList L;

    public /* synthetic */ rm0(defpackage.vm0 r1, java.util.ArrayList r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.A
            java.util.ArrayList r1 = r5.L
            vm0 r5 = r5.B
            e36 r6 = (defpackage.e36) r6
            switch(r0) {
                case 0: goto L41;
                default: goto Lb;
            }
        Lb:
            r6.getClass()
            um0 r5 = r5.d
            java.lang.String r0 = "UPDATE OR ABORT `cheat` SET `id` = ?,`enabled` = ? WHERE `id` = ?"
            j36 r0 = r6.i0(r0)
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            r3 = 0
        L1b:
            if (r3 >= r2) goto L34
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L32
            int r3 = r3 + 1
            if (r4 == 0) goto L1b
            r5.i(r0, r4)     // Catch: java.lang.Throwable -> L32
            r0.f0()     // Catch: java.lang.Throwable -> L32
            r0.reset()     // Catch: java.lang.Throwable -> L32
            defpackage.oi2.D(r6)     // Catch: java.lang.Throwable -> L32
            goto L1b
        L32:
            r5 = move-exception
            goto L3b
        L34:
            r5 = 0
            defpackage.lb4.p(r0, r5)
            jg7 r5 = defpackage.jg7.a
            return r5
        L3b:
            throw r5     // Catch: java.lang.Throwable -> L3c
        L3c:
            r6 = move-exception
            defpackage.lb4.p(r0, r5)
            throw r6
        L41:
            r6.getClass()
            tm0 r5 = r5.c
            java.util.List r5 = r5.a0(r6, r1)
            return r5
    }
}
