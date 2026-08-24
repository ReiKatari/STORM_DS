package com.github.junrar.rarfile;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class NewSubHeaderType {
    private final byte[] headerTypes;
    public static final NewSubHeaderType SUBHEAD_TYPE_CMT = new NewSubHeaderType(new byte[]{67, 77, 84});
    public static final NewSubHeaderType SUBHEAD_TYPE_ACL = new NewSubHeaderType(new byte[]{65, 67, 76});
    public static final NewSubHeaderType SUBHEAD_TYPE_STREAM = new NewSubHeaderType(new byte[]{83, 84, 77});
    public static final NewSubHeaderType SUBHEAD_TYPE_UOWNER = new NewSubHeaderType(new byte[]{85, 79, 87});
    public static final NewSubHeaderType SUBHEAD_TYPE_AV = new NewSubHeaderType(new byte[]{65, 86});
    public static final NewSubHeaderType SUBHEAD_TYPE_RR = new NewSubHeaderType(new byte[]{82, 82});
    public static final NewSubHeaderType SUBHEAD_TYPE_OS2EA = new NewSubHeaderType(new byte[]{69, 65, 50});
    public static final NewSubHeaderType SUBHEAD_TYPE_BEOSEA = new NewSubHeaderType(new byte[]{69, 65, 66, 69});

    private NewSubHeaderType(byte[] bArr) {
        this.headerTypes = bArr;
    }

    public boolean byteEquals(byte[] bArr) {
        return Arrays.equals(this.headerTypes, bArr);
    }

    public String toString() {
        return new String(this.headerTypes);
    }
}
