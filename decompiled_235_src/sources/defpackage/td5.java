package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: td5  reason: default package */
/* loaded from: classes.dex */
public final class td5 {
    public final String a;
    public final List b;

    public td5(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof td5) {
                td5 td5Var = (td5) obj;
                if (!this.a.equals(td5Var.a) || !this.b.equals(td5Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RawCheatCategory(folderName=" + this.a + ", cheats=" + this.b + ")";
    }
}
