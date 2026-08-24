package com.github.junrar.unpack.vm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class VMPreparedProgram {
    private java.util.List<com.github.junrar.unpack.vm.VMPreparedCommand> AltCmd;
    private java.util.List<com.github.junrar.unpack.vm.VMPreparedCommand> Cmd;
    private int CmdCount;
    private int FilteredDataOffset;
    private int FilteredDataSize;
    private java.util.Vector<java.lang.Byte> GlobalData;
    private int[] InitR;
    private java.util.Vector<java.lang.Byte> StaticData;

    public VMPreparedProgram() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.Cmd = r0
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1.GlobalData = r0
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1.StaticData = r0
            r0 = 7
            int[] r0 = new int[r0]
            r1.InitR = r0
            r0 = 0
            r1.AltCmd = r0
            return
    }

    public java.util.List<com.github.junrar.unpack.vm.VMPreparedCommand> getAltCmd() {
            r0 = this;
            java.util.List<com.github.junrar.unpack.vm.VMPreparedCommand> r0 = r0.AltCmd
            return r0
    }

    public java.util.List<com.github.junrar.unpack.vm.VMPreparedCommand> getCmd() {
            r0 = this;
            java.util.List<com.github.junrar.unpack.vm.VMPreparedCommand> r0 = r0.Cmd
            return r0
    }

    public int getCmdCount() {
            r0 = this;
            int r0 = r0.CmdCount
            return r0
    }

    public int getFilteredDataOffset() {
            r0 = this;
            int r0 = r0.FilteredDataOffset
            return r0
    }

    public int getFilteredDataSize() {
            r0 = this;
            int r0 = r0.FilteredDataSize
            return r0
    }

    public java.util.Vector<java.lang.Byte> getGlobalData() {
            r0 = this;
            java.util.Vector<java.lang.Byte> r0 = r0.GlobalData
            return r0
    }

    public int[] getInitR() {
            r0 = this;
            int[] r0 = r0.InitR
            return r0
    }

    public java.util.Vector<java.lang.Byte> getStaticData() {
            r0 = this;
            java.util.Vector<java.lang.Byte> r0 = r0.StaticData
            return r0
    }

    public void setAltCmd(java.util.List<com.github.junrar.unpack.vm.VMPreparedCommand> r1) {
            r0 = this;
            r0.AltCmd = r1
            return
    }

    public void setCmd(java.util.List<com.github.junrar.unpack.vm.VMPreparedCommand> r1) {
            r0 = this;
            r0.Cmd = r1
            return
    }

    public void setCmdCount(int r1) {
            r0 = this;
            r0.CmdCount = r1
            return
    }

    public void setFilteredDataOffset(int r1) {
            r0 = this;
            r0.FilteredDataOffset = r1
            return
    }

    public void setFilteredDataSize(int r1) {
            r0 = this;
            r0.FilteredDataSize = r1
            return
    }

    public void setGlobalData(java.util.Vector<java.lang.Byte> r1) {
            r0 = this;
            r0.GlobalData = r1
            return
    }

    public void setInitR(int[] r1) {
            r0 = this;
            r0.InitR = r1
            return
    }

    public void setStaticData(java.util.Vector<java.lang.Byte> r1) {
            r0 = this;
            r0.StaticData = r1
            return
    }
}
