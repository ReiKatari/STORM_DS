package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xe2  reason: default package */
/* loaded from: classes.dex */
public final class xe2 extends hw6 implements fo2 {
    public long X;
    public int Y;
    public /* synthetic */ Object Z;
    public /* synthetic */ Object d0;
    public final /* synthetic */ long e0;
    public final /* synthetic */ dm0 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe2(long j, dm0 dm0Var, r41 r41Var) {
        super(3, r41Var);
        this.e0 = j;
        this.f0 = dm0Var;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        xe2 xe2Var = new xe2(this.e0, this.f0, (r41) obj3);
        xe2Var.Z = (w61) obj;
        xe2Var.d0 = (ne2) obj2;
        return xe2Var.s(jg7.a);
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
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object s(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L23
            if (r2 != r4) goto L1d
            long r6 = r0.X
            java.lang.Object r2 = r0.d0
            ul0 r2 = (defpackage.ul0) r2
            java.lang.Object r8 = r0.Z
            ne2 r8 = (defpackage.ne2) r8
            defpackage.oi2.Y(r18)
            r9 = r18
            goto L8b
        L1d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r5
        L23:
            defpackage.oi2.Y(r18)
            java.lang.Object r2 = r0.Z
            w61 r2 = (defpackage.w61) r2
            java.lang.Object r6 = r0.d0
            ne2 r6 = (defpackage.ne2) r6
            r7 = 0
            long r9 = r0.e0
            int r7 = defpackage.oq1.c(r9, r7)
            if (r7 <= 0) goto L96
            dm0 r7 = r0.f0
            le2 r12 = defpackage.f04.o(r7, r3)
            boolean r7 = r12 instanceof defpackage.wl0
            if (r7 == 0) goto L46
            r7 = r12
            wl0 r7 = (defpackage.wl0) r7
            goto L47
        L46:
            r7 = r5
        L47:
            if (r7 != 0) goto L54
            yl0 r11 = new yl0
            r15 = 0
            r16 = 14
            r13 = 0
            r14 = 0
            r11.<init>(r12, r13, r14, r15, r16)
            r7 = r11
        L54:
            ul0 r2 = r7.i(r2)
            r8 = r6
            r6 = r9
        L5a:
            v96 r9 = new v96
            l61 r10 = r0.B
            r10.getClass()
            r9.<init>(r10)
            eb r10 = r2.l()
            ve2 r11 = new ve2
            r11.<init>(r8, r5, r3)
            r9.h(r10, r11)
            we2 r10 = new we2
            r10.<init>(r6, r5)
            long r11 = defpackage.q60.Y(r6)
            defpackage.ii2.I(r9, r11, r10)
            r0.Z = r8
            r0.d0 = r2
            r0.X = r6
            r0.Y = r4
            java.lang.Object r9 = r9.e(r0)
            if (r9 != r1) goto L8b
            return r1
        L8b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L5a
            jg7 r0 = defpackage.jg7.a
            return r0
        L96:
            c67 r0 = new c67
            java.lang.String r1 = "Timed out immediately"
            r0.<init>(r1, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xe2.s(java.lang.Object):java.lang.Object");
    }
}
