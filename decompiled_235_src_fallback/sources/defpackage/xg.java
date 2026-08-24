package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xg  reason: default package */
/* loaded from: classes.dex */
public final class xg extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ java.util.List Y;

    public /* synthetic */ xg(java.util.List r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.Y = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            xg r2 = (defpackage.xg) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            xg r2 = (defpackage.xg) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            switch(r3) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            xg r3 = new xg
            java.util.List r1 = r1.Y
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            xg r3 = new xg
            java.util.List r1 = r1.Y
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.X
            java.util.List r10 = r10.Y
            me.magnum.melonds.MelonEmulator r1 = me.magnum.melonds.MelonEmulator.a
            switch(r0) {
                case 0: goto L5d;
                default: goto L9;
            }
        L9:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r11)
            me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievement[] r11 = r1.getRuntimeAchievements()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.ht0.v0(r10, r1)
            r0.<init>(r1)
            java.util.Iterator r10 = r10.iterator()
        L21:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L5c
            java.lang.Object r1 = r10.next()
            eb5 r1 = (defpackage.eb5) r1
            int r2 = r11.length
            r3 = 0
            r4 = r3
        L30:
            if (r4 >= r2) goto L44
            r5 = r11[r4]
            long r6 = r5.getId()
            o75 r8 = r1.a
            long r8 = r8.a
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L41
            goto L45
        L41:
            int r4 = r4 + 1
            goto L30
        L44:
            r5 = 0
        L45:
            bb5 r2 = new bb5
            if (r5 == 0) goto L4e
            int r4 = r5.getValue()
            goto L4f
        L4e:
            r4 = r3
        L4f:
            if (r5 == 0) goto L55
            int r3 = r5.getTarget()
        L55:
            r2.<init>(r1, r4, r3)
            r0.add(r2)
            goto L21
        L5c:
            return r0
        L5d:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r11)
            long[] r10 = defpackage.gt0.l1(r10)
            int r10 = r1.discardPendingRetroAchievementsSubmissions(r10)
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r10)
            return r11
    }
}
