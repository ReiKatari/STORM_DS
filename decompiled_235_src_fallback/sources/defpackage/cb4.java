package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cb4  reason: default package */
/* loaded from: classes.dex */
public final class cb4 extends defpackage.hw6 implements defpackage.eo2 {
    public defpackage.fb4 X;
    public java.lang.Object Y;
    public java.lang.Object Z;
    public defpackage.db4 d0;
    public int e0;
    public /* synthetic */ java.lang.Object f0;
    public final /* synthetic */ defpackage.xa4 g0;
    public final /* synthetic */ defpackage.db4 h0;
    public final /* synthetic */ defpackage.eo2 i0;
    public final /* synthetic */ java.lang.Object j0;

    public cb4(defpackage.xa4 r1, defpackage.db4 r2, defpackage.eo2 r3, java.lang.Object r4, defpackage.r41 r5) {
            r0 = this;
            r0.g0 = r1
            r0.h0 = r2
            r0.i0 = r3
            r0.j0 = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            cb4 r0 = (defpackage.cb4) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r7, java.lang.Object r8) {
            r6 = this;
            cb4 r0 = new cb4
            eo2 r3 = r6.i0
            java.lang.Object r4 = r6.j0
            xa4 r1 = r6.g0
            db4 r2 = r6.h0
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r0.f0 = r8
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r8.e0
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1f
            java.lang.Object r0 = r8.Y
            db4 r0 = (defpackage.db4) r0
            fb4 r1 = r8.X
            java.lang.Object r8 = r8.f0
            ab4 r8 = (defpackage.ab4) r8
            defpackage.oi2.Y(r9)     // Catch: java.lang.Throwable -> L1c
            goto L8f
        L1c:
            r9 = move-exception
            goto La9
        L1f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r4
        L25:
            db4 r1 = r8.d0
            java.lang.Object r3 = r8.Z
            java.lang.Object r5 = r8.Y
            eo2 r5 = (defpackage.eo2) r5
            fb4 r6 = r8.X
            java.lang.Object r7 = r8.f0
            ab4 r7 = (defpackage.ab4) r7
            defpackage.oi2.Y(r9)
            r9 = r6
            r6 = r5
            r5 = r9
            r9 = r1
            r1 = r7
            goto L78
        L3c:
            defpackage.oi2.Y(r9)
            java.lang.Object r9 = r8.f0
            w61 r9 = (defpackage.w61) r9
            ab4 r1 = new ab4
            l61 r9 = r9.A()
            vs0 r5 = defpackage.vs0.h0
            j61 r9 = r9.Z(r5)
            r9.getClass()
            rc3 r9 = (defpackage.rc3) r9
            xa4 r5 = r8.g0
            r1.<init>(r5, r9)
            db4 r9 = r8.h0
            defpackage.db4.a(r9, r1)
            hb4 r5 = r9.b
            r8.f0 = r1
            r8.X = r5
            eo2 r6 = r8.i0
            r8.Y = r6
            java.lang.Object r7 = r8.j0
            r8.Z = r7
            r8.d0 = r9
            r8.e0 = r3
            java.lang.Object r3 = r5.e(r8)
            if (r3 != r0) goto L77
            goto L8a
        L77:
            r3 = r7
        L78:
            r8.f0 = r1     // Catch: java.lang.Throwable -> La4
            r8.X = r5     // Catch: java.lang.Throwable -> La4
            r8.Y = r9     // Catch: java.lang.Throwable -> La4
            r8.Z = r4     // Catch: java.lang.Throwable -> La4
            r8.d0 = r4     // Catch: java.lang.Throwable -> La4
            r8.e0 = r2     // Catch: java.lang.Throwable -> La4
            java.lang.Object r8 = r6.o(r3, r8)     // Catch: java.lang.Throwable -> La4
            if (r8 != r0) goto L8b
        L8a:
            return r0
        L8b:
            r0 = r9
            r9 = r8
            r8 = r1
            r1 = r5
        L8f:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La2
        L91:
            boolean r2 = r0.compareAndSet(r8, r4)     // Catch: java.lang.Throwable -> La2
            if (r2 == 0) goto L98
            goto L9e
        L98:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La2
            if (r2 == r8) goto L91
        L9e:
            r1.h(r4)
            return r9
        La2:
            r8 = move-exception
            goto Lb9
        La4:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r1
            r1 = r5
        La9:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La2
        Lab:
            boolean r2 = r0.compareAndSet(r8, r4)     // Catch: java.lang.Throwable -> La2
            if (r2 != 0) goto Lb8
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La2
            if (r2 != r8) goto Lb8
            goto Lab
        Lb8:
            throw r9     // Catch: java.lang.Throwable -> La2
        Lb9:
            r1.h(r4)
            throw r8
    }
}
