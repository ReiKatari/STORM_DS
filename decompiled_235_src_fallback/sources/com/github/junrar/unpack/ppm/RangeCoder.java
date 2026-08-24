package com.github.junrar.unpack.ppm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class RangeCoder {
    public static final int BOT = 32768;
    public static final int TOP = 16777216;
    private static final long uintMask = 4294967295L;
    private long code;
    private long low;
    private long range;
    private final com.github.junrar.unpack.ppm.RangeCoder.SubRange subRange;
    private com.github.junrar.unpack.Unpack unpackRead;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class SubRange {
        private long highCount;
        private long lowCount;
        private long scale;

        public SubRange() {
                r0 = this;
                r0.<init>()
                return
        }

        public long getHighCount() {
                r2 = this;
                long r0 = r2.highCount
                return r0
        }

        public long getLowCount() {
                r4 = this;
                long r0 = r4.lowCount
                r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r0 = r0 & r2
                return r0
        }

        public long getScale() {
                r2 = this;
                long r0 = r2.scale
                return r0
        }

        public void incScale(int r5) {
                r4 = this;
                long r0 = r4.getScale()
                long r2 = (long) r5
                long r0 = r0 + r2
                r4.setScale(r0)
                return
        }

        public void setHighCount(long r3) {
                r2 = this;
                r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r3 = r3 & r0
                r2.highCount = r3
                return
        }

        public void setLowCount(long r3) {
                r2 = this;
                r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r3 = r3 & r0
                r2.lowCount = r3
                return
        }

        public void setScale(long r3) {
                r2 = this;
                r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r3 = r3 & r0
                r2.scale = r3
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "SubRange[\n  lowCount="
                r0.<init>(r1)
                long r1 = r3.lowCount
                r0.append(r1)
                java.lang.String r1 = "\n  highCount="
                r0.append(r1)
                long r1 = r3.highCount
                r0.append(r1)
                java.lang.String r1 = "\n  scale="
                r0.append(r1)
                long r1 = r3.scale
                java.lang.String r3 = "]"
                java.lang.String r3 = defpackage.lb1.p(r0, r1, r3)
                return r3
        }
    }

    public RangeCoder() {
            r1 = this;
            r1.<init>()
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r0 = new com.github.junrar.unpack.ppm.RangeCoder$SubRange
            r0.<init>()
            r1.subRange = r0
            return
    }

    private int getChar() {
            r0 = this;
            com.github.junrar.unpack.Unpack r0 = r0.unpackRead
            int r0 = r0.getChar()
            return r0
    }

    public void ariDecNormalize() {
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            long r2 = r10.low
            long r4 = r10.range
            long r6 = r2 + r4
            long r6 = r6 ^ r2
            r8 = 16777216(0x1000000, double:8.289046E-317)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L1e
            r6 = 32768(0x8000, double:1.61895E-319)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L19
            r1 = 1
            goto L1a
        L19:
            r1 = r0
        L1a:
            if (r1 == 0) goto L1d
            goto L1e
        L1d:
            return
        L1e:
            if (r1 == 0) goto L27
            long r1 = -r2
            r3 = 32767(0x7fff, double:1.6189E-319)
            long r1 = r1 & r3
            r10.range = r1
            r1 = r0
        L27:
            long r2 = r10.code
            r4 = 8
            long r2 = r2 << r4
            int r5 = r10.getChar()
            long r5 = (long) r5
            long r2 = r2 | r5
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r5
            r10.code = r2
            long r2 = r10.range
            long r2 = r2 << r4
            long r2 = r2 & r5
            r10.range = r2
            long r2 = r10.low
            long r2 = r2 << r4
            long r2 = r2 & r5
            r10.low = r2
            goto L2
    }

    public void decode() {
            r8 = this;
            long r0 = r8.low
            long r2 = r8.range
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r4 = r8.subRange
            long r4 = r4.getLowCount()
            long r4 = r4 * r2
            long r4 = r4 + r0
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r4 & r0
            r8.low = r2
            long r2 = r8.range
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r4 = r8.subRange
            long r4 = r4.getHighCount()
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r6 = r8.subRange
            long r6 = r6.getLowCount()
            long r4 = r4 - r6
            long r4 = r4 * r2
            long r0 = r0 & r4
            r8.range = r0
            return
    }

    public int getCurrentCount() {
            r6 = this;
            long r0 = r6.range
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r2 = r6.subRange
            long r2 = r2.getScale()
            long r0 = r0 / r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r6.range = r0
            long r2 = r6.code
            long r4 = r6.low
            long r2 = r2 - r4
            long r2 = r2 / r0
            int r6 = (int) r2
            return r6
    }

    public long getCurrentShiftCount(int r5) {
            r4 = this;
            long r0 = r4.range
            long r0 = r0 >>> r5
            r4.range = r0
            long r2 = r4.code
            long r4 = r4.low
            long r2 = r2 - r4
            long r2 = r2 / r0
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            return r4
    }

    public com.github.junrar.unpack.ppm.RangeCoder.SubRange getSubRange() {
            r0 = this;
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r0 = r0.subRange
            return r0
    }

    public void initDecoder(com.github.junrar.unpack.Unpack r7) {
            r6 = this;
            r6.unpackRead = r7
            r0 = 0
            r6.code = r0
            r6.low = r0
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r6.range = r0
            r7 = 0
        L10:
            r2 = 4
            if (r7 >= r2) goto L24
            long r2 = r6.code
            r4 = 8
            long r2 = r2 << r4
            int r4 = r6.getChar()
            long r4 = (long) r4
            long r2 = r2 | r4
            long r2 = r2 & r0
            r6.code = r2
            int r7 = r7 + 1
            goto L10
        L24:
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RangeCoder[\n  low="
            r0.<init>(r1)
            long r1 = r3.low
            r0.append(r1)
            java.lang.String r1 = "\n  code="
            r0.append(r1)
            long r1 = r3.code
            r0.append(r1)
            java.lang.String r1 = "\n  range="
            r0.append(r1)
            long r1 = r3.range
            r0.append(r1)
            java.lang.String r1 = "\n  subrange="
            r0.append(r1)
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r3 = r3.subRange
            r0.append(r3)
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
