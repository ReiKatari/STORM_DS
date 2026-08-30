package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ga2  reason: default package */
/* loaded from: classes.dex */
public final class ga2 extends nk6 implements bj2 {
    public long X;
    public int Y;
    public /* synthetic */ Object Z;
    public /* synthetic */ Object c0;
    public final /* synthetic */ long d0;
    public final /* synthetic */ uj0 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga2(long j, uj0 uj0Var, j11 j11Var) {
        super(3, j11Var);
        this.d0 = j;
        this.e0 = uj0Var;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        ga2 ga2Var = new ga2(this.d0, this.e0, (j11) obj3);
        ga2Var.Z = (o31) obj;
        ga2Var.c0 = (w92) obj2;
        return ga2Var.v(o27.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0088 -> B:20:0x008b). Please submit an issue!!! */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L23
            if (r2 != r4) goto L1d
            long r6 = r0.X
            java.lang.Object r2 = r0.c0
            lj0 r2 = (defpackage.lj0) r2
            java.lang.Object r8 = r0.Z
            w92 r8 = (defpackage.w92) r8
            defpackage.me2.a0(r18)
            r9 = r18
            goto L8b
        L1d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r0)
            return r5
        L23:
            defpackage.me2.a0(r18)
            java.lang.Object r2 = r0.Z
            o31 r2 = (defpackage.o31) r2
            java.lang.Object r6 = r0.c0
            w92 r6 = (defpackage.w92) r6
            r7 = 0
            long r9 = r0.d0
            int r7 = defpackage.im1.c(r9, r7)
            if (r7 <= 0) goto L96
            uj0 r7 = r0.e0
            u92 r12 = defpackage.se.j(r7, r3)
            boolean r7 = r12 instanceof defpackage.nj0
            if (r7 == 0) goto L46
            r7 = r12
            nj0 r7 = (defpackage.nj0) r7
            goto L47
        L46:
            r7 = r5
        L47:
            if (r7 != 0) goto L54
            pj0 r11 = new pj0
            r15 = 0
            r16 = 14
            r13 = 0
            r14 = 0
            r11.<init>(r12, r13, r14, r15, r16)
            r7 = r11
        L54:
            lj0 r2 = r7.i(r2)
            r8 = r6
            r6 = r9
        L5a:
            jy5 r9 = new jy5
            e31 r10 = r0.B
            r10.getClass()
            r9.<init>(r10)
            q9 r10 = r2.j()
            ea2 r11 = new ea2
            r11.<init>(r8, r5, r3)
            r9.h(r10, r11)
            fa2 r10 = new fa2
            r10.<init>(r6, r5)
            long r11 = defpackage.dk7.J(r6)
            defpackage.io2.e0(r9, r11, r10)
            r0.Z = r8
            r0.c0 = r2
            r0.X = r6
            r0.Y = r4
            java.lang.Object r9 = r9.e(r0)
            if (r9 != r1) goto L8b
            return r1
        L8b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L5a
            o27 r0 = defpackage.o27.a
            return r0
        L96:
            lt6 r0 = new lt6
            java.lang.String r1 = "Timed out immediately"
            r0.<init>(r1, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ga2.v(java.lang.Object):java.lang.Object");
    }
}
