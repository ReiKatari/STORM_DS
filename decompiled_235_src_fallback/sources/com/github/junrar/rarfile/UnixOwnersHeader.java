package com.github.junrar.rarfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class UnixOwnersHeader extends com.github.junrar.rarfile.SubBlockHeader {
    private static final defpackage.ry3 logger = null;
    private java.lang.String group;
    private int groupNameSize;
    private java.lang.String owner;
    private int ownerNameSize;

    static {
            java.lang.Class<com.github.junrar.rarfile.UnixOwnersHeader> r0 = com.github.junrar.rarfile.UnixOwnersHeader.class
            ry3 r0 = defpackage.sy3.d(r0)
            com.github.junrar.rarfile.UnixOwnersHeader.logger = r0
            return
    }

    public UnixOwnersHeader(com.github.junrar.rarfile.SubBlockHeader r4, byte[] r5) {
            r3 = this;
            r3.<init>(r4)
            r4 = 0
            short r4 = com.github.junrar.io.Raw.readShortLittleEndian(r5, r4)
            r0 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r0
            r3.ownerNameSize = r4
            r4 = 2
            short r4 = com.github.junrar.io.Raw.readShortLittleEndian(r5, r4)
            r4 = r4 & r0
            r3.groupNameSize = r4
            int r4 = r3.ownerNameSize
            r0 = 4
            int r1 = r0 + r4
            int r2 = r5.length
            if (r1 >= r2) goto L25
            java.lang.String r1 = new java.lang.String
            r1.<init>(r5, r0, r4)
            r3.owner = r1
        L25:
            int r4 = r3.ownerNameSize
            int r0 = r0 + r4
            int r4 = r3.groupNameSize
            int r1 = r0 + r4
            int r2 = r5.length
            if (r1 >= r2) goto L36
            java.lang.String r1 = new java.lang.String
            r1.<init>(r5, r0, r4)
            r3.group = r1
        L36:
            return
    }

    public java.lang.String getGroup() {
            r0 = this;
            java.lang.String r0 = r0.group
            return r0
    }

    public int getGroupNameSize() {
            r0 = this;
            int r0 = r0.groupNameSize
            return r0
    }

    public java.lang.String getOwner() {
            r0 = this;
            java.lang.String r0 = r0.owner
            return r0
    }

    public int getOwnerNameSize() {
            r0 = this;
            int r0 = r0.ownerNameSize
            return r0
    }

    @Override // com.github.junrar.rarfile.SubBlockHeader, com.github.junrar.rarfile.BlockHeader, com.github.junrar.rarfile.BaseBlock
    public void print() {
            r3 = this;
            super.print()
            ry3 r0 = com.github.junrar.rarfile.UnixOwnersHeader.logger
            boolean r1 = r0.e()
            if (r1 == 0) goto L2f
            int r1 = r3.ownerNameSize
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ownerNameSize: {}"
            r0.b(r1, r2)
            java.lang.String r1 = "owner: {}"
            java.lang.String r2 = r3.owner
            r0.b(r2, r1)
            int r1 = r3.groupNameSize
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "groupNameSize: {}"
            r0.b(r1, r2)
            java.lang.String r1 = "group: {}"
            java.lang.String r3 = r3.group
            r0.b(r3, r1)
        L2f:
            return
    }

    public void setGroup(java.lang.String r1) {
            r0 = this;
            r0.group = r1
            return
    }

    public void setGroupNameSize(int r1) {
            r0 = this;
            r0.groupNameSize = r1
            return
    }

    public void setOwner(java.lang.String r1) {
            r0 = this;
            r0.owner = r1
            return
    }

    public void setOwnerNameSize(int r1) {
            r0 = this;
            r0.ownerNameSize = r1
            return
    }
}
