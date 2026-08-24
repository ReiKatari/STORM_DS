package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nv4  reason: default package */
/* loaded from: classes.dex */
public final class nv4 {
    public final defpackage.gd5 a;
    public final defpackage.hb4 b;
    public final java.util.LinkedHashMap c;
    public final java.util.LinkedHashSet d;
    public final java.util.LinkedHashSet e;
    public final java.util.LinkedHashSet f;
    public final defpackage.tp6 g;
    public boolean h;
    public final defpackage.de5 i;

    public nv4(defpackage.gd5 r5) {
            r4 = this;
            r5.getClass()
            r4.<init>()
            r4.a = r5
            hb4 r0 = new hb4
            r0.<init>()
            r4.b = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r4.c = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r4.d = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r4.e = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r4.f = r0
            bv4 r0 = new bv4
            yt1 r1 = defpackage.yt1.A
            lc5 r2 = defpackage.lc5.f
            r3 = 0
            r0.<init>(r5, r1, r2, r3)
            tp6 r5 = defpackage.up6.a(r0)
            r4.g = r5
            de5 r0 = new de5
            r0.<init>(r5)
            r4.i = r0
            return
    }

    public final java.lang.Object a(long r6, defpackage.s41 r8) {
            r5 = this;
            boolean r0 = r8 instanceof defpackage.gv4
            if (r0 == 0) goto L13
            r0 = r8
            gv4 r0 = (defpackage.gv4) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            gv4 r0 = new gv4
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.Y
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2c
            long r6 = r0.R
            hb4 r0 = r0.X
            defpackage.oi2.Y(r8)
            goto L45
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r4
        L32:
            defpackage.oi2.Y(r8)
            hb4 r8 = r5.b
            r0.X = r8
            r0.R = r6
            r0.d0 = r3
            java.lang.Object r0 = r8.e(r0)
            if (r0 != r1) goto L44
            return r1
        L44:
            r0 = r8
        L45:
            java.lang.String r6 = r5.j(r6)     // Catch: java.lang.Throwable -> L5d
            if (r6 != 0) goto L4d
            r3 = 0
            goto L55
        L4d:
            java.util.LinkedHashMap r7 = r5.c     // Catch: java.lang.Throwable -> L5d
            r7.remove(r6)     // Catch: java.lang.Throwable -> L5d
            r5.i()     // Catch: java.lang.Throwable -> L5d
        L55:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L5d
            r0.h(r4)
            return r5
        L5d:
            r5 = move-exception
            r0.h(r4)
            throw r5
    }

