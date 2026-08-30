package xg;

import mc.p;
import yb.y;
import zc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends ec.j implements p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ h Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = hVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        u uVar = (u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((g) t(cVar, uVar)).v(y.f14813a);
            default:
                return ((g) t(cVar, uVar)).v(y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new g(this.Z, cVar, 0);
            default:
                return new g(this.Z, cVar, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
        if (r12 == r6) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
        if (r12 == r6) goto L29;
     */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.X
            yb.y r1 = yb.y.f14813a
            xg.h r2 = r11.Z
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L33;
                default: goto Ld;
            }
        Ld:
            dc.a r0 = dc.a.COROUTINE_SUSPENDED
            int r6 = r11.Y
            if (r6 == 0) goto L1e
            if (r6 != r4) goto L19
            p7.j.I(r12)
            goto L32
        L19:
            a0.j.p(r3)
            r1 = r5
            goto L32
        L1e:
            p7.j.I(r12)
            gd.f r12 = zc.g0.f15015a
            xg.g r3 = new xg.g
            r6 = 0
            r3.<init>(r2, r5, r6)
            r11.Y = r4
            java.lang.Object r12 = zc.x.F(r12, r3, r11)
            if (r12 != r0) goto L32
            r1 = r0
        L32:
            return r1
        L33:
            kf.g r0 = r2.f14607b
            dc.a r6 = dc.a.COROUTINE_SUSPENDED
            int r7 = r11.Y
            r8 = 4
            r9 = 3
            r10 = 2
            if (r7 == 0) goto L58
            if (r7 == r4) goto L54
            if (r7 == r10) goto L50
            if (r7 == r9) goto L4c
            if (r7 != r8) goto L47
            goto L4c
        L47:
            a0.j.p(r3)
            r1 = r5
            goto L9f
        L4c:
            p7.j.I(r12)
            goto L9f
        L50:
            p7.j.I(r12)
            goto L75
        L54:
            p7.j.I(r12)
            goto L64
        L58:
            p7.j.I(r12)
            r11.Y = r4
            java.lang.Enum r12 = r0.g(r11)
            if (r12 != r6) goto L64
            goto L9e
        L64:
            re.c r12 = (re.c) r12
            boolean r12 = r12.isSuccess()
            if (r12 == 0) goto L8b
            r11.Y = r10
            java.io.Serializable r12 = r0.f(r11)
            if (r12 != r6) goto L75
            goto L9e
        L75:
            java.util.List r12 = (java.util.List) r12
            gd.f r0 = zc.g0.f15015a
            ad.e r0 = ed.n.f4465a
            ah.u0 r3 = new ah.u0
            r4 = 10
            r3.<init>(r2, r12, r5, r4)
            r11.Y = r9
            java.lang.Object r12 = zc.x.F(r0, r3, r11)
            if (r12 != r6) goto L9f
            goto L9e
        L8b:
            gd.f r12 = zc.g0.f15015a
            ad.e r12 = ed.n.f4465a
            a9.k r0 = new a9.k
            r3 = 9
            r0.<init>(r3, r5, r2)
            r11.Y = r8
            java.lang.Object r12 = zc.x.F(r12, r0, r11)
            if (r12 != r6) goto L9f
        L9e:
            r1 = r6
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xg.g.v(java.lang.Object):java.lang.Object");
    }
}
