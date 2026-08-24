package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i76  reason: default package */
/* loaded from: classes.dex */
public final class i76 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public /* synthetic */ java.lang.Object Y;
    public final /* synthetic */ float Z;
    public final /* synthetic */ defpackage.to d0;
    public final /* synthetic */ defpackage.ah5 e0;

    public i76(float r1, defpackage.to r2, defpackage.ah5 r3, defpackage.r41 r4) {
            r0 = this;
            r0.Z = r1
            r0.d0 = r2
            r0.e0 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            p76 r1 = (defpackage.p76) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            i76 r0 = (defpackage.i76) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r4, java.lang.Object r5) {
            r3 = this;
            i76 r0 = new i76
            to r1 = r3.d0
            ah5 r2 = r3.e0
            float r3 = r3.Z
            r0.<init>(r3, r1, r2, r4)
            r0.Y = r5
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r10) {
            r9 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r9.X
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 != r2) goto Ld
            defpackage.oi2.Y(r10)
            goto L34
        Ld:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r9)
            r9 = 0
            return r9
        L14:
            defpackage.oi2.Y(r10)
            java.lang.Object r10 = r9.Y
            p76 r10 = (defpackage.p76) r10
            sa5 r6 = new sa5
            r1 = 8
            ah5 r3 = r9.e0
            r6.<init>(r1, r3, r10)
            r9.X = r2
            r3 = 0
            float r4 = r9.Z
            to r5 = r9.d0
            r8 = 4
            r7 = r9
            java.lang.Object r9 = defpackage.kj2.l(r3, r4, r5, r6, r7, r8)
            if (r9 != r0) goto L34
            return r0
        L34:
            jg7 r9 = defpackage.jg7.a
            return r9
    }
}