    public final java.lang.Enum b(defpackage.zu4 r8, defpackage.s41 r9) {
            r7 = this;
            java.util.LinkedHashSet r0 = r7.e
            java.util.LinkedHashSet r1 = r7.d
            boolean r2 = r9 instanceof defpackage.hv4
            if (r2 == 0) goto L17
            r2 = r9
            hv4 r2 = (defpackage.hv4) r2
            int r3 = r2.d0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.d0 = r3
            goto L1c
        L17:
            hv4 r2 = new hv4
            r2.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r2.Y
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.d0
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L38
            if (r4 != r5) goto L32
            hb4 r8 = r2.X
            zu4 r2 = r2.R
            defpackage.oi2.Y(r9)
            r9 = r8
            r8 = r2
            goto L4a
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            return r6
        L38:
            defpackage.oi2.Y(r9)
            r2.R = r8
            hb4 r9 = r7.b
            r2.X = r9
            r2.d0 = r5
            java.lang.Object r2 = r9.e(r2)
            if (r2 != r3) goto L4a
            return r3
        L4a:
            boolean r2 = r7.h     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L55
            fv4 r7 = defpackage.fv4.CLOSED     // Catch: java.lang.Throwable -> L52
            goto Ld5
        L52:
            r7 = move-exception
            goto Ld9
        L55:
            gd5 r2 = r8.b()     // Catch: java.lang.Throwable -> L52
            gd5 r3 = r7.a     // Catch: java.lang.Throwable -> L52
            boolean r2 = defpackage.nb3.k(r2, r3)     // Catch: java.lang.Throwable -> L52
            if (r2 != 0) goto L64
            fv4 r7 = defpackage.fv4.CONTEXT_MISMATCH     // Catch: java.lang.Throwable -> L52
            goto Ld5
        L64:
            java.lang.String r2 = r8.c()     // Catch: java.lang.Throwable -> L52
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L71
            fv4 r7 = defpackage.fv4.DUPLICATE_SUBMISSION_ID     // Catch: java.lang.Throwable -> L52
            goto Ld5
        L71:
            long r2 = r8.e()     // Catch: java.lang.Throwable -> L52
            java.lang.Long r4 = new java.lang.Long     // Catch: java.lang.Throwable -> L52
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L52
            boolean r2 = r0.contains(r4)     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L83
            fv4 r7 = defpackage.fv4.DUPLICATE_NATIVE_SUBMISSION_ID     // Catch: java.lang.Throwable -> L52
            goto Ld5
        L83:
            boolean r2 = r8 instanceof defpackage.yu4     // Catch: java.lang.Throwable -> L52
            java.util.LinkedHashSet r3 = r7.f
            if (r2 == 0) goto L9c
            r2 = r8
            yu4 r2 = (defpackage.yu4) r2     // Catch: java.lang.Throwable -> L52
            long r4 = r2.g     // Catch: java.lang.Throwable -> L52
            java.lang.Long r2 = new java.lang.Long     // Catch: java.lang.Throwable -> L52
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L52
            boolean r2 = r3.contains(r2)     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L9c
            fv4 r7 = defpackage.fv4.DUPLICATE_LEADERBOARD_ATTEMPT_ID     // Catch: java.lang.Throwable -> L52
            goto Ld5
        L9c:
            java.lang.String r2 = r8.c()     // Catch: java.lang.Throwable -> L52
            r1.add(r2)     // Catch: java.lang.Throwable -> L52
            long r1 = r8.e()     // Catch: java.lang.Throwable -> L52
            java.lang.Long r4 = new java.lang.Long     // Catch: java.lang.Throwable -> L52
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L52
            r0.add(r4)     // Catch: java.lang.Throwable -> L52
            boolean r0 = r8 instanceof defpackage.yu4     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto Lc0
            r0 = r8
            yu4 r0 = (defpackage.yu4) r0     // Catch: java.lang.Throwable -> L52
            long r0 = r0.g     // Catch: java.lang.Throwable -> L52
            java.lang.Long r2 = new java.lang.Long     // Catch: java.lang.Throwable -> L52
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L52
            r3.add(r2)     // Catch: java.lang.Throwable -> L52
        Lc0:
            java.util.LinkedHashMap r0 = r7.c     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = r8.c()     // Catch: java.lang.Throwable -> L52
            av4 r2 = new av4     // Catch: java.lang.Throwable -> L52
            cv4 r3 = defpackage.cv4.RETRYABLE     // Catch: java.lang.Throwable -> L52
            r2.<init>(r8, r3)     // Catch: java.lang.Throwable -> L52
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L52
            r7.i()     // Catch: java.lang.Throwable -> L52
            fv4 r7 = defpackage.fv4.ADDED     // Catch: java.lang.Throwable -> L52
        Ld5:
            r9.h(r6)
            return r7
        Ld9:
            r9.h(r6)
            throw r7
    }

