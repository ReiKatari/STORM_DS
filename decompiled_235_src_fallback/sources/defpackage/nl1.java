package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nl1  reason: default package */
/* loaded from: classes.dex */
public final class nl1 implements defpackage.le2 {
    public final defpackage.le2 A;
    public final defpackage.qn2 B;

    public nl1(defpackage.le2 r1, defpackage.qn2 r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // defpackage.le2
    public final java.lang.Object b(defpackage.ne2 r3, defpackage.r41 r4) {
            r2 = this;
            dh5 r0 = new dh5
            r0.<init>()
            gr1 r1 = defpackage.fh4.a
            r0.A = r1
            vc r1 = new vc
            r1.<init>(r2, r0, r3)
            le2 r2 = r2.A
            java.lang.Object r2 = r2.b(r1, r4)
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            if (r2 != r3) goto L19
            return r2
        L19:
            jg7 r2 = defpackage.jg7.a
            return r2
    }
}
