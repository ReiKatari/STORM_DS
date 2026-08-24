package com.github.junrar.rarfile;

import com.github.junrar.io.Raw;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class UnixOwnersHeader extends SubBlockHeader {
    private static final ry3 logger = sy3.d(UnixOwnersHeader.class);
    private String group;
    private int groupNameSize;
    private String owner;
    private int ownerNameSize;

    public UnixOwnersHeader(SubBlockHeader subBlockHeader, byte[] bArr) {
        super(subBlockHeader);
        this.ownerNameSize = Raw.readShortLittleEndian(bArr, 0) & 65535;
        this.groupNameSize = Raw.readShortLittleEndian(bArr, 2) & 65535;
        int i = this.ownerNameSize;
        if (4 + i < bArr.length) {
            this.owner = new String(bArr, 4, i);
        }
        int i2 = 4 + this.ownerNameSize;
        int i3 = this.groupNameSize;
        if (i2 + i3 < bArr.length) {
            this.group = new String(bArr, i2, i3);
        }
    }

    public String getGroup() {
        return this.group;
    }

    public int getGroupNameSize() {
        return this.groupNameSize;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getOwnerNameSize() {
        return this.ownerNameSize;
    }

    @Override // com.github.junrar.rarfile.SubBlockHeader, com.github.junrar.rarfile.BlockHeader, com.github.junrar.rarfile.BaseBlock
    public void print() {
        super.print();
        ry3 ry3Var = logger;
        if (ry3Var.e()) {
            ry3Var.b(Integer.valueOf(this.ownerNameSize), "ownerNameSize: {}");
            ry3Var.b(this.owner, "owner: {}");
            ry3Var.b(Integer.valueOf(this.groupNameSize), "groupNameSize: {}");
            ry3Var.b(this.group, "group: {}");
        }
    }

    public void setGroup(String str) {
        this.group = str;
    }

    public void setGroupNameSize(int i) {
        this.groupNameSize = i;
    }

    public void setOwner(String str) {
        this.owner = str;
    }

    public void setOwnerNameSize(int i) {
        this.ownerNameSize = i;
    }
}
