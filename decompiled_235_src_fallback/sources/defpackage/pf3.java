package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pf3  reason: default package */
/* loaded from: classes.dex */
public final class pf3 extends defpackage.dm5 implements defpackage.fo2 {
    public int L;
    public /* synthetic */ defpackage.ad1 R;
    public final /* synthetic */ defpackage.zb X;

    public pf3(defpackage.zb r1, defpackage.r41 r2) {
            r0 = this;
            r0.X = r1
            r1 = 3
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            ad1 r1 = (defpackage.ad1) r1
            jg7 r2 = (defpackage.jg7) r2
            r41 r3 = (defpackage.r41) r3
            pf3 r2 = new pf3
            zb r0 = r0.X
            r2.<init>(r0, r3)
            r2.R = r1
            jg7 r0 = defpackage.jg7.a
            java.lang.Object r0 = r2.s(r0)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            zb r0 = r8.X
            java.lang.Object r1 = r0.L
            u0 r1 = (defpackage.u0) r1
            ad1 r2 = r8.R
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r8.L
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L1c
            if (r4 != r6) goto L16
            defpackage.oi2.Y(r9)
            goto L40
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r5
        L1c:
            defpackage.oi2.Y(r9)
            byte r9 = r1.v()
            if (r9 != r6) goto L2a
            df3 r8 = r0.s(r6)
            return r8
        L2a:
            r4 = 0
            if (r9 != 0) goto L32
            df3 r8 = r0.s(r4)
            return r8
        L32:
            r7 = 6
            if (r9 != r7) goto L43
            r8.R = r5
            r8.L = r6
            java.lang.Object r9 = defpackage.zb.h(r0, r2, r8)
            if (r9 != r3) goto L40
            return r3
        L40:
            de3 r9 = (defpackage.de3) r9
            return r9
        L43:
            r8 = 8
            if (r9 != r8) goto L4c
            nd3 r8 = r0.r()
            return r8
        L4c:
            java.lang.String r8 = "Can't begin reading element, unexpected token"
            defpackage.u0.q(r1, r8, r4, r5, r7)
            throw r5
    }
}
