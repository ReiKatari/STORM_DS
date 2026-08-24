package defpackage;

import java.util.LinkedHashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jz5  reason: default package */
/* loaded from: classes.dex */
public final class jz5 {
    public final lz5 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final LinkedHashSet f;

    public jz5(lz5 lz5Var, String str, String str2, String str3, String str4, LinkedHashSet linkedHashSet) {
        str.getClass();
        this.a = lz5Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jz5) {
                jz5 jz5Var = (jz5) obj;
                if (!this.a.equals(jz5Var.a) || !nb3.k(this.b, jz5Var.b) || !nb3.k(this.c, jz5Var.c) || !this.d.equals(jz5Var.d) || !this.e.equals(jz5Var.e) || !this.f.equals(jz5Var.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int d = xg6.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f.hashCode() + xg6.d(xg6.d((d + hashCode) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DirectoryNode(root=");
        sb.append(this.a);
        sb.append(", docId=");
        sb.append(this.b);
        sb.append(", parentDocId=");
        i61.B(sb, this.c, ", displayName=", this.d, ", relativePath=");
        sb.append(this.e);
        sb.append(", childDirectories=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
