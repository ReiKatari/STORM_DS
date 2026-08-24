package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbtl implements com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy {
    private final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk zba;

    private zbtl(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r2) {
            r1 = this;
            r1.<init>()
            byte[] r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbb
            r1.zba = r2
            r2.zba = r1
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtl zba(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r1) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtl r0 = r1.zba
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtl r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtl
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbA(int r1, long r2) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r0 = r0.zba
            r0.zbj(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbB(int r4, java.util.List r5, boolean r6) {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L48
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva) r5
            if (r6 == 0) goto L36
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            r6.zbu(r4, r1)
            r4 = r2
            r6 = r4
        L11:
            int r0 = r5.size()
            if (r4 >= r0) goto L1f
            r5.zbe(r4)
            int r6 = r6 + 8
            int r4 = r4 + 1
            goto L11
        L1f:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            r4.zbw(r6)
        L24:
            int r4 = r5.size()
            if (r2 >= r4) goto L9a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            long r0 = r5.zbe(r2)
            r4.zbk(r0)
            int r2 = r2 + 1
            goto L24
        L36:
            int r6 = r5.size()
            if (r2 >= r6) goto L9a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            long r0 = r5.zbe(r2)
            r6.zbj(r4, r0)
            int r2 = r2 + 1
            goto L36
        L48:
            if (r6 == 0) goto L82
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            r6.zbu(r4, r1)
            r4 = r2
            r6 = r4
        L51:
            int r0 = r5.size()
            if (r4 >= r0) goto L65
            java.lang.Object r0 = r5.get(r4)
            java.lang.Long r0 = (java.lang.Long) r0
            r0.getClass()
            int r6 = r6 + 8
            int r4 = r4 + 1
            goto L51
        L65:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            r4.zbw(r6)
        L6a:
            int r4 = r5.size()
            if (r2 >= r4) goto L9a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            java.lang.Object r6 = r5.get(r2)
            java.lang.Long r6 = (java.lang.Long) r6
            long r0 = r6.longValue()
            r4.zbk(r0)
            int r2 = r2 + 1
            goto L6a
        L82:
            int r6 = r5.size()
            if (r2 >= r6) goto L9a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            java.lang.Object r0 = r5.get(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r6.zbj(r4, r0)
            int r2 = r2 + 1
            goto L82
        L9a:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbC(int r2, int r3) {
            r1 = this;
            int r0 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r1 = r1.zba
            r1.zbv(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbD(int r4, java.util.List r5, boolean r6) {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L5b
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug) r5
            if (r6 == 0) goto L44
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            r6.zbu(r4, r1)
            r4 = r2
            r6 = r4
        L11:
            int r0 = r5.size()
            if (r4 >= r0) goto L28
            int r0 = r5.zbe(r4)
            int r1 = r0 + r0
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r0)
            int r6 = r6 + r0
            int r4 = r4 + 1
            goto L11
        L28:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            r4.zbw(r6)
        L2d:
            int r4 = r5.size()
            if (r2 >= r4) goto Lc0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            int r6 = r5.zbe(r2)
            int r0 = r6 + r6
            int r6 = r6 >> 31
            r6 = r6 ^ r0
            r4.zbw(r6)
            int r2 = r2 + 1
            goto L2d
        L44:
            int r6 = r5.size()
            if (r2 >= r6) goto Lc0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            int r0 = r5.zbe(r2)
            int r1 = r0 + r0
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            r6.zbv(r4, r0)
            int r2 = r2 + 1
            goto L44
        L5b:
            if (r6 == 0) goto La3
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            r6.zbu(r4, r1)
            r4 = r2
            r6 = r4
        L64:
            int r0 = r5.size()
            if (r4 >= r0) goto L81
            java.lang.Object r0 = r5.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r1 = r0 + r0
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r0)
            int r6 = r6 + r0
            int r4 = r4 + 1
            goto L64
        L81:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            r4.zbw(r6)
        L86:
            int r4 = r5.size()
            if (r2 >= r4) goto Lc0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            java.lang.Object r6 = r5.get(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r0 = r6 + r6
            int r6 = r6 >> 31
            r6 = r6 ^ r0
            r4.zbw(r6)
            int r2 = r2 + 1
            goto L86
        La3:
            int r6 = r5.size()
            if (r2 >= r6) goto Lc0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            java.lang.Object r0 = r5.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r1 = r0 + r0
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            r6.zbv(r4, r0)
            int r2 = r2 + 1
            goto La3
        Lc0:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbE(int r4, long r5) {
            r3 = this;
            long r0 = r5 + r5
            r2 = 63
            long r5 = r5 >> r2
            long r5 = r5 ^ r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r3 = r3.zba
            r3.zbx(r4, r5)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbF(int r7, java.util.List r8, boolean r9) {
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva
            r1 = 2
            r2 = 63
            r3 = 0
            if (r0 == 0) goto L5a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva r8 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva) r8
            if (r9 == 0) goto L44
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r9 = r6.zba
            r9.zbu(r7, r1)
            r7 = r3
            r9 = r7
        L13:
            int r0 = r8.size()
            if (r7 >= r0) goto L29
            long r0 = r8.zbe(r7)
            long r4 = r0 + r0
            long r0 = r0 >> r2
            long r0 = r0 ^ r4
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r0)
            int r9 = r9 + r0
            int r7 = r7 + 1
            goto L13
        L29:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r7 = r6.zba
            r7.zbw(r9)
        L2e:
            int r7 = r8.size()
            if (r3 >= r7) goto Lbc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r7 = r6.zba
            long r0 = r8.zbe(r3)
            long r4 = r0 + r0
            long r0 = r0 >> r2
            long r0 = r0 ^ r4
            r7.zby(r0)
            int r3 = r3 + 1
            goto L2e
        L44:
            int r9 = r8.size()
            if (r3 >= r9) goto Lbc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r9 = r6.zba
            long r0 = r8.zbe(r3)
            long r4 = r0 + r0
            long r0 = r0 >> r2
            long r0 = r0 ^ r4
            r9.zbx(r7, r0)
            int r3 = r3 + 1
            goto L44
        L5a:
            if (r9 == 0) goto La0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r9 = r6.zba
            r9.zbu(r7, r1)
            r7 = r3
            r9 = r7
        L63:
            int r0 = r8.size()
            if (r7 >= r0) goto L7f
            java.lang.Object r0 = r8.get(r7)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r4 = r0 + r0
            long r0 = r0 >> r2
            long r0 = r0 ^ r4
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r0)
            int r9 = r9 + r0
            int r7 = r7 + 1
            goto L63
        L7f:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r7 = r6.zba
            r7.zbw(r9)
        L84:
            int r7 = r8.size()
            if (r3 >= r7) goto Lbc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r7 = r6.zba
            java.lang.Object r9 = r8.get(r3)
            java.lang.Long r9 = (java.lang.Long) r9
            long r0 = r9.longValue()
            long r4 = r0 + r0
            long r0 = r0 >> r2
            long r0 = r0 ^ r4
            r7.zby(r0)
            int r3 = r3 + 1
            goto L84
        La0:
            int r9 = r8.size()
            if (r3 >= r9) goto Lbc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r9 = r6.zba
            java.lang.Object r0 = r8.get(r3)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r4 = r0 + r0
            long r0 = r0 >> r2
            long r0 = r0 ^ r4
            r9.zbx(r7, r0)
            int r3 = r3 + 1
            goto La0
        Lbc:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    @java.lang.Deprecated
    public final void zbG(int r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r1 = r1.zba
            r0 = 3
            r1.zbu(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbH(int r1, java.lang.String r2) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r0 = r0.zba
            r0.zbs(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbI(int r6, java.util.List r7) {
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbux
            r1 = 0
            if (r0 == 0) goto L26
            r0 = r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbux r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbux) r0
        L8:
            int r2 = r7.size()
            if (r1 >= r2) goto L3a
            java.lang.Object r2 = r0.zba()
            boolean r3 = r2 instanceof java.lang.String
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r5.zba
            if (r3 == 0) goto L1e
            java.lang.String r2 = (java.lang.String) r2
            r4.zbs(r6, r2)
            goto L23
        L1e:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc) r2
            r4.zbf(r6, r2)
        L23:
            int r1 = r1 + 1
            goto L8
        L26:
            int r0 = r7.size()
            if (r1 >= r0) goto L3a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r0 = r5.zba
            java.lang.Object r2 = r7.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r0.zbs(r6, r2)
            int r1 = r1 + 1
            goto L26
        L3a:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbJ(int r1, int r2) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r0 = r0.zba
            r0.zbv(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbK(int r4, java.util.List r5, boolean r6) {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L4c
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug) r5
            if (r6 == 0) goto L3a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            r6.zbu(r4, r1)
            r4 = r2
            r6 = r4
        L11:
            int r0 = r5.size()
            if (r4 >= r0) goto L23
            int r0 = r5.zbe(r4)
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r0)
            int r6 = r6 + r0
            int r4 = r4 + 1
            goto L11
        L23:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            r4.zbw(r6)
        L28:
            int r4 = r5.size()
            if (r2 >= r4) goto La2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            int r6 = r5.zbe(r2)
            r4.zbw(r6)
            int r2 = r2 + 1
            goto L28
        L3a:
            int r6 = r5.size()
            if (r2 >= r6) goto La2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            int r0 = r5.zbe(r2)
            r6.zbv(r4, r0)
            int r2 = r2 + 1
            goto L3a
        L4c:
            if (r6 == 0) goto L8a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            r6.zbu(r4, r1)
            r4 = r2
            r6 = r4
        L55:
            int r0 = r5.size()
            if (r4 >= r0) goto L6d
            java.lang.Object r0 = r5.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r0)
            int r6 = r6 + r0
            int r4 = r4 + 1
            goto L55
        L6d:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            r4.zbw(r6)
        L72:
            int r4 = r5.size()
            if (r2 >= r4) goto La2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            java.lang.Object r6 = r5.get(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.zbw(r6)
            int r2 = r2 + 1
            goto L72
        L8a:
            int r6 = r5.size()
            if (r2 >= r6) goto La2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            java.lang.Object r0 = r5.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r6.zbv(r4, r0)
            int r2 = r2 + 1
            goto L8a
        La2:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbL(int r1, long r2) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r0 = r0.zba
            r0.zbx(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbM(int r4, java.util.List r5, boolean r6) {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L4c
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva) r5
            if (r6 == 0) goto L3a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            r6.zbu(r4, r1)
            r4 = r2
            r6 = r4
        L11:
            int r0 = r5.size()
            if (r4 >= r0) goto L23
            long r0 = r5.zbe(r4)
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r0)
            int r6 = r6 + r0
            int r4 = r4 + 1
            goto L11
        L23:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            r4.zbw(r6)
        L28:
            int r4 = r5.size()
            if (r2 >= r4) goto La2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            long r0 = r5.zbe(r2)
            r4.zby(r0)
            int r2 = r2 + 1
            goto L28
        L3a:
            int r6 = r5.size()
            if (r2 >= r6) goto La2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            long r0 = r5.zbe(r2)
            r6.zbx(r4, r0)
            int r2 = r2 + 1
            goto L3a
        L4c:
            if (r6 == 0) goto L8a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            r6.zbu(r4, r1)
            r4 = r2
            r6 = r4
        L55:
            int r0 = r5.size()
            if (r4 >= r0) goto L6d
            java.lang.Object r0 = r5.get(r4)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r0)
            int r6 = r6 + r0
            int r4 = r4 + 1
            goto L55
        L6d:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            r4.zbw(r6)
        L72:
            int r4 = r5.size()
            if (r2 >= r4) goto La2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            java.lang.Object r6 = r5.get(r2)
            java.lang.Long r6 = (java.lang.Long) r6
            long r0 = r6.longValue()
            r4.zby(r0)
            int r2 = r2 + 1
            goto L72
        L8a:
            int r6 = r5.size()
            if (r2 >= r6) goto La2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            java.lang.Object r0 = r5.get(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r6.zbx(r4, r0)
            int r2 = r2 + 1
            goto L8a
        La2:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbb(int r1, boolean r2) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r0 = r0.zba
            r0.zbd(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbc(int r4, java.util.List r5, boolean r6) {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbss
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L48
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbss r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbss) r5
            if (r6 == 0) goto L36
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            r6.zbu(r4, r1)
            r4 = r2
            r6 = r4
        L11:
            int r0 = r5.size()
            if (r4 >= r0) goto L1f
            r5.zbf(r4)
            int r6 = r6 + 1
            int r4 = r4 + 1
            goto L11
        L1f:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            r4.zbw(r6)
        L24:
            int r4 = r5.size()
            if (r2 >= r4) goto L9a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            boolean r6 = r5.zbf(r2)
            r4.zbb(r6)
            int r2 = r2 + 1
            goto L24
        L36:
            int r6 = r5.size()
            if (r2 >= r6) goto L9a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            boolean r0 = r5.zbf(r2)
            r6.zbd(r4, r0)
            int r2 = r2 + 1
            goto L36
        L48:
            if (r6 == 0) goto L82
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            r6.zbu(r4, r1)
            r4 = r2
            r6 = r4
        L51:
            int r0 = r5.size()
            if (r4 >= r0) goto L65
            java.lang.Object r0 = r5.get(r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.getClass()
            int r6 = r6 + 1
            int r4 = r4 + 1
            goto L51
        L65:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            r4.zbw(r6)
        L6a:
            int r4 = r5.size()
            if (r2 >= r4) goto L9a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            java.lang.Object r6 = r5.get(r2)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r4.zbb(r6)
            int r2 = r2 + 1
            goto L6a
        L82:
            int r6 = r5.size()
            if (r2 >= r6) goto L9a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            java.lang.Object r0 = r5.get(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r6.zbd(r4, r0)
            int r2 = r2 + 1
            goto L82
        L9a:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbd(int r1, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r2) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r0 = r0.zba
            r0.zbf(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbe(int r4, java.util.List r5) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r5.size()
            if (r0 >= r1) goto L15
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r1 = r3.zba
            java.lang.Object r2 = r5.get(r0)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc) r2
            r1.zbf(r4, r2)
            int r0 = r0 + 1
            goto L1
        L15:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbf(int r1, double r2) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r0 = r0.zba
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            r0.zbj(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbg(int r4, java.util.List r5, boolean r6) {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtm
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L50
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtm r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtm) r5
            if (r6 == 0) goto L3a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            r6.zbu(r4, r1)
            r4 = r2
            r6 = r4
        L11:
            int r0 = r5.size()
            if (r4 >= r0) goto L1f
            r5.zbe(r4)
            int r6 = r6 + 8
            int r4 = r4 + 1
            goto L11
        L1f:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            r4.zbw(r6)
        L24:
            int r4 = r5.size()
            if (r2 >= r4) goto Laa
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            double r0 = r5.zbe(r2)
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            r4.zbk(r0)
            int r2 = r2 + 1
            goto L24
        L3a:
            int r6 = r5.size()
            if (r2 >= r6) goto Laa
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            double r0 = r5.zbe(r2)
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            r6.zbj(r4, r0)
            int r2 = r2 + 1
            goto L3a
        L50:
            if (r6 == 0) goto L8e
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            r6.zbu(r4, r1)
            r4 = r2
            r6 = r4
        L59:
            int r0 = r5.size()
            if (r4 >= r0) goto L6d
            java.lang.Object r0 = r5.get(r4)
            java.lang.Double r0 = (java.lang.Double) r0
            r0.getClass()
            int r6 = r6 + 8
            int r4 = r4 + 1
            goto L59
        L6d:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            r4.zbw(r6)
        L72:
            int r4 = r5.size()
            if (r2 >= r4) goto Laa
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            java.lang.Object r6 = r5.get(r2)
            java.lang.Double r6 = (java.lang.Double) r6
            double r0 = r6.doubleValue()
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            r4.zbk(r0)
            int r2 = r2 + 1
            goto L72
        L8e:
            int r6 = r5.size()
            if (r2 >= r6) goto Laa
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            java.lang.Object r0 = r5.get(r2)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            r6.zbj(r4, r0)
            int r2 = r2 + 1
            goto L8e
        Laa:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    @java.lang.Deprecated
    public final void zbh(int r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r1 = r1.zba
            r0 = 4
            r1.zbu(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbi(int r1, int r2) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r0 = r0.zba
            r0.zbl(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbj(int r4, java.util.List r5, boolean r6) {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug) r5
            if (r6 == 0) goto L3b
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            r6.zbu(r4, r1)
            r4 = r2
            r6 = r4
        L11:
            int r0 = r5.size()
            if (r4 >= r0) goto L24
            int r0 = r5.zbe(r4)
            long r0 = (long) r0
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r0)
            int r6 = r6 + r0
            int r4 = r4 + 1
            goto L11
        L24:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            r4.zbw(r6)
        L29:
            int r4 = r5.size()
            if (r2 >= r4) goto La4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            int r6 = r5.zbe(r2)
            r4.zbm(r6)
            int r2 = r2 + 1
            goto L29
        L3b:
            int r6 = r5.size()
            if (r2 >= r6) goto La4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            int r0 = r5.zbe(r2)
            r6.zbl(r4, r0)
            int r2 = r2 + 1
            goto L3b
        L4d:
            if (r6 == 0) goto L8c
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            r6.zbu(r4, r1)
            r4 = r2
            r6 = r4
        L56:
            int r0 = r5.size()
            if (r4 >= r0) goto L6f
            java.lang.Object r0 = r5.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r0)
            int r6 = r6 + r0
            int r4 = r4 + 1
            goto L56
        L6f:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            r4.zbw(r6)
        L74:
            int r4 = r5.size()
            if (r2 >= r4) goto La4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            java.lang.Object r6 = r5.get(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.zbm(r6)
            int r2 = r2 + 1
            goto L74
        L8c:
            int r6 = r5.size()
            if (r2 >= r6) goto La4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            java.lang.Object r0 = r5.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r6.zbl(r4, r0)
            int r2 = r2 + 1
            goto L8c
        La4:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbk(int r1, int r2) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r0 = r0.zba
            r0.zbh(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbl(int r4, java.util.List r5, boolean r6) {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L48
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug) r5
            if (r6 == 0) goto L36
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            r6.zbu(r4, r1)
            r4 = r2
            r6 = r4
        L11:
            int r0 = r5.size()
            if (r4 >= r0) goto L1f
            r5.zbe(r4)
            int r6 = r6 + 4
            int r4 = r4 + 1
            goto L11
        L1f:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            r4.zbw(r6)
        L24:
            int r4 = r5.size()
            if (r2 >= r4) goto L9a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            int r6 = r5.zbe(r2)
            r4.zbi(r6)
            int r2 = r2 + 1
            goto L24
        L36:
            int r6 = r5.size()
            if (r2 >= r6) goto L9a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            int r0 = r5.zbe(r2)
            r6.zbh(r4, r0)
            int r2 = r2 + 1
            goto L36
        L48:
            if (r6 == 0) goto L82
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            r6.zbu(r4, r1)
            r4 = r2
            r6 = r4
        L51:
            int r0 = r5.size()
            if (r4 >= r0) goto L65
            java.lang.Object r0 = r5.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r0.getClass()
            int r6 = r6 + 4
            int r4 = r4 + 1
            goto L51
        L65:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            r4.zbw(r6)
        L6a:
            int r4 = r5.size()
            if (r2 >= r4) goto L9a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            java.lang.Object r6 = r5.get(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.zbi(r6)
            int r2 = r2 + 1
            goto L6a
        L82:
            int r6 = r5.size()
            if (r2 >= r6) goto L9a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            java.lang.Object r0 = r5.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r6.zbh(r4, r0)
            int r2 = r2 + 1
            goto L82
        L9a:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbm(int r1, long r2) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r0 = r0.zba
            r0.zbj(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbn(int r4, java.util.List r5, boolean r6) {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L48
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva) r5
            if (r6 == 0) goto L36
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            r6.zbu(r4, r1)
            r4 = r2
            r6 = r4
        L11:
            int r0 = r5.size()
            if (r4 >= r0) goto L1f
            r5.zbe(r4)
            int r6 = r6 + 8
            int r4 = r4 + 1
            goto L11
        L1f:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            r4.zbw(r6)
        L24:
            int r4 = r5.size()
            if (r2 >= r4) goto L9a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            long r0 = r5.zbe(r2)
            r4.zbk(r0)
            int r2 = r2 + 1
            goto L24
        L36:
            int r6 = r5.size()
            if (r2 >= r6) goto L9a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            long r0 = r5.zbe(r2)
            r6.zbj(r4, r0)
            int r2 = r2 + 1
            goto L36
        L48:
            if (r6 == 0) goto L82
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            r6.zbu(r4, r1)
            r4 = r2
            r6 = r4
        L51:
            int r0 = r5.size()
            if (r4 >= r0) goto L65
            java.lang.Object r0 = r5.get(r4)
            java.lang.Long r0 = (java.lang.Long) r0
            r0.getClass()
            int r6 = r6 + 8
            int r4 = r4 + 1
            goto L51
        L65:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            r4.zbw(r6)
        L6a:
            int r4 = r5.size()
            if (r2 >= r4) goto L9a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            java.lang.Object r6 = r5.get(r2)
            java.lang.Long r6 = (java.lang.Long) r6
            long r0 = r6.longValue()
            r4.zbk(r0)
            int r2 = r2 + 1
            goto L6a
        L82:
            int r6 = r5.size()
            if (r2 >= r6) goto L9a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            java.lang.Object r0 = r5.get(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r6.zbj(r4, r0)
            int r2 = r2 + 1
            goto L82
        L9a:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbo(int r1, float r2) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r0 = r0.zba
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            r0.zbh(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbp(int r4, java.util.List r5, boolean r6) {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtw
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L50
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtw r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtw) r5
            if (r6 == 0) goto L3a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            r6.zbu(r4, r1)
            r4 = r2
            r6 = r4
        L11:
            int r0 = r5.size()
            if (r4 >= r0) goto L1f
            r5.zbe(r4)
            int r6 = r6 + 4
            int r4 = r4 + 1
            goto L11
        L1f:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            r4.zbw(r6)
        L24:
            int r4 = r5.size()
            if (r2 >= r4) goto Laa
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            float r6 = r5.zbe(r2)
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            r4.zbi(r6)
            int r2 = r2 + 1
            goto L24
        L3a:
            int r6 = r5.size()
            if (r2 >= r6) goto Laa
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            float r0 = r5.zbe(r2)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r6.zbh(r4, r0)
            int r2 = r2 + 1
            goto L3a
        L50:
            if (r6 == 0) goto L8e
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            r6.zbu(r4, r1)
            r4 = r2
            r6 = r4
        L59:
            int r0 = r5.size()
            if (r4 >= r0) goto L6d
            java.lang.Object r0 = r5.get(r4)
            java.lang.Float r0 = (java.lang.Float) r0
            r0.getClass()
            int r6 = r6 + 4
            int r4 = r4 + 1
            goto L59
        L6d:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            r4.zbw(r6)
        L72:
            int r4 = r5.size()
            if (r2 >= r4) goto Laa
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            java.lang.Object r6 = r5.get(r2)
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            r4.zbi(r6)
            int r2 = r2 + 1
            goto L72
        L8e:
            int r6 = r5.size()
            if (r2 >= r6) goto Laa
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            java.lang.Object r0 = r5.get(r2)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r6.zbh(r4, r0)
            int r2 = r2 + 1
            goto L8e
        Laa:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbq(int r2, java.lang.Object r3, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r4) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r3 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm) r3
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r1 = r1.zba
            r0 = 3
            r1.zbu(r2, r0)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtl r0 = r1.zba
            r4.zbi(r3, r0)
            r3 = 4
            r1.zbu(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbr(int r1, int r2) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r0 = r0.zba
            r0.zbl(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbs(int r4, java.util.List r5, boolean r6) {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug) r5
            if (r6 == 0) goto L3b
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            r6.zbu(r4, r1)
            r4 = r2
            r6 = r4
        L11:
            int r0 = r5.size()
            if (r4 >= r0) goto L24
            int r0 = r5.zbe(r4)
            long r0 = (long) r0
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r0)
            int r6 = r6 + r0
            int r4 = r4 + 1
            goto L11
        L24:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            r4.zbw(r6)
        L29:
            int r4 = r5.size()
            if (r2 >= r4) goto La4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            int r6 = r5.zbe(r2)
            r4.zbm(r6)
            int r2 = r2 + 1
            goto L29
        L3b:
            int r6 = r5.size()
            if (r2 >= r6) goto La4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            int r0 = r5.zbe(r2)
            r6.zbl(r4, r0)
            int r2 = r2 + 1
            goto L3b
        L4d:
            if (r6 == 0) goto L8c
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            r6.zbu(r4, r1)
            r4 = r2
            r6 = r4
        L56:
            int r0 = r5.size()
            if (r4 >= r0) goto L6f
            java.lang.Object r0 = r5.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r0)
            int r6 = r6 + r0
            int r4 = r4 + 1
            goto L56
        L6f:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            r4.zbw(r6)
        L74:
            int r4 = r5.size()
            if (r2 >= r4) goto La4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            java.lang.Object r6 = r5.get(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.zbm(r6)
            int r2 = r2 + 1
            goto L74
        L8c:
            int r6 = r5.size()
            if (r2 >= r6) goto La4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            java.lang.Object r0 = r5.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r6.zbl(r4, r0)
            int r2 = r2 + 1
            goto L8c
        La4:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbt(int r1, long r2) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r0 = r0.zba
            r0.zbx(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbu(int r4, java.util.List r5, boolean r6) {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L4c
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva) r5
            if (r6 == 0) goto L3a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            r6.zbu(r4, r1)
            r4 = r2
            r6 = r4
        L11:
            int r0 = r5.size()
            if (r4 >= r0) goto L23
            long r0 = r5.zbe(r4)
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r0)
            int r6 = r6 + r0
            int r4 = r4 + 1
            goto L11
        L23:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            r4.zbw(r6)
        L28:
            int r4 = r5.size()
            if (r2 >= r4) goto La2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            long r0 = r5.zbe(r2)
            r4.zby(r0)
            int r2 = r2 + 1
            goto L28
        L3a:
            int r6 = r5.size()
            if (r2 >= r6) goto La2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            long r0 = r5.zbe(r2)
            r6.zbx(r4, r0)
            int r2 = r2 + 1
            goto L3a
        L4c:
            if (r6 == 0) goto L8a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            r6.zbu(r4, r1)
            r4 = r2
            r6 = r4
        L55:
            int r0 = r5.size()
            if (r4 >= r0) goto L6d
            java.lang.Object r0 = r5.get(r4)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r0)
            int r6 = r6 + r0
            int r4 = r4 + 1
            goto L55
        L6d:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            r4.zbw(r6)
        L72:
            int r4 = r5.size()
            if (r2 >= r4) goto La2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            java.lang.Object r6 = r5.get(r2)
            java.lang.Long r6 = (java.lang.Long) r6
            long r0 = r6.longValue()
            r4.zby(r0)
            int r2 = r2 + 1
            goto L72
        L8a:
            int r6 = r5.size()
            if (r2 >= r6) goto La2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            java.lang.Object r0 = r5.get(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r6.zbx(r4, r0)
            int r2 = r2 + 1
            goto L8a
        La2:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbv(int r5, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbve r6, java.util.Map r7) {
            r4 = this;
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L8:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r1 = r4.zba
            r2 = 2
            r1.zbu(r5, r2)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r1 = r4.zba
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r3 = r0.getValue()
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvf.zbb(r6, r2, r3)
            r1.zbw(r2)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r1 = r4.zba
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvf.zbe(r1, r6, r2, r0)
            goto L8
        L39:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbw(int r1, java.lang.Object r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r3) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm) r2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r0 = r0.zba
            r0.zbo(r1, r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbx(int r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r3 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r1 = r1.zba
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r3 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc) r3
            r1.zbr(r2, r3)
            return
        Lc:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r3 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm) r3
            r1.zbq(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zby(int r1, int r2) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r0 = r0.zba
            r0.zbh(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbz(int r4, java.util.List r5, boolean r6) {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L48
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug) r5
            if (r6 == 0) goto L36
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            r6.zbu(r4, r1)
            r4 = r2
            r6 = r4
        L11:
            int r0 = r5.size()
            if (r4 >= r0) goto L1f
            r5.zbe(r4)
            int r6 = r6 + 4
            int r4 = r4 + 1
            goto L11
        L1f:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            r4.zbw(r6)
        L24:
            int r4 = r5.size()
            if (r2 >= r4) goto L9a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            int r6 = r5.zbe(r2)
            r4.zbi(r6)
            int r2 = r2 + 1
            goto L24
        L36:
            int r6 = r5.size()
            if (r2 >= r6) goto L9a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            int r0 = r5.zbe(r2)
            r6.zbh(r4, r0)
            int r2 = r2 + 1
            goto L36
        L48:
            if (r6 == 0) goto L82
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            r6.zbu(r4, r1)
            r4 = r2
            r6 = r4
        L51:
            int r0 = r5.size()
            if (r4 >= r0) goto L65
            java.lang.Object r0 = r5.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r0.getClass()
            int r6 = r6 + 4
            int r4 = r4 + 1
            goto L51
        L65:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            r4.zbw(r6)
        L6a:
            int r4 = r5.size()
            if (r2 >= r4) goto L9a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r4 = r3.zba
            java.lang.Object r6 = r5.get(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.zbi(r6)
            int r2 = r2 + 1
            goto L6a
        L82:
            int r6 = r5.size()
            if (r2 >= r6) goto L9a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r6 = r3.zba
            java.lang.Object r0 = r5.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r6.zbh(r4, r0)
            int r2 = r2 + 1
            goto L82
        L9a:
            return
    }
}
