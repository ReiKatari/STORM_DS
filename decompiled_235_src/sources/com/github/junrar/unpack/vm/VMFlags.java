package com.github.junrar.unpack.vm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum VMFlags {
    VM_FC(1),
    VM_FZ(2),
    VM_FS(Integer.MIN_VALUE);
    
    private final int flag;

    VMFlags(int i) {
        this.flag = i;
    }

    public static VMFlags findFlag(int i) {
        VMFlags vMFlags = VM_FC;
        if (vMFlags.equals(i)) {
            return vMFlags;
        }
        VMFlags vMFlags2 = VM_FS;
        if (vMFlags2.equals(i)) {
            return vMFlags2;
        }
        VMFlags vMFlags3 = VM_FZ;
        if (vMFlags3.equals(i)) {
            return vMFlags3;
        }
        return null;
    }

    public boolean equals(int i) {
        if (this.flag == i) {
            return true;
        }
        return false;
    }

    public int getFlag() {
        return this.flag;
    }
}
