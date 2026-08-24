package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bu0  reason: default package */
/* loaded from: classes.dex */
public final class bu0 implements defpackage.ne2 {
    public final /* synthetic */ defpackage.v80 A;
    public final /* synthetic */ int B;

    public bu0(defpackage.v80 r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // defpackage.ne2
    public final java.lang.Object a(java.lang.Object r6, defpackage.r41 r7) {
            r5 = this;
            boolean r0 = r7 instanceof defpackage.au0
            if (r0 == 0) goto L13
            r0 = r7
            au0 r0 = (defpackage.au0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            au0 r0 = new au0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            defpackage.oi2.Y(r7)
            goto L53
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            r5 = 0
            return r5
        L31:
            defpackage.oi2.Y(r7)
            goto L4a
        L35:
            defpackage.oi2.Y(r7)
            j43 r7 = new j43
            int r2 = r5.B
            r7.<init>(r2, r6)
            r0.Y = r4
            v80 r5 = r5.A
            java.lang.Object r5 = r5.a(r0, r7)
            if (r5 != r1) goto L4a
            goto L52
        L4a:
            r0.Y = r3
            java.lang.Object r5 = defpackage.ps7.b(r0)
            if (r5 != r1) goto L53
        L52:
            return r1
        L53:
            jg7 r5 = defpackage.jg7.a
            return r5
    }
}
