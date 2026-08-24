package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ng2  reason: default package */
/* loaded from: classes.dex */
public final class ng2 implements defpackage.le2 {
    public final /* synthetic */ defpackage.le2 A;
    public final /* synthetic */ defpackage.m16 B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ defpackage.qn2 R;

    public ng2(defpackage.le2 r1, defpackage.m16 r2, boolean r3, defpackage.qn2 r4) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            return
    }

    @Override // defpackage.le2
    public final java.lang.Object b(defpackage.ne2 r5, defpackage.r41 r6) {
            r4 = this;
            mg2 r0 = new mg2
            boolean r1 = r4.L
            qn2 r2 = r4.R
            m16 r3 = r4.B
            r0.<init>(r5, r3, r1, r2)
            le2 r4 = r4.A
            java.lang.Object r4 = r4.b(r0, r6)
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            if (r4 != r5) goto L16
            return r4
        L16:
            jg7 r4 = defpackage.jg7.a
            return r4
    }
}
