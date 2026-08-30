package dd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o implements cd.i {
    public final /* synthetic */ bd.h A;
    public final /* synthetic */ int B;

    public o(bd.h hVar, int i2) {
        this.A = hVar;
        this.B = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r6.A.b(r0, r8) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092 A[RETURN] */
    @Override // cd.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r7, cc.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof dd.n
            if (r0 == 0) goto L13
            r0 = r8
            dd.n r0 = (dd.n) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            dd.n r0 = new dd.n
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            yb.y r3 = yb.y.f14813a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2d
            p7.j.I(r8)
            goto L92
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r7)
            r7 = 0
            return r7
        L34:
            p7.j.I(r8)
            goto L4d
        L38:
            p7.j.I(r8)
            zb.t r8 = new zb.t
            int r2 = r6.B
            r8.<init>(r2, r7)
            r0.Y = r5
            bd.h r7 = r6.A
            java.lang.Object r7 = r7.b(r0, r8)
            if (r7 != r1) goto L4d
            goto L91
        L4d:
            r0.Y = r4
            cc.g r7 = r0.g()
            zc.x.j(r7)
            cc.c r8 = pc.a.A(r0)
            boolean r0 = r8 instanceof ed.f
            if (r0 == 0) goto L61
            ed.f r8 = (ed.f) r8
            goto L62
        L61:
            r8 = 0
        L62:
            if (r8 != 0) goto L66
            r7 = r3
            goto L89
        L66:
            zc.q r0 = r8.R
            boolean r2 = ed.b.j(r0, r7)
            if (r2 == 0) goto L76
            r8.Y = r3
            r8.L = r5
            r0.Y(r7, r8)
            goto L88
        L76:
            zc.w1 r2 = new zc.w1
            zc.r r4 = zc.w1.B
            r2.<init>(r4)
            cc.g r7 = r7.H(r2)
            r8.Y = r3
            r8.L = r5
            r0.Y(r7, r8)
        L88:
            r7 = r1
        L89:
            dc.a r8 = dc.a.COROUTINE_SUSPENDED
            if (r7 != r8) goto L8e
            goto L8f
        L8e:
            r7 = r3
        L8f:
            if (r7 != r1) goto L92
        L91:
            return r1
        L92:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.o.a(java.lang.Object, cc.c):java.lang.Object");
    }
}
