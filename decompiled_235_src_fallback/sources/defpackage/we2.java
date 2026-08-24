package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: we2  reason: default package */
/* loaded from: classes.dex */
public final class we2 extends defpackage.hw6 implements defpackage.qn2 {
    public final /* synthetic */ long X;

    public we2(long r1, defpackage.r41 r3) {
            r0 = this;
            r0.X = r1
            r1 = 1
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r4) {
            r3 = this;
            r41 r4 = (defpackage.r41) r4
            we2 r0 = new we2
            long r1 = r3.X
            r0.<init>(r1, r4)
            jg7 r3 = defpackage.jg7.a
            r0.s(r3)
            r3 = 0
            throw r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r4) {
            r3 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r4)
            c67 r4 = new c67
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Timed out waiting for "
            r0.<init>(r1)
            long r1 = r3.X
            java.lang.String r3 = defpackage.oq1.l(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 0
            r4.<init>(r3, r0)
            throw r4
    }
}
