package k7;

import g2.v3;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f8041l = {"INSERT", "UPDATE", "DELETE"};

    /* renamed from: a  reason: collision with root package name */
    public final t f8042a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f8043b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f8044c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f8045d;

    /* renamed from: e  reason: collision with root package name */
    public final a2.g f8046e;

    /* renamed from: g  reason: collision with root package name */
    public final String[] f8048g;

    /* renamed from: h  reason: collision with root package name */
    public final k f8049h;

    /* renamed from: i  reason: collision with root package name */
    public final d2.t f8050i;

    /* renamed from: j  reason: collision with root package name */
    public final AtomicBoolean f8051j = new AtomicBoolean(false);

    /* renamed from: k  reason: collision with root package name */
    public mc.a f8052k = new v3(12);

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashMap f8047f = new LinkedHashMap();

    public m0(t tVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z10, a2.g gVar) {
        String str;
        this.f8042a = tVar;
        this.f8043b = linkedHashMap;
        this.f8044c = linkedHashMap2;
        this.f8045d = z10;
        this.f8046e = gVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str2 = strArr[i2];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            this.f8047f.put(lowerCase, Integer.valueOf(i2));
            String str3 = (String) this.f8043b.get(strArr[i2]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                str.getClass();
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i2] = lowerCase;
        }
        this.f8048g = strArr2;
        for (Map.Entry entry : this.f8043b.entrySet()) {
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(locale2);
            lowerCase2.getClass();
            if (this.f8047f.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase3.getClass();
                LinkedHashMap linkedHashMap3 = this.f8047f;
                linkedHashMap3.put(lowerCase3, zb.v.D(lowerCase2, linkedHashMap3));
            }
        }
        this.f8049h = new k(this.f8048g.length);
        this.f8050i = new d2.t(this.f8048g.length);
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
    public static final java.lang.Object a(k7.m0 r4, k7.n r5, ec.c r6) {
        /*
            boolean r0 = r6 instanceof k7.d0
            if (r0 == 0) goto L13
            r0 = r6
            k7.d0 r0 = (k7.d0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            k7.d0 r0 = new k7.d0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.X
            dc.a r6 = dc.a.COROUTINE_SUSPENDED
            int r1 = r0.Z
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            java.lang.Object r5 = r0.R
            java.util.Set r5 = (java.util.Set) r5
            p7.j.I(r4)
            return r5
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r4)
            r4 = 0
            return r4
        L35:
            java.lang.Object r5 = r0.R
            k7.n r5 = (k7.n) r5
            p7.j.I(r4)
            goto L54
        L3d:
            p7.j.I(r4)
            g2.l5 r4 = new g2.l5
            r1 = 23
            r4.<init>(r1)
            r0.R = r5
            r0.Z = r3
            java.lang.String r1 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.a(r1, r4, r0)
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
            java.lang.Object r5 = ij.a.M(r5, r1, r0)
            if (r5 != r6) goto L6c
        L6b:
            return r6
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.m0.a(k7.m0, k7.n, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081 A[Catch: all -> 0x002c, TryCatch #1 {all -> 0x002c, blocks: (B:12:0x0028, B:32:0x0076, B:34:0x0081, B:47:0x00bc, B:37:0x0090, B:38:0x0094, B:40:0x00a1, B:42:0x00ab, B:44:0x00b1, B:43:0x00af, B:45:0x00b6), top: B:57:0x0028 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(k7.m0 r11, ec.c r12) {
        /*
            k7.t r0 = r11.f8042a
            boolean r1 = r12 instanceof k7.f0
            if (r1 == 0) goto L15
            r1 = r12
            k7.f0 r1 = (k7.f0) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Z = r2
            goto L1a
        L15:
            k7.f0 r1 = new k7.f0
            r1.<init>(r11, r12)
        L1a:
            java.lang.Object r12 = r1.X
            dc.a r2 = dc.a.COROUTINE_SUSPENDED
            int r3 = r1.Z
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L36
            if (r3 != r5) goto L2f
            jb.c r0 = r1.R
            p7.j.I(r12)     // Catch: java.lang.Throwable -> L2c
            goto L76
        L2c:
            r11 = move-exception
            goto Lc7
        L2f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r11)
            r11 = 0
            return r11
        L36:
            p7.j.I(r12)
            jb.c r12 = r0.f8079g
            boolean r3 = r12.i()
            zb.s r6 = zb.s.A
            if (r3 == 0) goto Lcb
            java.util.concurrent.atomic.AtomicBoolean r3 = r11.f8051j     // Catch: java.lang.Throwable -> Lc5
            boolean r3 = r3.compareAndSet(r5, r4)     // Catch: java.lang.Throwable -> Lc5
            if (r3 != 0) goto L4f
            r12.v()
            return r6
        L4f:
            mc.a r3 = r11.f8052k     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> Lc5
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> Lc5
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> Lc5
            if (r3 != 0) goto L61
            r12.v()
            return r6
        L61:
            k7.g0 r3 = new k7.g0     // Catch: java.lang.Throwable -> Lc5
            r6 = 0
            r7 = 1
            r3.<init>(r11, r6, r7)     // Catch: java.lang.Throwable -> Lc5
            r1.R = r12     // Catch: java.lang.Throwable -> Lc5
            r1.Z = r5     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r0 = r0.q(r4, r3, r1)     // Catch: java.lang.Throwable -> Lc5
            if (r0 != r2) goto L73
            return r2
        L73:
            r10 = r0
            r0 = r12
            r12 = r10
        L76:
            java.util.Set r12 = (java.util.Set) r12     // Catch: java.lang.Throwable -> L2c
            r1 = r12
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L2c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto Lc1
            d2.t r1 = r11.f8050i     // Catch: java.lang.Throwable -> L2c
            r1.getClass()     // Catch: java.lang.Throwable -> L2c
            r12.getClass()     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r12.isEmpty()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L90
            goto Lbc
        L90:
            java.lang.Object r1 = r1.B     // Catch: java.lang.Throwable -> L2c
            cd.q1 r1 = (cd.q1) r1     // Catch: java.lang.Throwable -> L2c
        L94:
            java.lang.Object r2 = r1.getValue()     // Catch: java.lang.Throwable -> L2c
            r3 = r2
            int[] r3 = (int[]) r3     // Catch: java.lang.Throwable -> L2c
            int r6 = r3.length     // Catch: java.lang.Throwable -> L2c
            int[] r7 = new int[r6]     // Catch: java.lang.Throwable -> L2c
            r8 = r4
        L9f:
            if (r8 >= r6) goto Lb6
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L2c
            boolean r9 = r12.contains(r9)     // Catch: java.lang.Throwable -> L2c
            if (r9 == 0) goto Laf
            r9 = r3[r8]     // Catch: java.lang.Throwable -> L2c
            int r9 = r9 + r5
            goto Lb1
        Laf:
            r9 = r3[r8]     // Catch: java.lang.Throwable -> L2c
        Lb1:
            r7[r8] = r9     // Catch: java.lang.Throwable -> L2c
            int r8 = r8 + 1
            goto L9f
        Lb6:
            boolean r2 = r1.i(r2, r7)     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L94
        Lbc:
            a2.g r11 = r11.f8046e     // Catch: java.lang.Throwable -> L2c
            r11.k(r12)     // Catch: java.lang.Throwable -> L2c
        Lc1:
            r0.v()
            return r12
        Lc5:
            r11 = move-exception
            r0 = r12
        Lc7:
            r0.v()
            throw r11
        Lcb:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.m0.b(k7.m0, ec.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
        if (ij.a.M(r1, r3, r4) == r5) goto L18;
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
    /* JADX WARN: Type inference failed for: r11v4, types: [k7.n] */
    /* JADX WARN: Type inference failed for: r2v6, types: [k7.n] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d8 -> B:28:0x00db). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(k7.m0 r17, k7.c0 r18, int r19, ec.c r20) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.m0.c(k7.m0, k7.c0, int, ec.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Type inference failed for: r4v4, types: [k7.n] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0081 -> B:19:0x0084). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(k7.m0 r8, k7.c0 r9, int r10, ec.c r11) {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof k7.i0
            if (r0 == 0) goto L16
            r0 = r11
            k7.i0 r0 = (k7.i0) r0
            int r1 = r0.f8026e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f8026e0 = r1
            goto L1b
        L16:
            k7.i0 r0 = new k7.i0
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.f8024c0
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.f8026e0
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L36
            int r8 = r0.f8023b0
            int r9 = r0.Z
            java.lang.String[] r10 = r0.Y
            java.lang.String r2 = r0.X
            k7.n r4 = r0.R
            p7.j.I(r11)
            r11 = r10
            r10 = r4
            goto L84
        L36:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r8)
            r8 = 0
            return r8
        L3d:
            p7.j.I(r11)
            java.lang.String[] r8 = r8.f8048g
            r8 = r8[r10]
            java.lang.String[] r10 = k7.m0.f8041l
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
            java.lang.String r4 = kc.a.c(r6, r5, r4)
            r0.R = r10
            r0.X = r2
            r0.Y = r11
            r0.Z = r9
            r0.f8023b0 = r8
            r0.f8026e0 = r3
            java.lang.Object r4 = ij.a.M(r10, r4, r0)
            if (r4 != r1) goto L84
            return r1
        L84:
            int r9 = r9 + r3
            goto L4f
        L86:
            yb.y r8 = yb.y.f14813a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.m0.d(k7.m0, k7.c0, int, ec.c):java.lang.Object");
    }

    public final void e(mc.a aVar, mc.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        if (this.f8051j.compareAndSet(false, true)) {
            aVar.b();
            ah.h0 h0Var = this.f8042a.f8073a;
            if (h0Var != null) {
                zc.x.v(h0Var, new zc.t(), null, new di.b(this, aVar2, null, 21), 2);
            } else {
                nc.k.f("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(ec.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof k7.j0
            if (r0 == 0) goto L13
            r0 = r8
            k7.j0 r0 = (k7.j0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            k7.j0 r0 = new k7.j0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            jb.c r0 = r0.R
            p7.j.I(r8)     // Catch: java.lang.Throwable -> L29
            goto L53
        L29:
            r8 = move-exception
            goto L59
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r8)
            r8 = 0
            return r8
        L32:
            p7.j.I(r8)
            k7.t r8 = r7.f8042a
            jb.c r2 = r8.f8079g
            boolean r4 = r2.i()
            if (r4 == 0) goto L5d
            h1.x2 r4 = new h1.x2     // Catch: java.lang.Throwable -> L57
            r5 = 0
            r6 = 7
            r4.<init>(r6, r5, r7)     // Catch: java.lang.Throwable -> L57
            r0.R = r2     // Catch: java.lang.Throwable -> L57
            r0.Z = r3     // Catch: java.lang.Throwable -> L57
            r3 = 0
            java.lang.Object r8 = r8.q(r3, r4, r0)     // Catch: java.lang.Throwable -> L57
            if (r8 != r1) goto L52
            return r1
        L52:
            r0 = r2
        L53:
            r0.v()
            goto L5d
        L57:
            r8 = move-exception
            r0 = r2
        L59:
            r0.v()
            throw r8
        L5d:
            yb.y r8 = yb.y.f14813a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.m0.f(ec.c):java.lang.Object");
    }
}
