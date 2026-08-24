package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gc0  reason: default package */
/* loaded from: classes.dex */
public final class gc0 implements defpackage.ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.kc0 B;

    public /* synthetic */ gc0(defpackage.kc0 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.ne2
    public final java.lang.Object a(java.lang.Object r5, defpackage.r41 r6) {
            r4 = this;
            int r6 = r4.A
            jg7 r0 = defpackage.jg7.a
            kc0 r4 = r4.B
            switch(r6) {
                case 0: goto L11;
                default: goto L9;
            }
        L9:
            jg7 r5 = (defpackage.jg7) r5
            fi0 r5 = defpackage.fi0.a
            defpackage.kc0.a(r4, r5)
            return r0
        L11:
            ii0 r5 = (defpackage.ii0) r5
            kf0 r6 = r4.d
            boolean r1 = r5 instanceof defpackage.ei0
            r2 = 0
            java.lang.String r3 = "Check failed."
            if (r1 == 0) goto L32
            r1 = r5
            ei0 r1 = (defpackage.ei0) r1
            java.lang.String r1 = r1.a
            java.lang.String r6 = r6.a
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L2d
            defpackage.kc0.a(r4, r5)
            goto L4b
        L2d:
            defpackage.i.m(r3)
        L30:
            r0 = r2
            goto L4b
        L32:
            boolean r1 = r5 instanceof defpackage.gi0
            if (r1 == 0) goto L4b
            r1 = r5
            gi0 r1 = (defpackage.gi0) r1
            java.lang.String r1 = r1.a
            java.lang.String r6 = r6.a
            boolean r6 = defpackage.nb3.k(r1, r6)
            if (r6 == 0) goto L47
            defpackage.kc0.a(r4, r5)
            goto L4b
        L47:
            defpackage.i.m(r3)
            goto L30
        L4b:
            return r0
    }
}
