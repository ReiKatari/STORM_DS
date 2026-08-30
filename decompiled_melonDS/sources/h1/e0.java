package h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f5886a = ((float) 0.125d) / 18;

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00be, code lost:
        if (h3.b.b(v3.s.h(r11, true), 0) == false) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [nc.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005f -> B:22:0x0064). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(v3.f0 r17, long r18, ec.c r20) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.e0.a(v3.f0, long, ec.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c A[Catch: m -> 0x00a5, TRY_LEAVE, TryCatch #0 {m -> 0x00a5, blocks: (B:12:0x002a, B:34:0x0098, B:36:0x009c, B:30:0x007e), top: B:46:0x0020 }] */
    /* JADX WARN: Type inference failed for: r10v2, types: [nc.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [nc.t] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [nc.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [nc.p, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(v3.f0 r9, long r10, ec.c r12) {
        /*
            boolean r0 = r12 instanceof h1.z
            if (r0 == 0) goto L13
            r0 = r12
            h1.z r0 = (h1.z) r0
            int r1 = r0.f6043b0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6043b0 = r1
            goto L18
        L13:
            h1.z r0 = new h1.z
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.Z
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.f6043b0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2e
            nc.p r9 = r0.Y
            nc.t r10 = r0.X
            v3.t r11 = r0.R
            p7.j.I(r12)     // Catch: v3.m -> La5
            goto L98
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r9)
            r9 = 0
            return r9
        L35:
            p7.j.I(r12)
            v3.h0 r12 = r9.Y
            v3.k r12 = r12.f13663n0
            boolean r12 = e(r12, r10)
            if (r12 == 0) goto L43
            goto La4
        L43:
            v3.h0 r12 = r9.Y
            v3.k r12 = r12.f13663n0
            java.lang.Object r12 = r12.f13678a
            int r2 = r12.size()
            r5 = 0
        L4e:
            if (r5 >= r2) goto L63
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            v3.t r7 = (v3.t) r7
            long r7 = r7.f13691a
            boolean r7 = v3.s.e(r7, r10)
            if (r7 == 0) goto L60
            goto L64
        L60:
            int r5 = r5 + 1
            goto L4e
        L63:
            r6 = r4
        L64:
            r11 = r6
            v3.t r11 = (v3.t) r11
            if (r11 != 0) goto L6a
            goto La4
        L6a:
            nc.t r10 = new nc.t
            r10.<init>()
            nc.t r12 = new nc.t
            r12.<init>()
            r12.A = r11
            b4.z2 r2 = r9.k()
            long r5 = r2.c()
            nc.p r2 = new nc.p     // Catch: v3.m -> La5
            r2.<init>()     // Catch: v3.m -> La5
            h1.a0 r7 = new h1.a0     // Catch: v3.m -> La5
            r7.<init>(r2, r12, r10, r4)     // Catch: v3.m -> La5
            r0.R = r11     // Catch: v3.m -> La5
            r0.X = r10     // Catch: v3.m -> La5
            r0.Y = r2     // Catch: v3.m -> La5
            r0.f6043b0 = r3     // Catch: v3.m -> La5
            java.lang.Object r9 = r9.l(r5, r7, r0)     // Catch: v3.m -> La5
            if (r9 != r1) goto L97
            return r1
        L97:
            r9 = r2
        L98:
            boolean r9 = r9.A     // Catch: v3.m -> La5
            if (r9 == 0) goto La4
            java.lang.Object r9 = r10.A     // Catch: v3.m -> La5
            v3.t r9 = (v3.t) r9     // Catch: v3.m -> La5
            if (r9 != 0) goto La3
            return r11
        La3:
            return r9
        La4:
            return r4
        La5:
            java.lang.Object r9 = r10.A
            v3.t r9 = (v3.t) r9
            if (r9 != 0) goto Lac
            goto Lad
        Lac:
            r11 = r9
        Lad:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.e0.b(v3.f0, long, ec.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [nc.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [mc.p] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [h1.b0, ec.a] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x013b -> B:21:0x0087). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x015f -> B:62:0x0162). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(v3.f0 r20, long r21, ai.s0 r23, ec.a r24) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.e0.c(v3.f0, long, ai.s0, ec.a):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(v3.f0 r4, long r5, mc.l r7, ec.c r8) {
        /*
            boolean r0 = r8 instanceof h1.d0
            if (r0 == 0) goto L13
            r0 = r8
            h1.d0 r0 = (h1.d0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            h1.d0 r0 = new h1.d0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.Y
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            mc.l r4 = r0.X
            v3.f0 r5 = r0.R
            p7.j.I(r8)
            r7 = r4
            r4 = r5
            goto L44
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r4)
            r4 = 0
            return r4
        L34:
            p7.j.I(r8)
        L37:
            r0.R = r4
            r0.X = r7
            r0.Z = r3
            java.lang.Object r8 = a(r4, r5, r0)
            if (r8 != r1) goto L44
            return r1
        L44:
            v3.t r8 = (v3.t) r8
            if (r8 != 0) goto L4b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4b:
            boolean r5 = v3.s.d(r8)
            if (r5 == 0) goto L54
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L54:
            r7.k(r8)
            long r5 = r8.f13691a
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.e0.d(v3.f0, long, mc.l, ec.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public static final boolean e(v3.k kVar, long j2) {
        Object obj;
        ?? r62 = kVar.f13678a;
        int size = r62.size();
        boolean z10 = false;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                obj = r62.get(i2);
                if (v3.s.e(((v3.t) obj).f13691a, j2)) {
                    break;
                }
                i2++;
            } else {
                obj = null;
                break;
            }
        }
        v3.t tVar = (v3.t) obj;
        if (tVar != null && tVar.f13694d) {
            z10 = true;
        }
        return true ^ z10;
    }

    public static final float f(b4.z2 z2Var, int i2) {
        if (i2 == 2) {
            return z2Var.d() * f5886a;
        }
        return z2Var.d();
    }
}
