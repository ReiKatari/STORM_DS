package defpackage;

import java.io.File;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: za2  reason: default package */
/* loaded from: classes.dex */
public final class za2 {
    public final File a;
    public final List b;

    public za2(File file, List list) {
        this.a = file;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof za2) {
                za2 za2Var = (za2) obj;
                if (!this.a.equals(za2Var.a) || !this.b.equals(za2Var.b)) {
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
        return "FilePathComponents(root=" + this.a + ", segments=" + this.b + ')';
    }
}
