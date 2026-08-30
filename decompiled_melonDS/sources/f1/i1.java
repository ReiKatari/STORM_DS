package f1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i1 extends ec.j implements mc.p {
    public id.a X;
    public Object Y;
    public Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public j1 f4588b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f4589c0;

    /* renamed from: d0  reason: collision with root package name */
    public /* synthetic */ Object f4590d0;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ f1 f4591e0;

    /* renamed from: f0  reason: collision with root package name */
    public final /* synthetic */ j1 f4592f0;

    /* renamed from: g0  reason: collision with root package name */
    public final /* synthetic */ ec.j f4593g0;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f4594h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(f1 f1Var, j1 j1Var, mc.p pVar, Object obj, cc.c cVar) {
        super(2, cVar);
        this.f4591e0 = f1Var;
        this.f4592f0 = j1Var;
        this.f4593g0 = (ec.j) pVar;
        this.f4594h0 = obj;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((i1) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [ec.j, mc.p] */
    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        i1 i1Var = new i1(this.f4591e0, this.f4592f0, this.f4593g0, this.f4594h0, cVar);
        i1Var.f4590d0 = obj;
        return i1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098 A[Catch: all -> 0x00a2, TRY_LEAVE, TryCatch #0 {all -> 0x00a2, blocks: (B:22:0x008f, B:23:0x0091, B:26:0x0098, B:34:0x00a9, B:35:0x00ab, B:37:0x00b1, B:40:0x00b8), top: B:43:0x0007 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, id.a] */
    /* JADX WARN: Type inference failed for: r1v7, types: [id.a] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [mc.p] */
    /* JADX WARN: Type inference failed for: r6v1, types: [id.a] */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r9) {
        /*
            r8 = this;
            dc.a r0 = dc.a.COROUTINE_SUSPENDED
            int r1 = r8.f4589c0
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1f
            java.lang.Object r0 = r8.Y
            f1.j1 r0 = (f1.j1) r0
            id.a r1 = r8.X
            java.lang.Object r2 = r8.f4590d0
            f1.h1 r2 = (f1.h1) r2
            p7.j.I(r9)     // Catch: java.lang.Throwable -> L1c
            goto L8f
        L1c:
            r9 = move-exception
            goto La9
        L1f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r9)
            r9 = 0
            return r9
        L26:
            f1.j1 r1 = r8.f4588b0
            java.lang.Object r3 = r8.Z
            java.lang.Object r5 = r8.Y
            mc.p r5 = (mc.p) r5
            id.a r6 = r8.X
            java.lang.Object r7 = r8.f4590d0
            f1.h1 r7 = (f1.h1) r7
            p7.j.I(r9)
            r9 = r1
            r1 = r6
            goto L79
        L3a:
            p7.j.I(r9)
            java.lang.Object r9 = r8.f4590d0
            zc.u r9 = (zc.u) r9
            f1.h1 r1 = new f1.h1
            cc.g r9 = r9.v()
            zc.r r5 = zc.r.B
            cc.e r9 = r9.t(r5)
            r9.getClass()
            zc.y0 r9 = (zc.y0) r9
            f1.f1 r5 = r8.f4591e0
            r1.<init>(r5, r9)
            f1.j1 r9 = r8.f4592f0
            f1.j1.a(r9, r1)
            id.c r5 = r9.f4601b
            r8.f4590d0 = r1
            r8.X = r5
            ec.j r6 = r8.f4593g0
            r8.Y = r6
            java.lang.Object r7 = r8.f4594h0
            r8.Z = r7
            r8.f4588b0 = r9
            r8.f4589c0 = r3
            java.lang.Object r3 = r5.i(r8)
            if (r3 != r0) goto L75
            goto L8b
        L75:
            r3 = r7
            r7 = r1
            r1 = r5
            r5 = r6
        L79:
            r8.f4590d0 = r7     // Catch: java.lang.Throwable -> La4
            r8.X = r1     // Catch: java.lang.Throwable -> La4
            r8.Y = r9     // Catch: java.lang.Throwable -> La4
            r8.Z = r4     // Catch: java.lang.Throwable -> La4
            r8.f4588b0 = r4     // Catch: java.lang.Throwable -> La4
            r8.f4589c0 = r2     // Catch: java.lang.Throwable -> La4
            java.lang.Object r2 = r5.j(r3, r8)     // Catch: java.lang.Throwable -> La4
            if (r2 != r0) goto L8c
        L8b:
            return r0
        L8c:
            r0 = r9
            r9 = r2
            r2 = r7
        L8f:
            java.util.concurrent.atomic.AtomicReference r0 = r0.f4600a     // Catch: java.lang.Throwable -> La2
        L91:
            boolean r3 = r0.compareAndSet(r2, r4)     // Catch: java.lang.Throwable -> La2
            if (r3 == 0) goto L98
            goto L9e
        L98:
            java.lang.Object r3 = r0.get()     // Catch: java.lang.Throwable -> La2
            if (r3 == r2) goto L91
        L9e:
            r1.d(r4)
            return r9
        La2:
            r9 = move-exception
            goto Lb9
        La4:
            r0 = move-exception
            r2 = r0
            r0 = r9
            r9 = r2
            r2 = r7
        La9:
            java.util.concurrent.atomic.AtomicReference r0 = r0.f4600a     // Catch: java.lang.Throwable -> La2
        Lab:
            boolean r3 = r0.compareAndSet(r2, r4)     // Catch: java.lang.Throwable -> La2
            if (r3 != 0) goto Lb8
            java.lang.Object r3 = r0.get()     // Catch: java.lang.Throwable -> La2
            if (r3 != r2) goto Lb8
            goto Lab
        Lb8:
            throw r9     // Catch: java.lang.Throwable -> La2
        Lb9:
            r1.d(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.i1.v(java.lang.Object):java.lang.Object");
    }
}
