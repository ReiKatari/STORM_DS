package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zk  reason: default package */
/* loaded from: classes.dex */
public final class zk extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ java.lang.Object Y;
    public final /* synthetic */ defpackage.pl Z;

    public /* synthetic */ zk(defpackage.pl r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.Z = r1
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
            zk r2 = (defpackage.zk) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            zk r2 = (defpackage.zk) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            pl r2 = r2.Z
            switch(r0) {
                case 0: goto L10;
                default: goto L7;
            }
        L7:
            zk r0 = new zk
            r1 = 1
            r0.<init>(r2, r3, r1)
            r0.Y = r4
            return r0
        L10:
            zk r0 = new zk
            r1 = 0
            r0.<init>(r2, r3, r1)
            r0.Y = r4
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.X
            yt1 r1 = defpackage.yt1.A
            java.lang.String r2 = "error"
            pl r3 = r5.Z
            me.magnum.melonds.MelonEmulator r4 = me.magnum.melonds.MelonEmulator.a
            java.lang.Object r5 = r5.Y
            w61 r5 = (defpackage.w61) r5
            switch(r0) {
                case 0: goto L50;
                default: goto L11;
            }
        L11:
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r6)
            long[] r5 = r4.getRuntimeSubsetIds()     // Catch: java.lang.Throwable -> L1f
            java.util.List r5 = defpackage.fv.S0(r5)     // Catch: java.lang.Throwable -> L1f
            goto L26
        L1f:
            r5 = move-exception
            em5 r6 = new em5
            r6.<init>(r5)
            r5 = r6
        L26:
            java.lang.Throwable r6 = defpackage.hm5.a(r5)
            if (r6 == 0) goto L48
            java.lang.String r0 = r6.getMessage()
            if (r0 != 0) goto L3a
            java.lang.Class r6 = r6.getClass()
            java.lang.String r0 = r6.getSimpleName()
        L3a:
            vr4 r6 = new vr4
            r6.<init>(r2, r0)
            vr4[] r6 = new defpackage.vr4[]{r6}
            java.lang.String r0 = "runtime_subset_ids_unavailable"
            r3.u(r0, r6)
        L48:
            java.lang.Throwable r6 = defpackage.hm5.a(r5)
            if (r6 != 0) goto L4f
            r1 = r5
        L4f:
            return r1
        L50:
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r6)
            me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievementBucketEntry[] r5 = r4.getRuntimeAchievementBuckets()     // Catch: java.lang.Throwable -> L5e
            java.util.List r5 = defpackage.fv.T0(r5)     // Catch: java.lang.Throwable -> L5e
            goto L65
        L5e:
            r5 = move-exception
            em5 r6 = new em5
            r6.<init>(r5)
            r5 = r6
        L65:
            java.lang.Throwable r6 = defpackage.hm5.a(r5)
            if (r6 == 0) goto L87
            java.lang.String r0 = r6.getMessage()
            if (r0 != 0) goto L79
            java.lang.Class r6 = r6.getClass()
            java.lang.String r0 = r6.getSimpleName()
        L79:
            vr4 r6 = new vr4
            r6.<init>(r2, r0)
            vr4[] r6 = new defpackage.vr4[]{r6}
            java.lang.String r0 = "runtime_buckets_unavailable"
            r3.u(r0, r6)
        L87:
            java.lang.Throwable r6 = defpackage.hm5.a(r5)
            if (r6 != 0) goto L8e
            r1 = r5
        L8e:
            return r1
    }
}
