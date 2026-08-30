package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ww4  reason: default package */
/* loaded from: classes.dex */
public final class ww4 {
    public final pf5 a;
    public final ya0 b;
    public final ab0 c;
    public final o31 d;
    public final ka e;
    public final LinkedHashSet f;
    public final ArrayList g;

    public ww4(qm4 qm4Var, pf5 pf5Var, ya0 ya0Var, ab0 ab0Var, ct6 ct6Var) {
        qm4Var.getClass();
        pf5Var.getClass();
        ya0Var.getClass();
        ab0Var.getClass();
        ct6Var.getClass();
        this.a = pf5Var;
        this.b = ya0Var;
        this.c = ab0Var;
        o31 o31Var = ct6Var.a;
        this.d = o31Var;
        ka kaVar = new ka(new z(1, this, ww4.class, "prune", "prune$camera_camera2_pipe(Ljava/util/List;)V", 0, 0, 28), new v74(this, (j11) null, 6));
        o31Var.getClass();
        if (((aw) kaVar.X).a()) {
            if (tq5.w(o31Var, null, null, new ys3(kaVar, null, 4), 3).isCancelled()) {
                ka.a(kaVar, null);
            }
            this.e = kaVar;
            this.f = new LinkedHashSet();
            this.g = new ArrayList();
            return;
        }
        i.n("PruningProcessingQueue cannot be re-started!");
        throw null;
    }

