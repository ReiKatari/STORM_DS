package com.github.junrar.unpack.vm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class VMStandardFilterSignature {
    private int CRC;
    private int length;
    private com.github.junrar.unpack.vm.VMStandardFilters type;

    public VMStandardFilterSignature(int r1, int r2, com.github.junrar.unpack.vm.VMStandardFilters r3) {
            r0 = this;
            r0.<init>()
            r0.length = r1
            r0.CRC = r2
            r0.type = r3
            return
    }

    public int getCRC() {
            r0 = this;
            int r0 = r0.CRC
            return r0
    }

    public int getLength() {
            r0 = this;
            int r0 = r0.length
            return r0
    }

    public com.github.junrar.unpack.vm.VMStandardFilters getType() {
            r0 = this;
            com.github.junrar.unpack.vm.VMStandardFilters r0 = r0.type
            return r0
    }

    public void setCRC(int r1) {
            r0 = this;
            r0.CRC = r1
            return
    }

    public void setLength(int r1) {
            r0 = this;
            r0.length = r1
            return
    }

    public void setType(com.github.junrar.unpack.vm.VMStandardFilters r1) {
            r0 = this;
            r0.type = r1
            return
    }
}
