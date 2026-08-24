package com.github.junrar.rarfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum SubBlockHeaderType {
    EA_HEAD(256),
    UO_HEAD(257),
    MAC_HEAD(258),
    BEEA_HEAD(259),
    NTACL_HEAD(260),
    STREAM_HEAD(261);
    
    private final short subblocktype;

    SubBlockHeaderType(short s) {
        this.subblocktype = s;
    }

    public static SubBlockHeaderType findSubblockHeaderType(short s) {
        SubBlockHeaderType subBlockHeaderType = EA_HEAD;
        if (subBlockHeaderType.equals(s)) {
            return subBlockHeaderType;
        }
        SubBlockHeaderType subBlockHeaderType2 = UO_HEAD;
        if (subBlockHeaderType2.equals(s)) {
            return subBlockHeaderType2;
        }
        SubBlockHeaderType subBlockHeaderType3 = MAC_HEAD;
        if (subBlockHeaderType3.equals(s)) {
            return subBlockHeaderType3;
        }
        SubBlockHeaderType subBlockHeaderType4 = BEEA_HEAD;
        if (subBlockHeaderType4.equals(s)) {
            return subBlockHeaderType4;
        }
        SubBlockHeaderType subBlockHeaderType5 = NTACL_HEAD;
        if (subBlockHeaderType5.equals(s)) {
            return subBlockHeaderType5;
        }
        SubBlockHeaderType subBlockHeaderType6 = STREAM_HEAD;
        if (subBlockHeaderType6.equals(s)) {
            return subBlockHeaderType6;
        }
        return null;
    }

    public boolean equals(short s) {
        if (this.subblocktype == s) {
            return true;
        }
        return false;
    }

    public short getSubblocktype() {
        return this.subblocktype;
    }
}
