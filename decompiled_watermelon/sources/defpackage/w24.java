package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w24  reason: default package */
/* loaded from: classes.dex */
public final class w24 extends nk6 implements aj2 {
    public z24 X;
    public Object Y;
    public Object Z;
    public x24 c0;
    public int d0;
    public /* synthetic */ Object e0;
    public final /* synthetic */ r24 f0;
    public final /* synthetic */ x24 g0;
    public final /* synthetic */ aj2 h0;
    public final /* synthetic */ Object i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w24(r24 r24Var, x24 x24Var, aj2 aj2Var, Object obj, j11 j11Var) {
        super(2, j11Var);
        this.f0 = r24Var;
        this.g0 = x24Var;
        this.h0 = aj2Var;
        this.i0 = obj;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((w24) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        w24 w24Var = new w24(this.f0, this.g0, this.h0, this.i0, j11Var);
        w24Var.e0 = obj;
        return w24Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098 A[Catch: all -> 0x00a2, TRY_LEAVE, TryCatch #0 {all -> 0x00a2, blocks: (B:22:0x008f, B:23:0x0091, B:26:0x0098, B:34:0x00a9, B:35:0x00ab, B:37:0x00b1, B:40:0x00b8), top: B:43:0x0007 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, z24] */
    /* JADX WARN: Type inference failed for: r6v2, types: [z24] */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r9) {
        /*
            r8 = this;
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r1 = r8.d0
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1f
            java.lang.Object r0 = r8.Y
            x24 r0 = (defpackage.x24) r0
            z24 r1 = r8.X
            java.lang.Object r8 = r8.e0
            u24 r8 = (defpackage.u24) r8
            defpackage.me2.a0(r9)     // Catch: java.lang.Throwable -> L1c
            goto L8f
        L1c:
            r9 = move-exception
            goto La9
        L1f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r8)
            return r4
        L25:
            x24 r1 = r8.c0
            java.lang.Object r3 = r8.Z
            java.lang.Object r5 = r8.Y
            aj2 r5 = (defpackage.aj2) r5
            z24 r6 = r8.X
            java.lang.Object r7 = r8.e0
            u24 r7 = (defpackage.u24) r7
            defpackage.me2.a0(r9)
            r9 = r6
            r6 = r5
            r5 = r9
            r9 = r1
            r1 = r7
            goto L78
        L3c:
            defpackage.me2.a0(r9)
            java.lang.Object r9 = r8.e0
            o31 r9 = (defpackage.o31) r9
            u24 r1 = new u24
            e31 r9 = r9.w()
            k45 r5 = defpackage.k45.d0
            c31 r9 = r9.I(r5)
            r9.getClass()
            c63 r9 = (defpackage.c63) r9
            r24 r5 = r8.f0
            r1.<init>(r5, r9)
            x24 r9 = r8.g0
            defpackage.x24.a(r9, r1)
            b34 r5 = r9.b
            r8.e0 = r1
            r8.X = r5
            aj2 r6 = r8.h0
            r8.Y = r6
            java.lang.Object r7 = r8.i0
            r8.Z = r7
            r8.c0 = r9
            r8.d0 = r3
            java.lang.Object r3 = r5.i(r8)
            if (r3 != r0) goto L77
            goto L8a
        L77:
            r3 = r7
        L78:
            r8.e0 = r1     // Catch: java.lang.Throwable -> La4
            r8.X = r5     // Catch: java.lang.Throwable -> La4
            r8.Y = r9     // Catch: java.lang.Throwable -> La4
            r8.Z = r4     // Catch: java.lang.Throwable -> La4
            r8.c0 = r4     // Catch: java.lang.Throwable -> La4
            r8.d0 = r2     // Catch: java.lang.Throwable -> La4
            java.lang.Object r8 = r6.j(r3, r8)     // Catch: java.lang.Throwable -> La4
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
            r1.d(r4)
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
            r1.d(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w24.v(java.lang.Object):java.lang.Object");
    }
}
