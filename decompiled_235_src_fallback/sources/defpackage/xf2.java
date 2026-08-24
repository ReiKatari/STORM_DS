package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xf2  reason: default package */
/* loaded from: classes.dex */
public final class xf2 implements defpackage.le2 {
    public final /* synthetic */ defpackage.le2 A;
    public final /* synthetic */ defpackage.le2 B;
    public final /* synthetic */ defpackage.fo2 L;

    public xf2(defpackage.le2 r1, defpackage.le2 r2, defpackage.fo2 r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            return
    }

    @Override // defpackage.le2
    public final java.lang.Object b(defpackage.ne2 r6, defpackage.r41 r7) {
            r5 = this;
            r0 = 2
            le2[] r0 = new defpackage.le2[r0]
            r1 = 0
            le2 r2 = r5.A
            r0[r1] = r2
            r1 = 1
            le2 r2 = r5.B
            r0[r1] = r2
            jz r1 = defpackage.jz.R
            o12 r2 = new o12
            r3 = 0
            r4 = 5
            fo2 r5 = r5.L
            r2.<init>(r5, r3, r4)
            java.lang.Object r5 = defpackage.nb3.o(r7, r6, r1, r2, r0)
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            if (r5 != r6) goto L21
            return r5
        L21:
            jg7 r5 = defpackage.jg7.a
            return r5
    }
}
