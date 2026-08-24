package com.github.junrar.unpack.ppm;

import com.github.junrar.unpack.Unpack;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class RangeCoder {
    public static final int BOT = 32768;
    public static final int TOP = 16777216;
    private static final long uintMask = 4294967295L;
    private long code;
    private long low;
    private long range;
    private final SubRange subRange = new SubRange();
    private Unpack unpackRead;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class SubRange {
        private long highCount;
        private long lowCount;
        private long scale;

        public long getHighCount() {
            return this.highCount;
        }

        public long getLowCount() {
            return this.lowCount & RangeCoder.uintMask;
        }

        public long getScale() {
            return this.scale;
        }

        public void incScale(int i) {
            setScale(getScale() + i);
        }

        public void setHighCount(long j) {
            this.highCount = j & RangeCoder.uintMask;
        }

        public void setLowCount(long j) {
            this.lowCount = j & RangeCoder.uintMask;
        }

        public void setScale(long j) {
            this.scale = j & RangeCoder.uintMask;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SubRange[\n  lowCount=");
            sb.append(this.lowCount);
            sb.append("\n  highCount=");
            sb.append(this.highCount);
            sb.append("\n  scale=");
            return lb1.p(sb, this.scale, "]");
        }
    }

    private int getChar() {
        return this.unpackRead.getChar();
    }

    public void ariDecNormalize() {
        boolean z = false;
        while (true) {
            long j = this.low;
            long j2 = this.range;
            if (((j + j2) ^ j) >= 16777216) {
                if (j2 < 32768) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return;
                }
            }
            if (z) {
                this.range = (-j) & 32767;
                z = false;
            }
            this.code = ((this.code << 8) | getChar()) & uintMask;
            this.range = (this.range << 8) & uintMask;
            this.low = (this.low << 8) & uintMask;
        }
    }

    public void decode() {
        this.low = ((this.subRange.getLowCount() * this.range) + this.low) & uintMask;
        this.range = uintMask & ((this.subRange.getHighCount() - this.subRange.getLowCount()) * this.range);
    }

    public int getCurrentCount() {
        long scale = (this.range / this.subRange.getScale()) & uintMask;
        this.range = scale;
        return (int) ((this.code - this.low) / scale);
    }

    public long getCurrentShiftCount(int i) {
        long j = this.range >>> i;
        this.range = j;
        return uintMask & ((this.code - this.low) / j);
    }

    public SubRange getSubRange() {
        return this.subRange;
    }

    public void initDecoder(Unpack unpack) {
        this.unpackRead = unpack;
        this.code = 0L;
        this.low = 0L;
        this.range = uintMask;
        for (int i = 0; i < 4; i++) {
            this.code = ((this.code << 8) | getChar()) & uintMask;
        }
    }

    public String toString() {
        return "RangeCoder[\n  low=" + this.low + "\n  code=" + this.code + "\n  range=" + this.range + "\n  subrange=" + this.subRange + "]";
    }
}
