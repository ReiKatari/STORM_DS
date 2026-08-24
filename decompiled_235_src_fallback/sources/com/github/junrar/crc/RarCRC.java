package com.github.junrar.crc;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class RarCRC {
    private static final int[] crcTab = null;

    static {
            r0 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r0]
            com.github.junrar.crc.RarCRC.crcTab = r1
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L27
            r3 = r1
            r4 = r2
        Lc:
            r5 = 8
            if (r3 >= r5) goto L20
            r5 = r4 & 1
            if (r5 == 0) goto L1b
            int r4 = r4 >>> 1
            r5 = -306674912(0xffffffffedb88320, float:-7.13797E27)
            r4 = r4 ^ r5
            goto L1d
        L1b:
            int r4 = r4 >>> 1
        L1d:
            int r3 = r3 + 1
            goto Lc
        L20:
            int[] r3 = com.github.junrar.crc.RarCRC.crcTab
            r3[r2] = r4
            int r2 = r2 + 1
            goto L8
        L27:
            return
    }

    private RarCRC() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int checkCrc(int r3, byte[] r4, int r5, int r6) {
            int r0 = r4.length
            int r0 = r0 - r5
            int r6 = java.lang.Math.min(r0, r6)
            r0 = 0
        L7:
            if (r0 >= r6) goto L1a
            int[] r1 = com.github.junrar.crc.RarCRC.crcTab
            int r2 = r5 + r0
            r2 = r4[r2]
            r2 = r2 ^ r3
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1 = r1[r2]
            int r3 = r3 >>> 8
            r3 = r3 ^ r1
            int r0 = r0 + 1
            goto L7
        L1a:
            return r3
    }

    public static short checkOldCrc(short r2, byte[] r3, int r4) {
            int r0 = r3.length
            int r4 = java.lang.Math.min(r0, r4)
            r0 = 0
        L6:
            if (r0 >= r4) goto L19
            r1 = r3[r0]
            r1 = r1 & 255(0xff, float:3.57E-43)
            short r1 = (short) r1
            int r2 = r2 + r1
            short r2 = (short) r2
            short r2 = (short) r2
            int r1 = r2 << 1
            int r2 = r2 >>> 15
            r2 = r2 | r1
            short r2 = (short) r2
            int r0 = r0 + 1
            goto L6
        L19:
            return r2
    }
}
