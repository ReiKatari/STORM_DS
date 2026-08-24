package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m65  reason: default package */
/* loaded from: classes.dex */
public final class m65 extends defpackage.hw6 implements defpackage.qn2 {
    public int X;
    public final /* synthetic */ defpackage.n65 Y;
    public final /* synthetic */ float Z;

    public m65(defpackage.n65 r1, float r2, defpackage.r41 r3) {
            r0 = this;
            r0.Y = r1
            r0.Z = r2
            r1 = 1
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r3) {
            r2 = this;
            r41 r3 = (defpackage.r41) r3
            m65 r0 = new m65
            n65 r1 = r2.Y
            float r2 = r2.Z
            r0.<init>(r1, r2, r3)
            jg7 r2 = defpackage.jg7.a
            java.lang.Object r2 = r0.s(r2)
            return r2
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
            goto L35
        Ld:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r9)
            r9 = 0
            return r9
        L14:
            defpackage.oi2.Y(r10)
            n65 r10 = r9.Y
            rs4 r1 = r10.e
            float r3 = r1.h()
            z5 r6 = new z5
            r1 = 21
            r6.<init>(r10, r1)
            r9.X = r2
            float r4 = r9.Z
            r5 = 0
            r8 = 12
            r7 = r9
            java.lang.Object r9 = defpackage.kj2.l(r3, r4, r5, r6, r7, r8)
            if (r9 != r0) goto L35
            return r0
        L35:
            jg7 r9 = defpackage.jg7.a
            return r9
    }
}
