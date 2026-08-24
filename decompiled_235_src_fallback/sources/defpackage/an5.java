package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: an5  reason: default package */
/* loaded from: classes.dex */
public final class an5 extends defpackage.hw6 implements defpackage.qn2 {
    public int X;
    public final /* synthetic */ defpackage.bn5 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ java.util.ArrayList d0;

    public an5(defpackage.bn5 r1, long r2, java.util.ArrayList r4, defpackage.r41 r5) {
            r0 = this;
            r0.Y = r1
            r0.Z = r2
            r0.d0 = r4
            r1 = 1
            r0.<init>(r1, r5)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r7) {
            r6 = this;
            r5 = r7
            r41 r5 = (defpackage.r41) r5
            an5 r0 = new an5
            long r2 = r6.Z
            java.util.ArrayList r4 = r6.d0
            bn5 r1 = r6.Y
            r0.<init>(r1, r2, r4, r5)
            jg7 r6 = defpackage.jg7.a
            java.lang.Object r6 = r0.s(r6)
            return r6
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
            goto L26
        Ld:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L14:
            defpackage.oi2.Y(r5)
            r4.X = r2
            bn5 r5 = r4.Y
            long r1 = r4.Z
            java.util.ArrayList r3 = r4.d0
            java.lang.Object r4 = defpackage.vm5.J(r5, r1, r3, r4)
            if (r4 != r0) goto L26
            return r0
        L26:
            jg7 r4 = defpackage.jg7.a
            return r4
    }
}