    public final java.lang.Object c(java.util.LinkedHashSet r6, java.util.Set r7, java.util.Set r8, java.util.Set r9, defpackage.s41 r10) {
            r5 = this;
            boolean r0 = r10 instanceof defpackage.iv4
            if (r0 == 0) goto L13
            r0 = r10
            iv4 r0 = (defpackage.iv4) r0
            int r1 = r0.g0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g0 = r1
            goto L18
        L13:
            iv4 r0 = new iv4
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.e0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.g0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3c
            hb4 r6 = r0.d0
            java.util.Set r7 = r0.Z
            r9 = r7
            java.util.Set r9 = (java.util.Set) r9
            java.util.Set r7 = r0.Y
            r8 = r7
            java.util.Set r8 = (java.util.Set) r8
            java.util.Set r7 = r0.X
            java.util.Set r7 = (java.util.Set) r7
            java.util.LinkedHashSet r0 = r0.R
            defpackage.oi2.Y(r10)
            r10 = r6
            r6 = r0
            goto L63
        L3c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r4
        L42:
            defpackage.oi2.Y(r10)
            r0.R = r6
            r10 = r7
            java.util.Set r10 = (java.util.Set) r10
            r0.X = r10
            r10 = r8
            java.util.Set r10 = (java.util.Set) r10
            r0.Y = r10
            r10 = r9
            java.util.Set r10 = (java.util.Set) r10
            r0.Z = r10
            hb4 r10 = r5.b
            r0.d0 = r10
            r0.g0 = r3
            java.lang.Object r0 = r10.e(r0)
            if (r0 != r1) goto L63
            return r1
        L63:
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: java.lang.Throwable -> La7
            java.util.LinkedHashSet r6 = defpackage.ii2.K(r6, r7)     // Catch: java.lang.Throwable -> La7
            boolean r7 = r6.isEmpty()     // Catch: java.lang.Throwable -> La7
            java.util.LinkedHashMap r0 = r5.c
            if (r7 != 0) goto La9
            java.util.Set r7 = r0.entrySet()     // Catch: java.lang.Throwable -> La7
            r7.getClass()     // Catch: java.lang.Throwable -> La7
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: java.lang.Throwable -> La7
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> La7
        L7e:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> La7
            if (r1 == 0) goto La9
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> La7
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> La7
            r1.getClass()     // Catch: java.lang.Throwable -> La7
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> La7
            av4 r1 = (defpackage.av4) r1     // Catch: java.lang.Throwable -> La7
            zu4 r1 = r1.a     // Catch: java.lang.Throwable -> La7
            long r1 = r1.e()     // Catch: java.lang.Throwable -> La7
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> La7
            boolean r1 = r6.contains(r1)     // Catch: java.lang.Throwable -> La7
            if (r1 != r3) goto L7e
            r7.remove()     // Catch: java.lang.Throwable -> La7
            goto L7e
        La7:
            r5 = move-exception
            goto Lc1
        La9:
            ql1 r6 = new ql1     // Catch: java.lang.Throwable -> La7
            r7 = 28
            r6.<init>(r7, r9, r8)     // Catch: java.lang.Throwable -> La7
            ev4 r7 = new ev4     // Catch: java.lang.Throwable -> La7
            r7.<init>(r6)     // Catch: java.lang.Throwable -> La7
            r0.replaceAll(r7)     // Catch: java.lang.Throwable -> La7
            r5.i()     // Catch: java.lang.Throwable -> La7
            jg7 r5 = defpackage.jg7.a     // Catch: java.lang.Throwable -> La7
            r10.h(r4)
            return r5
        Lc1:
            r10.h(r4)
            throw r5
    }

