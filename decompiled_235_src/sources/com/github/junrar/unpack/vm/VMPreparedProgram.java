package com.github.junrar.unpack.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class VMPreparedProgram {
    private int CmdCount;
    private int FilteredDataOffset;
    private int FilteredDataSize;
    private List<VMPreparedCommand> Cmd = new ArrayList();
    private Vector<Byte> GlobalData = new Vector<>();
    private Vector<Byte> StaticData = new Vector<>();
    private int[] InitR = new int[7];
    private List<VMPreparedCommand> AltCmd = null;

    public List<VMPreparedCommand> getAltCmd() {
        return this.AltCmd;
    }

    public List<VMPreparedCommand> getCmd() {
        return this.Cmd;
    }

    public int getCmdCount() {
        return this.CmdCount;
    }

    public int getFilteredDataOffset() {
        return this.FilteredDataOffset;
    }

    public int getFilteredDataSize() {
        return this.FilteredDataSize;
    }

    public Vector<Byte> getGlobalData() {
        return this.GlobalData;
    }

    public int[] getInitR() {
        return this.InitR;
    }

    public Vector<Byte> getStaticData() {
        return this.StaticData;
    }

    public void setAltCmd(List<VMPreparedCommand> list) {
        this.AltCmd = list;
    }

    public void setCmd(List<VMPreparedCommand> list) {
        this.Cmd = list;
    }

    public void setCmdCount(int i) {
        this.CmdCount = i;
    }

    public void setFilteredDataOffset(int i) {
        this.FilteredDataOffset = i;
    }

    public void setFilteredDataSize(int i) {
        this.FilteredDataSize = i;
    }

    public void setGlobalData(Vector<Byte> vector) {
        this.GlobalData = vector;
    }

    public void setInitR(int[] iArr) {
        this.InitR = iArr;
    }

    public void setStaticData(Vector<Byte> vector) {
        this.StaticData = vector;
    }
}
