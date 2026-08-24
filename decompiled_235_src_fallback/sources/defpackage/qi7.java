package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qi7  reason: default package */
/* loaded from: classes.dex */
public final class qi7 extends defpackage.hw6 implements defpackage.qn2 {
    public int X;
    public final /* synthetic */ java.util.LinkedHashSet Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ defpackage.ri7 d0;

    public qi7(java.util.LinkedHashSet r1, boolean r2, defpackage.ri7 r3, defpackage.r41 r4) {
            r0 = this;
            r0.Y = r1
            r0.Z = r2
            r0.d0 = r3
            r1 = 1
            r0.<init>(r1, r4)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r4) {
            r3 = this;
            r41 r4 = (defpackage.r41) r4
            qi7 r0 = new qi7
            boolean r1 = r3.Z
            ri7 r2 = r3.d0
            java.util.LinkedHashSet r3 = r3.Y
            r0.<init>(r3, r1, r2, r4)
            jg7 r3 = defpackage.jg7.a
            java.lang.Object r3 = r0.s(r3)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r25) {
            r24 = this;
            r0 = r24
            ri7 r1 = r0.d0
            java.util.LinkedHashMap r2 = r1.k
            java.lang.String r3 = "CXCP"
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r0.X
            r6 = 0
            r10 = 1
            if (r5 == 0) goto L1c
            if (r5 != r10) goto L16
            defpackage.oi2.Y(r25)
            return r25
        L16:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r6
        L1c:
            defpackage.oi2.Y(r25)
            boolean r5 = defpackage.kj2.F(r3)
            if (r5 == 0) goto L2a
            java.lang.String r5 = "UseCaseCameraRequestControlImpl: Building SessionConfig..."
            android.util.Log.d(r3, r5)
        L2a:
            tc6 r5 = new tc6
            java.util.LinkedHashSet r7 = r0.Y
            boolean r8 = r0.Z
            r5.<init>(r7, r8)
            ex6 r7 = r5.e
            java.lang.Object r7 = r7.getValue()
            pc6 r7 = (defpackage.pc6) r7
            boolean r7 = r7.c()
            if (r7 == 0) goto L4a
            ex6 r5 = r5.f
            java.lang.Object r5 = r5.getValue()
            r6 = r5
            rc6 r6 = (defpackage.rc6) r6
        L4a:
            if (r6 != 0) goto Lef
            boolean r5 = defpackage.kj2.F(r3)
            if (r5 == 0) goto L57
            java.lang.String r5 = "Using default SessionConfig"
            android.util.Log.d(r3, r5)
        L57:
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            da4 r7 = defpackage.da4.d()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            sa4 r9 = defpackage.sa4.a()
            android.util.ArrayMap r9 = r9.a
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            rc6 r14 = new rc6
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r13)
            ek0 r19 = new ek0
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r6)
            go4 r6 = defpackage.go4.a(r7)
            r17 = r11
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r8)
            sy6 r7 = defpackage.sy6.b
            android.util.ArrayMap r7 = new android.util.ArrayMap
            r7.<init>()
            java.util.Set r8 = r9.keySet()
            java.util.Iterator r8 = r8.iterator()
        Lb6:
            boolean r16 = r8.hasNext()
            if (r16 == 0) goto Ld1
            java.lang.Object r16 = r8.next()
            r10 = r16
            java.lang.String r10 = (java.lang.String) r10
            r16 = r5
            java.lang.Object r5 = r9.get(r10)
            r7.put(r10, r5)
            r5 = r16
            r10 = 1
            goto Lb6
        Ld1:
            r16 = r5
            sy6 r5 = new sy6
            r5.<init>(r7)
            r9 = r6
            r18 = r12
            r8 = r13
            r7 = r19
            r10 = 1
            r12 = r5
            r7.<init>(r8, r9, r10, r11, r12)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r6 = r14
        Lef:
            ek0 r5 = r6.g
            boolean r6 = defpackage.kj2.F(r3)
            if (r6 == 0) goto Lfc
            java.lang.String r6 = "UseCaseCameraRequestControlImpl: SessionConfig built. Updating state..."
            android.util.Log.d(r3, r6)
        Lfc:
            ki7 r6 = defpackage.ki7.SESSION_CONFIG
            tu0 r7 = defpackage.ri7.l
            kj7 r7 = r1.e
            s37 r7 = r7.e
            ni7 r8 = new ni7
            jd0 r9 = new jd0
            r11 = 0
            r9.<init>(r11)
            android.util.Range r12 = r5.a()
            android.util.Range r13 = defpackage.yy.h
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L12a
            android.hardware.camera2.CaptureRequest$Key r12 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE
            r12.getClass()
            android.util.Range r13 = r5.a()
            xx r12 = defpackage.nw7.T(r12)
            da4 r14 = r9.B
            r14.m(r12, r13)
        L12a:
            go4 r12 = r5.b
            r9.b(r12)
            sy6 r12 = r5.e
            r12.getClass()
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            android.util.ArrayMap r12 = r12.a
            java.util.Set r14 = r12.keySet()
            r14.getClass()
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.Iterator r14 = r14.iterator()
        L148:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L163
            java.lang.Object r15 = r14.next()
            java.lang.String r15 = (java.lang.String) r15
            r25 = r11
            java.lang.Object r11 = r12.get(r15)
            r11.getClass()
            r13.put(r15, r11)
            r11 = r25
            goto L148
        L163:
            r25 = r11
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>(r13)
            r7.getClass()
            java.util.List r12 = r5.d
            r12.getClass()
            ae0 r13 = new ae0
            r13.<init>()
            java.util.Iterator r12 = r12.iterator()
        L17b:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L1c6
            java.lang.Object r14 = r12.next()
            be0 r14 = (defpackage.be0) r14
            r14.getClass()
            r7.getClass()
            java.util.Map r15 = r13.L
            boolean r15 = r15.containsKey(r14)
            if (r15 != 0) goto L1ab
            java.util.LinkedHashMap r15 = r13.A
            monitor-enter(r15)
            java.util.LinkedHashMap r10 = r13.A     // Catch: java.lang.Throwable -> L1a8
            r10.put(r14, r7)     // Catch: java.lang.Throwable -> L1a8
            java.util.LinkedHashMap r10 = r13.A     // Catch: java.lang.Throwable -> L1a8
            java.util.Map r10 = defpackage.c14.s0(r10)     // Catch: java.lang.Throwable -> L1a8
            r13.L = r10     // Catch: java.lang.Throwable -> L1a8
            monitor-exit(r15)
            r10 = 1
            goto L17b
        L1a8:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L1ab:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            java.lang.String r1 = " was already registered!"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L1c6:
            r7 = 1
            jk5[] r7 = new defpackage.jk5[r7]
            r7[r25] = r13
            java.util.Set r7 = defpackage.ii2.G(r7)
            int r10 = r5.c
            bl5 r12 = new bl5
            r12.<init>(r10)
            r8.<init>(r9, r11, r7, r12)
            r2.put(r6, r8)
            ej7 r6 = r1.c
            java.util.ArrayList r5 = r5.a
            java.util.List r5 = java.util.Collections.unmodifiableList(r5)
            r5.getClass()
            java.util.LinkedHashSet r5 = r6.b(r5)
            boolean r6 = defpackage.kj2.F(r3)
            if (r6 == 0) goto L1f6
            java.lang.String r6 = "UseCaseCameraRequestControlImpl: State update processing."
            android.util.Log.d(r3, r6)
        L1f6:
            ni7 r2 = defpackage.ri7.l(r2)
            r10 = 1
            r0.X = r10
            java.lang.Object r0 = r1.n(r2, r5, r0)
            if (r0 != r4) goto L204
            return r4
        L204:
            return r0
    }
}
