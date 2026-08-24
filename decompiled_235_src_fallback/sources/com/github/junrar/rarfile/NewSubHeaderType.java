package com.github.junrar.rarfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class NewSubHeaderType {
    public static final com.github.junrar.rarfile.NewSubHeaderType SUBHEAD_TYPE_ACL = null;
    public static final com.github.junrar.rarfile.NewSubHeaderType SUBHEAD_TYPE_AV = null;
    public static final com.github.junrar.rarfile.NewSubHeaderType SUBHEAD_TYPE_BEOSEA = null;
    public static final com.github.junrar.rarfile.NewSubHeaderType SUBHEAD_TYPE_CMT = null;
    public static final com.github.junrar.rarfile.NewSubHeaderType SUBHEAD_TYPE_OS2EA = null;
    public static final com.github.junrar.rarfile.NewSubHeaderType SUBHEAD_TYPE_RR = null;
    public static final com.github.junrar.rarfile.NewSubHeaderType SUBHEAD_TYPE_STREAM = null;
    public static final com.github.junrar.rarfile.NewSubHeaderType SUBHEAD_TYPE_UOWNER = null;
    private final byte[] headerTypes;

    static {
            com.github.junrar.rarfile.NewSubHeaderType r0 = new com.github.junrar.rarfile.NewSubHeaderType
            r1 = 3
            byte[] r2 = new byte[r1]
            r2 = {x0064: FILL_ARRAY_DATA  , data: [67, 77, 84} // fill-array
            r0.<init>(r2)
            com.github.junrar.rarfile.NewSubHeaderType.SUBHEAD_TYPE_CMT = r0
            com.github.junrar.rarfile.NewSubHeaderType r0 = new com.github.junrar.rarfile.NewSubHeaderType
            byte[] r2 = new byte[r1]
            r2 = {x006a: FILL_ARRAY_DATA  , data: [65, 67, 76} // fill-array
            r0.<init>(r2)
            com.github.junrar.rarfile.NewSubHeaderType.SUBHEAD_TYPE_ACL = r0
            com.github.junrar.rarfile.NewSubHeaderType r0 = new com.github.junrar.rarfile.NewSubHeaderType
            byte[] r2 = new byte[r1]
            r2 = {x0070: FILL_ARRAY_DATA  , data: [83, 84, 77} // fill-array
            r0.<init>(r2)
            com.github.junrar.rarfile.NewSubHeaderType.SUBHEAD_TYPE_STREAM = r0
            com.github.junrar.rarfile.NewSubHeaderType r0 = new com.github.junrar.rarfile.NewSubHeaderType
            byte[] r2 = new byte[r1]
            r2 = {x0076: FILL_ARRAY_DATA  , data: [85, 79, 87} // fill-array
            r0.<init>(r2)
            com.github.junrar.rarfile.NewSubHeaderType.SUBHEAD_TYPE_UOWNER = r0
            com.github.junrar.rarfile.NewSubHeaderType r0 = new com.github.junrar.rarfile.NewSubHeaderType
            r2 = 2
            byte[] r3 = new byte[r2]
            r3 = {x007c: FILL_ARRAY_DATA  , data: [65, 86} // fill-array
            r0.<init>(r3)
            com.github.junrar.rarfile.NewSubHeaderType.SUBHEAD_TYPE_AV = r0
            com.github.junrar.rarfile.NewSubHeaderType r0 = new com.github.junrar.rarfile.NewSubHeaderType
            byte[] r2 = new byte[r2]
            r2 = {x0082: FILL_ARRAY_DATA  , data: [82, 82} // fill-array
            r0.<init>(r2)
            com.github.junrar.rarfile.NewSubHeaderType.SUBHEAD_TYPE_RR = r0
            com.github.junrar.rarfile.NewSubHeaderType r0 = new com.github.junrar.rarfile.NewSubHeaderType
            byte[] r1 = new byte[r1]
            r1 = {x0088: FILL_ARRAY_DATA  , data: [69, 65, 50} // fill-array
            r0.<init>(r1)
            com.github.junrar.rarfile.NewSubHeaderType.SUBHEAD_TYPE_OS2EA = r0
            com.github.junrar.rarfile.NewSubHeaderType r0 = new com.github.junrar.rarfile.NewSubHeaderType
            r1 = 4
            byte[] r1 = new byte[r1]
            r1 = {x008e: FILL_ARRAY_DATA  , data: [69, 65, 66, 69} // fill-array
            r0.<init>(r1)
            com.github.junrar.rarfile.NewSubHeaderType.SUBHEAD_TYPE_BEOSEA = r0
            return
    }

    private NewSubHeaderType(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.headerTypes = r1
            return
    }

    public boolean byteEquals(byte[] r1) {
            r0 = this;
            byte[] r0 = r0.headerTypes
            boolean r0 = java.util.Arrays.equals(r0, r1)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r1.headerTypes
            r0.<init>(r1)
            return r0
    }
}