    public final java.lang.Object d(defpackage.s41 r7) {
            r6 = this;
            java.util.LinkedHashMap r0 = r6.c
            boolean r1 = r7 instanceof defpackage.jv4
            if (r1 == 0) goto L15
            r1 = r7
            jv4 r1 = (defpackage.jv4) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Z = r2
            goto L1a
        L15:
            jv4 r1 = new jv4
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.X
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.Z
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L32
            if (r3 != r4) goto L2c
            hb4 r1 = r1.R
            defpackage.oi2.Y(r7)
            goto L43
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r5
        L32:
            defpackage.oi2.Y(r7)
            hb4 r7 = r6.b
            r1.R = r7
            r1.Z = r4
            java.lang.Object r1 = r7.e(r1)
            if (r1 != r2) goto L42
            return r2
        L42:
            r1 = r7
        L43:
            int r7 = r0.size()     // Catch: java.lang.Throwable -> L67
            r0.clear()     // Catch: java.lang.Throwable -> L67
            java.util.LinkedHashSet r0 = r6.d     // Catch: java.lang.Throwable -> L67
            r0.clear()     // Catch: java.lang.Throwable -> L67
            java.util.LinkedHashSet r0 = r6.e     // Catch: java.lang.Throwable -> L67
            r0.clear()     // Catch: java.lang.Throwable -> L67
            java.util.LinkedHashSet r0 = r6.f     // Catch: java.lang.Throwable -> L67
            r0.clear()     // Catch: java.lang.Throwable -> L67
            r6.h = r4     // Catch: java.lang.Throwable -> L67
            r6.i()     // Catch: java.lang.Throwable -> L67
            java.lang.Integer r6 = new java.lang.Integer     // Catch: java.lang.Throwable -> L67
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L67
            r1.h(r5)
            return r6
        L67:
            r6 = move-exception
            r1.h(r5)
            throw r6
    }

    public final java.lang.Object e(java.util.Set r9, defpackage.gd5 r10, defpackage.s41 r11) {
            r8 = this;
            java.util.LinkedHashMap r0 = r8.c
            boolean r1 = r11 instanceof defpackage.kv4
            if (r1 == 0) goto L15
            r1 = r11
            kv4 r1 = (defpackage.kv4) r1
            int r2 = r1.e0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.e0 = r2
            goto L1a
        L15:
            kv4 r1 = new kv4
            r1.<init>(r8, r11)
        L1a:
            java.lang.Object r11 = r1.Z
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.e0
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L34
            hb4 r9 = r1.Y
            gd5 r10 = r1.X
            java.util.Set r1 = r1.R
            java.util.Set r1 = (java.util.Set) r1
            defpackage.oi2.Y(r11)
            r11 = r9
            r9 = r1
            goto L51
        L34:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r5
        L3a:
            defpackage.oi2.Y(r11)
            r11 = r9
            java.util.Set r11 = (java.util.Set) r11
            r1.R = r11
            r1.X = r10
            hb4 r11 = r8.b
            r1.Y = r11
            r1.e0 = r4
            java.lang.Object r1 = r11.e(r1)
            if (r1 != r2) goto L51
            return r2
        L51:
            boolean r1 = r8.h     // Catch: java.lang.Throwable -> La1
            r2 = 0
            if (r1 != 0) goto Ld0
            gd5 r1 = r8.a     // Catch: java.lang.Throwable -> La1
            boolean r10 = defpackage.nb3.k(r10, r1)     // Catch: java.lang.Throwable -> La1
            if (r10 == 0) goto Ld0
            boolean r10 = r9.isEmpty()     // Catch: java.lang.Throwable -> La1
            if (r10 == 0) goto L65
            goto Ld0
        L65:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> La1
            r10.<init>()     // Catch: java.lang.Throwable -> La1
            java.util.Set r1 = r0.entrySet()     // Catch: java.lang.Throwable -> La1
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La1
        L72:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> La1
            if (r3 == 0) goto La3
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> La1
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> La1
            java.lang.Object r4 = r3.getValue()     // Catch: java.lang.Throwable -> La1
            av4 r4 = (defpackage.av4) r4     // Catch: java.lang.Throwable -> La1
            zu4 r4 = r4.a     // Catch: java.lang.Throwable -> La1
            long r6 = r4.e()     // Catch: java.lang.Throwable -> La1
            java.lang.Long r4 = new java.lang.Long     // Catch: java.lang.Throwable -> La1
            r4.<init>(r6)     // Catch: java.lang.Throwable -> La1
            boolean r4 = r9.contains(r4)     // Catch: java.lang.Throwable -> La1
            if (r4 == 0) goto L72
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> La1
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> La1
            r10.put(r4, r3)     // Catch: java.lang.Throwable -> La1
            goto L72
        La1:
            r8 = move-exception
            goto Ld9
        La3:
            java.util.Set r10 = r10.keySet()     // Catch: java.lang.Throwable -> La1
            int r1 = r10.size()     // Catch: java.lang.Throwable -> La1
            int r9 = r9.size()     // Catch: java.lang.Throwable -> La1
            if (r1 == r9) goto Lb2
            goto Ld0
        Lb2:
            r9 = r10
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Throwable -> La1
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> La1
        Lb9:
            boolean r1 = r9.hasNext()     // Catch: java.lang.Throwable -> La1
            if (r1 == 0) goto Lc9
            java.lang.Object r1 = r9.next()     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> La1
            r0.remove(r1)     // Catch: java.lang.Throwable -> La1
            goto Lb9
        Lc9:
            r8.i()     // Catch: java.lang.Throwable -> La1
            int r2 = r10.size()     // Catch: java.lang.Throwable -> La1
        Ld0:
            java.lang.Integer r8 = new java.lang.Integer     // Catch: java.lang.Throwable -> La1
            r8.<init>(r2)     // Catch: java.lang.Throwable -> La1
            r11.h(r5)
            return r8
        Ld9:
            r11.h(r5)
            throw r8
    }

