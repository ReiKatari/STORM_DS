package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g32  reason: default package */
/* loaded from: classes.dex */
public final class g32 extends defpackage.hw6 implements defpackage.fo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ defpackage.vr4 Z;
    public final /* synthetic */ defpackage.sz1 d0;

    public /* synthetic */ g32(int r1, defpackage.r41 r2, defpackage.sz1 r3) {
            r0 = this;
            r0.X = r1
            r0.d0 = r3
            r1 = 3
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            sz1 r2 = r2.d0
            vr4 r3 = (defpackage.vr4) r3
            jg7 r4 = (defpackage.jg7) r4
            r41 r5 = (defpackage.r41) r5
            switch(r0) {
                case 0: goto L1c;
                default: goto Lf;
            }
        Lf:
            g32 r4 = new g32
            r0 = 1
            r4.<init>(r0, r5, r2)
            r4.Z = r3
            java.lang.Object r2 = r4.s(r1)
            return r2
        L1c:
            g32 r4 = new g32
            r0 = 0
            r4.<init>(r0, r5, r2)
            r4.Z = r3
            java.lang.Object r2 = r4.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.X
            sz1 r1 = r7.d0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L43;
                default: goto Lb;
            }
        Lb:
            vr4 r0 = r7.Z
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r7.Y
            if (r6 == 0) goto L1d
            if (r6 != r3) goto L19
            defpackage.oi2.Y(r8)
            goto L3f
        L19:
            defpackage.i.m(r2)
            goto L42
        L1d:
            defpackage.oi2.Y(r8)
            if (r0 == 0) goto L27
            java.lang.Object r8 = r0.B
            ff7 r8 = (defpackage.ff7) r8
            goto L28
        L27:
            r8 = r4
        L28:
            if (r8 != 0) goto L2d
            t26 r4 = defpackage.t26.c
            goto L42
        L2d:
            z66 r8 = r8.b
            java.util.UUID r0 = r8.a
            me.magnum.melonds.domain.model.layout.BackgroundMode r8 = r8.b
            r7.Z = r4
            r7.Y = r3
            java.lang.Object r8 = defpackage.sz1.G(r1, r0, r8, r7)
            if (r8 != r5) goto L3f
            r4 = r5
            goto L42
        L3f:
            r4 = r8
            t26 r4 = (defpackage.t26) r4
        L42:
            return r4
        L43:
            vr4 r0 = r7.Z
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r7.Y
            if (r6 == 0) goto L55
            if (r6 != r3) goto L51
            defpackage.oi2.Y(r8)
            goto L77
        L51:
            defpackage.i.m(r2)
            goto L7a
        L55:
            defpackage.oi2.Y(r8)
            if (r0 == 0) goto L5f
            java.lang.Object r8 = r0.B
            ff7 r8 = (defpackage.ff7) r8
            goto L60
        L5f:
            r8 = r4
        L60:
            if (r8 != 0) goto L65
            t26 r4 = defpackage.t26.c
            goto L7a
        L65:
            z66 r8 = r8.a
            java.util.UUID r0 = r8.a
            me.magnum.melonds.domain.model.layout.BackgroundMode r8 = r8.b
            r7.Z = r4
            r7.Y = r3
            java.lang.Object r8 = defpackage.sz1.G(r1, r0, r8, r7)
            if (r8 != r5) goto L77
            r4 = r5
            goto L7a
        L77:
            r4 = r8
            t26 r4 = (defpackage.t26) r4
        L7a:
            return r4
    }
}
