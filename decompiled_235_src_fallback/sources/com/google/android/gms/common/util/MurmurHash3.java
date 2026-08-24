package com.google.android.gms.common.util;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MurmurHash3 {
    private MurmurHash3() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int murmurhash3_x86_32(byte[] r7, int r8, int r9, int r10) {
            r0 = r8
        L1:
            r1 = r9 & (-4)
            int r1 = r1 + r8
            r2 = 461845907(0x1b873593, float:2.2368498E-22)
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            if (r0 >= r1) goto L3f
            r1 = r7[r0]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r4 = r0 + 1
            r4 = r7[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            int r5 = r0 + 2
            r5 = r7[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 16
            int r6 = r0 + 3
            r6 = r7[r6]
            int r6 = r6 << 24
            r1 = r1 | r4
            r1 = r1 | r5
            r1 = r1 | r6
            int r1 = r1 * r3
            int r3 = r1 << 15
            int r1 = r1 >>> 17
            r1 = r1 | r3
            int r1 = r1 * r2
            r10 = r10 ^ r1
            int r1 = r10 << 13
            int r10 = r10 >>> 19
            r10 = r10 | r1
            int r10 = r10 * 5
            r1 = -430675100(0xffffffffe6546b64, float:-2.5078068E23)
            int r10 = r10 + r1
            int r0 = r0 + 4
            goto L1
        L3f:
            r8 = r9 & 3
            r0 = 0
            r4 = 1
            if (r8 == r4) goto L5d
            r4 = 2
            if (r8 == r4) goto L54
            r0 = 3
            if (r8 == r0) goto L4c
            goto L6a
        L4c:
            int r8 = r1 + 2
            r8 = r7[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r0 = r8 << 16
        L54:
            int r8 = r1 + 1
            r8 = r7[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            r0 = r0 | r8
        L5d:
            r7 = r7[r1]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r7 = r7 | r0
            int r7 = r7 * r3
            int r8 = r7 << 15
            int r7 = r7 >>> 17
            r7 = r7 | r8
            int r7 = r7 * r2
            r10 = r10 ^ r7
        L6a:
            r7 = r10 ^ r9
            int r8 = r7 >>> 16
            r7 = r7 ^ r8
            r8 = -2048144789(0xffffffff85ebca6b, float:-2.217365E-35)
            int r7 = r7 * r8
            int r8 = r7 >>> 13
            r7 = r7 ^ r8
            r8 = -1028477387(0xffffffffc2b2ae35, float:-89.34025)
            int r7 = r7 * r8
            int r8 = r7 >>> 16
            r7 = r7 ^ r8
            return r7
    }
}
