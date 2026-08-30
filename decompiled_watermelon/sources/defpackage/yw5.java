package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yw5  reason: default package */
/* loaded from: classes.dex */
public final class yw5 extends nk6 implements aj2 {
    public long X;
    public int Y;
    public /* synthetic */ long Z;
    public final /* synthetic */ ax5 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw5(ax5 ax5Var, j11 j11Var) {
        super(2, j11Var);
        this.c0 = ax5Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        long j = ((p77) obj).a;
        yw5 yw5Var = new yw5(this.c0, (j11) obj2);
        yw5Var.Z = j;
        return yw5Var.v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        yw5 yw5Var = new yw5(this.c0, j11Var);
        yw5Var.Z = ((p77) obj).a;
        return yw5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (r15 == r0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r15) {
        /*
            r14 = this;
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r1 = r14.Y
            r2 = 3
            r3 = 2
            r4 = 1
            ax5 r5 = r14.c0
            if (r1 == 0) goto L2e
            if (r1 == r4) goto L28
            if (r1 == r3) goto L20
            if (r1 != r2) goto L19
            long r0 = r14.X
            long r2 = r14.Z
            defpackage.me2.a0(r15)
            goto L70
        L19:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r14)
            r14 = 0
            return r14
        L20:
            long r3 = r14.X
            long r6 = r14.Z
            defpackage.me2.a0(r15)
            goto L56
        L28:
            long r6 = r14.Z
            defpackage.me2.a0(r15)
            goto L40
        L2e:
            defpackage.me2.a0(r15)
            long r6 = r14.Z
            q9 r15 = r5.f
            r14.Z = r6
            r14.Y = r4
            java.lang.Object r15 = r15.x(r6, r14)
            if (r15 != r0) goto L40
            goto L6d
        L40:
            p77 r15 = (defpackage.p77) r15
            long r8 = r15.a
            long r8 = defpackage.p77.d(r6, r8)
            r14.Z = r6
            r14.X = r8
            r14.Y = r3
            java.lang.Object r15 = r5.a(r8, r14)
            if (r15 != r0) goto L55
            goto L6d
        L55:
            r3 = r8
        L56:
            p77 r15 = (defpackage.p77) r15
            long r11 = r15.a
            q9 r8 = r5.f
            long r9 = defpackage.p77.d(r3, r11)
            r14.Z = r6
            r14.X = r11
            r14.Y = r2
            r13 = r14
            java.lang.Object r15 = r8.w(r9, r11, r13)
            if (r15 != r0) goto L6e
        L6d:
            return r0
        L6e:
            r2 = r6
            r0 = r11
        L70:
            p77 r15 = (defpackage.p77) r15
            long r14 = r15.a
            long r14 = defpackage.p77.d(r0, r14)
            long r14 = defpackage.p77.d(r2, r14)
            p77 r0 = new p77
            r0.<init>(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yw5.v(java.lang.Object):java.lang.Object");
    }
}
