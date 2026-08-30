package defpackage;

import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: eq4  reason: default package */
/* loaded from: classes.dex */
public final class eq4 {
    public final int a;
    public final ki2 b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final dx0[] f;
    public final wz5 g;
    public final xt h;

    /* JADX WARN: Type inference failed for: r2v4, types: [vz5, wz5] */
    public eq4(int i, ki2 ki2Var) {
        this.a = i;
        this.b = ki2Var;
        this.f = new dx0[i];
        int i2 = xz5.a;
        this.g = new vz5(i);
        this.h = new xt(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047 A[Catch: all -> 0x007a, TryCatch #2 {all -> 0x0078, blocks: (B:17:0x003e, B:27:0x0074, B:18:0x0043, B:20:0x0047, B:22:0x004d, B:25:0x0054, B:26:0x006e, B:33:0x007c, B:34:0x0083), top: B:39:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c A[Catch: all -> 0x007a, TRY_ENTER, TryCatch #2 {all -> 0x0078, blocks: (B:17:0x003e, B:27:0x0074, B:18:0x0043, B:20:0x0047, B:22:0x004d, B:25:0x0054, B:26:0x006e, B:33:0x007c, B:34:0x0083), top: B:39:0x003e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.k11 r8) {
        /*
            r7 = this;
            xt r0 = r7.h
            boolean r1 = r8 instanceof defpackage.cq4
            if (r1 == 0) goto L15
            r1 = r8
            cq4 r1 = (defpackage.cq4) r1
            int r2 = r1.Y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Y = r2
            goto L1a
        L15:
            cq4 r1 = new cq4
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.R
            p31 r2 = defpackage.p31.COROUTINE_SUSPENDED
            int r3 = r1.Y
            r4 = 0
            wz5 r5 = r7.g
            r6 = 1
            if (r3 == 0) goto L32
            if (r3 != r6) goto L2c
            defpackage.me2.a0(r8)
            goto L3e
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r7)
            return r4
        L32:
            defpackage.me2.a0(r8)
            r1.Y = r6
            java.lang.Object r8 = r5.a(r1)
            if (r8 != r2) goto L3e
            return r2
        L3e:
            java.util.concurrent.locks.ReentrantLock r8 = r7.c     // Catch: java.lang.Throwable -> L78
            r8.lock()     // Catch: java.lang.Throwable -> L78
            boolean r1 = r7.e     // Catch: java.lang.Throwable -> L7a
            if (r1 != 0) goto L7c
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L6e
            int r1 = r7.d     // Catch: java.lang.Throwable -> L7a
            int r2 = r7.a     // Catch: java.lang.Throwable -> L7a
            if (r1 < r2) goto L54
            goto L6e
        L54:
            dx0 r1 = new dx0     // Catch: java.lang.Throwable -> L7a
            ki2 r2 = r7.b     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r2 = r2.c()     // Catch: java.lang.Throwable -> L7a
            ls5 r2 = (defpackage.ls5) r2     // Catch: java.lang.Throwable -> L7a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7a
            dx0[] r2 = r7.f     // Catch: java.lang.Throwable -> L7a
            int r3 = r7.d     // Catch: java.lang.Throwable -> L7a
            int r4 = r3 + 1
            r7.d = r4     // Catch: java.lang.Throwable -> L7a
            r2[r3] = r1     // Catch: java.lang.Throwable -> L7a
            r0.addLast(r1)     // Catch: java.lang.Throwable -> L7a
        L6e:
            java.lang.Object r7 = r0.removeLast()     // Catch: java.lang.Throwable -> L7a
            dx0 r7 = (defpackage.dx0) r7     // Catch: java.lang.Throwable -> L7a
            r8.unlock()     // Catch: java.lang.Throwable -> L78
            return r7
        L78:
            r7 = move-exception
            goto L88
        L7a:
            r7 = move-exception
            goto L84
        L7c:
            java.lang.String r7 = "Connection pool is closed"
            r0 = 21
            defpackage.yf2.T(r0, r7)     // Catch: java.lang.Throwable -> L7a
            throw r4     // Catch: java.lang.Throwable -> L7a
        L84:
            r8.unlock()     // Catch: java.lang.Throwable -> L78
            throw r7     // Catch: java.lang.Throwable -> L78
        L88:
            r5.c()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eq4.a(k11):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:9|(2:10|11)|12|13|14|(1:(1:33)(2:30|(1:32)))(1:16)|17|18|19|20|(1:22)(10:24|12|13|14|(0)(0)|17|18|19|20|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
        r2 = r11;
        r11 = r12;
        r12 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:29:0x006b, B:31:0x006f, B:35:0x0077, B:39:0x007e), top: B:44:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, n75] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [ki2] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0058 -> B:24:0x005a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0066 -> B:44:0x006b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r9, defpackage.vw0 r11, defpackage.k11 r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.dq4
            if (r0 == 0) goto L13
            r0 = r12
            dq4 r0 = (defpackage.dq4) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            dq4 r0 = new dq4
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.Z
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            long r9 = r0.R
            n75 r11 = r0.Y
            ki2 r2 = r0.X
            defpackage.me2.a0(r12)     // Catch: java.lang.Throwable -> L2e
            goto L5a
        L2e:
            r12 = move-exception
            goto L66
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r8)
            return r4
        L36:
            defpackage.me2.a0(r12)
        L39:
            n75 r12 = new n75
            r12.<init>()
            wx1 r2 = new wx1     // Catch: java.lang.Throwable -> L64
            r5 = 18
            r2.<init>(r12, r8, r4, r5)     // Catch: java.lang.Throwable -> L64
            r0.X = r11     // Catch: java.lang.Throwable -> L64
            r0.Y = r12     // Catch: java.lang.Throwable -> L64
            r0.R = r9     // Catch: java.lang.Throwable -> L64
            r0.d0 = r3     // Catch: java.lang.Throwable -> L64
            long r5 = defpackage.dk7.J(r9)     // Catch: java.lang.Throwable -> L64
            java.lang.Object r2 = defpackage.ln2.V(r5, r2, r0)     // Catch: java.lang.Throwable -> L64
            if (r2 != r1) goto L58
            return r1
        L58:
            r2 = r11
            r11 = r12
        L5a:
            r12 = r11
            r11 = r2
            r2 = r0
            r0 = r4
            goto L6b
        L5f:
            r7 = r2
            r2 = r11
            r11 = r12
            r12 = r7
            goto L66
        L64:
            r2 = move-exception
            goto L5f
        L66:
            r7 = r12
            r12 = r11
            r11 = r2
            r2 = r0
            r0 = r7
        L6b:
            boolean r5 = r0 instanceof defpackage.lt6     // Catch: java.lang.Throwable -> L73
            if (r5 == 0) goto L75
            r11.c()     // Catch: java.lang.Throwable -> L73
            goto L7c
        L73:
            r9 = move-exception
            goto L7f
        L75:
            if (r0 != 0) goto L7e
            java.lang.Object r12 = r12.A     // Catch: java.lang.Throwable -> L73
            if (r12 == 0) goto L7c
            return r12
        L7c:
            r0 = r2
            goto L39
        L7e:
            throw r0     // Catch: java.lang.Throwable -> L73
        L7f:
            java.lang.Object r10 = r12.A
            dx0 r10 = (defpackage.dx0) r10
            if (r10 == 0) goto L88
            r8.e(r10)
        L88:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eq4.b(long, vw0, k11):java.lang.Object");
    }

    public final void c() {
        dx0[] dx0VarArr;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (dx0 dx0Var : this.f) {
                if (dx0Var != null) {
                    dx0Var.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(StringBuilder sb) {
        dx0[] dx0VarArr;
        String str;
        xt xtVar = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            ip3 C = l07.C();
            int i = xtVar.L;
            for (int i2 = 0; i2 < i; i2++) {
                C.add(xtVar.get(i2));
            }
            ip3 t = l07.t(C);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            wz5 wz5Var = this.g;
            wz5Var.getClass();
            sb2.append(Math.max(vz5.Z.get(wz5Var), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + t.b() + ")[" + tq0.S0(t, null, null, null, null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            int i3 = 0;
            for (dx0 dx0Var : this.f) {
                i3++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i3);
                sb3.append("] - ");
                if (dx0Var != null) {
                    str = dx0Var.A.toString();
                } else {
                    str = null;
                }
                sb3.append(str);
                sb.append(sb3.toString());
                sb.append('\n');
                if (dx0Var != null) {
                    dx0Var.p(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(dx0 dx0Var) {
        dx0Var.getClass();
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.addLast(dx0Var);
            reentrantLock.unlock();
            this.g.c();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
