package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zbuf<MessageType extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz<MessageType, BuilderType>> extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsj<MessageType, BuilderType> {
    private static final java.util.Map zbb = null;
    protected com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm zbc;
    private int zbd;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf.zbb = r0
            return
    }

    public zbuf() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.zbd = r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm.zbc()
            r1.zbc = r0
            return
    }

    public static java.lang.Object zbA(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r1, java.lang.String r2, java.lang.Object[] r3) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvw r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvw
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static void zbD(java.lang.Class r1, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r2) {
            r2.zbC()
            java.util.Map r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf.zbb
            r0.put(r1, r2)
            return
    }

    public static final boolean zbF(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r4, boolean r5) {
            r0 = 1
            r1 = 0
            java.lang.Object r2 = r4.zbb(r0, r1, r1)
            java.lang.Byte r2 = (java.lang.Byte) r2
            byte r2 = r2.byteValue()
            if (r2 != r0) goto Lf
            return r0
        Lf:
            if (r2 != 0) goto L13
            r4 = 0
            return r4
        L13:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zba()
            java.lang.Class r3 = r4.getClass()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r2 = r2.zbb(r3)
            boolean r2 = r2.zbk(r4)
            if (r5 == 0) goto L2e
            if (r0 == r2) goto L29
            r5 = r1
            goto L2a
        L29:
            r5 = r4
        L2a:
            r0 = 2
            r4.zbb(r0, r5, r1)
        L2e:
            return r2
    }

    private final int zbc(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zba()
            java.lang.Class r0 = r1.getClass()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r2 = r2.zbb(r0)
            int r1 = r2.zba(r1)
            return r1
    }

    private static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf zbe(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r10) {
            if (r9 != 0) goto L3
            return r6
        L3:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r1 = r6.zbt()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zba()     // Catch: java.lang.IndexOutOfBoundsException -> L22 java.io.IOException -> L29 com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwk -> L40 com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq -> L47
            java.lang.Class r8 = r1.getClass()     // Catch: java.lang.IndexOutOfBoundsException -> L22 java.io.IOException -> L29 com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwk -> L40 com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq -> L47
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r0 = r6.zbb(r8)     // Catch: java.lang.IndexOutOfBoundsException -> L22 java.io.IOException -> L29 com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwk -> L40 com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq -> L47
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq r5 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq     // Catch: java.lang.IndexOutOfBoundsException -> L22 java.io.IOException -> L29 com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwk -> L40 com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq -> L47
            r5.<init>(r10)     // Catch: java.lang.IndexOutOfBoundsException -> L22 java.io.IOException -> L29 com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwk -> L40 com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq -> L47
            r3 = 0
            r2 = r7
            r4 = r9
            r0.zbh(r1, r2, r3, r4, r5)     // Catch: java.lang.IndexOutOfBoundsException -> L22 java.io.IOException -> L29 com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwk -> L40 com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq -> L47
            r0.zbf(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L22 java.io.IOException -> L29 com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwk -> L40 com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq -> L47
            return r1
        L22:
            java.lang.String r6 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            defpackage.fa6.j(r6)
            r6 = 0
            return r6
        L29:
            r0 = move-exception
            r6 = r0
            java.lang.Throwable r7 = r6.getCause()
            boolean r7 = r7 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq
            if (r7 == 0) goto L3a
            java.lang.Throwable r6 = r6.getCause()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq r6 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq) r6
            throw r6
        L3a:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq r7 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq
            r7.<init>(r6)
            throw r7
        L40:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq r6 = r6.zba()
            throw r6
        L47:
            r0 = move-exception
            r6 = r0
            throw r6
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbud zbr(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r6, java.lang.Object r7, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r8, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbui r9, int r10, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbww r11, java.lang.Class r12) {
            r9 = r8
            r8 = r7
            r7 = r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbud r6 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbud
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuc r10 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuc
            r4 = 0
            r5 = 0
            r1 = 0
            r2 = 32149011(0x1ea8e13, float:8.616189E-38)
            r0 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r11 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf zbs(java.lang.Class r4) {
            java.util.Map r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf.zbb
            java.lang.Object r1 = r0.get(r4)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r1
            if (r1 != 0) goto L26
            java.lang.String r1 = r4.getName()     // Catch: java.lang.ClassNotFoundException -> L1d
            java.lang.ClassLoader r2 = r4.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L1d
            r3 = 1
            java.lang.Class.forName(r1, r3, r2)     // Catch: java.lang.ClassNotFoundException -> L1d
            java.lang.Object r1 = r0.get(r4)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r1
            goto L26
        L1d:
            r4 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Class initialization cannot fail."
            r0.<init>(r1, r4)
            throw r0
        L26:
            if (r1 != 0) goto L40
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbe(r4)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r1
            r2 = 6
            r3 = 0
            java.lang.Object r1 = r1.zbb(r2, r3, r3)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r1
            if (r1 == 0) goto L3c
            r0.put(r4, r1)
            return r1
        L3c:
            defpackage.e41.m()
            return r3
        L40:
            return r1
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf zbu(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r2, byte[] r3, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r4) {
            r0 = 0
            int r1 = r3.length
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r2 = zbe(r2, r3, r0, r1, r4)
            if (r2 == 0) goto L1a
            r3 = 1
            boolean r3 = zbF(r2, r3)
            if (r3 == 0) goto L10
            goto L1a
        L10:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwk r3 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwk
            r3.<init>(r2)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq r2 = r3.zba()
            throw r2
        L1a:
            return r2
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuk zbv() {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtw r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtw.zbf()
            return r0
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbul zbw() {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug.zbf()
            return r0
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbum zbx() {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva.zbf()
            return r0
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun zby() {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvv r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvv.zbe()
            return r0
    }

    public static java.lang.Object zbz(java.lang.reflect.Method r1, java.lang.Object r2, java.lang.Object... r3) {
            r0 = 0
            java.lang.Object r1 = r1.invoke(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L6 java.lang.IllegalAccessException -> L1f
            return r1
        L6:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()
            boolean r2 = r1 instanceof java.lang.RuntimeException
            if (r2 != 0) goto L1c
            boolean r2 = r1 instanceof java.lang.Error
            if (r2 != 0) goto L19
            java.lang.String r2 = "Unexpected exception thrown by generated accessor method."
            defpackage.u34.p(r2, r1)
            return r0
        L19:
            java.lang.Error r1 = (java.lang.Error) r1
            throw r1
        L1c:
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1
            throw r1
        L1f:
            r1 = move-exception
            java.lang.String r2 = "Couldn't use Java reflection to implement protocol message reflection."
            defpackage.u34.p(r2, r1)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r3 = 1
            return r3
        L4:
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L13
            return r0
        L13:
            java.lang.Class r0 = r3.getClass()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zba()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r0 = r1.zbb(r0)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r4 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r4
            boolean r3 = r0.zbj(r3, r4)
            return r3
    }

    public final int hashCode() {
            r1 = this;
            boolean r0 = r1.zbG()
            if (r0 != 0) goto L11
            int r0 = r1.zba
            if (r0 != 0) goto L10
            int r0 = r1.zbn()
            r1.zba = r0
        L10:
            return r0
        L11:
            int r1 = r1.zbn()
            return r1
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            java.lang.String r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvo.zba(r1, r0)
            return r1
    }

    public final void zbB() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zba()
            java.lang.Class r1 = r2.getClass()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r0 = r0.zbb(r1)
            r0.zbf(r2)
            r2.zbC()
            return
    }

    public final void zbC() {
            r2 = this;
            int r0 = r2.zbd
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            r2.zbd = r0
            return
    }

    public final void zbE(int r2) {
            r1 = this;
            int r2 = r1.zbd
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 | r0
            r1.zbd = r2
            return
    }

    public final boolean zbG() {
            r1 = this;
            int r1 = r1.zbd
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r0
            if (r1 == 0) goto L9
            r1 = 1
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm
    public final /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvl zbJ() {
            r2 = this;
            r0 = 5
            r1 = 0
            java.lang.Object r2 = r2.zbb(r0, r1, r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz) r2
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm
    public final /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvl zbK() {
            r2 = this;
            r0 = 5
            r1 = 0
            java.lang.Object r0 = r2.zbb(r0, r1, r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz) r0
            r0.zbh(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm
    public final void zbL(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r3) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zba()
            java.lang.Class r1 = r2.getClass()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r0 = r0.zbb(r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtl r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtl.zba(r3)
            r0.zbi(r2, r3)
            return
    }

    public abstract java.lang.Object zbb(int r1, java.lang.Object r2, java.lang.Object r3);

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsj
    public final int zbj(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r4) {
            r3 = this;
            boolean r0 = r3.zbG()
            java.lang.String r1 = "serialized size must be non-negative, was "
            if (r0 == 0) goto L18
            int r3 = r4.zba(r3)
            if (r3 < 0) goto Lf
            return r3
        Lf:
            java.lang.String r3 = defpackage.lb1.g(r3, r1)
            defpackage.i.m(r3)
        L16:
            r3 = 0
            return r3
        L18:
            int r0 = r3.zbd
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r2
            if (r0 != r2) goto L37
            int r4 = r4.zba(r3)
            if (r4 < 0) goto L2f
            int r0 = r3.zbd
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            r0 = r0 | r4
            r3.zbd = r0
            return r4
        L2f:
            java.lang.String r3 = defpackage.lb1.g(r4, r1)
            defpackage.i.m(r3)
            goto L16
        L37:
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn
    public final /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm zbm() {
            r2 = this;
            r0 = 6
            r1 = 0
            java.lang.Object r2 = r2.zbb(r0, r1, r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r2
            return r2
    }

    public final int zbn() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zba()
            java.lang.Class r1 = r2.getClass()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r0 = r0.zbb(r1)
            int r2 = r0.zbb(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm
    public final int zbo() {
            r4 = this;
            boolean r0 = r4.zbG()
            java.lang.String r1 = "serialized size must be non-negative, was "
            r2 = 0
            if (r0 == 0) goto L19
            int r4 = r4.zbc(r2)
            if (r4 < 0) goto L10
            return r4
        L10:
            java.lang.String r4 = defpackage.lb1.g(r4, r1)
            defpackage.i.m(r4)
        L17:
            r4 = 0
            return r4
        L19:
            int r0 = r4.zbd
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r3
            if (r0 == r3) goto L22
            return r0
        L22:
            int r0 = r4.zbc(r2)
            if (r0 < 0) goto L31
            int r1 = r4.zbd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            r1 = r1 | r0
            r4.zbd = r1
            return r0
        L31:
            java.lang.String r4 = defpackage.lb1.g(r0, r1)
            defpackage.i.m(r4)
            goto L17
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn
    public final boolean zbp() {
            r1 = this;
            r0 = 1
            boolean r1 = zbF(r1, r0)
            return r1
    }

    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz zbq() {
            r2 = this;
            r0 = 5
            r1 = 0
            java.lang.Object r2 = r2.zbb(r0, r1, r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz) r2
            return r2
    }

    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf zbt() {
            r2 = this;
            r0 = 4
            r1 = 0
            java.lang.Object r2 = r2.zbb(r0, r1, r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r2
            return r2
    }
}
