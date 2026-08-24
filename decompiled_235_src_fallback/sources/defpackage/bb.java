package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bb  reason: default package */
/* loaded from: classes.dex */
public final class bb {
    public final java.lang.Class a;
    public final java.util.Map b;
    public final java.lang.Class c;
    public final /* synthetic */ int d;

    public bb(java.lang.Class r6, defpackage.ya[] r7, int r8) {
            r5 = this;
            r5.d = r8
            r5.<init>()
            r5.a = r6
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            int r8 = r7.length
            r0 = 0
            r1 = r0
        Lf:
            java.lang.Class<xr6> r2 = defpackage.xr6.class
            if (r1 >= r8) goto L2f
            r3 = r7[r1]
            r3.getClass()
            boolean r4 = r6.containsKey(r2)
            if (r4 != 0) goto L24
            r6.put(r2, r3)
            int r1 = r1 + 1
            goto Lf
        L24:
            java.lang.String r5 = "KeyTypeManager constructed with duplicate factories for primitive "
            java.lang.String r6 = r2.getCanonicalName()
            defpackage.e41.A(r6, r5)
            r5 = 0
            throw r5
        L2f:
            int r8 = r7.length
            if (r8 <= 0) goto L3a
            r7 = r7[r0]
            r7.getClass()
            r5.c = r2
            goto L3e
        L3a:
            java.lang.Class<java.lang.Void> r7 = java.lang.Void.class
            r5.c = r7
        L3e:
            java.util.Map r6 = java.util.Collections.unmodifiableMap(r6)
            r5.b = r6
            return
    }

    public static void c(defpackage.db r4) {
            int r0 = r4.o()
            defpackage.kk7.a(r0)
            sw2 r0 = r4.p()
            sw2 r1 = defpackage.sw2.UNKNOWN_HASH
            if (r0 == r1) goto L90
            by2 r0 = r4.q()
            sw2 r0 = r0.n()
            if (r0 == r1) goto L8a
            by2 r0 = r4.q()
            int r1 = r0.o()
            r2 = 10
            if (r1 < r2) goto L84
            int[] r1 = defpackage.ab.a
            sw2 r2 = r0.n()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            java.lang.String r3 = "tag size too big"
            if (r1 == r2) goto L5c
            r2 = 2
            if (r1 == r2) goto L4f
            r2 = 3
            if (r1 != r2) goto L49
            int r0 = r0.o()
            r1 = 64
            if (r0 > r1) goto L45
            goto L64
        L45:
            defpackage.e41.v(r3)
            return
        L49:
            java.lang.String r4 = "unknown hash type"
            defpackage.e41.v(r4)
            return
        L4f:
            int r0 = r0.o()
            r1 = 32
            if (r0 > r1) goto L58
            goto L64
        L58:
            defpackage.e41.v(r3)
            return
        L5c:
            int r0 = r0.o()
            r1 = 20
            if (r0 > r1) goto L80
        L64:
            int r0 = r4.m()
            int r1 = r4.o()
            by2 r4 = r4.q()
            int r4 = r4.o()
            int r4 = r4 + r1
            int r4 = r4 + 9
            if (r0 < r4) goto L7a
            return
        L7a:
            java.lang.String r4 = "ciphertext_segment_size must be at least (derived_key_size + tag_size + NONCE_PREFIX_IN_BYTES + 2)"
            defpackage.e41.v(r4)
            return
        L80:
            defpackage.e41.v(r3)
            return
        L84:
            java.lang.String r4 = "tag size too small"
            defpackage.e41.v(r4)
            return
        L8a:
            java.lang.String r4 = "unknown HMAC hash type"
            defpackage.e41.v(r4)
            return
        L90:
            java.lang.String r4 = "unknown HKDF hash type"
            defpackage.e41.v(r4)
            return
    }

    public static void d(defpackage.pb r2) {
            int r0 = r2.r()
            defpackage.kk7.a(r0)
            sw2 r0 = r2.s()
            sw2 r1 = defpackage.sw2.UNKNOWN_HASH
            if (r0 == r1) goto L22
            int r0 = r2.p()
            int r2 = r2.r()
            int r2 = r2 + 25
            if (r0 < r2) goto L1c
            return
        L1c:
            java.lang.String r2 = "ciphertext_segment_size must be at least (derived_key_size + NONCE_PREFIX_IN_BYTES + TAG_SIZE_IN_BYTES + 2)"
            defpackage.e41.v(r2)
            return
        L22:
            java.lang.String r2 = "unknown HKDF hash type"
            defpackage.e41.v(r2)
            return
    }

    public final java.lang.String a() {
            r0 = this;
            int r0 = r0.d
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey"
            return r0
        L8:
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey"
            return r0
    }

    public final void b(defpackage.c1 r4) {
            r3 = this;
            int r3 = r3.d
            java.lang.String r0 = "key has version %d; only keys with version in range [0..%d] are supported"
            r1 = 0
            switch(r3) {
                case 0: goto L32;
                default: goto L8;
            }
        L8:
            jb r4 = (defpackage.jb) r4
            int r3 = r4.r()
            int r2 = defpackage.kk7.a
            if (r3 < 0) goto L1c
            if (r3 > 0) goto L1c
            pb r3 = r4.q()
            d(r3)
            return
        L1c:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r1}
            java.lang.String r3 = java.lang.String.format(r0, r3)
            r4.<init>(r3)
            throw r4
        L32:
            ua r4 = (defpackage.ua) r4
            int r3 = r4.r()
            int r2 = defpackage.kk7.a
            if (r3 < 0) goto L70
            if (r3 > 0) goto L70
            ea0 r3 = r4.p()
            int r3 = r3.size()
            r0 = 16
            if (r3 < r0) goto L6a
            ea0 r3 = r4.p()
            int r3 = r3.size()
            db r0 = r4.q()
            int r0 = r0.o()
            if (r3 < r0) goto L64
            db r3 = r4.q()
            c(r3)
            goto L6f
        L64:
            java.lang.String r3 = "key_value must have at least as many bits as derived keys"
            defpackage.e41.v(r3)
            goto L6f
        L6a:
            java.lang.String r3 = "key_value must have at least 16 bytes"
            defpackage.e41.v(r3)
        L6f:
            return
        L70:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r1}
            java.lang.String r3 = java.lang.String.format(r0, r3)
            r4.<init>(r3)
            throw r4
    }
}
