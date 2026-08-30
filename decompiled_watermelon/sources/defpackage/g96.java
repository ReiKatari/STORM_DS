package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g96  reason: default package */
/* loaded from: classes.dex */
public final class g96 {
    public final dz4 a;
    public final ra4 b;
    public final fb4 c;
    public final ki2 d;
    public final aj2 e;
    public final ki2 f;

    public g96(dz4 dz4Var, ra4 ra4Var, fb4 fb4Var, iw3 iw3Var) {
        zv5 zv5Var = new zv5(3);
        gu5 gu5Var = new gu5(10);
        this.a = dz4Var;
        this.b = ra4Var;
        this.c = fb4Var;
        this.d = zv5Var;
        this.e = gu5Var;
        this.f = iw3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x03a3 -> B:57:0x03af). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.g96 r37, long r38, boolean r40, java.lang.String r41, java.lang.Long r42, defpackage.k11 r43) {
        /*
            Method dump skipped, instructions count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g96.a(g96, long, boolean, java.lang.String, java.lang.Long, k11):java.lang.Object");
    }

    public final void b(String str, ti4... ti4VarArr) {
        StringBuilder sb = new StringBuilder("event_type=");
        sb.append(str);
        for (ti4 ti4Var : ti4VarArr) {
            String str2 = (String) ti4Var.A;
            Object obj = ti4Var.B;
            if (obj != null) {
                sb.append(' ');
                sb.append(str2);
                sb.append('=');
                sb.append(gh6.k0(obj.toString(), ' ', '_'));
            }
        }
        this.e.j("RASubmission", sb.toString());
    }

    public final void c(String str, ti4... ti4VarArr) {
        StringBuilder u = b31.u("event_type=", str, " submit_path=smart_sync_engine");
        for (ti4 ti4Var : ti4VarArr) {
            String str2 = (String) ti4Var.A;
            Object obj = ti4Var.B;
            if (obj != null) {
                u.append(' ');
                u.append(str2);
                u.append('=');
                u.append(gh6.k0(obj.toString(), ' ', '_'));
            }
        }
        this.e.j("RATrace", u.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r11, java.lang.String r12, java.util.Set r13, defpackage.k11 r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.c96
            if (r0 == 0) goto L13
            r0 = r14
            c96 r0 = (defpackage.c96) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            c96 r0 = new c96
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.me2.a0(r14)
            goto L48
        L27:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r10)
            r10 = 0
            return r10
        L2e:
            defpackage.me2.a0(r14)
            bb1 r14 = defpackage.tg1.a
            ha1 r14 = defpackage.ha1.L
            e96 r4 = new e96
            r9 = 0
            r5 = r10
            r8 = r11
            r7 = r12
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.Y = r3
            java.lang.Object r14 = defpackage.tq5.G(r14, r4, r0)
            if (r14 != r1) goto L48
            return r1
        L48:
            nc5 r14 = (defpackage.nc5) r14
            java.lang.Object r10 = r14.A
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g96.d(java.lang.String, java.lang.String, java.util.Set, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r5, java.lang.String r6, defpackage.k11 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.f96
            if (r0 == 0) goto L13
            r0 = r7
            f96 r0 = (defpackage.f96) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            f96 r0 = new f96
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            defpackage.me2.a0(r7)
            nc5 r7 = (defpackage.nc5) r7
            java.lang.Object r4 = r7.A
            return r4
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L32:
            defpackage.me2.a0(r7)
            jb4 r7 = defpackage.jb4.SOFTCORE
            java.util.Set r7 = defpackage.hi2.X(r7)
            r0.Y = r3
            java.lang.Object r4 = r4.d(r5, r6, r7, r0)
            if (r4 != r1) goto L44
            return r1
        L44:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g96.e(java.lang.String, java.lang.String, k11):java.lang.Object");
    }
}
