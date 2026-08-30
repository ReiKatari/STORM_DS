package cd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ i f2844b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(i iVar, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.f2844b0 = iVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return ((n) t((cc.c) obj2, new bd.o(((bd.o) obj).f2192a))).v(yb.y.f14813a);
            default:
                return ((n) t((cc.c) obj2, obj)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                n nVar = new n(this.f2844b0, cVar, 0);
                nVar.Z = obj;
                return nVar;
            default:
                n nVar2 = new n(this.f2844b0, cVar, 1);
                nVar2.Z = obj;
                return nVar2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.X
            switch(r0) {
                case 0: goto L2c;
                default: goto L5;
            }
        L5:
            dc.a r0 = dc.a.COROUTINE_SUSPENDED
            int r1 = r3.Y
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L12
            p7.j.I(r4)
            goto L29
        L12:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r4)
            r0 = 0
            goto L2b
        L19:
            p7.j.I(r4)
            java.lang.Object r4 = r3.Z
            r3.Y = r2
            cd.i r1 = r3.f2844b0
            java.lang.Object r4 = r1.a(r4, r3)
            if (r4 != r0) goto L29
            goto L2b
        L29:
            yb.y r0 = yb.y.f14813a
        L2b:
            return r0
        L2c:
            dc.a r0 = dc.a.COROUTINE_SUSPENDED
            int r1 = r3.Y
            r2 = 1
            if (r1 == 0) goto L42
            if (r1 != r2) goto L3b
            java.lang.Object r0 = r3.Z
            p7.j.I(r4)
            goto L5d
        L3b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r4)
            r0 = 0
            goto L6f
        L42:
            p7.j.I(r4)
            java.lang.Object r4 = r3.Z
            bd.o r4 = (bd.o) r4
            java.lang.Object r4 = r4.f2192a
            boolean r1 = r4 instanceof bd.n
            if (r1 != 0) goto L5e
            r3.Z = r4
            r3.Y = r2
            cd.i r1 = r3.f2844b0
            java.lang.Object r1 = r1.a(r4, r3)
            if (r1 != r0) goto L5c
            goto L6f
        L5c:
            r0 = r4
        L5d:
            r4 = r0
        L5e:
            boolean r0 = r4 instanceof bd.m
            if (r0 == 0) goto L6d
            bd.m r4 = (bd.m) r4
            java.lang.Throwable r4 = r4.f2190a
            if (r4 != 0) goto L6c
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L6f
        L6c:
            throw r4
        L6d:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.n.v(java.lang.Object):java.lang.Object");
    }
}
