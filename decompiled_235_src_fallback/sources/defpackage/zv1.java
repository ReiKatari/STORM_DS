package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zv1  reason: default package */
/* loaded from: classes.dex */
public final class zv1 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public int Z;
    public java.lang.Object d0;
    public final /* synthetic */ java.lang.Object e0;
    public java.lang.Object f0;
    public final /* synthetic */ java.lang.Object g0;

    public zv1(defpackage.hu1 r2, defpackage.sz1 r3, defpackage.dy1 r4, defpackage.c46 r5, int r6, defpackage.r41 r7) {
            r1 = this;
            r0 = 1
            r1.X = r0
            r1.d0 = r2
            r1.e0 = r3
            r1.f0 = r4
            r1.g0 = r5
            r1.Z = r6
            r2 = 2
            r1.<init>(r2, r7)
            return
    }

    public zv1(java.util.Map r2, me.magnum.melonds.ui.emulator.EmulatorActivity r3, defpackage.r41 r4) {
            r1 = this;
            r0 = 0
            r1.X = r0
            r1.g0 = r2
            r1.e0 = r3
            r2 = 2
            r1.<init>(r2, r4)
            return
    }

    public zv1(defpackage.xr7 r2, me.magnum.melonds.ui.emulator.EmulatorSurfaceView r3, int r4, me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig r5, defpackage.t26 r6, defpackage.r41 r7) {
            r1 = this;
            r0 = 2
            r1.X = r0
            r1.d0 = r2
            r1.e0 = r3
            r1.Z = r4
            r1.f0 = r5
            r1.g0 = r6
            r1.<init>(r0, r7)
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
                case 0: goto L21;
                case 1: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            zv1 r2 = (defpackage.zv1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            zv1 r2 = (defpackage.zv1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            zv1 r2 = (defpackage.zv1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r11, java.lang.Object r12) {
            r10 = this;
            int r12 = r10.X
            java.lang.Object r0 = r10.g0
            java.lang.Object r1 = r10.e0
            switch(r12) {
                case 0: goto L3d;
                case 1: goto L22;
                default: goto L9;
            }
        L9:
            zv1 r2 = new zv1
            java.lang.Object r12 = r10.d0
            r3 = r12
            xr7 r3 = (defpackage.xr7) r3
            r4 = r1
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView r4 = (me.magnum.melonds.ui.emulator.EmulatorSurfaceView) r4
            int r5 = r10.Z
            java.lang.Object r10 = r10.f0
            r6 = r10
            me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig r6 = (me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig) r6
            r7 = r0
            t26 r7 = (defpackage.t26) r7
            r8 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        L22:
            r8 = r11
            zv1 r3 = new zv1
            java.lang.Object r11 = r10.d0
            r4 = r11
            hu1 r4 = (defpackage.hu1) r4
            r5 = r1
            sz1 r5 = (defpackage.sz1) r5
            java.lang.Object r11 = r10.f0
            r6 = r11
            dy1 r6 = (defpackage.dy1) r6
            r7 = r0
            c46 r7 = (defpackage.c46) r7
            int r10 = r10.Z
            r9 = r8
            r8 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L3d:
            r8 = r11
            zv1 r10 = new zv1
            java.util.Map r0 = (java.util.Map) r0
            me.magnum.melonds.ui.emulator.EmulatorActivity r1 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r1
            r10.<init>(r0, r1, r8)
            return r10
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.X
            r1 = 0
            r2 = 1
            r3 = 0
            switch(r0) {
                case 0: goto L127;
                case 1: goto Le1;
                default: goto L8;
            }
        L8:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r9.Y
            if (r4 == 0) goto L1b
            if (r4 != r2) goto L14
            defpackage.oi2.Y(r10)
            goto L3c
        L14:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r9)
            goto Lde
        L1b:
            defpackage.oi2.Y(r10)
            xe1 r10 = defpackage.xk1.a
            de1 r10 = defpackage.de1.L
            bf4 r4 = new bf4
            java.lang.Object r5 = r9.d0
            xr7 r5 = (defpackage.xr7) r5
            java.lang.Object r6 = r9.g0
            t26 r6 = (defpackage.t26) r6
            r7 = 28
            r4.<init>(r5, r6, r3, r7)
            r9.Y = r2
            java.lang.Object r10 = defpackage.hv.d0(r10, r4, r9)
            if (r10 != r0) goto L3c
            r3 = r0
            goto Lde
        L3c:
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            java.lang.Object r0 = r9.d0
            xr7 r0 = (defpackage.xr7) r0
            tr7 r0 = r0.f
            java.lang.Object r4 = r9.e0
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView r4 = (me.magnum.melonds.ui.emulator.EmulatorSurfaceView) r4
            int r5 = r9.Z
            java.lang.Object r9 = r9.f0
            me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig r9 = (me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig) r9
            r0.getClass()
            r4.getClass()
            boolean r6 = r0.B
            if (r6 != 0) goto L5f
            if (r10 == 0) goto Ldc
            r10.recycle()
            goto Ldc
        L5f:
            xr7 r6 = r0.X
            java.lang.Object r7 = r6.c
            monitor-enter(r7)
            java.util.LinkedHashMap r8 = r6.e     // Catch: java.lang.Throwable -> L74
            java.lang.Object r8 = r8.get(r4)     // Catch: java.lang.Throwable -> L74
            vr7 r8 = (defpackage.vr7) r8     // Catch: java.lang.Throwable -> L74
            if (r8 == 0) goto L77
            int r8 = r8.a     // Catch: java.lang.Throwable -> L74
            if (r5 >= r8) goto L77
            r6 = r1
            goto L82
        L74:
            r0 = move-exception
            r9 = r0
            goto Ldf
        L77:
            java.util.LinkedHashMap r6 = r6.e     // Catch: java.lang.Throwable -> L74
            vr7 r8 = new vr7     // Catch: java.lang.Throwable -> L74
            r8.<init>(r5, r9)     // Catch: java.lang.Throwable -> L74
            r6.put(r4, r8)     // Catch: java.lang.Throwable -> L74
            r6 = r2
        L82:
            monitor-exit(r7)
            if (r6 != 0) goto L8b
            if (r10 == 0) goto Ldc
            r10.recycle()
            goto Ldc
        L8b:
            android.os.Handler r6 = r0.c()
            if (r6 != 0) goto L97
            if (r10 == 0) goto Ldc
            r10.recycle()
            goto Ldc
        L97:
            r7 = 3
            android.os.Message r4 = r6.obtainMessage(r7, r4)
            java.lang.String r7 = "generation"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            vr4 r8 = new vr4
            r8.<init>(r7, r5)
            java.lang.String r5 = "has-config"
            if (r9 == 0) goto Lac
            r1 = r2
        Lac:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
            vr4 r1 = new vr4
            r1.<init>(r5, r9)
            java.lang.String r9 = "background-bitmap"
            vr4 r2 = new vr4
            r2.<init>(r9, r10)
            vr4[] r9 = new defpackage.vr4[]{r8, r1, r2}
            android.os.Bundle r9 = defpackage.jw2.l(r9)
            r4.setData(r9)
            r6.sendMessage(r4)     // Catch: java.lang.IllegalStateException -> Lcb
            goto Ldc
        Lcb:
            sk1 r9 = r0.A
            if (r9 != r6) goto Ld4
            r6.removeCallbacksAndMessages(r3)
            r0.A = r3
        Ld4:
            if (r10 == 0) goto Ld9
            r10.recycle()
        Ld9:
            r4.recycle()
        Ldc:
            jg7 r3 = defpackage.jg7.a
        Lde:
            return r3
        Ldf:
            monitor-exit(r7)
            throw r9
        Le1:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r9.Y
            if (r1 == 0) goto Lf3
            if (r1 != r2) goto Led
            defpackage.oi2.Y(r10)
            goto L11b
        Led:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r9)
            goto L126
        Lf3:
            defpackage.oi2.Y(r10)
            xe1 r10 = defpackage.xk1.a
            de1 r10 = defpackage.de1.L
            b0 r3 = new b0
            java.lang.Object r1 = r9.e0
            r4 = r1
            sz1 r4 = (defpackage.sz1) r4
            java.lang.Object r1 = r9.f0
            r5 = r1
            dy1 r5 = (defpackage.dy1) r5
            java.lang.Object r1 = r9.g0
            r6 = r1
            c46 r6 = (defpackage.c46) r6
            int r7 = r9.Z
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            r9.Y = r2
            java.lang.Object r10 = defpackage.hv.d0(r10, r3, r9)
            if (r10 != r0) goto L11b
            r3 = r0
            goto L126
        L11b:
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r9 = r9.d0
            hu1 r9 = (defpackage.hu1) r9
            r9.g(r10)
            jg7 r3 = defpackage.jg7.a
        L126:
            return r3
        L127:
            jg7 r0 = defpackage.jg7.a
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r9.Z
            if (r5 == 0) goto L145
            if (r5 != r2) goto L13f
            int r1 = r9.Y
            java.lang.Object r5 = r9.f0
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r9.d0
            me.magnum.melonds.ui.emulator.EmulatorActivity r6 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r6
            defpackage.oi2.Y(r10)
            goto L15c
        L13f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r9)
            goto L193
        L145:
            defpackage.oi2.Y(r10)
            java.lang.Object r10 = r9.g0
            java.util.Map r10 = (java.util.Map) r10
            java.util.Set r10 = r10.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Object r5 = r9.e0
            me.magnum.melonds.ui.emulator.EmulatorActivity r5 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r5
            java.util.Iterator r10 = r10.iterator()
            r6 = r5
            r5 = r10
        L15c:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L192
            java.lang.Object r10 = r5.next()
            java.lang.String r10 = (java.lang.String) r10
            uv4 r7 = r6.F0
            if (r7 == 0) goto L18c
            r9.d0 = r6
            r9.f0 = r5
            r9.Y = r1
            r9.Z = r2
            java.util.LinkedHashMap r7 = r7.c
            java.lang.Object r10 = r7.get(r10)
            na4 r10 = (defpackage.na4) r10
            if (r10 == 0) goto L187
            java.lang.Object r10 = r10.a(r0, r9)
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            if (r10 != r7) goto L187
            goto L188
        L187:
            r10 = r0
        L188:
            if (r10 != r4) goto L15c
            r3 = r4
            goto L193
        L18c:
            java.lang.String r9 = "permissionHandler"
            defpackage.nb3.a0(r9)
            throw r3
        L192:
            r3 = r0
        L193:
            return r3
    }
}
