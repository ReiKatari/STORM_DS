package com.github.junrar.unpack;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class UnpackFilter {
    private int BlockLength;
    private int BlockStart;
    private int ExecCount;
    private boolean NextWindow;
    private int ParentFilter;
    private com.github.junrar.unpack.vm.VMPreparedProgram Prg;

    public UnpackFilter() {
            r1 = this;
            r1.<init>()
            com.github.junrar.unpack.vm.VMPreparedProgram r0 = new com.github.junrar.unpack.vm.VMPreparedProgram
            r0.<init>()
            r1.Prg = r0
            return
    }

    public int getBlockLength() {
            r0 = this;
            int r0 = r0.BlockLength
            return r0
    }

    public int getBlockStart() {
            r0 = this;
            int r0 = r0.BlockStart
            return r0
    }

    public int getExecCount() {
            r0 = this;
            int r0 = r0.ExecCount
            return r0
    }

    public int getParentFilter() {
            r0 = this;
            int r0 = r0.ParentFilter
            return r0
    }

    public com.github.junrar.unpack.vm.VMPreparedProgram getPrg() {
            r0 = this;
            com.github.junrar.unpack.vm.VMPreparedProgram r0 = r0.Prg
            return r0
    }

    public boolean isNextWindow() {
            r0 = this;
            boolean r0 = r0.NextWindow
            return r0
    }

    public void setBlockLength(int r1) {
            r0 = this;
            r0.BlockLength = r1
            return
    }

    public void setBlockStart(int r1) {
            r0 = this;
            r0.BlockStart = r1
            return
    }

    public void setExecCount(int r1) {
            r0 = this;
            r0.ExecCount = r1
            return
    }

    public void setNextWindow(boolean r1) {
            r0 = this;
            r0.NextWindow = r1
            return
    }

    public void setParentFilter(int r1) {
            r0 = this;
            r0.ParentFilter = r1
            return
    }

    public void setPrg(com.github.junrar.unpack.vm.VMPreparedProgram r1) {
            r0 = this;
            r0.Prg = r1
            return
    }
}
