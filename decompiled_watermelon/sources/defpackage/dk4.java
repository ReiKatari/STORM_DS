package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dk4  reason: default package */
/* loaded from: classes.dex */
public final class dk4 implements qw6, h45 {
    public final aj2 a;
    public final ls5 b;
    public final AtomicInteger c;
    public pw6 d;

    public dk4(aj2 aj2Var, ls5 ls5Var) {
        ls5Var.getClass();
        this.a = aj2Var;
        this.b = ls5Var;
        this.c = new AtomicInteger(0);
    }

    @Override // defpackage.qw6
    public final Object a(pw6 pw6Var, aj2 aj2Var, nk6 nk6Var) {
        Object j = this.a.j(new mc(this, pw6Var, aj2Var, null, 2), nk6Var);
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r13 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    @Override // defpackage.fq4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r11, defpackage.mi2 r12, defpackage.k11 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.ck4
            if (r0 == 0) goto L13
            r0 = r13
            ck4 r0 = (defpackage.ck4) r0
            int r1 = r0.c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c0 = r1
            goto L18
        L13:
            ck4 r0 = new ck4
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.Y
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.c0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            defpackage.me2.a0(r13)
            return r13
        L2a:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r10)
            r10 = 0
            return r10
        L31:
            mi2 r12 = r0.X
            java.lang.String r11 = r0.R
            defpackage.me2.a0(r13)
        L38:
            r6 = r11
            r7 = r12
            goto L4b
        L3b:
            defpackage.me2.a0(r13)
            r0.R = r11
            r0.X = r12
            r0.c0 = r4
            java.lang.Boolean r13 = r10.d(r0)
            if (r13 != r1) goto L38
            goto L69
        L4b:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r11 = r13.booleanValue()
            r8 = 0
            if (r11 == 0) goto L6b
            pf0 r4 = new pf0
            r9 = 1
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.R = r8
            r0.X = r8
            r0.c0 = r3
            aj2 r10 = r5.a
            java.lang.Object r10 = r10.j(r4, r0)
            if (r10 != r1) goto L6a
        L69:
            return r1
        L6a:
            return r10
        L6b:
            r5 = r10
            ls5 r10 = r5.b
            ns5 r10 = r10.i0(r6)
            java.lang.Object r11 = r7.n(r10)     // Catch: java.lang.Throwable -> L7a
            defpackage.iq2.h(r10, r8)
            return r11
        L7a:
            r0 = move-exception
            r11 = r0
            throw r11     // Catch: java.lang.Throwable -> L7d
        L7d:
            r0 = move-exception
            r12 = r0
            defpackage.iq2.h(r10, r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk4.b(java.lang.String, mi2, k11):java.lang.Object");
    }

    @Override // defpackage.h45
    public final ls5 c() {
        return this.b;
    }

    @Override // defpackage.qw6
    public final Boolean d(j11 j11Var) {
        boolean z;
        if (this.d == null && !this.b.G()) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.pw6 r9, defpackage.aj2 r10, defpackage.k11 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.bk4
            if (r0 == 0) goto L13
            r0 = r11
            bk4 r0 = (defpackage.bk4) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            bk4 r0 = new bk4
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            java.lang.String r3 = "ROLLBACK TRANSACTION"
            r4 = 0
            java.util.concurrent.atomic.AtomicInteger r5 = r8.c
            r6 = 1
            ls5 r7 = r8.b
            if (r2 == 0) goto L38
            if (r2 != r6) goto L32
            int r6 = r0.R
            defpackage.me2.a0(r11)     // Catch: java.lang.Throwable -> L30
            goto L79
        L30:
            r9 = move-exception
            goto L8d
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r8)
            return r4
        L38:
            defpackage.me2.a0(r11)
            int[] r11 = defpackage.ak4.a
            int r2 = r9.ordinal()
            r11 = r11[r2]
            if (r11 == r6) goto L5b
            r2 = 2
            if (r11 == r2) goto L55
            r2 = 3
            if (r11 != r2) goto L51
            java.lang.String r11 = "BEGIN EXCLUSIVE TRANSACTION"
            defpackage.yf2.o(r7, r11)
            goto L60
        L51:
            defpackage.i.c()
            return r4
        L55:
            java.lang.String r11 = "BEGIN IMMEDIATE TRANSACTION"
            defpackage.yf2.o(r7, r11)
            goto L60
        L5b:
            java.lang.String r11 = "BEGIN DEFERRED TRANSACTION"
            defpackage.yf2.o(r7, r11)
        L60:
            int r11 = r5.incrementAndGet()
            if (r11 <= 0) goto L68
            r8.d = r9
        L68:
            zj4 r9 = new zj4     // Catch: java.lang.Throwable -> L30
            r11 = 0
            r9.<init>(r11, r8)     // Catch: java.lang.Throwable -> L30
            r0.R = r6     // Catch: java.lang.Throwable -> L30
            r0.Z = r6     // Catch: java.lang.Throwable -> L30
            java.lang.Object r11 = r10.j(r9, r0)     // Catch: java.lang.Throwable -> L30
            if (r11 != r1) goto L79
            return r1
        L79:
            int r9 = r5.decrementAndGet()
            if (r9 != 0) goto L81
            r8.d = r4
        L81:
            if (r6 == 0) goto L89
            java.lang.String r8 = "END TRANSACTION"
            defpackage.yf2.o(r7, r8)
            return r11
        L89:
            defpackage.yf2.o(r7, r3)
            return r11
        L8d:
            throw r9     // Catch: java.lang.Throwable -> L8e
        L8e:
            r10 = move-exception
            int r11 = r5.decrementAndGet()     // Catch: android.database.SQLException -> L98
            if (r11 != 0) goto L9a
            r8.d = r4     // Catch: android.database.SQLException -> L98
            goto L9a
        L98:
            r8 = move-exception
            goto L9e
        L9a:
            defpackage.yf2.o(r7, r3)     // Catch: android.database.SQLException -> L98
            goto La1
        L9e:
            defpackage.pu.k(r9, r8)
        La1:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk4.e(pw6, aj2, k11):java.lang.Object");
    }
}
