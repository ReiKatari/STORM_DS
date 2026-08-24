package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kh  reason: default package */
/* loaded from: classes.dex */
public final class kh {
    public final android.content.Context a;
    public final defpackage.go3 b;

    public kh(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            xr3 r3 = defpackage.xr3.SYNCHRONIZED
            c5 r0 = new c5
            r1 = 7
            r0.<init>(r1)
            go3 r3 = defpackage.kj2.M(r3, r0)
            r2.b = r3
            return
    }

    public static final defpackage.yc1 a(defpackage.kh r17, java.io.File r18) {
            r0 = r17
            android.content.Context r1 = r0.a
            go3 r0 = r0.b
            java.lang.Object r0 = r0.getValue()
            r0.getClass()
            java.lang.String r0 = (java.lang.String) r0
            g42 r2 = defpackage.g42.AES256_GCM_HKDF_4KB
            defpackage.yr6.a()
            pa r3 = new pa
            r4 = 1
            r5 = 0
            r3.<init>(r4, r5)
            r6 = 0
            r3.B = r6
            r3.L = r6
            r3.R = r6
            r3.X = r6
            r3.Y = r6
            nh3 r2 = r2.getKeyTemplate()
            r3.Y = r2
            s35 r2 = new s35
            r7 = 12
            r2.<init>(r1, r7)
            r3.B = r2
            s35 r2 = new s35
            r7 = 13
            r2.<init>(r1, r7)
            r3.L = r2
            java.lang.String r1 = "android-keystore://"
            java.lang.String r0 = r1.concat(r0)
            java.lang.String r1 = "android-keystore://"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L3f1
            r3.R = r0
            monitor-enter(r3)
            java.lang.Object r0 = r3.R     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L5f
            os0 r0 = r3.q()     // Catch: java.lang.Throwable -> L5c
            r3.X = r0     // Catch: java.lang.Throwable -> L5c
            goto L5f
        L5c:
            r0 = move-exception
            goto L3ef
        L5f:
            s63 r0 = r3.p()     // Catch: java.lang.Throwable -> L5c
            r3.Z = r0     // Catch: java.lang.Throwable -> L5c
            vs0 r1 = new vs0     // Catch: java.lang.Throwable -> L5c
            r0 = 22
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r0 = r3.Z     // Catch: java.lang.Throwable -> L5c
            s63 r0 = (defpackage.s63) r0     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r3)
            monitor-enter(r1)
            s63 r0 = r0.o()     // Catch: java.lang.Throwable -> L3ec
            monitor-exit(r1)
            java.lang.Class<xr6> r1 = defpackage.xr6.class
            java.lang.String r2 = "No wrapper found for "
            java.lang.Class<xr6> r3 = defpackage.xr6.class
            java.util.concurrent.ConcurrentHashMap r7 = defpackage.ai5.e
            java.lang.Object r7 = r7.get(r1)
            ds6 r7 = (defpackage.ds6) r7
            if (r7 != 0) goto L89
            r7 = r6
            goto L8a
        L89:
            r7 = r3
        L8a:
            if (r7 == 0) goto L3de
            java.lang.Object r0 = r0.B
            ii3 r0 = (defpackage.ii3) r0
            int r8 = defpackage.bk7.a
            int r8 = r0.r()
            java.util.List r9 = r0.q()
            java.util.Iterator r9 = r9.iterator()
            r12 = r4
            r10 = r5
            r11 = r10
        La1:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L134
            java.lang.Object r13 = r9.next()
            hi3 r13 = (defpackage.hi3) r13
            hh3 r14 = r13.t()
            hh3 r15 = defpackage.hh3.ENABLED
            if (r14 == r15) goto Lb6
            goto La1
        Lb6:
            boolean r14 = r13.u()
            if (r14 == 0) goto L11c
            jp4 r14 = r13.s()
            jp4 r15 = defpackage.jp4.UNKNOWN_PREFIX
            if (r14 == r15) goto L104
            hh3 r14 = r13.t()
            hh3 r15 = defpackage.hh3.UNKNOWN_STATUS
            if (r14 == r15) goto Lec
            int r14 = r13.r()
            if (r14 != r8) goto Ldc
            if (r11 != 0) goto Ld6
            r11 = r4
            goto Ldc
        Ld6:
            java.lang.String r0 = "keyset contains multiple primary keys"
            defpackage.e41.v(r0)
            return r6
        Ldc:
            vg3 r13 = r13.q()
            ug3 r13 = r13.q()
            ug3 r14 = defpackage.ug3.ASYMMETRIC_PUBLIC
            if (r13 == r14) goto Le9
            r12 = r5
        Le9:
            int r10 = r10 + 1
            goto La1
        Lec:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "key %d has unknown status"
            int r2 = r13.r()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
        L104:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "key %d has unknown prefix"
            int r2 = r13.r()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
        L11c:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "key %d has no key data"
            int r2 = r13.r()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
        L134:
            if (r10 == 0) goto L3d6
            if (r11 != 0) goto L141
            if (r12 == 0) goto L13b
            goto L141
        L13b:
            java.lang.String r0 = "keyset doesn't contain a valid primary key"
            defpackage.e41.v(r0)
            return r6
        L141:
            m44 r8 = new m44
            r8.<init>(r7)
            java.lang.Object r9 = r8.R
            java.lang.Class r9 = (java.lang.Class) r9
            java.util.List r10 = r0.q()
            java.util.Iterator r10 = r10.iterator()
        L152:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L37f
            java.lang.Object r11 = r10.next()
            hi3 r11 = (defpackage.hi3) r11
            hh3 r12 = r11.t()
            hh3 r13 = defpackage.hh3.ENABLED
            if (r12 != r13) goto L377
            vg3 r12 = r11.q()
            java.lang.String r12 = r12.r()
            vg3 r14 = r11.q()
            ea0 r14 = r14.s()
            zh5 r12 = defpackage.ai5.b(r12)
            bb r15 = r12.a
            java.util.Map r15 = r15.b
            java.util.Set r15 = r15.keySet()
            r17 = r6
            bb r6 = r12.a
            boolean r15 = r15.contains(r7)
            if (r15 == 0) goto L319
            java.util.Map r12 = r6.b     // Catch: java.lang.IllegalArgumentException -> L310
            java.util.Set r12 = r12.keySet()     // Catch: java.lang.IllegalArgumentException -> L310
            boolean r12 = r12.contains(r7)     // Catch: java.lang.IllegalArgumentException -> L310
            if (r12 != 0) goto L1c5
            java.lang.Class<java.lang.Void> r12 = java.lang.Void.class
            boolean r12 = r12.equals(r7)     // Catch: java.lang.IllegalArgumentException -> L310
            if (r12 == 0) goto L1a1
            goto L1c5
        L1a1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L310
            java.lang.String r1 = r6.toString()     // Catch: java.lang.IllegalArgumentException -> L310
            java.lang.String r2 = r7.getName()     // Catch: java.lang.IllegalArgumentException -> L310
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L310
            java.lang.String r4 = "Given internalKeyMananger "
            r3.<init>(r4)     // Catch: java.lang.IllegalArgumentException -> L310
            r3.append(r1)     // Catch: java.lang.IllegalArgumentException -> L310
            java.lang.String r1 = " does not support primitive class "
            r3.append(r1)     // Catch: java.lang.IllegalArgumentException -> L310
            r3.append(r2)     // Catch: java.lang.IllegalArgumentException -> L310
            java.lang.String r1 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> L310
            r0.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L310
            throw r0     // Catch: java.lang.IllegalArgumentException -> L310
        L1c5:
            int r12 = r6.d     // Catch: defpackage.ub3 -> L2fd
            switch(r12) {
                case 0: goto L1d3;
                default: goto L1ca;
            }     // Catch: defpackage.ub3 -> L2fd
        L1ca:
            g82 r12 = defpackage.g82.a()     // Catch: defpackage.ub3 -> L2fd
            jb r12 = defpackage.jb.t(r14, r12)     // Catch: defpackage.ub3 -> L2fd
            goto L1db
        L1d3:
            g82 r12 = defpackage.g82.a()     // Catch: defpackage.ub3 -> L2fd
            ua r12 = defpackage.ua.t(r14, r12)     // Catch: defpackage.ub3 -> L2fd
        L1db:
            java.lang.Class<java.lang.Void> r14 = java.lang.Void.class
            boolean r14 = r14.equals(r7)     // Catch: defpackage.ub3 -> L2fd
            if (r14 != 0) goto L2f5
            r6.b(r12)     // Catch: defpackage.ub3 -> L2fd
            java.util.Map r14 = r6.b     // Catch: defpackage.ub3 -> L2fd
            java.lang.Object r14 = r14.get(r7)     // Catch: defpackage.ub3 -> L2fd
            ya r14 = (defpackage.ya) r14     // Catch: defpackage.ub3 -> L2fd
            if (r14 == 0) goto L2d8
            java.lang.Object r6 = r14.a(r12)     // Catch: defpackage.ub3 -> L2fd
            java.lang.Object r12 = r8.B
            java.util.concurrent.ConcurrentHashMap r12 = (java.util.concurrent.ConcurrentHashMap) r12
            hh3 r14 = r11.t()
            if (r14 != r13) goto L2d2
            y25 r14 = new y25
            int[] r15 = defpackage.u71.a
            jp4 r16 = r11.s()
            int r16 = r16.ordinal()
            r15 = r15[r16]
            r16 = 5
            if (r15 == r4) goto L238
            r5 = 2
            if (r15 == r5) goto L238
            r5 = 3
            if (r15 == r5) goto L223
            r5 = 4
            if (r15 != r5) goto L21d
            byte[] r5 = defpackage.n16.l
        L21b:
            r15 = 0
            goto L24d
        L21d:
            java.lang.String r0 = "unknown output prefix type"
            defpackage.e41.v(r0)
            return r17
        L223:
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r16)
            java.nio.ByteBuffer r5 = r5.put(r4)
            int r15 = r11.r()
            java.nio.ByteBuffer r5 = r5.putInt(r15)
            byte[] r5 = r5.array()
            goto L21b
        L238:
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r16)
            r15 = 0
            java.nio.ByteBuffer r5 = r5.put(r15)
            int r4 = r11.r()
            java.nio.ByteBuffer r4 = r5.putInt(r4)
            byte[] r5 = r4.array()
        L24d:
            hh3 r4 = r11.t()
            r11.s()
            r14.<init>(r6, r5, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r14)
            z25 r5 = new z25
            byte[] r6 = r14.b
            if (r6 != 0) goto L268
            r6 = r17
            goto L26d
        L268:
            int r15 = r6.length
            byte[] r6 = java.util.Arrays.copyOf(r6, r15)
        L26d:
            r5.<init>(r6)
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)
            java.lang.Object r4 = r12.put(r5, r4)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L28e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.addAll(r4)
            r6.add(r14)
            java.util.List r4 = java.util.Collections.unmodifiableList(r6)
            r12.put(r5, r4)
        L28e:
            int r4 = r11.r()
            int r5 = r0.r()
            if (r4 != r5) goto L379
            hh3 r4 = r14.c
            if (r4 != r13) goto L2cc
            byte[] r4 = r14.b
            if (r4 != 0) goto L2a3
            r4 = r17
            goto L2a8
        L2a3:
            int r5 = r4.length
            byte[] r4 = java.util.Arrays.copyOf(r4, r5)
        L2a8:
            java.lang.Object r5 = r8.B
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5
            z25 r6 = new z25
            r6.<init>(r4)
            java.lang.Object r4 = r5.get(r6)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L2ba
            goto L2bc
        L2ba:
            java.util.List r4 = java.util.Collections.EMPTY_LIST
        L2bc:
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L2c6
            r8.L = r14
            goto L379
        L2c6:
            java.lang.String r0 = "the primary entry cannot be set to an entry which is not held by this primitive set"
            defpackage.i.h(r0)
            return r17
        L2cc:
            java.lang.String r0 = "the primary entry has to be ENABLED"
            defpackage.i.h(r0)
            return r17
        L2d2:
            java.lang.String r0 = "only ENABLED key is allowed"
            defpackage.e41.v(r0)
            return r17
        L2d8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: defpackage.ub3 -> L2fd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: defpackage.ub3 -> L2fd
            java.lang.String r2 = "Requested primitive class "
            r1.<init>(r2)     // Catch: defpackage.ub3 -> L2fd
            java.lang.String r2 = r7.getCanonicalName()     // Catch: defpackage.ub3 -> L2fd
            r1.append(r2)     // Catch: defpackage.ub3 -> L2fd
            java.lang.String r2 = " not supported."
            r1.append(r2)     // Catch: defpackage.ub3 -> L2fd
            java.lang.String r1 = r1.toString()     // Catch: defpackage.ub3 -> L2fd
            r0.<init>(r1)     // Catch: defpackage.ub3 -> L2fd
            throw r0     // Catch: defpackage.ub3 -> L2fd
        L2f5:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: defpackage.ub3 -> L2fd
            java.lang.String r1 = "Cannot create a primitive for Void"
            r0.<init>(r1)     // Catch: defpackage.ub3 -> L2fd
            throw r0     // Catch: defpackage.ub3 -> L2fd
        L2fd:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.Class r2 = r6.a
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "Failures parsing proto of type "
            java.lang.String r2 = r3.concat(r2)
            r1.<init>(r2, r0)
            throw r1
        L310:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Primitive type not supported"
            r1.<init>(r2, r0)
            throw r1
        L319:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Primitive type "
            r1.<init>(r2)
            java.lang.String r2 = r7.getName()
            r1.append(r2)
            java.lang.String r2 = " not supported by key manager of type "
            r1.append(r2)
            java.lang.Class r2 = r6.getClass()
            r1.append(r2)
            java.lang.String r2 = ", supported primitives: "
            r1.append(r2)
            bb r2 = r12.a
            java.util.Map r2 = r2.b
            java.util.Set r2 = r2.keySet()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
            r4 = 1
        L34c:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L368
            java.lang.Object r5 = r2.next()
            java.lang.Class r5 = (java.lang.Class) r5
            if (r4 != 0) goto L35f
            java.lang.String r4 = ", "
            r3.append(r4)
        L35f:
            java.lang.String r4 = r5.getCanonicalName()
            r3.append(r4)
            r4 = 0
            goto L34c
        L368:
            java.lang.String r2 = r3.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L377:
            r17 = r6
        L379:
            r4 = 1
            r5 = 0
            r6 = r17
            goto L152
        L37f:
            r17 = r6
            java.util.concurrent.ConcurrentHashMap r0 = defpackage.ai5.e
            java.lang.Object r0 = r0.get(r1)
            ds6 r0 = (defpackage.ds6) r0
            if (r0 == 0) goto L3c8
            boolean r0 = r3.equals(r9)
            if (r0 == 0) goto L3ac
            bs6 r0 = new bs6
            r0.<init>()
            java.lang.Object r1 = r8.L
            y25 r1 = (defpackage.y25) r1
            if (r1 == 0) goto L3a6
            r0.a = r8
            yc1 r1 = new yc1
            r2 = r18
            r1.<init>(r2, r0)
            return r1
        L3a6:
            java.lang.String r0 = "Missing primary primitive."
            defpackage.e41.v(r0)
            return r17
        L3ac:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Wrong input primitive class, expected "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = ", got "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3c8:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = r9.getName()
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L3d6:
            r17 = r6
            java.lang.String r0 = "keyset must contain at least one ENABLED key"
            defpackage.e41.v(r0)
            return r17
        L3de:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = r1.getName()
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L3ec:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3ec
            throw r0
        L3ef:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5c
            throw r0
        L3f1:
            r17 = r6
            java.lang.String r0 = "key URI must start with android-keystore://"
            defpackage.i.h(r0)
            return r17
    }
}
