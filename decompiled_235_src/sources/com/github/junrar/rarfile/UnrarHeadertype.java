package com.github.junrar.rarfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum UnrarHeadertype {
    MainHeader((byte) 115),
    MarkHeader((byte) 114),
    FileHeader((byte) 116),
    CommHeader((byte) 117),
    AvHeader((byte) 118),
    SubHeader((byte) 119),
    ProtectHeader((byte) 120),
    SignHeader((byte) 121),
    NewSubHeader((byte) 122),
    EndArcHeader((byte) 123);
    
    private final byte headerByte;

    UnrarHeadertype(byte b) {
        this.headerByte = b;
    }

    public static UnrarHeadertype findType(byte b) {
        UnrarHeadertype unrarHeadertype = MarkHeader;
        if (unrarHeadertype.equals(b)) {
            return unrarHeadertype;
        }
        UnrarHeadertype unrarHeadertype2 = MainHeader;
        if (unrarHeadertype2.equals(b)) {
            return unrarHeadertype2;
        }
        UnrarHeadertype unrarHeadertype3 = FileHeader;
        if (unrarHeadertype3.equals(b)) {
            return unrarHeadertype3;
        }
        UnrarHeadertype unrarHeadertype4 = EndArcHeader;
        if (unrarHeadertype4.equals(b)) {
            return unrarHeadertype4;
        }
        UnrarHeadertype unrarHeadertype5 = NewSubHeader;
        if (unrarHeadertype5.equals(b)) {
            return unrarHeadertype5;
        }
        UnrarHeadertype unrarHeadertype6 = SubHeader;
        if (unrarHeadertype6.equals(b)) {
            return unrarHeadertype6;
        }
        UnrarHeadertype unrarHeadertype7 = SignHeader;
        if (unrarHeadertype7.equals(b)) {
            return unrarHeadertype7;
        }
        UnrarHeadertype unrarHeadertype8 = ProtectHeader;
        if (unrarHeadertype8.equals(b)) {
            return unrarHeadertype8;
        }
        UnrarHeadertype unrarHeadertype9 = CommHeader;
        if (unrarHeadertype9.equals(b)) {
            return unrarHeadertype9;
        }
        UnrarHeadertype unrarHeadertype10 = AvHeader;
        if (unrarHeadertype10.equals(b)) {
            return unrarHeadertype10;
        }
        return null;
    }

    public boolean equals(byte b) {
        if (this.headerByte == b) {
            return true;
        }
        return false;
    }

    public byte getHeaderByte() {
        return this.headerByte;
    }
}
