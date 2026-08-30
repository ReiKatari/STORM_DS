package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xm6  reason: default package */
/* loaded from: classes.dex */
public abstract class xm6 {
    public static final xj1 a = new xj1(3, 2, null);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.sk6 r5, boolean r6, defpackage.lp4 r7, defpackage.m00 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.om6
            if (r0 == 0) goto L13
            r0 = r8
            om6 r0 = (defpackage.om6) r0
            int r1 = r0.c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c0 = r1
            goto L18
        L13:
            om6 r0 = new om6
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.Z
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.c0
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            boolean r5 = r0.Y
            lp4 r6 = r0.X
            sk6 r7 = r0.R
            defpackage.me2.a0(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            r5 = 0
            return r5
        L38:
            defpackage.me2.a0(r8)
        L3b:
            r0.R = r5
            r0.X = r7
            r0.Y = r6
            r0.c0 = r3
            java.lang.Object r8 = r5.c(r7, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            kp4 r8 = (defpackage.kp4) r8
            boolean r2 = e(r8, r6)
            if (r2 == 0) goto L3b
            java.util.List r5 = r8.a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm6.a(sk6, boolean, lp4, m00):java.lang.Object");
    }

    public static /* synthetic */ Object b(sk6 sk6Var, m00 m00Var, int i) {
        boolean z = true;
        if ((i & 1) == 0) {
            z = false;
        }
        return a(sk6Var, z, lp4.Main, m00Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[LOOP:0: B:19:0x004a->B:20:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.sk6 r8, defpackage.k11 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.pm6
            if (r0 == 0) goto L13
            r0 = r9
            pm6 r0 = (defpackage.pm6) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            pm6 r0 = new pm6
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            sk6 r8 = r0.R
            defpackage.me2.a0(r9)
            goto L40
        L29:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r8)
            r8 = 0
            return r8
        L30:
            defpackage.me2.a0(r9)
        L33:
            r0.R = r8
            r0.Y = r3
            lp4 r9 = defpackage.lp4.Main
            java.lang.Object r9 = r8.c(r9, r0)
            if (r9 != r1) goto L40
            return r1
        L40:
            kp4 r9 = (defpackage.kp4) r9
            java.util.List r2 = r9.a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L4a:
            if (r6 >= r4) goto L58
            java.lang.Object r7 = r2.get(r6)
            rp4 r7 = (defpackage.rp4) r7
            r7.a()
            int r6 = r6 + 1
            goto L4a
        L58:
            java.util.List r9 = r9.a
            int r2 = r9.size()
        L5e:
            if (r5 >= r2) goto L6e
            java.lang.Object r4 = r9.get(r5)
            rp4 r4 = (defpackage.rp4) r4
            boolean r4 = r4.d
            if (r4 == 0) goto L6b
            goto L33
        L6b:
            int r5 = r5 + 1
            goto L5e
        L6e:
            o27 r8 = defpackage.o27.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm6.c(sk6, k11):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [xj1] */
    public static Object d(vp4 vp4Var, r86 r86Var, mi2 mi2Var, j11 j11Var, int i) {
        r86 r86Var2 = r86Var;
        if ((i & 4) != 0) {
            r86Var2 = a;
        }
        Object k = iq2.k(new vm(vp4Var, null, null, r86Var2, mi2Var, null, 7), j11Var);
        if (k == p31.COROUTINE_SUSPENDED) {
            return k;
        }
        return o27.a;
    }

    public static boolean e(kp4 kp4Var, boolean z) {
        boolean o;
        List list = kp4Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            rp4 rp4Var = (rp4) list.get(i);
            if (z) {
                o = ve2.n(rp4Var);
            } else {
                o = ve2.o(rp4Var);
            }
            if (!o) {
                return false;
            }
        }
        return true;
    }

    public static kd6 f(o31 o31Var, c63 c63Var, aj2 aj2Var) {
        return tq5.w(o31Var, null, s31.UNDISPATCHED, new zw5(c63Var, aj2Var, null, 8), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0393  */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v14, types: [e31, java.lang.Object, j11] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v21, types: [mi2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v8, types: [mi2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [k11, tm6, m00] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.sk6 r21, defpackage.o31 r22, defpackage.ht4 r23, defpackage.mi2 r24, defpackage.mi2 r25, defpackage.bj2 r26, defpackage.mi2 r27, defpackage.m00 r28) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm6.g(sk6, o31, ht4, mi2, mi2, bj2, mi2, m00):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, n75] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.sk6 r8, defpackage.lp4 r9, defpackage.k11 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.vm6
            if (r0 == 0) goto L13
            r0 = r10
            vm6 r0 = (defpackage.vm6) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            vm6 r0 = new vm6
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            n75 r8 = r0.R
            defpackage.me2.a0(r10)     // Catch: defpackage.mp4 -> L59
            goto L56
        L2a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r8)
            return r3
        L30:
            defpackage.me2.a0(r10)
            n75 r10 = new n75
            r10.<init>()
            tr3 r2 = defpackage.tr3.a
            r10.A = r2
            fa7 r2 = r8.f()     // Catch: defpackage.mp4 -> L59
            long r5 = r2.c()     // Catch: defpackage.mp4 -> L59
            ue2 r2 = new ue2     // Catch: defpackage.mp4 -> L59
            r7 = 3
            r2.<init>(r9, r10, r3, r7)     // Catch: defpackage.mp4 -> L59
            r0.R = r10     // Catch: defpackage.mp4 -> L59
            r0.Y = r4     // Catch: defpackage.mp4 -> L59
            java.lang.Object r8 = r8.h(r5, r2, r0)     // Catch: defpackage.mp4 -> L59
            if (r8 != r1) goto L55
            return r1
        L55:
            r8 = r10
        L56:
            java.lang.Object r8 = r8.A
            return r8
        L59:
            vr3 r8 = defpackage.vr3.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm6.h(sk6, lp4, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
        if (r0 == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c7, code lost:
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ad -> B:13:0x0031). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(defpackage.sk6 r17, defpackage.lp4 r18, defpackage.m00 r19) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm6.i(sk6, lp4, m00):java.lang.Object");
    }
}
