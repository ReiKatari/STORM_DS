package defpackage;

import java.util.LinkedHashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oo5  reason: default package */
/* loaded from: classes.dex */
public final class oo5 {
    public final qo5 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final LinkedHashSet f;

    public oo5(qo5 qo5Var, String str, String str2, String str3, String str4, LinkedHashSet linkedHashSet) {
        str.getClass();
        this.a = qo5Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof oo5) {
                oo5 oo5Var = (oo5) obj;
                if (!this.a.equals(oo5Var.a) || !b53.x(this.b, oo5Var.b) || !b53.x(this.c, oo5Var.c) || !this.d.equals(oo5Var.d) || !this.e.equals(oo5Var.e) || !this.f.equals(oo5Var.f)) {
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
        int b = ej6.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f.hashCode() + ej6.b(ej6.b((b + hashCode) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DirectoryNode(root=");
        sb.append(this.a);
        sb.append(", docId=");
        sb.append(this.b);
        sb.append(", parentDocId=");
        b31.B(sb, this.c, ", displayName=", this.d, ", relativePath=");
        sb.append(this.e);
        sb.append(", childDirectories=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
