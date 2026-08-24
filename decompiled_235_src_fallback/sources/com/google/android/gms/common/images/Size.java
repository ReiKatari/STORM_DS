package com.google.android.gms.common.images;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class Size {
    private final int zaa;
    private final int zab;

    public Size(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            return
    }

    public static com.google.android.gms.common.images.Size parseSize(java.lang.String r3) {
            if (r3 == 0) goto L35
            r0 = 42
            int r0 = r3.indexOf(r0)
            if (r0 >= 0) goto L10
            r0 = 120(0x78, float:1.68E-43)
            int r0 = r3.indexOf(r0)
        L10:
            if (r0 < 0) goto L30
            com.google.android.gms.common.images.Size r1 = new com.google.android.gms.common.images.Size     // Catch: java.lang.NumberFormatException -> L2b
            r2 = 0
            java.lang.String r2 = r3.substring(r2, r0)     // Catch: java.lang.NumberFormatException -> L2b
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L2b
            int r0 = r0 + 1
            java.lang.String r0 = r3.substring(r0)     // Catch: java.lang.NumberFormatException -> L2b
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L2b
            r1.<init>(r2, r0)     // Catch: java.lang.NumberFormatException -> L2b
            return r1
        L2b:
            java.lang.NumberFormatException r3 = zaa(r3)
            throw r3
        L30:
            java.lang.NumberFormatException r3 = zaa(r3)
            throw r3
        L35:
            java.lang.String r3 = "string must not be null"
            defpackage.i.h(r3)
            r3 = 0
            return r3
    }

    private static java.lang.NumberFormatException zaa(java.lang.String r3) {
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Invalid Size: \""
            java.lang.String r2 = "\""
            java.lang.String r3 = defpackage.lb1.A(r1, r3, r2)
            r0.<init>(r3)
            throw r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r4 != r5) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.common.images.Size
            if (r2 == 0) goto L1b
            com.google.android.gms.common.images.Size r5 = (com.google.android.gms.common.images.Size) r5
            int r2 = r4.zaa
            int r3 = r5.zaa
            if (r2 != r3) goto L1b
            int r4 = r4.zab
            int r5 = r5.zab
            if (r4 != r5) goto L1b
            return r1
        L1b:
            return r0
    }

    public int getHeight() {
            r0 = this;
            int r0 = r0.zab
            return r0
    }

    public int getWidth() {
            r0 = this;
            int r0 = r0.zaa
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.zaa
            int r1 = r0 << 16
            int r0 = r0 >>> 16
            int r2 = r2.zab
            r0 = r0 | r1
            r2 = r2 ^ r0
            return r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.zaa
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            int r2 = r2.zab
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
