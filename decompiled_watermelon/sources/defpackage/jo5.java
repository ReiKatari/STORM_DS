package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jo5  reason: default package */
/* loaded from: classes.dex */
public final class jo5 extends nk6 implements bj2 {
    public int X;
    public /* synthetic */ w92 Y;
    public /* synthetic */ Object[] Z;
    public final /* synthetic */ yo5 c0;
    public w92 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo5(j11 j11Var, yo5 yo5Var) {
        super(3, j11Var);
        this.c0 = yo5Var;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        jo5 jo5Var = new jo5((j11) obj3, this.c0);
        jo5Var.Y = (w92) obj;
        jo5Var.Z = (Object[]) obj2;
        return jo5Var.v(o27.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008a, code lost:
        if (r4 == r1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0099, code lost:
        if (r2.b(r4, r20) == r1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009b, code lost:
        return r1;
     */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.X
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L22
            if (r2 == r4) goto L1a
            if (r2 != r3) goto L14
            defpackage.me2.a0(r21)
            goto L9c
        L14:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r0)
            return r5
        L1a:
            w92 r2 = r0.d0
            defpackage.me2.a0(r21)
            r4 = r21
            goto L8d
        L22:
            defpackage.me2.a0(r21)
            w92 r2 = r0.Y
            java.lang.Object[] r6 = r0.Z
            r7 = 0
            r7 = r6[r7]
            r7.getClass()
            ti4 r7 = (defpackage.ti4) r7
            java.lang.Object r8 = r7.A
            r10 = r8
            java.util.List r10 = (java.util.List) r10
            r8 = r6[r4]
            r8.getClass()
            r12 = r8
            java.lang.String r12 = (java.lang.String) r12
            r8 = r6[r3]
            r8.getClass()
            r18 = r8
            java.util.List r18 = (java.util.List) r18
            r8 = 3
            r8 = r6[r8]
            r8.getClass()
            r11 = r8
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r7 = r7.B
            r15 = r7
            qb6 r15 = (defpackage.qb6) r15
            yo5 r7 = r0.c0
            ee6 r8 = r7.o
            java.lang.Object r8 = r8.getValue()
            r16 = r8
            rb6 r16 = (defpackage.rb6) r16
            r8 = 4
            r8 = r6[r8]
            r8.getClass()
            r14 = r8
            bm5 r14 = (defpackage.bm5) r14
            r8 = 5
            r6 = r6[r8]
            r6.getClass()
            r13 = r6
            tp5 r13 = (defpackage.tp5) r13
            r0.Y = r5
            r0.Z = r5
            r0.d0 = r2
            r0.X = r4
            bb1 r4 = defpackage.tg1.a
            to5 r9 = new to5
            r19 = 0
            r17 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r4 = defpackage.tq5.G(r4, r9, r0)
            if (r4 != r1) goto L8d
            goto L9b
        L8d:
            r0.Y = r5
            r0.Z = r5
            r0.d0 = r5
            r0.X = r3
            java.lang.Object r0 = r2.b(r4, r0)
            if (r0 != r1) goto L9c
        L9b:
            return r1
        L9c:
            o27 r0 = defpackage.o27.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo5.v(java.lang.Object):java.lang.Object");
    }
}
