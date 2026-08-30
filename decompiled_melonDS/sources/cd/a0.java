package cd;

import java.io.Serializable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 implements i {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public a0(i iVar, mc.p pVar) {
        this.A = 4;
        this.B = iVar;
        this.L = (ec.j) pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:275:0x052c, code lost:
        if (r1.hasVibrator() != false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x052e, code lost:
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0538, code lost:
        if (r1.hasVibrator() != false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x053b, code lost:
        if (r2 == null) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x053d, code lost:
        r0.add(r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:466:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:481:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.Object, l2.g] */
    /* JADX WARN: Type inference failed for: r2v20, types: [ec.j, mc.p] */
    @Override // cd.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r13, cc.c r14) {
        /*
            Method dump skipped, instructions count: 1980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.a0.a(java.lang.Object, cc.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(int r6, cc.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof cd.l1
            if (r0 == 0) goto L13
            r0 = r7
            cd.l1 r0 = (cd.l1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            cd.l1 r0 = new cd.l1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            yb.y r3 = yb.y.f14813a
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L29
            p7.j.I(r7)
            return r3
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r6)
            r6 = 0
            return r6
        L30:
            p7.j.I(r7)
            if (r6 <= 0) goto L4e
            java.lang.Object r6 = r5.L
            nc.p r6 = (nc.p) r6
            boolean r7 = r6.A
            if (r7 != 0) goto L4e
            r6.A = r4
            java.lang.Object r6 = r5.B
            cd.i r6 = (cd.i) r6
            cd.g1 r7 = cd.g1.START
            r0.Y = r4
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.a0.b(int, cc.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
        if (d1.d.e(-1.0f, 0.0f, 0.0f, r6, r7, r8, 4) == r2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
        if (zc.x.h(5500, r8) != r2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
        if (d1.d.e(0.0f, -1.0f, 0.0f, r6, r7, r8, 4) == r2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(hh.i0 r14, cc.c r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.L
            n2.b1 r0 = (n2.b1) r0
            java.lang.Object r1 = r13.B
            n2.w0 r1 = (n2.w0) r1
            boolean r2 = r15 instanceof mh.f0
            if (r2 == 0) goto L1c
            r2 = r15
            mh.f0 r2 = (mh.f0) r2
            int r3 = r2.Y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1c
            int r3 = r3 - r4
            r2.Y = r3
        L1a:
            r8 = r2
            goto L22
        L1c:
            mh.f0 r2 = new mh.f0
            r2.<init>(r13, r15)
            goto L1a
        L22:
            java.lang.Object r15 = r8.R
            dc.a r2 = dc.a.COROUTINE_SUSPENDED
            int r3 = r8.Y
            r10 = 2
            r4 = 1
            r11 = 0
            r12 = 3
            if (r3 == 0) goto L47
            if (r3 == r4) goto L43
            if (r3 == r10) goto L3f
            if (r3 != r12) goto L38
            p7.j.I(r15)
            goto L8c
        L38:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r14)
            r14 = 0
            return r14
        L3f:
            p7.j.I(r15)
            goto L72
        L43:
            p7.j.I(r15)
            goto L67
        L47:
            p7.j.I(r15)
            r1.setValue(r14)
            a0.j r14 = d1.w.f3689c
            d1.v1 r6 = d1.d.r(r11, r11, r14, r12)
            mh.s r7 = new mh.s
            r14 = 2
            r7.<init>(r0, r14)
            r8.Y = r4
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 0
            r5 = 0
            r9 = 4
            java.lang.Object r14 = d1.d.e(r3, r4, r5, r6, r7, r8, r9)
            if (r14 != r2) goto L67
            goto L8b
        L67:
            r8.Y = r10
            r14 = 5500(0x157c, double:2.7174E-320)
            java.lang.Object r14 = zc.x.h(r14, r8)
            if (r14 != r2) goto L72
            goto L8b
        L72:
            a0.j r14 = d1.w.f3689c
            d1.v1 r6 = d1.d.r(r11, r11, r14, r12)
            mh.s r7 = new mh.s
            r14 = 3
            r7.<init>(r0, r14)
            r8.Y = r12
            r3 = 0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 0
            r9 = 4
            java.lang.Object r14 = d1.d.e(r3, r4, r5, r6, r7, r8, r9)
            if (r14 != r2) goto L8c
        L8b:
            return r2
        L8c:
            r14 = 0
            r1.setValue(r14)
            yb.y r14 = yb.y.f14813a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.a0.c(hh.i0, cc.c):java.lang.Object");
    }

    public /* synthetic */ a0(int i2, Object obj, Object obj2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
    }

    public /* synthetic */ a0(Serializable serializable, i iVar, int i2) {
        this.A = i2;
        this.L = serializable;
        this.B = iVar;
    }
}
