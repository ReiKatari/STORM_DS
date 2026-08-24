package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ji4  reason: default package */
/* loaded from: classes.dex */
public final class ji4 {
    public final String a;
    public final List b;
    public final ki4 c;
    public final String d;
    public final String e;

    public ji4(String str, List list, ki4 ki4Var, String str2, String str3) {
        ki4Var.getClass();
        this.a = str;
        this.b = list;
        this.c = ki4Var;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ji4) {
                ji4 ji4Var = (ji4) obj;
                if (!this.a.equals(ji4Var.a) || !this.b.equals(ji4Var.b) || this.c != ji4Var.c || !this.d.equals(ji4Var.d) || !this.e.equals(ji4Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + xg6.d((this.c.hashCode() + i61.b(this.a.hashCode() * 31, this.b, 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharacterEntity(name=");
        sb.append(this.a);
        sb.append(", aliases=");
        sb.append(this.b);
        sb.append(", gender=");
        sb.append(this.c);
        sb.append(", role=");
        sb.append(this.d);
        sb.append(", defaultPersona=");
        return i61.n(sb, this.e, ")");
    }
}
