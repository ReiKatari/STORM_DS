package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vf0  reason: default package */
/* loaded from: classes.dex */
public final class vf0 implements defpackage.ye0, java.lang.AutoCloseable {
    public final defpackage.jb4 A;
    public final defpackage.gt2 B;
    public final defpackage.t41 L;
    public final defpackage.tf0 R;
    public final defpackage.uf0 X;
    public final int Y;

    public vf0(defpackage.jb4 r1, defpackage.gt2 r2, defpackage.t41 r3, defpackage.km2 r4, defpackage.tf0 r5, defpackage.uf0 r6) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r5
            r0.X = r6
            uw r1 = defpackage.wf0.a
            r1.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.uw.b
            int r1 = r2.incrementAndGet(r1)
            r0.Y = r1
            return
    }

    public static defpackage.tu0 k(defpackage.vf0 r24, long r25, int r27) {
            r0 = r24
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r2 = r27 & 1
            r3 = 0
            if (r2 == 0) goto Lb
            r2 = r3
            goto Lc
        Lb:
            r2 = r1
        Lc:
            r4 = r27 & 4
            if (r4 == 0) goto L12
            r4 = r3
            goto L13
        L12:
            r4 = r1
        L13:
            r5 = r27 & 32
            if (r5 == 0) goto L1d
            r5 = 3000000000(0xb2d05e00, double:1.4821969375E-314)
            goto L1f
        L1d:
            r5 = r25
        L1f:
            jb4 r7 = r0.A
            boolean r7 = r7.a()
            if (r7 != 0) goto L15b
            t41 r0 = r0.L
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r5)
            tu0 r5 = defpackage.t41.o
            gt2 r6 = r0.a
            kg0 r8 = defpackage.lg0.g
            lg0 r9 = r0.b
            r8.getClass()
            boolean r8 = defpackage.kg0.a(r9)
            if (r8 != 0) goto L41
            r8 = r3
            goto L42
        L41:
            r8 = r1
        L42:
            boolean r9 = defpackage.nb3.k(r2, r1)
            r10 = 0
            if (r9 != 0) goto L5f
            boolean r9 = defpackage.nb3.k(r8, r1)
            if (r9 != 0) goto L5f
            boolean r9 = defpackage.nb3.k(r4, r1)
            if (r9 != 0) goto L5f
            fm5 r0 = new fm5
            r0.<init>(r10, r3)
            tu0 r0 = defpackage.u24.b(r0)
            return r0
        L5f:
            ft2 r9 = r6.b
            kk5 r9 = r9.k()
            if (r9 != 0) goto L68
            return r5
        L68:
            boolean r9 = defpackage.nb3.k(r8, r1)
            java.lang.String r11 = "CXCP"
            if (r9 == 0) goto Lb6
            java.lang.String r9 = "unlock3A - sending a request to unlock af first."
            android.util.Log.d(r11, r9)
            java.util.Map r9 = defpackage.t41.n
            r9.getClass()
            ft2 r12 = r6.b
            r12.getClass()
            kk5 r13 = r12.k()
            if (r13 == 0) goto L91
            s9 r10 = r12.Z
            zs2 r12 = new zs2
            r12.<init>(r9)
            boolean r10 = r10.H(r12)
            goto L96
        L91:
            java.lang.String r9 = "Cannot submit parameters without an active repeating request!"
            defpackage.i.m(r9)
        L96:
            if (r10 != 0) goto L9e
            java.lang.String r0 = "unlock3A - failed to send a request to unlock af first."
            android.util.Log.d(r11, r0)
            return r5
        L9e:
            ot2 r12 = r0.c
            java.lang.Boolean r21 = java.lang.Boolean.FALSE
            r22 = 0
            r23 = 767(0x2ff, float:1.075E-42)
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            defpackage.ot2.b(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        Lb6:
            boolean r5 = defpackage.nb3.k(r2, r1)
            boolean r8 = defpackage.nb3.k(r8, r1)
            boolean r9 = defpackage.nb3.k(r4, r1)
            if (r5 != 0) goto Lcb
            if (r8 != 0) goto Lcb
            if (r9 != 0) goto Lcb
            zt1 r5 = defpackage.zt1.A
            goto Lec
        Lcb:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            if (r5 == 0) goto Ld9
            android.hardware.camera2.CaptureResult$Key r5 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.util.List r12 = defpackage.t41.p
            r10.put(r5, r12)
        Ld9:
            if (r8 == 0) goto Le2
            android.hardware.camera2.CaptureResult$Key r5 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
            java.util.List r8 = defpackage.t41.q
            r10.put(r5, r8)
        Le2:
            if (r9 == 0) goto Leb
            android.hardware.camera2.CaptureResult$Key r5 = android.hardware.camera2.CaptureResult.CONTROL_AWB_STATE
            java.util.List r8 = defpackage.t41.r
            r10.put(r5, r8)
        Leb:
            r5 = r10
        Lec:
            bg2 r8 = new bg2
            r9 = 29
            r8.<init>(r5, r9)
            gm5 r5 = new gm5
            r9 = 60
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r5.<init>(r8, r9, r7)
            ox3 r7 = r0.d
            r7.getClass()
            java.util.concurrent.CopyOnWriteArrayList r7 = r7.A
            r7.add(r5)
            boolean r2 = defpackage.nb3.k(r2, r1)
            if (r2 == 0) goto L111
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L112
        L111:
            r2 = r3
        L112:
            boolean r1 = defpackage.nb3.k(r4, r1)
            if (r1 == 0) goto L11a
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
        L11a:
            if (r2 != 0) goto L11e
            if (r3 == 0) goto L14f
        L11e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "unlock3A - updating graph state, aeLock="
            r1.<init>(r4)
            r1.append(r2)
            java.lang.String r4 = ", awbLock="
            r1.append(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r11, r1)
            ot2 r12 = r0.c
            r21 = 0
            r23 = 383(0x17f, float:5.37E-43)
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = r2
            r22 = r3
            defpackage.ot2.b(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L14f:
            ot2 r0 = r0.c
            java.util.LinkedHashMap r0 = r0.a()
            r6.e(r0)
            tu0 r0 = r5.R
            return r0
        L15b:
            java.lang.String r1 = "Cannot call unlock3A on "
            java.lang.String r2 = " after close."
            defpackage.e41.g(r0, r2, r1)
            return r3
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            tf0 r0 = r1.R
            java.lang.Object r0 = r0.a
            monitor-enter(r0)
            monitor-exit(r0)
            uf0 r0 = r1.X
            java.lang.Object r0 = r0.a
            monitor-enter(r0)
            monitor-exit(r0)
            jb4 r1 = r1.A
            r1.b()
            return
    }

    public final defpackage.tu0 h() {
            r11 = this;
            jb4 r0 = r11.A
            boolean r0 = r0.a()
            r1 = 0
            if (r0 != 0) goto L41
            t41 r2 = r11.L
            ot2 r11 = r2.c
            xw r11 = r11.a
            java.lang.Object r11 = r11.a
            np6 r11 = (defpackage.np6) r11
            oa r11 = r11.a
            java.util.List r0 = defpackage.oa.b
            r0 = 1
            if (r11 != 0) goto L1b
            goto L20
        L1b:
            int r3 = r11.a
            if (r3 != r0) goto L20
            goto L27
        L20:
            if (r11 != 0) goto L23
            goto L29
        L23:
            int r11 = r11.a
            if (r11 != 0) goto L29
        L27:
            r3 = r1
            goto L2f
        L29:
            oa r1 = new oa
            r1.<init>(r0)
            goto L27
        L2f:
            pd2 r6 = new pd2
            r11 = 2
            r6.<init>(r11)
            r9 = 0
            r10 = 118(0x76, float:1.65E-43)
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            tu0 r11 = defpackage.t41.a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        L41:
            java.lang.String r0 = "Cannot call setTorchOn on "
            java.lang.String r2 = " after close."
            defpackage.e41.g(r11, r2, r0)
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CameraGraph.Session-"
            r0.<init>(r1)
            int r2 = r2.Y
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
