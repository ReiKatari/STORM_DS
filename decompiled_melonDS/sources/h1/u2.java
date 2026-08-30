package h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u2 extends ec.i implements mc.p {
    public zc.l1 L;
    public int R;
    public /* synthetic */ Object X;
    public final /* synthetic */ zc.u Y;
    public final /* synthetic */ ec.j Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ mc.l f6013b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ r1 f6014c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(zc.u uVar, mc.q qVar, mc.l lVar, r1 r1Var, cc.c cVar) {
        super(2, cVar);
        this.Y = uVar;
        this.Z = (ec.j) qVar;
        this.f6013b0 = lVar;
        this.f6014c0 = r1Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((u2) t((cc.c) obj2, (v3.f0) obj)).v(yb.y.f14813a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ec.j, mc.q] */
    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        u2 u2Var = new u2(this.Y, this.Z, this.f6013b0, this.f6014c0, cVar);
        u2Var.X = obj;
        return u2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Type inference failed for: r10v0, types: [ec.j, mc.q] */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r13) {
        /*
            r12 = this;
            dc.a r0 = dc.a.COROUTINE_SUSPENDED
            int r1 = r12.R
            r2 = 0
            zc.u r3 = r12.Y
            r4 = 2
            r5 = 1
            h1.r1 r6 = r12.f6014c0
            r7 = 0
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L20
            if (r1 != r4) goto L1a
            java.lang.Object r0 = r12.X
            zc.y0 r0 = (zc.y0) r0
            p7.j.I(r13)
            goto L73
        L1a:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r13)
            return r7
        L20:
            zc.l1 r1 = r12.L
            java.lang.Object r8 = r12.X
            v3.f0 r8 = (v3.f0) r8
            p7.j.I(r13)
            goto L50
        L2a:
            p7.j.I(r13)
            java.lang.Object r13 = r12.X
            r8 = r13
            v3.f0 r8 = (v3.f0) r8
            h1.m0 r13 = h1.a3.f5853a
            zc.w r13 = zc.w.UNDISPATCHED
            h1.t2 r1 = new h1.t2
            r1.<init>(r6, r7, r2)
            zc.l1 r13 = zc.x.v(r3, r7, r13, r1, r5)
            r12.X = r8
            r12.L = r13
            r12.R = r5
            r1 = 3
            java.lang.Object r1 = h1.a3.c(r8, r12, r1)
            if (r1 != r0) goto L4d
            goto L71
        L4d:
            r11 = r1
            r1 = r13
            r13 = r11
        L50:
            v3.t r13 = (v3.t) r13
            r13.a()
            h1.m0 r9 = h1.a3.f5853a
            ec.j r10 = r12.Z
            if (r10 == r9) goto L63
            a2.o r9 = new a2.o
            r9.<init>(r10, r6, r13, r7)
            h1.a3.f(r3, r1, r9)
        L63:
            r12.X = r1
            r12.L = r7
            r12.R = r4
            v3.l r13 = v3.l.Main
            java.lang.Object r13 = h1.a3.h(r8, r13, r12)
            if (r13 != r0) goto L72
        L71:
            return r0
        L72:
            r0 = r1
        L73:
            v3.t r13 = (v3.t) r13
            if (r13 != 0) goto L80
            h1.s2 r13 = new h1.s2
            r13.<init>(r6, r7, r2)
            h1.a3.f(r3, r0, r13)
            goto L97
        L80:
            r13.a()
            h1.s2 r1 = new h1.s2
            r1.<init>(r6, r7, r5)
            h1.a3.f(r3, r0, r1)
            long r0 = r13.f13693c
            h3.b r13 = new h3.b
            r13.<init>(r0)
            mc.l r0 = r12.f6013b0
            r0.k(r13)
        L97:
            yb.y r13 = yb.y.f14813a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.u2.v(java.lang.Object):java.lang.Object");
    }
}
