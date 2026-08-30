package defpackage;

import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ra4  reason: default package */
/* loaded from: classes.dex */
public final class ra4 {
    public final ji a;
    public final th b;
    public final jp0 c;
    public final ki2 d;
    public final b34 e;

    public ra4(ji jiVar, th thVar, iw3 iw3Var) {
        y60 y60Var = y60.p0;
        this.a = jiVar;
        this.b = thVar;
        this.c = y60Var;
        this.d = iw3Var;
        this.e = new b34();
    }

    public static LinkedHashMap f(List list) {
        long j;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        long j2;
        Long l5;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ba4 ba4Var = ((ea4) it.next()).a;
            String str = ba4Var.h;
            long j3 = ba4Var.i;
            if (!zg6.B0(str)) {
                int i = ia4.a[ba4Var.a.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        gb4 gb4Var = (gb4) linkedHashMap.get(str);
                        if (gb4Var != null) {
                            j = gb4Var.a;
                        } else {
                            j = ba4Var.b;
                        }
                        if (gb4Var != null) {
                            l = gb4Var.c;
                            l2 = null;
                        } else {
                            l = null;
                            l2 = null;
                        }
                        Long valueOf = Long.valueOf(j3);
                        long j4 = ba4Var.m;
                        Long valueOf2 = Long.valueOf(j4);
                        if (j4 <= 0) {
                            valueOf2 = l2;
                        }
                        if (valueOf2 == null) {
                            if (gb4Var != null) {
                                l3 = gb4Var.e;
                            } else {
                                l3 = l2;
                            }
                        } else {
                            l3 = valueOf2;
                        }
                        linkedHashMap.put(str, new gb4(j, str, l, valueOf, l3));
                    }
                } else {
                    gb4 gb4Var2 = (gb4) linkedHashMap.get(str);
                    long j5 = ba4Var.b;
                    Long valueOf3 = Long.valueOf(j3);
                    if (gb4Var2 != null) {
                        l4 = gb4Var2.d;
                    } else {
                        l4 = null;
                    }
                    if (gb4Var2 != null) {
                        j2 = j5;
                        l5 = gb4Var2.e;
                    } else {
                        j2 = j5;
                        l5 = null;
                    }
                    linkedHashMap.put(str, new gb4(j2, str, valueOf3, l4, l5));
                }
            }
        }
        return linkedHashMap;
    }

    public static Long h(w94 w94Var, ArrayList arrayList) {
        Comparable comparable;
        if (w94Var.b > 0) {
            v72 v72Var = new v72(new w72(new y82(new mu(1, arrayList), new n44(9), 2), true, new n44(10)));
            if (!v72Var.hasNext()) {
                comparable = null;
            } else {
                comparable = (Comparable) v72Var.next();
                while (v72Var.hasNext()) {
                    Comparable comparable2 = (Comparable) v72Var.next();
                    if (comparable.compareTo(comparable2) > 0) {
                        comparable = comparable2;
                    }
                }
            }
            Long l = (Long) comparable;
            if (l != null) {
                return Long.valueOf(l.longValue() + 1209600000);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r31, java.lang.String r32, long r33, long r35, boolean r37, long r38, defpackage.jb4 r40, defpackage.lb4 r41, defpackage.k11 r42) {
        /*
            r30 = this;
            r0 = r30
            r1 = r42
            boolean r2 = r1 instanceof defpackage.ja4
            if (r2 == 0) goto L17
            r2 = r1
            ja4 r2 = (defpackage.ja4) r2
            int r3 = r2.Y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Y = r3
            goto L1c
        L17:
            ja4 r2 = new ja4
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.R
            p31 r3 = defpackage.p31.COROUTINE_SUSPENDED
            int r4 = r2.Y
            r5 = 1
            if (r4 == 0) goto L36
            if (r4 != r5) goto L2f
            defpackage.me2.a0(r1)
            nc5 r1 = (defpackage.nc5) r1
            java.lang.Object r0 = r1.A
            return r0
        L2f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r0)
            r0 = 0
            return r0
        L36:
            defpackage.me2.a0(r1)
            ba4 r6 = new ba4
            ga4 r7 = defpackage.ga4.ACHIEVEMENT_ACK
            jp0 r1 = r0.c
            l23 r1 = r1.g()
            long r16 = r1.b()
            r28 = 0
            r29 = 13954(0x3682, float:1.9554E-41)
            r15 = 0
            r18 = 0
            r20 = 0
            r24 = 0
            r8 = r31
            r9 = r32
            r10 = r33
            r12 = r35
            r14 = r37
            r22 = r38
            r26 = r40
            r27 = r41
            r6.<init>(r7, r8, r9, r10, r12, r14, r15, r16, r18, r20, r22, r24, r26, r27, r28, r29)
            r2.Y = r5
            java.lang.Object r0 = r0.c(r8, r9, r6, r2)
            if (r0 != r3) goto L6e
            return r3
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra4.a(java.lang.String, java.lang.String, long, long, boolean, long, jb4, lb4, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r31, java.lang.String r32, long r33, long r35, java.lang.String r37, long r38, long r40, long r42, defpackage.jb4 r44, defpackage.lb4 r45, defpackage.k11 r46) {
        /*
            r30 = this;
            r0 = r30
            r1 = r46
            boolean r2 = r1 instanceof defpackage.ka4
            if (r2 == 0) goto L17
            r2 = r1
            ka4 r2 = (defpackage.ka4) r2
            int r3 = r2.Y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Y = r3
            goto L1c
        L17:
            ka4 r2 = new ka4
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.R
            p31 r3 = defpackage.p31.COROUTINE_SUSPENDED
            int r4 = r2.Y
            r5 = 1
            if (r4 == 0) goto L36
            if (r4 != r5) goto L2f
            defpackage.me2.a0(r1)
            nc5 r1 = (defpackage.nc5) r1
            java.lang.Object r0 = r1.A
            return r0
        L2f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r0)
            r0 = 0
            return r0
        L36:
            defpackage.me2.a0(r1)
            ba4 r6 = new ba4
            ga4 r7 = defpackage.ga4.ACHIEVEMENT_UNLOCK
            r28 = 1
            r29 = 14338(0x3802, float:2.0092E-41)
            r14 = 0
            r22 = 0
            r24 = 0
            r8 = r31
            r9 = r32
            r10 = r33
            r12 = r35
            r15 = r37
            r16 = r38
            r18 = r40
            r20 = r42
            r26 = r44
            r27 = r45
            r6.<init>(r7, r8, r9, r10, r12, r14, r15, r16, r18, r20, r22, r24, r26, r27, r28, r29)
            r2.Y = r5
            java.lang.Object r0 = r0.c(r8, r9, r6, r2)
            if (r0 != r3) goto L66
            return r3
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra4.b(java.lang.String, java.lang.String, long, long, java.lang.String, long, long, long, jb4, lb4, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r15, java.lang.String r16, defpackage.ba4 r17, defpackage.k11 r18) {
        /*
            Method dump skipped, instructions count: 189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra4.c(java.lang.String, java.lang.String, ba4, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r31, java.lang.String r32, long r33, java.lang.String r35, long r36, long r38, boolean r40, defpackage.jb4 r41, defpackage.lb4 r42, defpackage.k11 r43) {
        /*
            r30 = this;
            r0 = r30
            r1 = r43
            boolean r2 = r1 instanceof defpackage.na4
            if (r2 == 0) goto L17
            r2 = r1
            na4 r2 = (defpackage.na4) r2
            int r3 = r2.Y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Y = r3
            goto L1c
        L17:
            na4 r2 = new na4
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.R
            p31 r3 = defpackage.p31.COROUTINE_SUSPENDED
            int r4 = r2.Y
            r5 = 1
            if (r4 == 0) goto L36
            if (r4 != r5) goto L2f
            defpackage.me2.a0(r1)
            nc5 r1 = (defpackage.nc5) r1
            java.lang.Object r0 = r1.A
            return r0
        L2f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r0)
            r0 = 0
            return r0
        L36:
            defpackage.me2.a0(r1)
            ba4 r6 = new ba4
            ga4 r7 = defpackage.ga4.SESSION_END
            r28 = 0
            r29 = 11810(0x2e22, float:1.655E-41)
            r12 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r8 = r31
            r9 = r32
            r10 = r33
            r15 = r35
            r16 = r36
            r24 = r38
            r14 = r40
            r26 = r41
            r27 = r42
            r6.<init>(r7, r8, r9, r10, r12, r14, r15, r16, r18, r20, r22, r24, r26, r27, r28, r29)
            r2.Y = r5
            java.lang.Object r0 = r0.c(r8, r9, r6, r2)
            if (r0 != r3) goto L67
            return r3
        L67:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra4.d(java.lang.String, java.lang.String, long, java.lang.String, long, long, boolean, jb4, lb4, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r31, java.lang.String r32, long r33, java.lang.String r35, long r36, boolean r38, defpackage.jb4 r39, defpackage.lb4 r40, defpackage.k11 r41) {
        /*
            r30 = this;
            r0 = r30
            r1 = r41
            boolean r2 = r1 instanceof defpackage.oa4
            if (r2 == 0) goto L17
            r2 = r1
            oa4 r2 = (defpackage.oa4) r2
            int r3 = r2.Y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Y = r3
            goto L1c
        L17:
            oa4 r2 = new oa4
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.R
            p31 r3 = defpackage.p31.COROUTINE_SUSPENDED
            int r4 = r2.Y
            r5 = 1
            if (r4 == 0) goto L36
            if (r4 != r5) goto L2f
            defpackage.me2.a0(r1)
            nc5 r1 = (defpackage.nc5) r1
            java.lang.Object r0 = r1.A
            return r0
        L2f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r0)
            r0 = 0
            return r0
        L36:
            defpackage.me2.a0(r1)
            ba4 r6 = new ba4
            ga4 r7 = defpackage.ga4.SESSION_START
            r28 = 0
            r29 = 15906(0x3e22, float:2.2289E-41)
            r12 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r8 = r31
            r9 = r32
            r10 = r33
            r15 = r35
            r16 = r36
            r14 = r38
            r26 = r39
            r27 = r40
            r6.<init>(r7, r8, r9, r10, r12, r14, r15, r16, r18, r20, r22, r24, r26, r27, r28, r29)
            r2.Y = r5
            java.lang.Object r0 = r0.c(r8, r9, r6, r2)
            if (r0 != r3) goto L67
            return r3
        L67:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra4.e(java.lang.String, java.lang.String, long, java.lang.String, long, boolean, jb4, lb4, k11):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|(1:(1:(7:10|11|12|13|(1:15)(4:19|20|21|(1:23)(8:24|(1:26)(2:43|(1:45)(4:46|(2:49|47)|50|51))|27|(4:30|(3:32|33|34)(1:36)|35|28)|37|38|(1:40)(1:42)|41))|16|17)(2:61|62))(1:63))(3:74|(1:76)|67)|64|65|(5:68|13|(0)(0)|16|17)|67))|77|6|(0)(0)|64|65|(0)|67|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0189, code lost:
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x018b, code lost:
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x018d, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x018e, code lost:
        r13 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a A[Catch: all -> 0x002f, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x002f, blocks: (B:13:0x002b, B:28:0x0086, B:30:0x008a, B:32:0x0093, B:33:0x00a3, B:35:0x00af, B:36:0x00b6, B:38:0x0107, B:47:0x0130, B:48:0x0139, B:50:0x013f, B:52:0x0153, B:53:0x0157, B:55:0x016d, B:57:0x017a, B:39:0x010a, B:41:0x0114, B:42:0x0119, B:43:0x0121, B:45:0x0127, B:58:0x0181, B:63:0x0190), top: B:69:0x002b, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r14, java.lang.String r15, defpackage.k11 r16) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra4.g(java.lang.String, java.lang.String, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r12, java.lang.String r13, defpackage.k11 r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.qa4
            if (r0 == 0) goto L13
            r0 = r14
            qa4 r0 = (defpackage.qa4) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e0 = r1
            goto L18
        L13:
            qa4 r0 = new qa4
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.c0
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.e0
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L46
            if (r2 == r4) goto L38
            if (r2 != r3) goto L31
            z24 r11 = r0.Y
            defpackage.me2.a0(r14)     // Catch: java.lang.Throwable -> L2d
            goto L7f
        L2d:
            r0 = move-exception
            r12 = r0
            goto L8f
        L31:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r11)
            r11 = 0
            return r11
        L38:
            int r12 = r0.Z
            z24 r13 = r0.Y
            java.lang.String r2 = r0.X
            java.lang.String r4 = r0.R
            defpackage.me2.a0(r14)
            r8 = r2
            r7 = r4
            goto L61
        L46:
            defpackage.me2.a0(r14)
            r0.R = r12
            r0.X = r13
            b34 r14 = r11.e
            r0.Y = r14
            r2 = 0
            r0.Z = r2
            r0.e0 = r4
            java.lang.Object r4 = r14.i(r0)
            if (r4 != r1) goto L5d
            goto L7d
        L5d:
            r7 = r12
            r8 = r13
            r13 = r14
            r12 = r2
        L61:
            bb1 r14 = defpackage.tg1.a     // Catch: java.lang.Throwable -> L8b
            ha1 r14 = defpackage.ha1.L     // Catch: java.lang.Throwable -> L8b
            wx1 r5 = new wx1     // Catch: java.lang.Throwable -> L87
            r10 = 15
            r6 = r11
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L87
            r0.R = r9     // Catch: java.lang.Throwable -> L87
            r0.X = r9     // Catch: java.lang.Throwable -> L87
            r0.Y = r13     // Catch: java.lang.Throwable -> L87
            r0.Z = r12     // Catch: java.lang.Throwable -> L87
            r0.e0 = r3     // Catch: java.lang.Throwable -> L87
            java.lang.Object r14 = defpackage.tq5.G(r14, r5, r0)     // Catch: java.lang.Throwable -> L87
            if (r14 != r1) goto L7e
        L7d:
            return r1
        L7e:
            r11 = r13
        L7f:
            nc5 r14 = (defpackage.nc5) r14     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r12 = r14.A     // Catch: java.lang.Throwable -> L2d
            r11.d(r9)
            return r12
        L87:
            r0 = move-exception
            r12 = r0
        L89:
            r11 = r13
            goto L8f
        L8b:
            r0 = move-exception
            r11 = r0
            r12 = r11
            goto L89
        L8f:
            r11.d(r9)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra4.i(java.lang.String, java.lang.String, k11):java.lang.Object");
    }

    public final ha4 j(List list) {
        boolean z;
        if (list.isEmpty()) {
            return new ha4(x94.EMPTY, null, null);
        }
        byte[] bArr = new byte[0];
        long j = ((ea4) tq0.K0(list)).a.b;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                ea4 ea4Var = (ea4) obj;
                ba4 ba4Var = ea4Var.a;
                byte[] bArr2 = ea4Var.b;
                iv4 iv4Var = s94.a;
                ba4Var.getClass();
                byte[] b = s94.a.b(ba4.Companion.serializer(), ba4Var);
                long j2 = ba4Var.b;
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(b);
                digest.getClass();
                if (!Arrays.equals(digest, bArr2)) {
                    return new ha4(x94.TAMPERED, null, null);
                }
                if (!Arrays.equals(ba4Var.n, bArr)) {
                    return new ha4(x94.TAMPERED, null, null);
                }
                if (i > 0 && j2 != j) {
                    return new ha4(x94.TAMPERED, null, null);
                }
                try {
                    th thVar = this.b;
                    byte[] bArr3 = ea4Var.c;
                    bArr2.getClass();
                    bArr3.getClass();
                    PublicKey publicKey = thVar.a().getPublic();
                    Signature signature = Signature.getInstance("SHA256withECDSA");
                    signature.initVerify(publicKey);
                    signature.update(bArr2);
                    z = signature.verify(bArr3);
                } catch (Exception unused) {
                    z = false;
                }
                if (!z) {
                    return new ha4(x94.SIGNING_KEY_INVALID, null, null);
                }
                j = j2 + 1;
                i = i2;
                bArr = bArr2;
            } else {
                l07.v0();
                throw null;
            }
        }
        ea4 ea4Var2 = (ea4) tq0.T0(list);
        return new ha4(x94.OK, Long.valueOf(ea4Var2.a.b), ea4Var2.b);
    }
}
