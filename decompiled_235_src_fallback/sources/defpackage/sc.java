package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sc  reason: default package */
/* loaded from: classes.dex */
public final class sc extends defpackage.hw6 implements defpackage.go2 {
    public int X;
    public /* synthetic */ defpackage.bd Y;
    public /* synthetic */ defpackage.s04 Z;
    public /* synthetic */ java.lang.Object d0;
    public final /* synthetic */ defpackage.dd e0;
    public final /* synthetic */ float f0;

    public sc(defpackage.dd r1, float r2, defpackage.r41 r3) {
            r0 = this;
            r0.e0 = r1
            r0.f0 = r2
            r1 = 4
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.go2
    public final java.lang.Object l(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r2 = this;
            bd r3 = (defpackage.bd) r3
            s04 r4 = (defpackage.s04) r4
            r41 r6 = (defpackage.r41) r6
            sc r0 = new sc
            dd r1 = r2.e0
            float r2 = r2.f0
            r0.<init>(r1, r2, r6)
            r0.Y = r3
            r0.Z = r4
            r0.d0 = r5
            jg7 r2 = defpackage.jg7.a
            java.lang.Object r2 = r0.s(r2)
            return r2
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r12) {
            r11 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r11.X
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 != r3) goto Le
            defpackage.oi2.Y(r12)
            goto L5c
        Le:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            return r2
        L14:
            defpackage.oi2.Y(r12)
            bd r12 = r11.Y
            s04 r1 = r11.Z
            java.lang.Object r4 = r11.d0
            float r6 = r1.c(r4)
            boolean r1 = java.lang.Float.isNaN(r6)
            if (r1 != 0) goto L5c
            ah5 r1 = new ah5
            r1.<init>()
            dd r4 = r11.e0
            rs4 r5 = r4.j
            float r5 = r5.h()
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L3c
            r5 = 0
            goto L42
        L3c:
            rs4 r5 = r4.j
            float r5 = r5.h()
        L42:
            r1.A = r5
            to r8 = r4.c
            ql1 r9 = new ql1
            r4 = 3
            r9.<init>(r4, r12, r1)
            r11.Y = r2
            r11.Z = r2
            r11.X = r3
            float r7 = r11.f0
            r10 = r11
            java.lang.Object r11 = defpackage.kj2.j(r5, r6, r7, r8, r9, r10)
            if (r11 != r0) goto L5c
            return r0
        L5c:
            jg7 r11 = defpackage.jg7.a
            return r11
    }
}
