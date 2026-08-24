package com.github.junrar.rarfile;

import com.github.junrar.io.Raw;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MacInfoHeader extends SubBlockHeader {
    public static final short MacInfoHeaderSize = 8;
    private static final ry3 logger = sy3.d(MacInfoHeader.class);
    private int fileCreator;
    private int fileType;

    public MacInfoHeader(SubBlockHeader subBlockHeader, byte[] bArr) {
        super(subBlockHeader);
        this.fileType = Raw.readIntLittleEndian(bArr, 0);
        this.fileCreator = Raw.readIntLittleEndian(bArr, 4);
    }

    public int getFileCreator() {
        return this.fileCreator;
    }

    public int getFileType() {
        return this.fileType;
    }

    @Override // com.github.junrar.rarfile.SubBlockHeader, com.github.junrar.rarfile.BlockHeader, com.github.junrar.rarfile.BaseBlock
    public void print() {
        super.print();
        ry3 ry3Var = logger;
        if (ry3Var.e()) {
            ry3Var.b(Integer.valueOf(this.fileType), "filetype: {}");
            ry3Var.b(Integer.valueOf(this.fileCreator), "creator: {}");
        }
    }

    public void setFileCreator(int i) {
        this.fileCreator = i;
    }

    public void setFileType(int i) {
        this.fileType = i;
    }
}
