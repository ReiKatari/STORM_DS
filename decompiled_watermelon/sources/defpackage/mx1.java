package defpackage;

import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mx1  reason: default package */
/* loaded from: classes.dex */
public final class mx1 extends nk6 implements aj2 {
    public int X;
    public final /* synthetic */ hv1 Y;
    public final /* synthetic */ ConsoleType Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx1(hv1 hv1Var, ConsoleType consoleType, j11 j11Var) {
        super(2, j11Var);
        this.Y = hv1Var;
        this.Z = consoleType;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((mx1) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new mx1(this.Y, this.Z, j11Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006e, code lost:
        if (defpackage.hv1.i(r0, null, r10) == r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0087, code lost:
        if (r11 == r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
        return r3;
     */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r11) {
        /*
            r10 = this;
            hv1 r0 = r10.Y
            ee6 r1 = r0.p0
            g11 r2 = r0.z
            p31 r3 = defpackage.p31.COROUTINE_SUSPENDED
            int r4 = r10.X
            r5 = 3
            me.magnum.melonds.domain.model.ConsoleType r6 = r10.Z
            r7 = 2
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L24
            if (r4 == r8) goto L20
            if (r4 != r7) goto L1a
            defpackage.me2.a0(r11)
            goto L8a
        L1a:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r10)
            return r9
        L20:
            defpackage.me2.a0(r11)
            goto L71
        L24:
            defpackage.me2.a0(r11)
            wu1 r11 = new wu1
            r4 = 21
            r11.<init>(r4, r9, r0)
            defpackage.tq5.w(r2, r9, r9, r11, r5)
            wu1 r11 = new wu1
            r4 = 24
            r11.<init>(r4, r9, r0)
            defpackage.tq5.w(r2, r9, r9, r11, r5)
            wu1 r11 = new wu1
            r4 = 23
            r11.<init>(r4, r9, r0)
            defpackage.tq5.w(r2, r9, r9, r11, r5)
            wu1 r11 = new wu1
            r4 = 22
            r11.<init>(r4, r9, r0)
            defpackage.tq5.w(r2, r9, r9, r11, r5)
            ee6 r11 = r0.r0
            r11.k(r9)
            wu1 r11 = new wu1
            r4 = 19
            r11.<init>(r4, r9, r0)
            defpackage.tq5.w(r2, r9, r9, r11, r5)
            wu1 r11 = new wu1
            r4 = 18
            r11.<init>(r4, r9, r0)
            defpackage.tq5.w(r2, r9, r9, r11, r5)
            r10.X = r8
            java.lang.Object r11 = defpackage.hv1.i(r0, r9, r10)
            if (r11 != r3) goto L71
            goto L89
        L71:
            rs1 r11 = r0.v
            r10.X = r7
            xg r11 = (defpackage.xg) r11
            r11.getClass()
            bb1 r4 = defpackage.tg1.a
            ha1 r4 = defpackage.ha1.L
            og r7 = new og
            r7.<init>(r11, r6, r9)
            java.lang.Object r11 = defpackage.tq5.G(r4, r7, r10)
            if (r11 != r3) goto L8a
        L89:
            return r3
        L8a:
            j82 r11 = (defpackage.j82) r11
            boolean r10 = r11 instanceof defpackage.h82
            if (r10 == 0) goto La0
            mt1 r10 = new mt1
            h82 r11 = (defpackage.h82) r11
            me.magnum.melonds.MelonEmulator$a r11 = r11.a
            r10.<init>(r11)
            r1.getClass()
            r1.l(r9, r10)
            goto Lbb
        La0:
            i82 r10 = defpackage.i82.a
            boolean r10 = defpackage.b53.x(r11, r10)
            if (r10 == 0) goto Lbe
            rt1 r10 = new rt1
            r10.<init>(r6)
            r1.getClass()
            r1.l(r9, r10)
            ex1 r10 = new ex1
            r10.<init>(r8, r9, r0)
            defpackage.tq5.w(r2, r9, r9, r10, r5)
        Lbb:
            o27 r10 = defpackage.o27.a
            return r10
        Lbe:
            defpackage.i.c()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mx1.v(java.lang.Object):java.lang.Object");
    }
}
