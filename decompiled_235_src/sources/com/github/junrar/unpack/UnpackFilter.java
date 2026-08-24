package com.github.junrar.unpack;

import com.github.junrar.unpack.vm.VMPreparedProgram;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class UnpackFilter {
    private int BlockLength;
    private int BlockStart;
    private int ExecCount;
    private boolean NextWindow;
    private int ParentFilter;
    private VMPreparedProgram Prg = new VMPreparedProgram();

    public int getBlockLength() {
        return this.BlockLength;
    }

    public int getBlockStart() {
        return this.BlockStart;
    }

    public int getExecCount() {
        return this.ExecCount;
    }

    public int getParentFilter() {
        return this.ParentFilter;
    }

    public VMPreparedProgram getPrg() {
        return this.Prg;
    }

    public boolean isNextWindow() {
        return this.NextWindow;
    }

    public void setBlockLength(int i) {
        this.BlockLength = i;
    }

    public void setBlockStart(int i) {
        this.BlockStart = i;
    }

    public void setExecCount(int i) {
        this.ExecCount = i;
    }

    public void setNextWindow(boolean z) {
        this.NextWindow = z;
    }

    public void setParentFilter(int i) {
        this.ParentFilter = i;
    }

    public void setPrg(VMPreparedProgram vMPreparedProgram) {
        this.Prg = vMPreparedProgram;
    }
}
