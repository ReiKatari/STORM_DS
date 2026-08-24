package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mc7  reason: default package */
/* loaded from: classes.dex */
public final class mc7 extends defpackage.hw6 implements defpackage.eo2 {
    public defpackage.ci4[] X;
    public defpackage.nc7 Y;
    public defpackage.d97 Z;
    public int d0;
    public int e0;
    public int f0;
    public int g0;
    public final /* synthetic */ defpackage.ci4[] h0;
    public final /* synthetic */ defpackage.nc7 i0;
    public final /* synthetic */ defpackage.d97 j0;

    public mc7(defpackage.ci4[] r1, defpackage.nc7 r2, defpackage.d97 r3, defpackage.r41 r4) {
            r0 = this;
            r0.h0 = r1
            r0.i0 = r2
            r0.j0 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            bt4 r1 = (defpackage.bt4) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            mc7 r0 = (defpackage.mc7) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            mc7 r4 = new mc7
            nc7 r0 = r2.i0
            d97 r1 = r2.j0
            ci4[] r2 = r2.h0
            r4.<init>(r2, r0, r1, r3)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r13) {
            r12 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r12.g0
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto Ld
            if (r1 != r3) goto L1d
        Ld:
            int r1 = r12.f0
            int r5 = r12.e0
            int r6 = r12.d0
            d97 r7 = r12.Z
            nc7 r8 = r12.Y
            ci4[] r9 = r12.X
            defpackage.oi2.Y(r13)
            goto L5c
        L1d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            return r2
        L23:
            defpackage.oi2.Y(r13)
            ci4[] r13 = r12.h0
            int r1 = r13.length
            r5 = 0
            nc7 r6 = r12.i0
            d97 r7 = r12.j0
            r9 = r13
            r13 = r5
            r8 = r6
        L31:
            if (r5 >= r1) goto L7a
            r6 = r9[r5]
            int r10 = r13 + 1
            int[] r11 = defpackage.lc7.a
            int r6 = r6.ordinal()
            r6 = r11[r6]
            if (r6 == r4) goto L77
            if (r6 == r3) goto L62
            r11 = 3
            if (r6 != r11) goto L5e
            r12.X = r9
            r12.Y = r8
            r12.Z = r7
            r12.d0 = r10
            r12.e0 = r5
            r12.f0 = r1
            r12.g0 = r3
            java.lang.Object r13 = defpackage.nc7.d(r8, r7, r13, r12)
            if (r13 != r0) goto L5b
            goto L76
        L5b:
            r6 = r10
        L5c:
            r13 = r6
            goto L78
        L5e:
            defpackage.i.d()
            return r2
        L62:
            r12.X = r9
            r12.Y = r8
            r12.Z = r7
            r12.d0 = r10
            r12.e0 = r5
            r12.f0 = r1
            r12.g0 = r4
            java.lang.Object r13 = defpackage.nc7.c(r8, r7, r13, r12)
            if (r13 != r0) goto L5b
        L76:
            return r0
        L77:
            r13 = r10
        L78:
            int r5 = r5 + r4
            goto L31
        L7a:
            jg7 r12 = defpackage.jg7.a
            return r12
    }
}