    public final void a(String str) {
        str.getClass();
        za5 za5Var = new za5(str);
        if (((q60) this.e.Y).c(za5Var) instanceof wj0) {
            Log.e("CXCP", "Camera close by ID request failed for " + ((Object) od0.b(str)) + '!');
            za5Var.b.c0(o27.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
        r19 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d9, code lost:
        r5 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00df, code lost:
        defpackage.i.n("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e4, code lost:
        return r19;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00f5 -> B:46:0x00f6). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.Set r18, defpackage.k11 r19) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ww4.b(java.util.Set, k11):java.lang.Object");
    }

    public final void c(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            lw4 lw4Var = (lw4) obj;
            lw4Var.c.b();
            this.g.remove(lw4Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r5, java.util.List r6, defpackage.x90 r7, defpackage.o31 r8, defpackage.k11 r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.qw4
            if (r0 == 0) goto L13
            r0 = r9
            qw4 r0 = (defpackage.qw4) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            qw4 r0 = new qw4
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.Z
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            o31 r8 = r0.Y
            java.util.List r6 = r0.X
            java.lang.String r5 = r0.R
            defpackage.me2.a0(r9)
            goto L66
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L34:
            defpackage.me2.a0(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "Opening "
            r9.<init>(r2)
            java.lang.String r2 = defpackage.od0.b(r5)
            r9.append(r2)
            java.lang.String r2 = " with retries..."
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = "CXCP"
            android.util.Log.d(r2, r9)
            r0.R = r5
            r0.X = r6
            r0.Y = r8
            r0.d0 = r3
            pf5 r9 = r4.a
            ya0 r2 = r4.b
            java.lang.Object r9 = r9.b(r5, r2, r7, r0)
            if (r9 != r1) goto L66
            return r1
        L66:
            kd4 r9 = (defpackage.kd4) r9
            hd r7 = r9.a
            if (r7 != 0) goto L74
            iw4 r4 = new iw4
            uc0 r5 = r9.b
            r4.<init>(r5)
            return r4
        L74:
            jw4 r9 = new jw4
            m8 r0 = new m8
            od0 r1 = new od0
            r1.<init>(r5)
            java.util.ArrayList r5 = defpackage.tq0.Y0(r6, r1)
            java.util.Set r5 = defpackage.tq0.s1(r5)
            kb2 r6 = new kb2
            r1 = 24
            r6.<init>(r1, r4)
            r0.<init>(r7, r5, r8, r6)
            r9.<init>(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ww4.d(java.lang.String, java.util.List, x90, o31, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
        if (r4 == r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.xa5 r13, defpackage.k11 r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.rw4
            if (r0 == 0) goto L13
            r0 = r14
            rw4 r0 = (defpackage.rw4) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            rw4 r0 = new rw4
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            o27 r4 = defpackage.o27.a
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L39
            if (r2 == r6) goto L33
            if (r2 != r5) goto L2d
            defpackage.me2.a0(r14)
            return r4
        L2d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r12)
            return r3
        L33:
            xa5 r13 = r0.R
            defpackage.me2.a0(r14)
            goto L93
        L39:
            defpackage.me2.a0(r14)
            m8 r14 = r13.a
            hd r2 = r14.a
            java.lang.String r2 = r2.a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "PruningCamera2DeviceManager#processRequestClose("
            r7.<init>(r8)
            java.lang.String r2 = defpackage.od0.b(r2)
            r7.append(r2)
            r2 = 41
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            java.lang.String r7 = "CXCP"
            android.util.Log.i(r7, r2)
            java.util.LinkedHashSet r2 = r12.f
            boolean r7 = r2.contains(r14)
            if (r7 == 0) goto L69
            r2.remove(r14)
        L69:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r7 = r12.g
            int r8 = r7.size()
            r9 = 0
        L75:
            if (r9 >= r8) goto L89
            java.lang.Object r10 = r7.get(r9)
            int r9 = r9 + 1
            r11 = r10
            lw4 r11 = (defpackage.lw4) r11
            m8 r11 = r11.b
            if (r11 == r14) goto L85
            goto L75
        L85:
            r2.add(r10)
            goto L75
        L89:
            r0.R = r13
            r0.Z = r6
            r12.c(r2)
            if (r4 != r1) goto L93
            goto La4
        L93:
            m8 r12 = r13.a
            r12.c()
            m8 r12 = r13.a
            r0.R = r3
            r0.Z = r5
            java.lang.Object r12 = r12.b(r0)
            if (r12 != r1) goto La5
        La4:
            return r1
        La5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ww4.e(xa5, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[LOOP:1: B:20:0x0059->B:22:0x005f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ya5 r8, defpackage.k11 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.sw4
            if (r0 == 0) goto L13
            r0 = r9
            sw4 r0 = (defpackage.sw4) r0
            int r1 = r0.c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c0 = r1
            goto L18
        L13:
            sw4 r0 = new sw4
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.Y
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.c0
            o27 r3 = defpackage.o27.a
            r4 = 2
            r5 = 1
            java.util.LinkedHashSet r6 = r7.f
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L39
            if (r2 != r4) goto L32
            java.util.Iterator r7 = r0.X
            ya5 r8 = r0.R
            defpackage.me2.a0(r9)
            goto L6d
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r7)
            r7 = 0
            return r7
        L39:
            ya5 r8 = r0.R
            defpackage.me2.a0(r9)
            goto L55
        L3f:
            defpackage.me2.a0(r9)
            java.lang.String r9 = "CXCP"
            java.lang.String r2 = "PruningCamera2DeviceManager#processRequestCloseAll()"
            android.util.Log.i(r9, r2)
            r0.R = r8
            r0.c0 = r5
            java.util.ArrayList r9 = r7.g
            r7.c(r9)
            if (r3 != r1) goto L55
            goto L85
        L55:
            java.util.Iterator r7 = r6.iterator()
        L59:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L69
            java.lang.Object r9 = r7.next()
            m8 r9 = (defpackage.m8) r9
            r9.c()
            goto L59
        L69:
            java.util.Iterator r7 = r6.iterator()
        L6d:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L86
            java.lang.Object r9 = r7.next()
            m8 r9 = (defpackage.m8) r9
            r0.R = r8
            r0.X = r7
            r0.c0 = r4
            java.lang.Object r9 = r9.b(r0)
            if (r9 != r1) goto L6d
        L85:
            return r1
        L86:
            r6.clear()
            gs0 r7 = r8.a
            r7.c0(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ww4.f(ya5, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.za5 r13, defpackage.k11 r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.tw4
            if (r0 == 0) goto L13
            r0 = r14
            tw4 r0 = (defpackage.tw4) r0
            int r1 = r0.c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c0 = r1
            goto L18
        L13:
            tw4 r0 = new tw4
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.Y
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.c0
            r3 = 0
            o27 r4 = defpackage.o27.a
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3e
            if (r2 == r6) goto L36
            if (r2 != r5) goto L30
            za5 r12 = r0.R
            defpackage.me2.a0(r14)
            goto Lcd
        L30:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r12)
            return r3
        L36:
            java.lang.String r13 = r0.X
            za5 r2 = r0.R
            defpackage.me2.a0(r14)
            goto L96
        L3e:
            defpackage.me2.a0(r14)
            java.lang.String r14 = r13.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r7 = "PruningCamera2DeviceManager#processRequestCloseById("
            r2.<init>(r7)
            java.lang.String r7 = r13.a
            java.lang.String r7 = defpackage.od0.b(r7)
            r2.append(r7)
            r7 = 41
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.lang.String r7 = "CXCP"
            android.util.Log.i(r7, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r7 = r12.g
            int r8 = r7.size()
            r9 = 0
        L6d:
            if (r9 >= r8) goto L88
            java.lang.Object r10 = r7.get(r9)
            int r9 = r9 + 1
            r11 = r10
            lw4 r11 = (defpackage.lw4) r11
            ib5 r11 = r11.a
            nc7 r11 = r11.a
            java.lang.String r11 = r11.a
            boolean r11 = defpackage.b53.x(r11, r14)
            if (r11 == 0) goto L6d
            r2.add(r10)
            goto L6d
        L88:
            r0.R = r13
            r0.X = r14
            r0.c0 = r6
            r12.c(r2)
            if (r4 != r1) goto L94
            goto Lcb
        L94:
            r2 = r13
            r13 = r14
        L96:
            java.util.LinkedHashSet r12 = r12.f
            java.util.Iterator r14 = r12.iterator()
        L9c:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto Lb4
            java.lang.Object r6 = r14.next()
            r7 = r6
            m8 r7 = (defpackage.m8) r7
            hd r7 = r7.a
            java.lang.String r7 = r7.a
            boolean r7 = defpackage.b53.x(r7, r13)
            if (r7 == 0) goto L9c
            goto Lb5
        Lb4:
            r6 = r3
        Lb5:
            m8 r6 = (defpackage.m8) r6
            if (r6 == 0) goto Lce
            r12.remove(r6)
            r6.c()
            r0.R = r2
            r0.X = r3
            r0.c0 = r5
            java.lang.Object r12 = r6.b(r0)
            if (r12 != r1) goto Lcc
        Lcb:
            return r1
        Lcc:
            r12 = r2
        Lcd:
            r2 = r12
        Lce:
            gs0 r12 = r2.b
            r12.c0(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ww4.g(za5, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x027d, code lost:
        if (defpackage.o27.a == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0269, code lost:
        if (b(r13, r0) != r1) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0174 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0138 A[LOOP:3: B:45:0x0132->B:47:0x0138, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.ib5 r13, defpackage.k11 r14) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ww4.h(ib5, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
        r11 = r10.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
        if (r11 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
        r10.c();
        r2.R = r1;
        r2.X = r9;
        r2.Y = r3;
        r2.Z = r10;
        r2.e0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r10.b(r2) != r6) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
        r12 = r9;
        r9 = r3;
        r3 = r10;
        r10 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008c A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0082 -> B:28:0x0086). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r14, defpackage.ib5 r15, defpackage.k11 r16) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ww4.i(java.lang.String, ib5, k11):java.lang.Object");
    }
}
