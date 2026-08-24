package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p22  reason: default package */
/* loaded from: classes.dex */
public final class p22 extends defpackage.hw6 implements defpackage.eo2 {
    public java.lang.Object X;
    public defpackage.sz1 Y;
    public defpackage.hy1 Z;
    public java.lang.Object d0;
    public java.lang.Object e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public int l0;
    public /* synthetic */ java.lang.Object m0;
    public final /* synthetic */ defpackage.sz1 n0;

    public p22(defpackage.sz1 r1, defpackage.r41 r2) {
            r0 = this;
            r0.n0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            p22 r0 = (defpackage.p22) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            p22 r0 = new p22
            sz1 r1 = r1.n0
            r0.<init>(r1, r2)
            r0.m0 = r3
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r22) {
            r21 = this;
            r1 = r21
            java.lang.String r0 = "pending_total"
            java.lang.String r2 = "runtime_path"
            s67 r3 = defpackage.s67.a
            sz1 r4 = r1.n0
            java.lang.Object r5 = r1.m0
            w61 r5 = (defpackage.w61) r5
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r1.l0
            r9 = 0
            r10 = 0
            switch(r7) {
                case 0: goto L1b4;
                case 1: goto L19e;
                case 2: goto L174;
                case 3: goto L156;
                case 4: goto L12a;
                case 5: goto Lfc;
                case 6: goto Lea;
                case 7: goto Ldb;
                case 8: goto Lb3;
                case 9: goto La1;
                case 10: goto L8f;
                case 11: goto L5c;
                case 12: goto L45;
                case 13: goto L2b;
                case 14: goto L26;
                case 15: goto L1d;
                default: goto L17;
            }
        L17:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r10
        L1d:
            java.lang.Object r0 = r1.X
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            defpackage.oi2.Y(r22)
            goto L71f
        L26:
            defpackage.oi2.Y(r22)
            goto L6a0
        L2b:
            int r2 = r1.f0
            java.lang.Object r0 = r1.e0
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r3 = r1.d0
            nv4 r3 = (defpackage.nv4) r3
            sz1 r3 = r1.Y
            java.lang.Object r5 = r1.X
            fb4 r5 = (defpackage.fb4) r5
            defpackage.oi2.Y(r22)     // Catch: java.lang.Throwable -> L3f
            goto L58
        L3f:
            r0 = move-exception
            r3 = r4
            r15 = r10
            r4 = 1
            goto L6cf
        L45:
            int r2 = r1.f0
            java.lang.Object r0 = r1.e0
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r3 = r1.d0
            nv4 r3 = (defpackage.nv4) r3
            sz1 r3 = r1.Y
            java.lang.Object r5 = r1.X
            fb4 r5 = (defpackage.fb4) r5
            defpackage.oi2.Y(r22)     // Catch: java.lang.Throwable -> L3f
        L58:
            r17 = r4
            goto L622
        L5c:
            boolean r5 = r1.j0
            int r7 = r1.i0
            int r11 = r1.h0
            int r12 = r1.g0
            int r13 = r1.f0
            java.lang.Object r14 = r1.e0
            nv4 r14 = (defpackage.nv4) r14
            java.lang.Object r14 = r1.d0
            nv4 r14 = (defpackage.nv4) r14
            hy1 r15 = r1.Z
            sz1 r10 = r1.Y
            java.lang.Object r8 = r1.X
            fb4 r8 = (defpackage.fb4) r8
            defpackage.oi2.Y(r22)     // Catch: java.lang.Throwable -> L87
            r18 = r2
            r17 = r4
            r2 = r13
            r9 = r14
            r4 = r3
            r14 = r8
            r3 = r12
            r12 = r0
            r0 = r22
            goto L53a
        L87:
            r0 = move-exception
            r3 = r4
            r5 = r8
            r2 = r13
        L8b:
            r4 = 1
        L8c:
            r15 = 0
            goto L6cf
        L8f:
            int r2 = r1.f0
            sz1 r0 = r1.Y
            hy1 r0 = (defpackage.hy1) r0
            java.lang.Object r0 = r1.X
            r5 = r0
            fb4 r5 = (defpackage.fb4) r5
            defpackage.oi2.Y(r22)     // Catch: java.lang.Throwable -> L9e
            goto Laf
        L9e:
            r0 = move-exception
            r3 = r4
            goto L8b
        La1:
            int r2 = r1.f0
            sz1 r0 = r1.Y
            hy1 r0 = (defpackage.hy1) r0
            java.lang.Object r0 = r1.X
            r5 = r0
            fb4 r5 = (defpackage.fb4) r5
            defpackage.oi2.Y(r22)     // Catch: java.lang.Throwable -> L9e
        Laf:
            r17 = r4
            goto L659
        Lb3:
            boolean r5 = r1.k0
            boolean r7 = r1.j0
            int r8 = r1.i0
            int r10 = r1.h0
            int r11 = r1.g0
            int r12 = r1.f0
            hy1 r13 = r1.Z
            sz1 r14 = r1.Y
            java.lang.Object r15 = r1.X
            fb4 r15 = (defpackage.fb4) r15
            defpackage.oi2.Y(r22)     // Catch: java.lang.Throwable -> Ld6
            r9 = r22
            r17 = r4
            r4 = r3
            r3 = r7
            r7 = r12
            r12 = r0
            r0 = r5
            r5 = r15
            goto L44e
        Ld6:
            r0 = move-exception
            r3 = r4
            r2 = r12
        Ld9:
            r5 = r15
            goto L8b
        Ldb:
            int r2 = r1.f0
            sz1 r0 = r1.Y
            hy1 r0 = (defpackage.hy1) r0
            java.lang.Object r0 = r1.X
            r5 = r0
            fb4 r5 = (defpackage.fb4) r5
            defpackage.oi2.Y(r22)     // Catch: java.lang.Throwable -> L9e
            goto Lf8
        Lea:
            int r2 = r1.f0
            sz1 r0 = r1.Y
            hy1 r0 = (defpackage.hy1) r0
            java.lang.Object r0 = r1.X
            r5 = r0
            fb4 r5 = (defpackage.fb4) r5
            defpackage.oi2.Y(r22)     // Catch: java.lang.Throwable -> L9e
        Lf8:
            r17 = r4
            goto L659
        Lfc:
            boolean r5 = r1.j0
            int r7 = r1.i0
            int r8 = r1.h0
            int r10 = r1.g0
            int r11 = r1.f0
            hy1 r12 = r1.Z
            sz1 r13 = r1.Y
            java.lang.Object r14 = r1.X
            fb4 r14 = (defpackage.fb4) r14
            defpackage.oi2.Y(r22)     // Catch: java.lang.Throwable -> L124
            r17 = r8
            r8 = r7
            r7 = r11
            r11 = r10
            r10 = r17
            r19 = r0
            r18 = r3
            r17 = r4
            r3 = r13
            r0 = r22
            r13 = r12
            goto L368
        L124:
            r0 = move-exception
            r3 = r4
            r2 = r11
            r5 = r14
            goto L8b
        L12a:
            boolean r5 = r1.j0
            int r7 = r1.i0
            int r8 = r1.h0
            int r10 = r1.g0
            int r11 = r1.f0
            java.lang.Object r12 = r1.d0
            yr7 r12 = (defpackage.yr7) r12
            hy1 r13 = r1.Z
            sz1 r14 = r1.Y
            java.lang.Object r15 = r1.X
            fb4 r15 = (defpackage.fb4) r15
            defpackage.oi2.Y(r22)     // Catch: java.lang.Throwable -> L152
            r9 = r11
            r11 = r7
            r7 = r9
            r19 = r0
            r18 = r3
            r17 = r4
            r9 = r5
            r5 = r15
            r0 = r22
            goto L2d3
        L152:
            r0 = move-exception
            r3 = r4
            r2 = r11
            goto Ld9
        L156:
            boolean r5 = r1.j0
            int r7 = r1.i0
            int r8 = r1.h0
            int r10 = r1.g0
            int r11 = r1.f0
            hy1 r12 = r1.Z
            sz1 r13 = r1.Y
            java.lang.Object r14 = r1.X
            fb4 r14 = (defpackage.fb4) r14
            defpackage.oi2.Y(r22)     // Catch: java.lang.Throwable -> L124
            r9 = r11
            r11 = r7
            r7 = r9
            r9 = r5
            r5 = r14
            r14 = r13
        L171:
            r13 = r12
            goto L287
        L174:
            int r5 = r1.h0
            int r7 = r1.g0
            int r8 = r1.f0
            java.lang.Object r10 = r1.e0
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r10 = (me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig) r10
            java.lang.Object r11 = r1.d0
            w61 r11 = (defpackage.w61) r11
            hy1 r11 = r1.Z
            sz1 r12 = r1.Y
            java.lang.Object r13 = r1.X
            fb4 r13 = (defpackage.fb4) r13
            defpackage.oi2.Y(r22)     // Catch: java.lang.Throwable -> L198
            r14 = r12
            r12 = r11
            r11 = r10
            r10 = r7
            r7 = r8
            r8 = r5
            r5 = r13
            r13 = r22
            goto L208
        L198:
            r0 = move-exception
            r3 = r4
            r2 = r8
            r5 = r13
            goto L8b
        L19e:
            int r5 = r1.g0
            int r7 = r1.f0
            sz1 r8 = r1.Y
            java.lang.Object r10 = r1.X
            fb4 r10 = (defpackage.fb4) r10
            defpackage.oi2.Y(r22)     // Catch: java.lang.Throwable -> L1af
            r12 = r8
            r8 = r5
            r5 = r10
            goto L1d2
        L1af:
            r0 = move-exception
            r3 = r4
        L1b1:
            r4 = 1
            goto L6df
        L1b4:
            defpackage.oi2.Y(r22)
            hb4 r7 = r4.k0     // Catch: java.lang.Throwable -> L6d6
            r1.m0 = r5     // Catch: java.lang.Throwable -> L6d6
            r1.X = r7     // Catch: java.lang.Throwable -> L6d6
            r1.Y = r4     // Catch: java.lang.Throwable -> L6d6
            r1.f0 = r9     // Catch: java.lang.Throwable -> L6d6
            r1.g0 = r9     // Catch: java.lang.Throwable -> L6d6
            r5 = 1
            r1.l0 = r5     // Catch: java.lang.Throwable -> L6db
            java.lang.Object r5 = r7.e(r1)     // Catch: java.lang.Throwable -> L6d6
            if (r5 != r6) goto L1ce
            goto L71e
        L1ce:
            r12 = r4
            r5 = r7
            r7 = r9
            r8 = r7
        L1d2:
            tp6 r10 = r12.p0     // Catch: java.lang.Throwable -> L6c9
            java.lang.Object r10 = r10.getValue()     // Catch: java.lang.Throwable -> L6c9
            r11 = r10
            hy1 r11 = (defpackage.hy1) r11     // Catch: java.lang.Throwable -> L6c9
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r10 = r12.N     // Catch: java.lang.Throwable -> L6c9
            pn5 r13 = r12.g     // Catch: java.lang.Throwable -> L6c9
            r14 = 0
            r1.m0 = r14     // Catch: java.lang.Throwable -> L6c9
            r1.X = r5     // Catch: java.lang.Throwable -> L6c9
            r1.Y = r12     // Catch: java.lang.Throwable -> L6c9
            r1.Z = r11     // Catch: java.lang.Throwable -> L6c9
            r1.d0 = r14     // Catch: java.lang.Throwable -> L6c9
            r1.e0 = r10     // Catch: java.lang.Throwable -> L6c9
            r1.f0 = r7     // Catch: java.lang.Throwable -> L6c9
            r1.g0 = r8     // Catch: java.lang.Throwable -> L6c9
            r1.h0 = r9     // Catch: java.lang.Throwable -> L6c9
            r1.i0 = r9     // Catch: java.lang.Throwable -> L6c9
            r14 = 2
            r1.l0 = r14     // Catch: java.lang.Throwable -> L6c9
            pl r13 = (defpackage.pl) r13     // Catch: java.lang.Throwable -> L6cc
            hk r13 = r13.c     // Catch: java.lang.Throwable -> L6cc
            java.lang.Object r13 = r13.b(r1)     // Catch: java.lang.Throwable -> L6cc
            if (r13 != r6) goto L203
            goto L71e
        L203:
            r14 = r12
            r12 = r11
            r11 = r10
            r10 = r8
            r8 = r9
        L208:
            boolean r15 = r13 instanceof defpackage.hb5     // Catch: java.lang.Throwable -> L6c9
            if (r15 == 0) goto L214
            hb5 r13 = (defpackage.hb5) r13     // Catch: java.lang.Throwable -> L20f
            goto L215
        L20f:
            r0 = move-exception
            r3 = r4
            r2 = r7
            goto L8b
        L214:
            r13 = 0
        L215:
            if (r11 == 0) goto L250
            java.lang.String r15 = r11.getUsername()     // Catch: java.lang.Throwable -> L20f
            java.lang.String r11 = r11.getApiToken()     // Catch: java.lang.Throwable -> L20f
            if (r13 == 0) goto L228
            java.lang.String r16 = r13.a()     // Catch: java.lang.Throwable -> L20f
            r9 = r16
            goto L229
        L228:
            r9 = 0
        L229:
            if (r13 == 0) goto L22e
            java.lang.String r13 = r13.b     // Catch: java.lang.Throwable -> L20f
            goto L22f
        L22e:
            r13 = 0
        L22f:
            if (r15 == 0) goto L24e
            boolean r17 = defpackage.qs6.v0(r15)     // Catch: java.lang.Throwable -> L20f
            if (r17 == 0) goto L238
            goto L24e
        L238:
            if (r11 == 0) goto L24e
            boolean r17 = defpackage.qs6.v0(r11)     // Catch: java.lang.Throwable -> L20f
            if (r17 == 0) goto L241
            goto L24e
        L241:
            boolean r9 = defpackage.nb3.k(r15, r9)     // Catch: java.lang.Throwable -> L20f
            if (r9 == 0) goto L24e
            boolean r9 = defpackage.nb3.k(r11, r13)     // Catch: java.lang.Throwable -> L20f
            if (r9 == 0) goto L24e
            goto L250
        L24e:
            r9 = 0
            goto L251
        L250:
            r9 = 1
        L251:
            sz1$c r11 = defpackage.sz1.p(r14)     // Catch: java.lang.Throwable -> L6c9
            sz1$c r13 = defpackage.sz1.c.RC_CLIENT     // Catch: java.lang.Throwable -> L6c9
            if (r11 != r13) goto L25d
            if (r9 != 0) goto L25d
            r11 = 1
            goto L25e
        L25d:
            r11 = 0
        L25e:
            jh r13 = defpackage.sz1.q(r14)     // Catch: java.lang.Throwable -> L6c9
            r15 = 0
            r1.m0 = r15     // Catch: java.lang.Throwable -> L6c9
            r1.X = r5     // Catch: java.lang.Throwable -> L6c9
            r1.Y = r14     // Catch: java.lang.Throwable -> L6c9
            r1.Z = r12     // Catch: java.lang.Throwable -> L6c9
            r1.d0 = r15     // Catch: java.lang.Throwable -> L6c9
            r1.e0 = r15     // Catch: java.lang.Throwable -> L6c9
            r1.f0 = r7     // Catch: java.lang.Throwable -> L6c9
            r1.g0 = r10     // Catch: java.lang.Throwable -> L6c9
            r1.h0 = r8     // Catch: java.lang.Throwable -> L6c9
            r1.i0 = r11     // Catch: java.lang.Throwable -> L6c9
            r1.j0 = r9     // Catch: java.lang.Throwable -> L6c9
            r15 = 3
            r1.l0 = r15     // Catch: java.lang.Throwable -> L6c9
            r13.getClass()     // Catch: java.lang.Throwable -> L6cc
            java.lang.Object r13 = defpackage.jh.j(r11, r1)     // Catch: java.lang.Throwable -> L6cc
            if (r13 != r6) goto L171
            goto L71e
        L287:
            kd6 r12 = defpackage.sz1.y(r14)     // Catch: java.lang.Throwable -> L6c9
            ng6 r12 = (defpackage.ng6) r12     // Catch: java.lang.Throwable -> L6cc
            me.magnum.melonds.domain.model.VideoRenderer r12 = r12.e()     // Catch: java.lang.Throwable -> L6cc
            me.magnum.melonds.domain.model.VideoRenderer r15 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN     // Catch: java.lang.Throwable -> L6c9
            if (r12 != r15) goto L33b
            yr7 r12 = me.magnum.melonds.domain.model.VulkanPipelineProfile.Companion     // Catch: java.lang.Throwable -> L337
            kd6 r15 = defpackage.sz1.y(r14)     // Catch: java.lang.Throwable -> L337
            ng6 r15 = (defpackage.ng6) r15     // Catch: java.lang.Throwable -> L337
            r15.getClass()     // Catch: java.lang.Throwable -> L337
            r17 = r4
            java.lang.String r4 = "video_vulkan_fastpath_enabled"
            r18 = r3
            tf6 r3 = new tf6     // Catch: java.lang.Throwable -> L2f3
            r19 = r0
            r0 = 18
            r3.<init>(r15, r0)     // Catch: java.lang.Throwable -> L2f3
            wp0 r0 = r15.p(r4, r3)     // Catch: java.lang.Throwable -> L2f3
            r15 = 0
            r1.m0 = r15     // Catch: java.lang.Throwable -> L2f3
            r1.X = r5     // Catch: java.lang.Throwable -> L2f3
            r1.Y = r14     // Catch: java.lang.Throwable -> L2f3
            r1.Z = r13     // Catch: java.lang.Throwable -> L2f3
            r1.d0 = r12     // Catch: java.lang.Throwable -> L2f3
            r1.f0 = r7     // Catch: java.lang.Throwable -> L2f3
            r1.g0 = r10     // Catch: java.lang.Throwable -> L2f3
            r1.h0 = r8     // Catch: java.lang.Throwable -> L2f3
            r1.i0 = r11     // Catch: java.lang.Throwable -> L2f3
            r1.j0 = r9     // Catch: java.lang.Throwable -> L2f3
            r3 = 4
            r1.l0 = r3     // Catch: java.lang.Throwable -> L2f3
            java.lang.Object r0 = defpackage.f04.B(r0, r1)     // Catch: java.lang.Throwable -> L2f3
            if (r0 != r6) goto L2d3
            goto L71e
        L2d3:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2f3
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2f3
            r12.getClass()     // Catch: java.lang.Throwable -> L2f3
            if (r0 == 0) goto L2e1
            me.magnum.melonds.domain.model.VulkanPipelineProfile r0 = me.magnum.melonds.domain.model.VulkanPipelineProfile.FASTPATH     // Catch: java.lang.Throwable -> L2f3
            goto L2e3
        L2e1:
            me.magnum.melonds.domain.model.VulkanPipelineProfile r0 = me.magnum.melonds.domain.model.VulkanPipelineProfile.COMPATIBILITY     // Catch: java.lang.Throwable -> L2f3
        L2e3:
            me.magnum.melonds.MelonDSAndroidInterface r3 = me.magnum.melonds.MelonDSAndroidInterface.a     // Catch: java.lang.Throwable -> L2f3
            boolean r4 = r3.c()     // Catch: java.lang.Throwable -> L2f3
            if (r4 == 0) goto L2f9
            boolean r0 = r3.a(r0)     // Catch: java.lang.Throwable -> L2f3
            if (r0 == 0) goto L2f9
        L2f1:
            r15 = 0
            goto L342
        L2f3:
            r0 = move-exception
        L2f4:
            r2 = r7
        L2f5:
            r3 = r17
            goto L8b
        L2f9:
            me.magnum.melonds.domain.model.VideoRenderer r0 = defpackage.sz1.x(r14)     // Catch: java.lang.Throwable -> L2f3
            if (r0 != 0) goto L301
            me.magnum.melonds.domain.model.VideoRenderer r0 = me.magnum.melonds.domain.model.VideoRenderer.SOFTWARE     // Catch: java.lang.Throwable -> L2f3
        L301:
            kd6 r2 = defpackage.sz1.y(r14)     // Catch: java.lang.Throwable -> L2f3
            ng6 r2 = (defpackage.ng6) r2     // Catch: java.lang.Throwable -> L2f3
            r2.getClass()     // Catch: java.lang.Throwable -> L2f3
            r0.getClass()     // Catch: java.lang.Throwable -> L2f3
            android.content.SharedPreferences r2 = r2.b     // Catch: java.lang.Throwable -> L2f3
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L2f3
            java.lang.String r3 = "video_renderer"
            java.lang.String r0 = r0.name()     // Catch: java.lang.Throwable -> L2f3
            java.util.Locale r4 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L2f3
            java.lang.String r0 = r0.toLowerCase(r4)     // Catch: java.lang.Throwable -> L2f3
            r0.getClass()     // Catch: java.lang.Throwable -> L2f3
            r2.putString(r3, r0)     // Catch: java.lang.Throwable -> L2f3
            r2.apply()     // Catch: java.lang.Throwable -> L2f3
            of6 r0 = r14.J0     // Catch: java.lang.Throwable -> L2f3
            m77 r2 = new m77     // Catch: java.lang.Throwable -> L2f3
            me.magnum.melonds.domain.model.VideoRenderer r3 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN     // Catch: java.lang.Throwable -> L2f3
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2f3
            r0.k(r2)     // Catch: java.lang.Throwable -> L2f3
        L334:
            r15 = 0
            goto L65c
        L337:
            r0 = move-exception
            r17 = r4
            goto L2f4
        L33b:
            r19 = r0
            r18 = r3
            r17 = r4
            goto L2f1
        L342:
            r1.m0 = r15     // Catch: java.lang.Throwable -> L6c2
            r1.X = r5     // Catch: java.lang.Throwable -> L6c2
            r1.Y = r14     // Catch: java.lang.Throwable -> L6c2
            r1.Z = r13     // Catch: java.lang.Throwable -> L6c2
            r1.d0 = r15     // Catch: java.lang.Throwable -> L6c2
            r1.f0 = r7     // Catch: java.lang.Throwable -> L6c2
            r1.g0 = r10     // Catch: java.lang.Throwable -> L6c2
            r1.h0 = r8     // Catch: java.lang.Throwable -> L6c2
            r1.i0 = r11     // Catch: java.lang.Throwable -> L6c2
            r1.j0 = r9     // Catch: java.lang.Throwable -> L6c2
            r0 = 5
            r1.l0 = r0     // Catch: java.lang.Throwable -> L6c2
            java.lang.Object r0 = defpackage.sz1.F(r14, r13, r1)     // Catch: java.lang.Throwable -> L6c2
            if (r0 != r6) goto L361
            goto L71e
        L361:
            r3 = r10
            r10 = r8
            r8 = r11
            r11 = r3
            r3 = r14
            r14 = r5
            r5 = r9
        L368:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L6bc
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L6bc
            sz1$c r4 = defpackage.sz1.p(r3)     // Catch: java.lang.Throwable -> L6bc
            sz1$c r9 = defpackage.sz1.c.DISABLED     // Catch: java.lang.Throwable -> L6bc
            if (r4 == r9) goto L416
            if (r5 != 0) goto L416
            java.lang.String r4 = "ra_runtime_authentication_changed"
            sz1$c r9 = defpackage.sz1.p(r3)     // Catch: java.lang.Throwable -> L3a1
            java.lang.String r9 = r9.getTraceValue()     // Catch: java.lang.Throwable -> L3a1
            vr4 r2 = defpackage.kj2.a0(r2, r9)     // Catch: java.lang.Throwable -> L3a1
            nv4 r9 = r3.b0     // Catch: java.lang.Throwable -> L3a1
            if (r9 == 0) goto L3a6
            de5 r9 = r9.i     // Catch: java.lang.Throwable -> L3a1
            if (r9 == 0) goto L3a6
            java.lang.Object r9 = r9.getValue()     // Catch: java.lang.Throwable -> L3a1
            bv4 r9 = (defpackage.bv4) r9     // Catch: java.lang.Throwable -> L3a1
            if (r9 == 0) goto L3a6
            lc5 r9 = r9.c     // Catch: java.lang.Throwable -> L3a1
            int r9 = r9.a     // Catch: java.lang.Throwable -> L3a1
            java.lang.Integer r9 = defpackage.vy7.P(r9)     // Catch: java.lang.Throwable -> L3a1
        L39e:
            r12 = r19
            goto L3a8
        L3a1:
            r0 = move-exception
            r2 = r7
        L3a3:
            r5 = r14
            goto L2f5
        L3a6:
            r9 = 0
            goto L39e
        L3a8:
            vr4 r9 = defpackage.kj2.a0(r12, r9)     // Catch: java.lang.Throwable -> L3a1
            vr4[] r2 = new defpackage.vr4[]{r2, r9}     // Catch: java.lang.Throwable -> L3a1
            r3.G0(r4, r2)     // Catch: java.lang.Throwable -> L3a1
            of6 r2 = r3.J0     // Catch: java.lang.Throwable -> L3a1
            r4 = r18
            r2.k(r4)     // Catch: java.lang.Throwable -> L3a1
            boolean r2 = r13 instanceof defpackage.dy1     // Catch: java.lang.Throwable -> L3a1
            if (r2 == 0) goto L3ea
            jh r2 = defpackage.sz1.q(r3)     // Catch: java.lang.Throwable -> L3a1
            dy1 r13 = (defpackage.dy1) r13     // Catch: java.lang.Throwable -> L3a1
            pq5 r3 = r13.a     // Catch: java.lang.Throwable -> L3a1
            r15 = 0
            r1.m0 = r15     // Catch: java.lang.Throwable -> L3a1
            r1.X = r14     // Catch: java.lang.Throwable -> L3a1
            r1.Y = r15     // Catch: java.lang.Throwable -> L3a1
            r1.Z = r15     // Catch: java.lang.Throwable -> L3a1
            r1.f0 = r7     // Catch: java.lang.Throwable -> L3a1
            r1.g0 = r11     // Catch: java.lang.Throwable -> L3a1
            r1.h0 = r10     // Catch: java.lang.Throwable -> L3a1
            r1.i0 = r8     // Catch: java.lang.Throwable -> L3a1
            r1.j0 = r0     // Catch: java.lang.Throwable -> L3a1
            r1.k0 = r5     // Catch: java.lang.Throwable -> L3a1
            r0 = 6
            r1.l0 = r0     // Catch: java.lang.Throwable -> L3a1
            java.lang.Object r0 = r2.m(r3, r1)     // Catch: java.lang.Throwable -> L3a1
            if (r0 != r6) goto L3e6
            goto L71e
        L3e6:
            r2 = r7
            r5 = r14
            goto L659
        L3ea:
            boolean r2 = r13 instanceof defpackage.cy1     // Catch: java.lang.Throwable -> L3a1
            if (r2 == 0) goto L50a
            jh r2 = defpackage.sz1.q(r3)     // Catch: java.lang.Throwable -> L3a1
            cy1 r13 = (defpackage.cy1) r13     // Catch: java.lang.Throwable -> L3a1
            me.magnum.melonds.domain.model.ConsoleType r3 = r13.a     // Catch: java.lang.Throwable -> L3a1
            r15 = 0
            r1.m0 = r15     // Catch: java.lang.Throwable -> L3a1
            r1.X = r14     // Catch: java.lang.Throwable -> L3a1
            r1.Y = r15     // Catch: java.lang.Throwable -> L3a1
            r1.Z = r15     // Catch: java.lang.Throwable -> L3a1
            r1.f0 = r7     // Catch: java.lang.Throwable -> L3a1
            r1.g0 = r11     // Catch: java.lang.Throwable -> L3a1
            r1.h0 = r10     // Catch: java.lang.Throwable -> L3a1
            r1.i0 = r8     // Catch: java.lang.Throwable -> L3a1
            r1.j0 = r0     // Catch: java.lang.Throwable -> L3a1
            r1.k0 = r5     // Catch: java.lang.Throwable -> L3a1
            r0 = 7
            r1.l0 = r0     // Catch: java.lang.Throwable -> L3a1
            java.lang.Object r0 = r2.l(r3, r1)     // Catch: java.lang.Throwable -> L3a1
            if (r0 != r6) goto L3e6
            goto L71e
        L416:
            r4 = r18
            r12 = r19
            sz1$c r9 = defpackage.sz1.p(r3)     // Catch: java.lang.Throwable -> L6bc
            sz1$c r15 = defpackage.sz1.c.RC_CLIENT     // Catch: java.lang.Throwable -> L6bc
            if (r9 != r15) goto L4c2
            nv4 r9 = r3.b0     // Catch: java.lang.Throwable -> L3a1
            if (r9 == 0) goto L4c2
            r15 = 0
            r1.m0 = r15     // Catch: java.lang.Throwable -> L3a1
            r1.X = r14     // Catch: java.lang.Throwable -> L3a1
            r1.Y = r3     // Catch: java.lang.Throwable -> L3a1
            r1.Z = r13     // Catch: java.lang.Throwable -> L3a1
            r1.f0 = r7     // Catch: java.lang.Throwable -> L3a1
            r1.g0 = r11     // Catch: java.lang.Throwable -> L3a1
            r1.h0 = r10     // Catch: java.lang.Throwable -> L3a1
            r1.i0 = r8     // Catch: java.lang.Throwable -> L3a1
            r1.j0 = r0     // Catch: java.lang.Throwable -> L3a1
            r1.k0 = r5     // Catch: java.lang.Throwable -> L3a1
            r9 = 8
            r1.l0 = r9     // Catch: java.lang.Throwable -> L3a1
            java.lang.Object r9 = defpackage.sz1.P(r3, r1)     // Catch: java.lang.Throwable -> L3a1
            if (r9 != r6) goto L447
            goto L71e
        L447:
            r20 = r3
            r3 = r0
            r0 = r5
            r5 = r14
            r14 = r20
        L44e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L2f3
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L2f3
            if (r9 != 0) goto L4ba
            of6 r2 = r14.J0     // Catch: java.lang.Throwable -> L2f3
            g77 r4 = defpackage.g77.a     // Catch: java.lang.Throwable -> L2f3
            r2.k(r4)     // Catch: java.lang.Throwable -> L2f3
            boolean r2 = r13 instanceof defpackage.dy1     // Catch: java.lang.Throwable -> L2f3
            if (r2 == 0) goto L48d
            jh r2 = defpackage.sz1.q(r14)     // Catch: java.lang.Throwable -> L2f3
            dy1 r13 = (defpackage.dy1) r13     // Catch: java.lang.Throwable -> L2f3
            pq5 r4 = r13.a     // Catch: java.lang.Throwable -> L2f3
            r15 = 0
            r1.m0 = r15     // Catch: java.lang.Throwable -> L2f3
            r1.X = r5     // Catch: java.lang.Throwable -> L2f3
            r1.Y = r15     // Catch: java.lang.Throwable -> L2f3
            r1.Z = r15     // Catch: java.lang.Throwable -> L2f3
            r1.f0 = r7     // Catch: java.lang.Throwable -> L2f3
            r1.g0 = r11     // Catch: java.lang.Throwable -> L2f3
            r1.h0 = r10     // Catch: java.lang.Throwable -> L2f3
            r1.i0 = r8     // Catch: java.lang.Throwable -> L2f3
            r1.j0 = r3     // Catch: java.lang.Throwable -> L2f3
            r1.k0 = r0     // Catch: java.lang.Throwable -> L2f3
            r0 = 9
            r1.l0 = r0     // Catch: java.lang.Throwable -> L2f3
            java.lang.Object r0 = r2.m(r4, r1)     // Catch: java.lang.Throwable -> L2f3
            if (r0 != r6) goto L48a
            goto L71e
        L48a:
            r2 = r7
            goto L659
        L48d:
            boolean r2 = r13 instanceof defpackage.cy1     // Catch: java.lang.Throwable -> L2f3
            if (r2 == 0) goto L334
            jh r2 = defpackage.sz1.q(r14)     // Catch: java.lang.Throwable -> L2f3
            cy1 r13 = (defpackage.cy1) r13     // Catch: java.lang.Throwable -> L2f3
            me.magnum.melonds.domain.model.ConsoleType r4 = r13.a     // Catch: java.lang.Throwable -> L2f3
            r15 = 0
            r1.m0 = r15     // Catch: java.lang.Throwable -> L2f3
            r1.X = r5     // Catch: java.lang.Throwable -> L2f3
            r1.Y = r15     // Catch: java.lang.Throwable -> L2f3
            r1.Z = r15     // Catch: java.lang.Throwable -> L2f3
            r1.f0 = r7     // Catch: java.lang.Throwable -> L2f3
            r1.g0 = r11     // Catch: java.lang.Throwable -> L2f3
            r1.h0 = r10     // Catch: java.lang.Throwable -> L2f3
            r1.i0 = r8     // Catch: java.lang.Throwable -> L2f3
            r1.j0 = r3     // Catch: java.lang.Throwable -> L2f3
            r1.k0 = r0     // Catch: java.lang.Throwable -> L2f3
            r0 = 10
            r1.l0 = r0     // Catch: java.lang.Throwable -> L2f3
            java.lang.Object r0 = r2.l(r4, r1)     // Catch: java.lang.Throwable -> L2f3
            if (r0 != r6) goto L48a
            goto L71e
        L4ba:
            r15 = r5
            r5 = r3
            r3 = r11
            r11 = r10
            r10 = r14
            r14 = r15
        L4c0:
            r15 = r13
            goto L4ca
        L4c2:
            r15 = r5
            r5 = r0
            r0 = r15
            r15 = r10
            r10 = r3
            r3 = r11
            r11 = r15
            goto L4c0
        L4ca:
            sz1$c r9 = defpackage.sz1.p(r10)     // Catch: java.lang.Throwable -> L6bc
            sz1$c r13 = defpackage.sz1.c.RC_CLIENT     // Catch: java.lang.Throwable -> L6bc
            if (r9 != r13) goto L4e3
            nv4 r9 = r10.b0     // Catch: java.lang.Throwable -> L3a1
            if (r9 == 0) goto L4e3
            jf4 r9 = defpackage.sz1.t(r10)     // Catch: java.lang.Throwable -> L3a1
            boolean r9 = r9.a()     // Catch: java.lang.Throwable -> L3a1
            if (r9 == 0) goto L4e3
            defpackage.sz1.S(r10)     // Catch: java.lang.Throwable -> L3a1
        L4e3:
            nv4 r9 = r10.b0     // Catch: java.lang.Throwable -> L6bc
            sz1$c r13 = defpackage.sz1.p(r10)     // Catch: java.lang.Throwable -> L6bc
            r18 = r2
            sz1$c r2 = defpackage.sz1.c.DISABLED     // Catch: java.lang.Throwable -> L6bc
            if (r13 != r2) goto L50d
            if (r9 == 0) goto L502
            de5 r2 = r9.i     // Catch: java.lang.Throwable -> L3a1
            if (r2 == 0) goto L502
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L3a1
            bv4 r2 = (defpackage.bv4) r2     // Catch: java.lang.Throwable -> L3a1
            if (r2 == 0) goto L502
            lc5 r2 = r2.c     // Catch: java.lang.Throwable -> L3a1
            int r2 = r2.a     // Catch: java.lang.Throwable -> L3a1
            goto L503
        L502:
            r2 = 0
        L503:
            if (r2 <= 0) goto L50d
            of6 r0 = r10.J0     // Catch: java.lang.Throwable -> L3a1
            r0.k(r4)     // Catch: java.lang.Throwable -> L3a1
        L50a:
            r5 = r14
            goto L334
        L50d:
            if (r9 == 0) goto L549
            gd5 r2 = r9.f()     // Catch: java.lang.Throwable -> L3a1
            r13 = 0
            r1.m0 = r13     // Catch: java.lang.Throwable -> L3a1
            r1.X = r14     // Catch: java.lang.Throwable -> L3a1
            r1.Y = r10     // Catch: java.lang.Throwable -> L3a1
            r1.Z = r15     // Catch: java.lang.Throwable -> L3a1
            r1.d0 = r9     // Catch: java.lang.Throwable -> L3a1
            r1.e0 = r13     // Catch: java.lang.Throwable -> L3a1
            r1.f0 = r7     // Catch: java.lang.Throwable -> L3a1
            r1.g0 = r3     // Catch: java.lang.Throwable -> L3a1
            r1.h0 = r11     // Catch: java.lang.Throwable -> L3a1
            r1.i0 = r8     // Catch: java.lang.Throwable -> L3a1
            r1.j0 = r5     // Catch: java.lang.Throwable -> L3a1
            r1.k0 = r0     // Catch: java.lang.Throwable -> L3a1
            r0 = 11
            r1.l0 = r0     // Catch: java.lang.Throwable -> L3a1
            java.lang.Object r0 = defpackage.sz1.M(r10, r2, r1)     // Catch: java.lang.Throwable -> L3a1
            if (r0 != r6) goto L538
            goto L71e
        L538:
            r2 = r7
            r7 = r8
        L53a:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L546
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L546
            r8 = r7
            r7 = r5
            r5 = r0
        L543:
            r0 = r3
            r3 = r10
            goto L54d
        L546:
            r0 = move-exception
            goto L3a3
        L549:
            r2 = r7
            r7 = r5
            r5 = 1
            goto L543
        L54d:
            sx1 r10 = defpackage.sz1.r(r3)     // Catch: java.lang.Throwable -> L6ab
            boolean r10 = r10.c()     // Catch: java.lang.Throwable -> L6ab
            sz1$c r13 = defpackage.sz1.p(r3)     // Catch: java.lang.Throwable -> L6ab
            r22 = r5
            sz1$c r5 = defpackage.sz1.c.RC_CLIENT     // Catch: java.lang.Throwable -> L6ab
            if (r13 != r5) goto L562
            yc5 r5 = defpackage.yc5.RC_CLIENT     // Catch: java.lang.Throwable -> L546
            goto L564
        L562:
            yc5 r5 = defpackage.yc5.NONE     // Catch: java.lang.Throwable -> L6ab
        L564:
            if (r9 == 0) goto L577
            de5 r9 = r9.i     // Catch: java.lang.Throwable -> L546
            if (r9 == 0) goto L577
            java.lang.Object r9 = r9.getValue()     // Catch: java.lang.Throwable -> L546
            bv4 r9 = (defpackage.bv4) r9     // Catch: java.lang.Throwable -> L546
            if (r9 == 0) goto L577
            lc5 r9 = r9.c     // Catch: java.lang.Throwable -> L546
            int r9 = r9.a     // Catch: java.lang.Throwable -> L546
            goto L578
        L577:
            r9 = 0
        L578:
            r5.getClass()     // Catch: java.lang.Throwable -> L6ab
            if (r7 != 0) goto L589
            if (r10 == 0) goto L589
            yc5 r10 = defpackage.yc5.RC_CLIENT     // Catch: java.lang.Throwable -> L6ab
            if (r5 != r10) goto L589
            if (r9 <= 0) goto L589
            if (r22 == 0) goto L589
            r5 = 1
            goto L58a
        L589:
            r5 = 0
        L58a:
            q33 r9 = defpackage.sz1.u(r3)     // Catch: java.lang.Throwable -> L6ab
            monitor-enter(r9)     // Catch: java.lang.Throwable -> L6ab
            r9.A = r5     // Catch: java.lang.Throwable -> L6b2
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L6ab
            if (r5 == 0) goto L5d0
            of6 r9 = r3.J0     // Catch: java.lang.Throwable -> L546
            r9.k(r4)     // Catch: java.lang.Throwable -> L546
            java.lang.String r4 = "ra_pending_settings_disable_deferred"
            nv4 r9 = r3.b0     // Catch: java.lang.Throwable -> L546
            if (r9 == 0) goto L5b4
            de5 r9 = r9.i     // Catch: java.lang.Throwable -> L546
            if (r9 == 0) goto L5b4
            java.lang.Object r9 = r9.getValue()     // Catch: java.lang.Throwable -> L546
            bv4 r9 = (defpackage.bv4) r9     // Catch: java.lang.Throwable -> L546
            if (r9 == 0) goto L5b4
            lc5 r9 = r9.c     // Catch: java.lang.Throwable -> L546
            int r9 = r9.a     // Catch: java.lang.Throwable -> L546
            java.lang.Integer r9 = defpackage.vy7.P(r9)     // Catch: java.lang.Throwable -> L546
            goto L5b5
        L5b4:
            r9 = 0
        L5b5:
            vr4 r9 = defpackage.kj2.a0(r12, r9)     // Catch: java.lang.Throwable -> L546
            java.lang.String r10 = "rc_client"
            r12 = r18
            vr4 r10 = defpackage.kj2.a0(r12, r10)     // Catch: java.lang.Throwable -> L546
            java.lang.String r12 = "hardcore"
            java.lang.Boolean r13 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L546
            vr4 r12 = defpackage.kj2.a0(r12, r13)     // Catch: java.lang.Throwable -> L546
            vr4[] r9 = new defpackage.vr4[]{r9, r10, r12}     // Catch: java.lang.Throwable -> L546
            r3.G0(r4, r9)     // Catch: java.lang.Throwable -> L546
        L5d0:
            sx1 r4 = defpackage.sz1.r(r3)     // Catch: java.lang.Throwable -> L6ab
            if (r7 != 0) goto L5db
            if (r5 == 0) goto L5d9
            goto L5db
        L5d9:
            r9 = 0
            goto L5dc
        L5db:
            r9 = 1
        L5dc:
            kd6 r10 = defpackage.sz1.y(r3)     // Catch: java.lang.Throwable -> L6ab
            ng6 r10 = (defpackage.ng6) r10     // Catch: java.lang.Throwable -> L6ab
            android.content.SharedPreferences r10 = r10.b     // Catch: java.lang.Throwable -> L6ab
            java.lang.String r12 = "ra_hardcore_enabled"
            r13 = 0
            boolean r10 = r10.getBoolean(r12, r13)     // Catch: java.lang.Throwable -> L6ab
            java.util.ArrayList r4 = r4.f(r9, r10)     // Catch: java.lang.Throwable -> L6ab
            boolean r9 = r15 instanceof defpackage.dy1     // Catch: java.lang.Throwable -> L6ab
            if (r9 == 0) goto L624
            jh r9 = defpackage.sz1.q(r3)     // Catch: java.lang.Throwable -> L546
            dy1 r15 = (defpackage.dy1) r15     // Catch: java.lang.Throwable -> L546
            pq5 r10 = r15.a     // Catch: java.lang.Throwable -> L546
            r15 = 0
            r1.m0 = r15     // Catch: java.lang.Throwable -> L546
            r1.X = r14     // Catch: java.lang.Throwable -> L546
            r1.Y = r3     // Catch: java.lang.Throwable -> L546
            r1.Z = r15     // Catch: java.lang.Throwable -> L546
            r1.d0 = r15     // Catch: java.lang.Throwable -> L546
            r1.e0 = r4     // Catch: java.lang.Throwable -> L546
            r1.f0 = r2     // Catch: java.lang.Throwable -> L546
            r1.g0 = r0     // Catch: java.lang.Throwable -> L546
            r1.h0 = r11     // Catch: java.lang.Throwable -> L546
            r1.i0 = r8     // Catch: java.lang.Throwable -> L546
            r1.j0 = r7     // Catch: java.lang.Throwable -> L546
            r1.k0 = r5     // Catch: java.lang.Throwable -> L546
            r0 = 12
            r1.l0 = r0     // Catch: java.lang.Throwable -> L546
            java.lang.Object r0 = r9.m(r10, r1)     // Catch: java.lang.Throwable -> L546
            if (r0 != r6) goto L620
            goto L71e
        L620:
            r0 = r4
            r5 = r14
        L622:
            r4 = r0
            goto L656
        L624:
            boolean r9 = r15 instanceof defpackage.cy1     // Catch: java.lang.Throwable -> L6ab
            if (r9 == 0) goto L655
            jh r9 = defpackage.sz1.q(r3)     // Catch: java.lang.Throwable -> L546
            cy1 r15 = (defpackage.cy1) r15     // Catch: java.lang.Throwable -> L546
            me.magnum.melonds.domain.model.ConsoleType r10 = r15.a     // Catch: java.lang.Throwable -> L546
            r15 = 0
            r1.m0 = r15     // Catch: java.lang.Throwable -> L546
            r1.X = r14     // Catch: java.lang.Throwable -> L546
            r1.Y = r3     // Catch: java.lang.Throwable -> L546
            r1.Z = r15     // Catch: java.lang.Throwable -> L546
            r1.d0 = r15     // Catch: java.lang.Throwable -> L546
            r1.e0 = r4     // Catch: java.lang.Throwable -> L546
            r1.f0 = r2     // Catch: java.lang.Throwable -> L546
            r1.g0 = r0     // Catch: java.lang.Throwable -> L546
            r1.h0 = r11     // Catch: java.lang.Throwable -> L546
            r1.i0 = r8     // Catch: java.lang.Throwable -> L546
            r1.j0 = r7     // Catch: java.lang.Throwable -> L546
            r1.k0 = r5     // Catch: java.lang.Throwable -> L546
            r0 = 13
            r1.l0 = r0     // Catch: java.lang.Throwable -> L546
            java.lang.Object r0 = r9.l(r10, r1)     // Catch: java.lang.Throwable -> L546
            if (r0 != r6) goto L620
            goto L71e
        L655:
            r5 = r14
        L656:
            defpackage.sz1.l(r3, r4)     // Catch: java.lang.Throwable -> L6a8
        L659:
            r7 = r2
            goto L334
        L65c:
            r5.h(r15)     // Catch: java.lang.Throwable -> L6a3
            r3 = r17
            java.util.concurrent.atomic.AtomicInteger r0 = r3.j0
            int r0 = r0.decrementAndGet()
            if (r0 != 0) goto L674
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.l0
            r13 = 0
            boolean r0 = r0.getAndSet(r13)
            if (r0 == 0) goto L674
            r9 = 1
            goto L675
        L674:
            r9 = 0
        L675:
            if (r9 == 0) goto L6a0
            l61 r0 = r1.b()
            boolean r0 = defpackage.yh2.z(r0)
            if (r0 == 0) goto L6a0
            r15 = 0
            r1.m0 = r15
            r1.X = r15
            r1.Y = r15
            r1.Z = r15
            r1.d0 = r15
            r1.e0 = r15
            r4 = 1
            r1.f0 = r4
            r1.g0 = r9
            r0 = 14
            r1.l0 = r0
            r3.U0()
            jg7 r0 = defpackage.jg7.a
            if (r0 != r6) goto L6a0
            goto L71e
        L6a0:
            jg7 r0 = defpackage.jg7.a
            return r0
        L6a3:
            r0 = move-exception
            r3 = r17
            goto L1b1
        L6a8:
            r0 = move-exception
            goto L2f5
        L6ab:
            r0 = move-exception
            r3 = r17
            r4 = 1
        L6af:
            r5 = r14
            goto L8c
        L6b2:
            r0 = move-exception
            r3 = r17
            r4 = 1
        L6b6:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L6ba
            throw r0     // Catch: java.lang.Throwable -> L6b8
        L6b8:
            r0 = move-exception
            goto L6af
        L6ba:
            r0 = move-exception
            goto L6b6
        L6bc:
            r0 = move-exception
            r3 = r17
            r4 = 1
            r2 = r7
            goto L6af
        L6c2:
            r0 = move-exception
            r3 = r17
        L6c5:
            r4 = 1
            r2 = r7
            goto L8c
        L6c9:
            r0 = move-exception
            r3 = r4
            goto L6c5
        L6cc:
            r0 = move-exception
            r3 = r4
            goto L6c5
        L6cf:
            r5.h(r15)     // Catch: java.lang.Throwable -> L6d3
            throw r0     // Catch: java.lang.Throwable -> L6d3
        L6d3:
            r0 = move-exception
            r7 = r2
            goto L6df
        L6d6:
            r0 = move-exception
            r3 = r4
            r4 = 1
        L6d9:
            r7 = 0
            goto L6df
        L6db:
            r0 = move-exception
            r3 = r4
            r4 = r5
            goto L6d9
        L6df:
            java.util.concurrent.atomic.AtomicInteger r2 = r3.j0
            int r2 = r2.decrementAndGet()
            if (r2 != 0) goto L6f2
            java.util.concurrent.atomic.AtomicBoolean r2 = r3.l0
            r13 = 0
            boolean r2 = r2.getAndSet(r13)
            if (r2 == 0) goto L6f3
            r8 = r4
            goto L6f4
        L6f2:
            r13 = 0
        L6f3:
            r8 = r13
        L6f4:
            if (r8 == 0) goto L71f
            if (r7 == 0) goto L71f
            l61 r2 = r1.b()
            boolean r2 = defpackage.yh2.z(r2)
            if (r2 == 0) goto L71f
            r15 = 0
            r1.m0 = r15
            r1.X = r0
            r1.Y = r15
            r1.Z = r15
            r1.d0 = r15
            r1.e0 = r15
            r1.f0 = r7
            r1.g0 = r8
            r2 = 15
            r1.l0 = r2
            r3.U0()
            jg7 r1 = defpackage.jg7.a
            if (r1 != r6) goto L71f
        L71e:
            return r6
        L71f:
            throw r0
    }
}
