package f2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f0 extends ec.i implements mc.p {
    public final /* synthetic */ int L;
    public int R;
    public /* synthetic */ Object X;
    public final /* synthetic */ mc.l Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(int i2, cc.c cVar, mc.l lVar) {
        super(2, cVar);
        this.L = i2;
        this.Y = lVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        v3.f0 f0Var = (v3.f0) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.L) {
            case 0:
                return ((f0) t(cVar, f0Var)).v(yb.y.f14813a);
            default:
                return ((f0) t(cVar, f0Var)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.L) {
            case 0:
                f0 f0Var = new f0(0, cVar, this.Y);
                f0Var.X = obj;
                return f0Var;
            default:
                f0 f0Var2 = new f0(1, cVar, this.Y);
                f0Var2.X = obj;
                return f0Var2;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0088 -> B:32:0x008c). Please submit an issue!!! */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.L
            mc.l r1 = r9.Y
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L62;
                default: goto Lb;
            }
        Lb:
            dc.a r0 = dc.a.COROUTINE_SUSPENDED
            int r5 = r9.R
            r6 = 2
            if (r5 == 0) goto L26
            if (r5 == r3) goto L1e
            if (r5 != r6) goto L1a
            p7.j.I(r10)
            goto L58
        L1a:
            a0.j.p(r2)
            goto L61
        L1e:
            java.lang.Object r2 = r9.X
            v3.f0 r2 = (v3.f0) r2
            p7.j.I(r10)
            goto L39
        L26:
            p7.j.I(r10)
            java.lang.Object r10 = r9.X
            r2 = r10
            v3.f0 r2 = (v3.f0) r2
            r9.X = r2
            r9.R = r3
            java.lang.Object r10 = p7.o.a(r2, r9)
            if (r10 != r0) goto L39
            goto L56
        L39:
            v3.t r10 = (v3.t) r10
            r10.a()
            long r7 = r10.f13693c
            h3.b r10 = new h3.b
            r10.<init>(r7)
            r1.k(r10)
            r9.X = r4
            r9.R = r6
            h1.m0 r10 = h1.a3.f5853a
            v3.l r10 = v3.l.Main
            java.lang.Object r10 = h1.a3.h(r2, r10, r9)
            if (r10 != r0) goto L58
        L56:
            r4 = r0
            goto L61
        L58:
            v3.t r10 = (v3.t) r10
            if (r10 == 0) goto L5f
            r10.a()
        L5f:
            yb.y r4 = yb.y.f14813a
        L61:
            return r4
        L62:
            dc.a r0 = dc.a.COROUTINE_SUSPENDED
            int r5 = r9.R
            if (r5 == 0) goto L76
            if (r5 != r3) goto L72
            java.lang.Object r2 = r9.X
            v3.f0 r2 = (v3.f0) r2
            p7.j.I(r10)
            goto L8c
        L72:
            a0.j.p(r2)
            goto L8b
        L76:
            p7.j.I(r10)
            java.lang.Object r10 = r9.X
            v3.f0 r10 = (v3.f0) r10
            r2 = r10
        L7e:
            v3.l r10 = v3.l.Initial
            r9.X = r2
            r9.R = r3
            java.lang.Object r10 = r2.a(r10, r9)
            if (r10 != r0) goto L8c
            r4 = r0
        L8b:
            return r4
        L8c:
            v3.k r10 = (v3.k) r10
            boolean r10 = d0.d.Y(r10)
            r10 = r10 ^ r3
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r1.k(r10)
            goto L7e
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.f0.v(java.lang.Object):java.lang.Object");
    }
}
