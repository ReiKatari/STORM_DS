package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dl  reason: default package */
/* loaded from: classes.dex */
public final class dl implements ud5 {
    public final az4 a;
    public final b74 b;
    public final vj c;
    public final xj d;
    public final SharedPreferences e;
    public final Context f;
    public final id5 g;
    public final xf1 h = new xf1(7);

    public dl(az4 az4Var, b74 b74Var, vj vjVar, xj xjVar, SharedPreferences sharedPreferences, Context context, id5 id5Var) {
        this.a = az4Var;
        this.b = b74Var;
        this.c = vjVar;
        this.d = xjVar;
        this.e = sharedPreferences;
        this.f = context;
        this.g = id5Var;
    }

    public static void t(String str, ti4... ti4VarArr) {
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
        Log.i("RASubmission", sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (r14 == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(java.lang.String r12, boolean r13, defpackage.k11 r14) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.A(java.lang.String, boolean, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0223, code lost:
        if (r25 > 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02ea, code lost:
        if (r1 == r13) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x043b  */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.lang.Long, v15, x15] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(long r40, long r42, boolean r44, java.lang.Long r45, defpackage.x15 r46, defpackage.k11 r47) {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.B(long, long, boolean, java.lang.Long, x15, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r0 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(long r7, int r9, defpackage.x15 r10, defpackage.k11 r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof defpackage.al
            if (r0 == 0) goto L14
            r0 = r11
            al r0 = (defpackage.al) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d0 = r1
        L12:
            r11 = r0
            goto L1a
        L14:
            al r0 = new al
            r0.<init>(r6, r11)
            goto L12
        L1a:
            java.lang.Object r0 = r11.Z
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r11.d0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L37
            if (r2 != r4) goto L31
            defpackage.me2.a0(r0)
            nc5 r0 = (defpackage.nc5) r0
            java.lang.Object r6 = r0.A
            return r6
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            return r3
        L37:
            int r9 = r11.X
            long r7 = r11.R
            x15 r10 = r11.Y
            defpackage.me2.a0(r0)
            goto L53
        L41:
            defpackage.me2.a0(r0)
            r11.Y = r10
            r11.R = r7
            r11.X = r9
            r11.d0 = r5
            java.lang.Object r0 = r6.b(r10, r11)
            if (r0 != r1) goto L53
            goto L74
        L53:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L66
            w57 r6 = new w57
            r6.<init>()
            kc5 r7 = new kc5
            r7.<init>(r6)
            return r7
        L66:
            r11.Y = r3
            r11.R = r7
            r11.X = r9
            r11.d0 = r4
            java.lang.Object r6 = r6.D(r7, r9, r10, r11)
            if (r6 != r1) goto L75
        L74:
            return r1
        L75:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.C(long, int, x15, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e6, code lost:
        if (r3 == r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(long r17, int r19, defpackage.x15 r20, defpackage.k11 r21) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.D(long, int, x15, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (r1 == r9) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01bf, code lost:
        if (r4.C(r14, r2) == r9) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ae  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c9 -> B:56:0x01ee). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01bf -> B:55:0x01c2). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(defpackage.k11 r22) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.E(k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #1 {all -> 0x002c, blocks: (B:12:0x0028, B:42:0x0084, B:45:0x008c, B:39:0x0075), top: B:55:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, defpackage.x15 r8, defpackage.k11 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.zj
            if (r0 == 0) goto L13
            r0 = r9
            zj r0 = (defpackage.zj) r0
            int r1 = r0.c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c0 = r1
            goto L18
        L13:
            zj r0 = new zj
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.Y
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.c0
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2f
            x15 r8 = r0.X
            java.lang.String r7 = r0.R
            defpackage.me2.a0(r9)     // Catch: java.lang.Throwable -> L2c
            goto L84
        L2c:
            r8 = move-exception
            goto L96
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            r6 = 0
            return r6
        L36:
            defpackage.me2.a0(r9)
            boolean r9 = defpackage.zg6.B0(r7)
            if (r9 != 0) goto L9e
            xf1 r9 = r6.h
            r9.getClass()
            r8.getClass()
            java.lang.Object r2 = r9.L
            monitor-enter(r2)
            boolean r5 = r9.A     // Catch: java.lang.Throwable -> L67
            if (r5 == 0) goto L50
        L4e:
            r9 = r3
            goto L71
        L50:
            java.lang.Object r5 = r9.B     // Catch: java.lang.Throwable -> L67
            c25 r5 = (defpackage.c25) r5     // Catch: java.lang.Throwable -> L67
            if (r5 == 0) goto L69
            java.lang.String r9 = r5.a     // Catch: java.lang.Throwable -> L67
            boolean r9 = defpackage.b53.x(r9, r7)     // Catch: java.lang.Throwable -> L67
            if (r9 == 0) goto L4e
            x15 r9 = r5.b     // Catch: java.lang.Throwable -> L67
            boolean r9 = defpackage.b53.x(r9, r8)     // Catch: java.lang.Throwable -> L67
            if (r9 == 0) goto L4e
            goto L70
        L67:
            r6 = move-exception
            goto L9c
        L69:
            c25 r5 = new c25     // Catch: java.lang.Throwable -> L67
            r5.<init>(r7, r8)     // Catch: java.lang.Throwable -> L67
            r9.B = r5     // Catch: java.lang.Throwable -> L67
        L70:
            r9 = r4
        L71:
            monitor-exit(r2)
            if (r9 != 0) goto L75
            goto L9e
        L75:
            vj r9 = r6.c     // Catch: java.lang.Throwable -> L2c
            r0.R = r7     // Catch: java.lang.Throwable -> L2c
            r0.X = r8     // Catch: java.lang.Throwable -> L2c
            r0.c0 = r4     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r9 = r9.b(r0)     // Catch: java.lang.Throwable -> L2c
            if (r9 != r1) goto L84
            return r1
        L84:
            boolean r8 = defpackage.b53.x(r9, r8)     // Catch: java.lang.Throwable -> L2c
            if (r8 == 0) goto L8c
            r3 = r4
            goto L91
        L8c:
            xf1 r8 = r6.h     // Catch: java.lang.Throwable -> L2c
            r8.n(r7)     // Catch: java.lang.Throwable -> L2c
        L91:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L96:
            xf1 r6 = r6.h
            r6.n(r7)
            throw r8
        L9c:
            monitor-exit(r2)
            throw r6
        L9e:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.a(java.lang.String, x15, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.x15 r5, defpackage.k11 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ak
            if (r0 == 0) goto L13
            r0 = r6
            ak r0 = (defpackage.ak) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ak r0 = new ak
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            x15 r5 = r0.R
            defpackage.me2.a0(r6)
            goto L40
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L30:
            defpackage.me2.a0(r6)
            r0.R = r5
            r0.Z = r3
            vj r4 = r4.c
            java.lang.Object r6 = r4.b(r0)
            if (r6 != r1) goto L40
            return r1
        L40:
            boolean r4 = defpackage.b53.x(r6, r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.b(x15, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.dy4 r25, boolean r26, defpackage.x15 r27, defpackage.k11 r28) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.c(dy4, boolean, x15, k11):java.lang.Object");
    }

    public final a25 d(t05 t05Var, List list, boolean z) {
        boolean z2 = this.e.getBoolean("ra_unofficial_enabled", false);
        if (t05Var != null) {
            List list2 = t05Var.e;
            ArrayList arrayList = new ArrayList(uq0.y0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                hy4 hy4Var = (hy4) it.next();
                long j = hy4Var.a;
                long j2 = hy4Var.b;
                String str = hy4Var.c;
                gy4 gy4Var = hy4Var.d;
                URL url = hy4Var.e;
                ArrayList arrayList2 = hy4Var.f;
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    boolean z3 = z2;
                    Object obj = arrayList2.get(i);
                    i++;
                    Iterator it2 = it;
                    cy4 cy4Var = ((dy4) obj).m;
                    int i2 = size;
                    if (cy4Var == cy4.CORE || (z3 && cy4Var == cy4.UNOFFICIAL)) {
                        arrayList3.add(obj);
                    }
                    size = i2;
                    z2 = z3;
                    it = it2;
                }
                boolean z4 = z2;
                Iterator it3 = it;
                ArrayList arrayList4 = new ArrayList(uq0.y0(arrayList3, 10));
                int size2 = arrayList3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    dy4 dy4Var = (dy4) arrayList3.get(i3);
                    arrayList4.add(new u15(dy4Var, list.contains(Long.valueOf(dy4Var.a)), z));
                    size2 = size2;
                }
                ArrayList arrayList5 = hy4Var.g;
                ArrayList arrayList6 = new ArrayList();
                int size3 = arrayList5.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj2 = arrayList5.get(i4);
                    i4++;
                    ArrayList arrayList7 = arrayList4;
                    if (!((j15) obj2).i) {
                        arrayList6.add(obj2);
                    }
                    arrayList4 = arrayList7;
                }
                arrayList.add(new w15(j, j2, gy4Var, str, url, arrayList4, arrayList6));
                z2 = z4;
                it = it3;
            }
            return new a25(t05Var.a, t05Var.b, t05Var.c, t05Var.d, arrayList);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:15:0x0031, B:72:0x00f9, B:21:0x0040, B:65:0x00dd, B:67:0x00e6, B:24:0x0049, B:62:0x00c4, B:27:0x0054, B:46:0x0096, B:48:0x009a, B:51:0x00a0, B:53:0x00a4, B:55:0x00aa, B:58:0x00b3, B:75:0x0104, B:43:0x0083), top: B:81:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a0 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:15:0x0031, B:72:0x00f9, B:21:0x0040, B:65:0x00dd, B:67:0x00e6, B:24:0x0049, B:62:0x00c4, B:27:0x0054, B:46:0x0096, B:48:0x009a, B:51:0x00a0, B:53:0x00a4, B:55:0x00aa, B:58:0x00b3, B:75:0x0104, B:43:0x0083), top: B:81:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e6 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:15:0x0031, B:72:0x00f9, B:21:0x0040, B:65:0x00dd, B:67:0x00e6, B:24:0x0049, B:62:0x00c4, B:27:0x0054, B:46:0x0096, B:48:0x009a, B:51:0x00a0, B:53:0x00a4, B:55:0x00aa, B:58:0x00b3, B:75:0x0104, B:43:0x0083), top: B:81:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r15, java.lang.String r16, java.lang.String r17, defpackage.k11 r18) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.e(java.lang.String, java.lang.String, java.lang.String, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x010d, code lost:
        if (r0 == r10) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f9 A[Catch: all -> 0x004b, TRY_ENTER, TryCatch #3 {all -> 0x004b, blocks: (B:17:0x0046, B:122:0x034d, B:124:0x0351, B:126:0x0357, B:22:0x0052, B:114:0x0323, B:116:0x0327, B:106:0x02f9, B:108:0x02ff, B:111:0x0305, B:118:0x032e), top: B:135:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0327 A[Catch: all -> 0x004b, TryCatch #3 {all -> 0x004b, blocks: (B:17:0x0046, B:122:0x034d, B:124:0x0351, B:126:0x0357, B:22:0x0052, B:114:0x0323, B:116:0x0327, B:106:0x02f9, B:108:0x02ff, B:111:0x0305, B:118:0x032e), top: B:135:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0351 A[Catch: all -> 0x004b, TryCatch #3 {all -> 0x004b, blocks: (B:17:0x0046, B:122:0x034d, B:124:0x0351, B:126:0x0357, B:22:0x0052, B:114:0x0323, B:116:0x0327, B:106:0x02f9, B:108:0x02ff, B:111:0x0305, B:118:0x032e), top: B:135:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0357 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #3 {all -> 0x004b, blocks: (B:17:0x0046, B:122:0x034d, B:124:0x0351, B:126:0x0357, B:22:0x0052, B:114:0x0323, B:116:0x0327, B:106:0x02f9, B:108:0x02ff, B:111:0x0305, B:118:0x032e), top: B:135:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[Catch: all -> 0x003d, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x003d, blocks: (B:12:0x0038, B:50:0x00eb, B:52:0x00ef, B:47:0x00d5), top: B:135:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #5 {all -> 0x003d, blocks: (B:12:0x0038, B:50:0x00eb, B:52:0x00ef, B:47:0x00d5), top: B:135:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(long r41, java.lang.String r43, defpackage.yj r44, boolean r45, defpackage.k11 r46) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.f(long, java.lang.String, yj, boolean, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x029f, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0241, code lost:
        if (r2 != null) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0273 A[Catch: all -> 0x0284, LOOP:1: B:102:0x026d->B:104:0x0273, LOOP_END, TryCatch #1 {all -> 0x0284, blocks: (B:111:0x02a2, B:112:0x02b3, B:114:0x02b9, B:101:0x025c, B:102:0x026d, B:104:0x0273, B:87:0x022c, B:90:0x0234, B:98:0x0243, B:108:0x0289, B:95:0x023d), top: B:121:0x022c }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x022c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108 A[Catch: all -> 0x0119, LOOP:3: B:45:0x0102->B:47:0x0108, LOOP_END, TRY_LEAVE, TryCatch #2 {all -> 0x0119, blocks: (B:44:0x00f1, B:45:0x0102, B:47:0x0108, B:41:0x00db), top: B:122:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x022b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(long r27, boolean r29, defpackage.yj r30, boolean r31, defpackage.k11 r32) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.g(long, boolean, yj, boolean, k11):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:22|23))(3:24|25|(1:27))|11|12|(4:14|(1:16)|17|18)(1:20)))|30|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
        r6 = r0.B;
        r8 = defpackage.wh1.d(r6, r6, r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(long r6, defpackage.k11 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.fk
            if (r0 == 0) goto L13
            r0 = r8
            fk r0 = (defpackage.fk) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            fk r0 = new fk
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            defpackage.me2.a0(r8)     // Catch: java.lang.Throwable -> L28
            goto L40
        L28:
            r5 = move-exception
            goto L43
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            return r3
        L30:
            defpackage.me2.a0(r8)
            b74 r5 = r5.b     // Catch: java.lang.Throwable -> L28
            r0.Y = r4     // Catch: java.lang.Throwable -> L28
            bd5 r5 = r5.a     // Catch: java.lang.Throwable -> L28
            java.lang.Object r8 = r5.m(r6, r0)     // Catch: java.lang.Throwable -> L28
            if (r8 != r1) goto L40
            return r1
        L40:
            ey4 r8 = (defpackage.ey4) r8     // Catch: java.lang.Throwable -> L28
            goto L49
        L43:
            e31 r6 = r0.B
            kc5 r8 = defpackage.wh1.d(r6, r6, r5)
        L49:
            boolean r5 = r8 instanceof defpackage.kc5
            if (r5 != 0) goto L56
            ey4 r8 = (defpackage.ey4) r8
            if (r8 == 0) goto L55
            dy4 r3 = defpackage.gk2.Y(r8)
        L55:
            r8 = r3
        L56:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.h(long, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(long r13, defpackage.k11 r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.gk
            if (r0 == 0) goto L13
            r0 = r15
            gk r0 = (defpackage.gk) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            gk r0 = new gk
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.me2.a0(r15)
            goto L3e
        L28:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r12)
            return r3
        L2e:
            defpackage.me2.a0(r15)
            r0.Y = r4
            b74 r12 = r12.b
            bd5 r12 = r12.a
            java.lang.Object r15 = r12.n(r13, r0)
            if (r15 != r1) goto L3e
            return r1
        L3e:
            iy4 r15 = (defpackage.iy4) r15
            if (r15 == 0) goto L62
            jy4 r4 = new jy4
            long r5 = r15.a
            long r7 = r15.b
            java.lang.String r9 = r15.c
            java.lang.String r12 = r15.d
            gy4[] r13 = defpackage.gy4.values()
            java.lang.Enum r12 = defpackage.se.t(r12, r13)
            r10 = r12
            gy4 r10 = (defpackage.gy4) r10
            java.net.URL r11 = new java.net.URL
            java.lang.String r12 = r15.e
            r11.<init>(r12)
            r4.<init>(r5, r7, r9, r10, r11)
            return r4
        L62:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.i(long, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:14:0x0032, B:44:0x00a7, B:45:0x00b8, B:47:0x00be, B:48:0x00cf, B:21:0x0048, B:37:0x008a, B:39:0x008e, B:40:0x0092, B:24:0x0052, B:31:0x0070, B:33:0x0074, B:27:0x005d), top: B:53:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:14:0x0032, B:44:0x00a7, B:45:0x00b8, B:47:0x00be, B:48:0x00cf, B:21:0x0048, B:37:0x008a, B:39:0x008e, B:40:0x0092, B:24:0x0052, B:31:0x0070, B:33:0x0074, B:27:0x005d), top: B:53:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be A[Catch: all -> 0x0037, LOOP:0: B:45:0x00b8->B:47:0x00be, LOOP_END, TryCatch #0 {all -> 0x0037, blocks: (B:14:0x0032, B:44:0x00a7, B:45:0x00b8, B:47:0x00be, B:48:0x00cf, B:21:0x0048, B:37:0x008a, B:39:0x008e, B:40:0x0092, B:24:0x0052, B:31:0x0070, B:33:0x0074, B:27:0x005d), top: B:53:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r12, boolean r13, defpackage.k11 r14) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.j(java.lang.String, boolean, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0161, code lost:
        if (r7 == r8) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #1 {all -> 0x0043, blocks: (B:15:0x003f, B:35:0x00ab, B:37:0x00af, B:32:0x009c), top: B:73:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0153 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0154 A[Catch: all -> 0x0051, TRY_ENTER, TryCatch #0 {all -> 0x0051, blocks: (B:21:0x004c, B:66:0x0164, B:68:0x0168, B:63:0x0154), top: B:73:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0168 A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:21:0x004c, B:66:0x0164, B:68:0x0168, B:63:0x0154), top: B:73:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r20, boolean r21, defpackage.k11 r22) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.k(java.lang.String, boolean, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r7, defpackage.k11 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.jk
            if (r0 == 0) goto L13
            r0 = r8
            jk r0 = (defpackage.jk) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            jk r0 = new jk
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.me2.a0(r8)
            return r8
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            return r5
        L31:
            defpackage.me2.a0(r8)
            nc5 r8 = (defpackage.nc5) r8
            java.lang.Object r7 = r8.A
            goto L46
        L39:
            defpackage.me2.a0(r8)
            r0.Y = r4
            r8 = 0
            java.lang.Object r7 = r6.k(r7, r8, r0)
            if (r7 != r1) goto L46
            goto L59
        L46:
            boolean r8 = r7 instanceof defpackage.kc5
            if (r8 == 0) goto L4b
            r7 = r5
        L4b:
            w05 r7 = (defpackage.w05) r7
            if (r7 == 0) goto L5b
            long r7 = r7.a
            r0.Y = r3
            java.lang.Object r6 = r6.m(r7, r0)
            if (r6 != r1) goto L5a
        L59:
            return r1
        L5a:
            return r6
        L5b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.l(java.lang.String, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(long r6, defpackage.k11 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.kk
            if (r0 == 0) goto L13
            r0 = r8
            kk r0 = (defpackage.kk) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            kk r0 = new kk
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.me2.a0(r8)
            goto L3e
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            return r3
        L2e:
            defpackage.me2.a0(r8)
            r0.Y = r4
            b74 r5 = r5.b
            bd5 r5 = r5.a
            java.lang.Object r8 = r5.p(r6, r0)
            if (r8 != r1) goto L3e
            return r1
        L3e:
            u05 r8 = (defpackage.u05) r8
            if (r8 == 0) goto L53
            z05 r5 = new z05
            java.lang.String r6 = r8.c
            java.net.URL r7 = new java.net.URL
            java.lang.String r0 = r8.d
            r7.<init>(r0)
            java.lang.String r8 = r8.b
            r5.<init>(r6, r7, r8)
            return r5
        L53:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.m(long, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(long r20, defpackage.k11 r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r22
            boolean r2 = r1 instanceof defpackage.lk
            if (r2 == 0) goto L17
            r2 = r1
            lk r2 = (defpackage.lk) r2
            int r3 = r2.Y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Y = r3
            goto L1c
        L17:
            lk r2 = new lk
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.R
            p31 r3 = defpackage.p31.COROUTINE_SUSPENDED
            int r4 = r2.Y
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L32
            if (r4 != r6) goto L2c
            defpackage.me2.a0(r1)
            goto L44
        L2c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r0)
            return r5
        L32:
            defpackage.me2.a0(r1)
            r2.Y = r6
            b74 r0 = r0.b
            bd5 r0 = r0.a
            r6 = r20
            java.lang.Object r1 = r0.t(r6, r2)
            if (r1 != r3) goto L44
            return r3
        L44:
            l15 r1 = (defpackage.l15) r1
            if (r1 == 0) goto L66
            j15 r6 = new j15
            long r7 = r1.a
            long r9 = r1.b
            long r11 = r1.c
            java.lang.String r13 = r1.d
            java.lang.String r14 = r1.e
            boolean r15 = r1.f
            java.lang.String r0 = r1.g
            java.lang.String r2 = r1.h
            boolean r1 = r1.i
            r16 = r0
            r18 = r1
            r17 = r2
            r6.<init>(r7, r9, r11, r13, r14, r15, r16, r17, r18)
            return r6
        L66:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.n(long, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(long r5, int r7, int r8, defpackage.k11 r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.mk
            if (r0 == 0) goto L14
            r0 = r9
            mk r0 = (defpackage.mk) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Y = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            mk r0 = new mk
            r0.<init>(r4, r9)
            goto L12
        L1a:
            java.lang.Object r0 = r9.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r9.Y
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            defpackage.me2.a0(r0)
            nc5 r0 = (defpackage.nc5) r0
            java.lang.Object r4 = r0.A
            return r4
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L34:
            defpackage.me2.a0(r0)
            r9.Y = r3
            az4 r4 = r4.a
            java.lang.Object r4 = r4.o(r5, r7, r8, r9)
            if (r4 != r1) goto L42
            return r1
        L42:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.o(long, int, int, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.String r5, boolean r6, defpackage.k11 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.ok
            if (r0 == 0) goto L13
            r0 = r7
            ok r0 = (defpackage.ok) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ok r0 = new ok
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
            r0.Y = r3
            r7 = 0
            java.lang.Object r4 = r4.q(r5, r6, r7, r0)
            if (r4 != r1) goto L3f
            return r1
        L3f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.p(java.lang.String, boolean, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
        if (r14 == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.String r11, boolean r12, boolean r13, defpackage.k11 r14) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.q(java.lang.String, boolean, boolean, k11):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:3|(10:5|6|7|(1:(2:10|11)(2:32|33))(3:34|35|(1:37))|12|(3:25|(3:28|(1:30)|26)|31)|16|17|18|(2:20|21)(1:23)))|40|6|7|(0)(0)|12|(1:14)|25|(1:26)|31|16|17|18|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
        r4 = new defpackage.kc5(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:12:0x0025, B:20:0x0042, B:22:0x0049, B:30:0x006a, B:25:0x0054, B:26:0x0058, B:28:0x005e, B:17:0x0033), top: B:38:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable r(long r5, long r7, boolean r9, defpackage.k11 r10) {
        /*
            r4 = this;
            boolean r0 = r10 instanceof defpackage.qk
            if (r0 == 0) goto L13
            r0 = r10
            qk r0 = (defpackage.qk) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            qk r0 = new qk
            r0.<init>(r4, r10)
        L18:
            java.lang.Object r10 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            long r7 = r0.R
            defpackage.me2.a0(r10)     // Catch: java.lang.Throwable -> L6f
            goto L42
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L30:
            defpackage.me2.a0(r10)
            b74 r4 = r4.b     // Catch: java.lang.Throwable -> L6f
            r0.R = r7     // Catch: java.lang.Throwable -> L6f
            r0.Z = r3     // Catch: java.lang.Throwable -> L6f
            bd5 r4 = r4.a     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r10 = r4.r(r5, r9, r0)     // Catch: java.lang.Throwable -> L6f
            if (r10 != r1) goto L42
            return r1
        L42:
            java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch: java.lang.Throwable -> L6f
            boolean r4 = r10 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L6f
            r5 = 0
            if (r4 == 0) goto L54
            r4 = r10
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L6f
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L6f
            if (r4 == 0) goto L54
        L52:
            r3 = r5
            goto L6a
        L54:
            java.util.Iterator r4 = r10.iterator()     // Catch: java.lang.Throwable -> L6f
        L58:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L6f
            if (r6 == 0) goto L52
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L6f
            v15 r6 = (defpackage.v15) r6     // Catch: java.lang.Throwable -> L6f
            long r9 = r6.b     // Catch: java.lang.Throwable -> L6f
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 != 0) goto L58
        L6a:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L6f
            goto L76
        L6f:
            r4 = move-exception
            kc5 r5 = new kc5
            r5.<init>(r4)
            r4 = r5
        L76:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r6 = r4 instanceof defpackage.kc5
            if (r6 == 0) goto L7d
            r4 = r5
        L7d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.r(long, long, boolean, k11):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.k11 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.rk
            if (r0 == 0) goto L13
            r0 = r5
            rk r0 = (defpackage.rk) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            rk r0 = new rk
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.me2.a0(r5)
            goto L3c
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.me2.a0(r5)
            r0.Y = r3
            vj r4 = r4.c
            java.lang.Object r5 = r4.b(r0)
            if (r5 != r1) goto L3c
            return r1
        L3c:
            boolean r4 = r5 instanceof defpackage.x15
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.s(k11):java.lang.Object");
    }

    public final void u(String str, ti4... ti4VarArr) {
        if ((this.f.getApplicationInfo().flags & 2) != 0) {
            StringBuilder u = b31.u("event_type=", str, " submit_path=kotlin_api");
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
            Log.i("RATrace", u.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0031, B:52:0x00d2, B:21:0x0044, B:46:0x00b7, B:22:0x0049, B:36:0x0085, B:38:0x008e, B:40:0x0094, B:42:0x009f, B:51:0x00c9, B:33:0x0075), top: B:59:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0031, B:52:0x00d2, B:21:0x0044, B:46:0x00b7, B:22:0x0049, B:36:0x0085, B:38:0x008e, B:40:0x0094, B:42:0x009f, B:51:0x00c9, B:33:0x0075), top: B:59:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.String r10, java.lang.String r11, defpackage.k11 r12) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.v(java.lang.String, java.lang.String, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
        if (r7.b(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(defpackage.k11 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.tk
            if (r0 == 0) goto L13
            r0 = r8
            tk r0 = (defpackage.tk) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            tk r0 = new tk
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 3
            r4 = 2
            r5 = 1
            xf1 r6 = r7.h
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L31
            defpackage.me2.a0(r8)     // Catch: java.lang.Throwable -> L2f
            goto L6d
        L2f:
            r7 = move-exception
            goto L73
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r7)
            r7 = 0
            return r7
        L38:
            defpackage.me2.a0(r8)     // Catch: java.lang.Throwable -> L2f
            goto L62
        L3c:
            defpackage.me2.a0(r8)     // Catch: java.lang.Throwable -> L2f
            goto L57
        L40:
            defpackage.me2.a0(r8)
            boolean r8 = r6.p()
            if (r8 != 0) goto L4c
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L4c:
            b74 r8 = r7.b     // Catch: java.lang.Throwable -> L2f
            r0.Y = r5     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r8.d(r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r1) goto L57
            goto L6c
        L57:
            vj r8 = r7.c     // Catch: java.lang.Throwable -> L2f
            r0.Y = r4     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r8.a(r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r1) goto L62
            goto L6c
        L62:
            xj r7 = r7.d     // Catch: java.lang.Throwable -> L2f
            r0.Y = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r7 = r7.b(r0)     // Catch: java.lang.Throwable -> L2f
            if (r7 != r1) goto L6d
        L6c:
            return r1
        L6d:
            r6.h()
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L73:
            r6.h()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.w(k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(java.lang.String r5, boolean r6, defpackage.k11 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.vk
            if (r0 == 0) goto L13
            r0 = r7
            vk r0 = (defpackage.vk) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            vk r0 = new vk
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
            r0.Y = r3
            java.lang.Object r4 = r4.q(r5, r6, r3, r0)
            if (r4 != r1) goto L3e
            return r1
        L3e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.x(java.lang.String, boolean, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(defpackage.k11 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.wk
            if (r0 == 0) goto L13
            r0 = r7
            wk r0 = (defpackage.wk) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            wk r0 = new wk
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            o27 r3 = defpackage.o27.a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L30
            defpackage.me2.a0(r7)
            nc5 r7 = (defpackage.nc5) r7
            java.lang.Object r6 = r7.A
            goto L59
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            r6 = 0
            return r6
        L37:
            defpackage.me2.a0(r7)
            goto L49
        L3b:
            defpackage.me2.a0(r7)
            r0.Y = r5
            vj r7 = r6.c
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L49
            goto L58
        L49:
            boolean r7 = r7 instanceof defpackage.x15
            if (r7 != 0) goto L4e
            goto L72
        L4e:
            r0.Y = r4
            az4 r6 = r6.a
            java.lang.Object r6 = r6.r(r0)
            if (r6 != r1) goto L59
        L58:
            return r1
        L59:
            java.lang.Throwable r6 = defpackage.nc5.a(r6)
            if (r6 == 0) goto L72
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getSimpleName()
            java.lang.String r7 = "profile refresh failed: "
            java.lang.String r6 = r7.concat(r6)
            java.lang.String r7 = "RATrace"
            android.util.Log.w(r7, r6)
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.y(k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(java.lang.String r18, boolean r19, java.lang.String r20, defpackage.k11 r21) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.z(java.lang.String, boolean, java.lang.String, k11):java.lang.Object");
    }
}
