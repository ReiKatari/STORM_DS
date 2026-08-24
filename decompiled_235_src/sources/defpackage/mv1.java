package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mv1  reason: default package */
/* loaded from: classes.dex */
public final class mv1 implements ov1 {
    public final String a;
    public final List b;
    public final int c;
    public final qn2 d;

    public mv1(int i, qn2 qn2Var, String str, List list) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = qn2Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mv1) {
                mv1 mv1Var = (mv1) obj;
                if (!this.a.equals(mv1Var.a) || !this.b.equals(mv1Var.b) || this.c != mv1Var.c || !this.d.equals(mv1Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + lb1.a(this.c, i61.b(this.a.hashCode() * 31, this.b, 31), 31);
    }

    public final String toString() {
        return "Choice(title=" + this.a + ", labels=" + this.b + ", selectedIndex=" + this.c + ", onSelect=" + this.d + ")";
    }
}
