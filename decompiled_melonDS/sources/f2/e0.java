package f2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 extends ec.i implements mc.p {
    public final /* synthetic */ int L = 0;
    public long R;
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(long j2, nc.s sVar, cc.c cVar) {
        super(2, cVar);
        this.R = j2;
        this.Z = sVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        v3.f0 f0Var = (v3.f0) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.L) {
            case 0:
                return ((e0) t(cVar, f0Var)).v(yb.y.f14813a);
            default:
                return ((e0) t(cVar, f0Var)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.L) {
            case 0:
                e0 e0Var = new e0(this.R, (nc.s) this.Z, cVar);
                e0Var.Y = obj;
                return e0Var;
            default:
                e0 e0Var2 = new e0((v3.t) this.Z, cVar);
                e0Var2.Y = obj;
                return e0Var2;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0043 -> B:13:0x0046). Please submit an issue!!! */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.L
            switch(r0) {
                case 0: goto L50;
                default: goto L5;
            }
        L5:
            dc.a r0 = dc.a.COROUTINE_SUSPENDED
            int r1 = r7.X
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L18
            long r3 = r7.R
            java.lang.Object r1 = r7.Y
            v3.f0 r1 = (v3.f0) r1
            p7.j.I(r8)
            goto L46
        L18:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r8)
            r0 = 0
            goto L4f
        L1f:
            p7.j.I(r8)
            java.lang.Object r8 = r7.Y
            v3.f0 r8 = (v3.f0) r8
            java.lang.Object r1 = r7.Z
            v3.t r1 = (v3.t) r1
            long r3 = r1.f13692b
            b4.z2 r1 = r8.k()
            r1.getClass()
            r5 = 40
            long r5 = r5 + r3
            r1 = r8
            r3 = r5
        L38:
            r7.Y = r1
            r7.R = r3
            r7.X = r2
            r8 = 3
            java.lang.Object r8 = h1.a3.c(r1, r7, r8)
            if (r8 != r0) goto L46
            goto L4f
        L46:
            v3.t r8 = (v3.t) r8
            long r5 = r8.f13692b
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L38
            r0 = r8
        L4f:
            return r0
        L50:
            java.lang.Object r0 = r7.Z
            nc.s r0 = (nc.s) r0
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r7.X
            r3 = 1
            if (r2 == 0) goto L6c
            if (r2 != r3) goto L65
            java.lang.Object r1 = r7.Y
            v3.f0 r1 = (v3.f0) r1
            p7.j.I(r8)
            goto L88
        L65:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r8)
            r1 = 0
            goto Lba
        L6c:
            p7.j.I(r8)
            java.lang.Object r8 = r7.Y
            v3.f0 r8 = (v3.f0) r8
            long r4 = r7.R
            ai.s0 r2 = new ai.s0
            r6 = 4
            r2.<init>(r6, r0)
            r7.Y = r8
            r7.X = r3
            java.lang.Object r2 = h1.e0.c(r8, r4, r2, r7)
            if (r2 != r1) goto L86
            goto Lba
        L86:
            r1 = r8
            r8 = r2
        L88:
            v3.t r8 = (v3.t) r8
            if (r8 == 0) goto La0
            long r2 = r0.A
            r4 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r2 = r2 & r4
            r4 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto La0
            f2.k r1 = f2.k.Drag
            goto Lba
        La0:
            v3.h0 r8 = r1.Y
            v3.k r8 = r8.f13663n0
            java.lang.Object r8 = r8.f13678a
            java.lang.Object r8 = zb.l.R(r8)
            v3.t r8 = (v3.t) r8
            boolean r0 = v3.s.d(r8)
            if (r0 == 0) goto Lb8
            r8.a()
            f2.k r1 = f2.k.Up
            goto Lba
        Lb8:
            f2.k r1 = f2.k.Cancel
        Lba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.e0.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(v3.t tVar, cc.c cVar) {
        super(2, cVar);
        this.Z = tVar;
    }
}
