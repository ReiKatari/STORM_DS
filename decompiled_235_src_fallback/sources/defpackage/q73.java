package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q73  reason: default package */
/* loaded from: classes.dex */
public final class q73 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public final /* synthetic */ defpackage.le2 Y;
    public final /* synthetic */ defpackage.ah2 Z;

    public q73(defpackage.le2 r1, defpackage.ah2 r2, defpackage.r41 r3) {
            r0 = this;
            r0.Y = r1
            r0.Z = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            q73 r0 = (defpackage.q73) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            q73 r3 = new q73
            le2 r0 = r1.Y
            ah2 r1 = r1.Z
            r3.<init>(r0, r1, r2)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r5) {
            r4 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r4.X
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 != r2) goto Ld
            defpackage.oi2.Y(r5)
            goto L2b
        Ld:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L14:
            defpackage.oi2.Y(r5)
            y6 r5 = new y6
            ah2 r1 = r4.Z
            r3 = 10
            r5.<init>(r1, r3)
            r4.X = r2
            le2 r1 = r4.Y
            java.lang.Object r4 = r1.b(r5, r4)
            if (r4 != r0) goto L2b
            return r0
        L2b:
            jg7 r4 = defpackage.jg7.a
            return r4
    }
}
