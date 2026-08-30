package h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o2 extends ec.j implements mc.p {
    public long X;
    public int Y;
    public /* synthetic */ long Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ p2 f5986b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(p2 p2Var, cc.c cVar) {
        super(2, cVar);
        this.f5986b0 = p2Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        long j2 = ((x4.q) obj).f14352a;
        o2 o2Var = new o2(this.f5986b0, (cc.c) obj2);
        o2Var.Z = j2;
        return o2Var.v(yb.y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        o2 o2Var = new o2(this.f5986b0, cVar);
        o2Var.Z = ((x4.q) obj).f14352a;
        return o2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (r15 == r0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r15) {
        /*
            r14 = this;
            dc.a r0 = dc.a.COROUTINE_SUSPENDED
            int r1 = r14.Y
            r2 = 3
            r3 = 2
            r4 = 1
            h1.p2 r5 = r14.f5986b0
            if (r1 == 0) goto L2e
            if (r1 == r4) goto L28
            if (r1 == r3) goto L20
            if (r1 != r2) goto L19
            long r0 = r14.X
            long r2 = r14.Z
            p7.j.I(r15)
            goto L70
        L19:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r15)
            r15 = 0
            return r15
        L20:
            long r3 = r14.X
            long r6 = r14.Z
            p7.j.I(r15)
            goto L56
        L28:
            long r6 = r14.Z
            p7.j.I(r15)
            goto L40
        L2e:
            p7.j.I(r15)
            long r6 = r14.Z
            b9.e r15 = r5.f5994f
            r14.Z = r6
            r14.Y = r4
            java.lang.Object r15 = r15.r(r6, r14)
            if (r15 != r0) goto L40
            goto L6d
        L40:
            x4.q r15 = (x4.q) r15
            long r8 = r15.f14352a
            long r8 = x4.q.d(r6, r8)
            r14.Z = r6
            r14.X = r8
            r14.Y = r3
            java.lang.Object r15 = r5.a(r8, r14)
            if (r15 != r0) goto L55
            goto L6d
        L55:
            r3 = r8
        L56:
            x4.q r15 = (x4.q) r15
            long r11 = r15.f14352a
            b9.e r8 = r5.f5994f
            long r9 = x4.q.d(r3, r11)
            r14.Z = r6
            r14.X = r11
            r14.Y = r2
            r13 = r14
            java.lang.Object r15 = r8.q(r9, r11, r13)
            if (r15 != r0) goto L6e
        L6d:
            return r0
        L6e:
            r2 = r6
            r0 = r11
        L70:
            x4.q r15 = (x4.q) r15
            long r4 = r15.f14352a
            long r0 = x4.q.d(r0, r4)
            long r0 = x4.q.d(r2, r0)
            x4.q r15 = new x4.q
            r15.<init>(r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.o2.v(java.lang.Object):java.lang.Object");
    }
}
