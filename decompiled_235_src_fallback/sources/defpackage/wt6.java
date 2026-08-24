package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wt6  reason: default package */
/* loaded from: classes.dex */
public final class wt6 implements defpackage.kf6 {
    public final defpackage.na4 A;
    public final defpackage.bf4 B;

    public wt6(defpackage.na4 r1, defpackage.bf4 r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // defpackage.le2
    public final java.lang.Object b(defpackage.ne2 r6, defpackage.r41 r7) {
            r5 = this;
            boolean r0 = r7 instanceof defpackage.vt6
            if (r0 == 0) goto L13
            r0 = r7
            vt6 r0 = (defpackage.vt6) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            vt6 r0 = new vt6
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 == r4) goto L2a
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r3
        L2a:
            defpackage.oi2.Y(r7)
            goto L43
        L2e:
            defpackage.oi2.Y(r7)
            ut6 r7 = new ut6
            bf4 r2 = r5.B
            r7.<init>(r6, r2)
            r0.Y = r4
            na4 r5 = r5.A
            java.lang.Object r5 = r5.b(r7, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            defpackage.e41.c()
            return r3
    }
}