    public final defpackage.gd5 f() {
            r0 = this;
            gd5 r0 = r0.a
            return r0
    }

    public final java.lang.Object g(long r6, defpackage.s41 r8) {
            r5 = this;
            boolean r0 = r8 instanceof defpackage.lv4
            if (r0 == 0) goto L13
            r0 = r8
            lv4 r0 = (defpackage.lv4) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            lv4 r0 = new lv4
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.Y
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2c
            long r6 = r0.R
            hb4 r0 = r0.X
            defpackage.oi2.Y(r8)
            goto L45
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r4
        L32:
            defpackage.oi2.Y(r8)
            hb4 r8 = r5.b
            r0.X = r8
            r0.R = r6
            r0.d0 = r3
            java.lang.Object r0 = r8.e(r0)
            if (r0 != r1) goto L44
            return r1
        L44:
            r0 = r8
        L45:
            java.lang.String r6 = r5.j(r6)     // Catch: java.lang.Throwable -> L5b
            if (r6 != 0) goto L4d
            r5 = 0
            goto L53
        L4d:
            cv4 r7 = defpackage.cv4.PERMANENT_FAILURE     // Catch: java.lang.Throwable -> L5b
            boolean r5 = r5.k(r6, r7)     // Catch: java.lang.Throwable -> L5b
        L53:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L5b
            r0.h(r4)
            return r5
        L5b:
            r5 = move-exception
            r0.h(r4)
            throw r5
    }

    public final java.lang.Object h(long r6, defpackage.s41 r8) {
            r5 = this;
            boolean r0 = r8 instanceof defpackage.mv4
            if (r0 == 0) goto L13
            r0 = r8
            mv4 r0 = (defpackage.mv4) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            mv4 r0 = new mv4
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.Y
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2c
            long r6 = r0.R
            hb4 r0 = r0.X
            defpackage.oi2.Y(r8)
            goto L45
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r4
        L32:
            defpackage.oi2.Y(r8)
            hb4 r8 = r5.b
            r0.X = r8
            r0.R = r6
            r0.d0 = r3
            java.lang.Object r0 = r8.e(r0)
            if (r0 != r1) goto L44
            return r1
        L44:
            r0 = r8
        L45:
            java.lang.String r6 = r5.j(r6)     // Catch: java.lang.Throwable -> L5b
            if (r6 != 0) goto L4d
            r5 = 0
            goto L53
        L4d:
            cv4 r7 = defpackage.cv4.RETRYABLE     // Catch: java.lang.Throwable -> L5b
            boolean r5 = r5.k(r6, r7)     // Catch: java.lang.Throwable -> L5b
        L53:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L5b
            r0.h(r4)
            return r5
        L5b:
            r5 = move-exception
            r0.h(r4)
            throw r5
    }

