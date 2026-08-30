package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sy6  reason: default package */
/* loaded from: classes.dex */
public final class sy6 {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};
    public final sq5 a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final boolean d;
    public final z e;
    public final String[] g;
    public final j94 h;
    public final ka3 i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public ki2 k = new zv5(10);
    public final LinkedHashMap f = new LinkedHashMap();

    public sy6(sq5 sq5Var, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, z zVar) {
        String str;
        this.a = sq5Var;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
        this.d = z;
        this.e = zVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            this.f.put(lowerCase, Integer.valueOf(i));
            String str3 = (String) this.b.get(strArr[i]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                str.getClass();
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(locale2);
            lowerCase2.getClass();
            if (this.f.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase3.getClass();
                LinkedHashMap linkedHashMap3 = this.f;
                linkedHashMap3.put(lowerCase3, zt3.i0(lowerCase2, linkedHashMap3));
            }
        }
        this.h = new j94(this.g.length);
        this.i = new ka3(this.g.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
        if (r4 == r6) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.sy6 r4, defpackage.fq4 r5, defpackage.k11 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.jy6
            if (r0 == 0) goto L13
            r0 = r6
            jy6 r0 = (defpackage.jy6) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            jy6 r0 = new jy6
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.X
            p31 r6 = defpackage.p31.COROUTINE_SUSPENDED
            int r1 = r0.Z
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            java.lang.Object r5 = r0.R
            java.util.Set r5 = (java.util.Set) r5
            defpackage.me2.a0(r4)
            return r5
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L35:
            java.lang.Object r5 = r0.R
            fq4 r5 = (defpackage.fq4) r5
            defpackage.me2.a0(r4)
            goto L54
        L3d:
            defpackage.me2.a0(r4)
            d96 r4 = new d96
            r1 = 26
            r4.<init>(r1)
            r0.R = r5
            r0.Z = r3
            java.lang.String r1 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.b(r1, r4, r0)
            if (r4 != r6) goto L54
            goto L6b
        L54:
            java.util.Set r4 = (java.util.Set) r4
            r1 = r4
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L6c
            r0.R = r4
            r0.Z = r2
            java.lang.String r1 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = defpackage.oo2.C(r5, r1, r0)
            if (r5 != r6) goto L6c
        L6b:
            return r6
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sy6.a(sy6, fq4, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, blocks: (B:12:0x0029, B:32:0x0074, B:34:0x007f, B:47:0x00ba, B:37:0x008e, B:38:0x0092, B:40:0x009f, B:42:0x00a9, B:44:0x00af, B:43:0x00ad, B:45:0x00b4), top: B:57:0x0029 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.sy6 r11, defpackage.k11 r12) {
        /*
            sq5 r0 = r11.a
            boolean r1 = r12 instanceof defpackage.ly6
            if (r1 == 0) goto L15
            r1 = r12
            ly6 r1 = (defpackage.ly6) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Z = r2
            goto L1a
        L15:
            ly6 r1 = new ly6
            r1.<init>(r11, r12)
        L1a:
            java.lang.Object r12 = r1.X
            p31 r2 = defpackage.p31.COROUTINE_SUSPENDED
            int r3 = r1.Z
            r4 = 0
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L36
            if (r3 != r6) goto L30
            q03 r0 = r1.R
            defpackage.me2.a0(r12)     // Catch: java.lang.Throwable -> L2d
            goto L74
        L2d:
            r11 = move-exception
            goto Lc5
        L30:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r11)
            return r4
        L36:
            defpackage.me2.a0(r12)
            q03 r12 = r0.g
            boolean r3 = r12.g()
            up1 r7 = defpackage.up1.A
            if (r3 == 0) goto Lc9
            java.util.concurrent.atomic.AtomicBoolean r3 = r11.j     // Catch: java.lang.Throwable -> Lc3
            boolean r3 = r3.compareAndSet(r6, r5)     // Catch: java.lang.Throwable -> Lc3
            if (r3 != 0) goto L4f
            r12.D()
            return r7
        L4f:
            ki2 r3 = r11.k     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r3 = r3.c()     // Catch: java.lang.Throwable -> Lc3
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> Lc3
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> Lc3
            if (r3 != 0) goto L61
            r12.D()
            return r7
        L61:
            my6 r3 = new my6     // Catch: java.lang.Throwable -> Lc3
            r3.<init>(r11, r4, r6)     // Catch: java.lang.Throwable -> Lc3
            r1.R = r12     // Catch: java.lang.Throwable -> Lc3
            r1.Z = r6     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r0 = r0.q(r5, r3, r1)     // Catch: java.lang.Throwable -> Lc3
            if (r0 != r2) goto L71
            return r2
        L71:
            r10 = r0
            r0 = r12
            r12 = r10
        L74:
            java.util.Set r12 = (java.util.Set) r12     // Catch: java.lang.Throwable -> L2d
            r1 = r12
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L2d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto Lbf
            ka3 r1 = r11.i     // Catch: java.lang.Throwable -> L2d
            r1.getClass()     // Catch: java.lang.Throwable -> L2d
            r12.getClass()     // Catch: java.lang.Throwable -> L2d
            boolean r2 = r12.isEmpty()     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L8e
            goto Lba
        L8e:
            java.lang.Object r1 = r1.B     // Catch: java.lang.Throwable -> L2d
            ee6 r1 = (defpackage.ee6) r1     // Catch: java.lang.Throwable -> L2d
        L92:
            java.lang.Object r2 = r1.getValue()     // Catch: java.lang.Throwable -> L2d
            r3 = r2
            int[] r3 = (int[]) r3     // Catch: java.lang.Throwable -> L2d
            int r4 = r3.length     // Catch: java.lang.Throwable -> L2d
            int[] r7 = new int[r4]     // Catch: java.lang.Throwable -> L2d
            r8 = r5
        L9d:
            if (r8 >= r4) goto Lb4
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L2d
            boolean r9 = r12.contains(r9)     // Catch: java.lang.Throwable -> L2d
            if (r9 == 0) goto Lad
            r9 = r3[r8]     // Catch: java.lang.Throwable -> L2d
            int r9 = r9 + r6
            goto Laf
        Lad:
            r9 = r3[r8]     // Catch: java.lang.Throwable -> L2d
        Laf:
            r7[r8] = r9     // Catch: java.lang.Throwable -> L2d
            int r8 = r8 + 1
            goto L9d
        Lb4:
            boolean r2 = r1.j(r2, r7)     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L92
        Lba:
            z r11 = r11.e     // Catch: java.lang.Throwable -> L2d
            r11.n(r12)     // Catch: java.lang.Throwable -> L2d
        Lbf:
            r0.D()
            return r12
        Lc3:
            r11 = move-exception
            r0 = r12
        Lc5:
            r0.D()
            throw r11
        Lc9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sy6.b(sy6, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
        if (defpackage.oo2.C(r1, r3, r4) == r5) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d8, code lost:
        if (r3 == r5) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00da, code lost:
        return r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARN: Type inference failed for: r11v4, types: [fq4] */
    /* JADX WARN: Type inference failed for: r2v6, types: [fq4] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d8 -> B:28:0x00db). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.sy6 r17, defpackage.qw6 r18, int r19, defpackage.k11 r20) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sy6.c(sy6, qw6, int, k11):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Type inference failed for: r4v4, types: [fq4] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0081 -> B:19:0x0084). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.sy6 r8, defpackage.qw6 r9, int r10, defpackage.k11 r11) {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof defpackage.oy6
            if (r0 == 0) goto L16
            r0 = r11
            oy6 r0 = (defpackage.oy6) r0
            int r1 = r0.f0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f0 = r1
            goto L1b
        L16:
            oy6 r0 = new oy6
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.d0
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.f0
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L36
            int r8 = r0.c0
            int r9 = r0.Z
            java.lang.String[] r10 = r0.Y
            java.lang.String r2 = r0.X
            fq4 r4 = r0.R
            defpackage.me2.a0(r11)
            r11 = r10
            r10 = r4
            goto L84
        L36:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r8)
            r8 = 0
            return r8
        L3d:
            defpackage.me2.a0(r11)
            java.lang.String[] r8 = r8.g
            r8 = r8[r10]
            java.lang.String[] r10 = defpackage.sy6.l
            r11 = 0
            r2 = 3
            r7 = r2
            r2 = r8
            r8 = r7
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
        L4f:
            if (r9 >= r8) goto L86
            r4 = r11[r9]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "room_table_modification_trigger_"
            r5.<init>(r6)
            r5.append(r2)
            r6 = 95
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            r6 = 96
            java.lang.String r4 = defpackage.b31.n(r6, r5, r4)
            r0.R = r10
            r0.X = r2
            r0.Y = r11
            r0.Z = r9
            r0.c0 = r8
            r0.f0 = r3
            java.lang.Object r4 = defpackage.oo2.C(r10, r4, r0)
            if (r4 != r1) goto L84
            return r1
        L84:
            int r9 = r9 + r3
            goto L4f
        L86:
            o27 r8 = defpackage.o27.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sy6.d(sy6, qw6, int, k11):java.lang.Object");
    }

    public final void e(ki2 ki2Var, ki2 ki2Var2) {
        ki2Var.getClass();
        ki2Var2.getClass();
        if (this.j.compareAndSet(false, true)) {
            ki2Var.c();
            g11 g11Var = this.a.a;
            if (g11Var != null) {
                tq5.w(g11Var, new j31("Room Invalidation Tracker Refresh"), null, new v74(this, ki2Var2, null, 23), 2);
            } else {
                b53.g0("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.k11 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.py6
            if (r0 == 0) goto L13
            r0 = r8
            py6 r0 = (defpackage.py6) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            py6 r0 = new py6
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            q03 r7 = r0.R
            defpackage.me2.a0(r8)     // Catch: java.lang.Throwable -> L2a
            goto L53
        L2a:
            r8 = move-exception
            goto L59
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r7)
            return r3
        L32:
            defpackage.me2.a0(r8)
            sq5 r8 = r7.a
            q03 r2 = r8.g
            boolean r5 = r2.g()
            if (r5 == 0) goto L5d
            zw5 r5 = new zw5     // Catch: java.lang.Throwable -> L57
            r6 = 11
            r5.<init>(r7, r3, r6)     // Catch: java.lang.Throwable -> L57
            r0.R = r2     // Catch: java.lang.Throwable -> L57
            r0.Z = r4     // Catch: java.lang.Throwable -> L57
            r7 = 0
            java.lang.Object r7 = r8.q(r7, r5, r0)     // Catch: java.lang.Throwable -> L57
            if (r7 != r1) goto L52
            return r1
        L52:
            r7 = r2
        L53:
            r7.D()
            goto L5d
        L57:
            r8 = move-exception
            r7 = r2
        L59:
            r7.D()
            throw r8
        L5d:
            o27 r7 = defpackage.o27.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sy6.f(k11):java.lang.Object");
    }
}
