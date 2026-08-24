package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zbtc implements java.lang.Iterable, java.io.Serializable {
    public static final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc zbb = null;
    private int zba;

    static {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb
            byte[] r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbb
            r0.<init>(r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc.zbb = r0
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsm.zba
            return
    }

    public zbtc() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zba = r0
            return
    }

    public static int zbh(int r3, int r4, int r5) {
            r0 = r3 | r4
            int r1 = r4 - r3
            r0 = r0 | r1
            int r2 = r5 - r4
            r0 = r0 | r2
            if (r0 >= 0) goto L33
            if (r3 < 0) goto L27
            if (r4 >= r3) goto L1b
            java.lang.String r5 = "Beginning index larger than ending index: "
            java.lang.String r0 = ", "
            java.lang.String r3 = defpackage.lb1.j(r5, r3, r4, r0)
            defpackage.e41.q(r3)
        L19:
            r3 = 0
            return r3
        L1b:
            java.lang.String r3 = "End index: "
            java.lang.String r0 = " >= "
            java.lang.String r3 = defpackage.lb1.j(r3, r4, r5, r0)
            defpackage.e41.q(r3)
            goto L19
        L27:
            java.lang.String r4 = "Beginning index: "
            java.lang.String r5 = " < 0"
            java.lang.String r3 = defpackage.lb1.k(r4, r3, r5)
            defpackage.e41.q(r3)
            goto L19
        L33:
            return r1
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc zbj(byte[] r3, int r4, int r5) {
            int r0 = r4 + r5
            int r1 = r3.length
            zbh(r4, r0, r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb
            byte[] r1 = new byte[r5]
            r2 = 0
            java.lang.System.arraycopy(r3, r4, r1, r2, r5)
            r0.<init>(r1)
            return r0
    }

    public abstract boolean equals(java.lang.Object r1);

    public final int hashCode() {
            r2 = this;
            int r0 = r2.zba
            if (r0 != 0) goto L12
            r0 = 0
            int r1 = r2.zbd()
            int r0 = r2.zbe(r1, r0, r1)
            if (r0 != 0) goto L10
            r0 = 1
        L10:
            r2.zba = r0
        L12:
            return r0
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsu r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsu
            r0.<init>(r1)
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.util.Locale r0 = java.util.Locale.ROOT
            int r0 = java.lang.System.identityHashCode(r4)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            int r1 = r4.zbd()
            int r2 = r4.zbd()
            r3 = 50
            if (r2 > r3) goto L1b
            java.lang.String r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwj.zba(r4)
            goto L2c
        L1b:
            r2 = 0
            r3 = 47
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r4 = r4.zbf(r2, r3)
            java.lang.String r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwj.zba(r4)
            java.lang.String r2 = "..."
            java.lang.String r4 = r4.concat(r2)
        L2c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "<ByteString@"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " size="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " contents=\""
            r2.append(r0)
            java.lang.String r0 = "\">"
            java.lang.String r4 = defpackage.i61.n(r2, r4, r0)
            return r4
    }

    public abstract byte zba(int r1);

    public abstract byte zbb(int r1);

    public abstract int zbd();

    public abstract int zbe(int r1, int r2, int r3);

    public abstract com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc zbf(int r1, int r2);

    public abstract void zbg(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbst r1);

    public final int zbi() {
            r0 = this;
            int r0 = r0.zba
            return r0
    }
}
