package com.github.junrar.rarfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class FileNameDecoder {
    public FileNameDecoder() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String decode(byte[] r9, int r10) {
            int r0 = r10 + 1
            int r10 = getChar(r9, r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            r3 = r2
            r4 = r3
        Le:
            int r5 = r9.length
            if (r0 >= r5) goto La6
            r5 = 8
            if (r2 != 0) goto L1d
            int r2 = r0 + 1
            int r3 = getChar(r9, r0)
            r0 = r2
            r2 = r5
        L1d:
            int r6 = r3 >>> 6
            if (r6 == 0) goto L93
            r7 = 1
            if (r6 == r7) goto L83
            r7 = 2
            if (r6 == r7) goto L6d
            r5 = 3
            if (r6 == r5) goto L2c
            goto L9e
        L2c:
            int r5 = r0 + 1
            int r6 = getChar(r9, r0)
            r8 = r6 & 128(0x80, float:1.8E-43)
            if (r8 == 0) goto L57
            int r0 = r0 + 2
            int r5 = getChar(r9, r5)
            r6 = r6 & 127(0x7f, float:1.78E-43)
            int r6 = r6 + r7
        L3f:
            if (r6 <= 0) goto L9e
            int r7 = r9.length
            if (r4 >= r7) goto L9e
            int r7 = getChar(r9, r4)
            int r7 = r7 + r5
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r10 << 8
            int r8 = r8 + r7
            char r7 = (char) r8
            r1.append(r7)
            int r6 = r6 + (-1)
            int r4 = r4 + 1
            goto L3f
        L57:
            int r6 = r6 + 2
        L59:
            if (r6 <= 0) goto L6b
            int r0 = r9.length
            if (r4 >= r0) goto L6b
            int r0 = getChar(r9, r4)
            char r0 = (char) r0
            r1.append(r0)
            int r6 = r6 + (-1)
            int r4 = r4 + 1
            goto L59
        L6b:
            r0 = r5
            goto L9e
        L6d:
            int r6 = getChar(r9, r0)
            int r7 = r0 + 1
            int r7 = getChar(r9, r7)
            int r5 = r7 << 8
            int r5 = r5 + r6
            char r5 = (char) r5
            r1.append(r5)
            int r4 = r4 + 1
            int r0 = r0 + 2
            goto L9e
        L83:
            int r5 = r0 + 1
            int r0 = getChar(r9, r0)
            int r6 = r10 << 8
            int r0 = r0 + r6
            char r0 = (char) r0
            r1.append(r0)
        L90:
            int r4 = r4 + 1
            goto L6b
        L93:
            int r5 = r0 + 1
            int r0 = getChar(r9, r0)
            char r0 = (char) r0
            r1.append(r0)
            goto L90
        L9e:
            int r3 = r3 << 2
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 + (-2)
            goto Le
        La6:
            java.lang.String r9 = r1.toString()
            return r9
    }

    public static int getChar(byte[] r0, int r1) {
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }
}