    public final void i() {
            r13 = this;
            java.util.LinkedHashMap r0 = r13.c
            java.util.Collection r0 = r0.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            dv4 r1 = new dv4
            r2 = 0
            r1.<init>(r2)
            dv4 r3 = new dv4
            r4 = 1
            r3.<init>(r4)
            dv4 r5 = new dv4
            r6 = 2
            r5.<init>(r6)
            r7 = 3
            qn2[] r7 = new defpackage.qn2[r7]
            r7[r2] = r1
            r7[r4] = r3
            r7[r6] = r5
            su0 r1 = new su0
            r1.<init>(r7, r2)
            java.util.List r0 = defpackage.gt0.d1(r0, r1)
            bv4 r1 = new bv4
            java.util.Iterator r3 = r0.iterator()
            r9 = r2
            r10 = r9
            r11 = r10
            r12 = r11
        L39:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L70
            java.lang.Object r2 = r3.next()
            av4 r2 = (defpackage.av4) r2
            zu4 r5 = r2.a
            boolean r7 = r5 instanceof defpackage.xu4
            if (r7 == 0) goto L4e
            int r9 = r9 + 1
            goto L54
        L4e:
            boolean r5 = r5 instanceof defpackage.yu4
            if (r5 == 0) goto L6c
            int r10 = r10 + 1
        L54:
            cv4 r2 = r2.b
            int[] r5 = defpackage.kc5.a
            int r2 = r2.ordinal()
            r2 = r5[r2]
            if (r2 == r4) goto L69
            if (r2 != r6) goto L65
            int r12 = r12 + 1
            goto L39
        L65:
            defpackage.i.d()
            return
        L69:
            int r11 = r11 + 1
            goto L39
        L6c:
            defpackage.i.d()
            return
        L70:
            lc5 r7 = new lc5
            int r8 = r0.size()
            r7.<init>(r8, r9, r10, r11, r12)
            boolean r2 = r13.h
            gd5 r3 = r13.a
            r1.<init>(r3, r0, r7, r2)
            tp6 r13 = r13.g
            r13.getClass()
            r0 = 0
            r13.m(r0, r1)
            return
    }

    public final java.lang.String j(long r5) {
            r4 = this;
            java.util.LinkedHashMap r4 = r4.c
            java.util.Set r4 = r4.entrySet()
            r4.getClass()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        Lf:
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r4.next()
            r2 = r0
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            av4 r2 = (defpackage.av4) r2
            zu4 r2 = r2.a
            long r2 = r2.e()
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto Lf
            goto L2f
        L2e:
            r0 = r1
        L2f:
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r0 == 0) goto L3a
            java.lang.Object r4 = r0.getKey()
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L3a:
            return r1
    }

    public final boolean k(java.lang.String r6, defpackage.cv4 r7) {
            r5 = this;
            java.util.LinkedHashMap r0 = r5.c
            java.lang.Object r1 = r0.get(r6)
            av4 r1 = (defpackage.av4) r1
            if (r1 != 0) goto Lb
            goto L19
        Lb:
            cv4 r2 = r1.b
            r3 = 1
            if (r2 != r7) goto L11
            return r3
        L11:
            cv4 r4 = defpackage.cv4.PERMANENT_FAILURE
            if (r2 != r4) goto L1b
            cv4 r2 = defpackage.cv4.RETRYABLE
            if (r7 != r2) goto L1b
        L19:
            r5 = 0
            return r5
        L1b:
            av4 r7 = defpackage.av4.a(r1, r7)
            r0.put(r6, r7)
            r5.i()
            return r3
    }
}
