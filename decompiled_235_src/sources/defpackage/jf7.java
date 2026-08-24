package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jf7  reason: default package */
/* loaded from: classes.dex */
public final class jf7 {
    public final my4 a;
    public final d83 b;
    public final ko4 c;
    public final List d;
    public final ok3 e;

    public jf7(my4 my4Var, d83 d83Var, ko4 ko4Var, List list, ok3 ok3Var) {
        my4Var.getClass();
        d83Var.getClass();
        ko4Var.getClass();
        list.getClass();
        this.a = my4Var;
        this.b = d83Var;
        this.c = ko4Var;
        this.d = list;
        this.e = ok3Var;
    }

    public static jf7 a(jf7 jf7Var, my4 my4Var, ko4 ko4Var, ok3 ok3Var, int i) {
        List list;
        if ((i & 1) != 0) {
            my4Var = jf7Var.a;
        }
        my4 my4Var2 = my4Var;
        d83 d83Var = jf7Var.b;
        if ((i & 4) != 0) {
            ko4Var = jf7Var.c;
        }
        ko4 ko4Var2 = ko4Var;
        if ((i & 8) != 0) {
            list = jf7Var.d;
        } else {
            list = yt1.A;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            ok3Var = jf7Var.e;
        }
        jf7Var.getClass();
        my4Var2.getClass();
        d83Var.getClass();
        ko4Var2.getClass();
        list2.getClass();
        return new jf7(my4Var2, d83Var, ko4Var2, list2, ok3Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jf7) {
                jf7 jf7Var = (jf7) obj;
                if (!nb3.k(this.a, jf7Var.a) || !nb3.k(this.b, jf7Var.b) || this.c != jf7Var.c || !nb3.k(this.d, jf7Var.d) || !this.e.equals(jf7Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.e.hashCode() + i61.b((this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31, this.d, 31);
    }

    public final String toString() {
        return "UILayoutVariant(uiSize=" + this.a + ", uiInsets=" + this.b + ", orientation=" + this.c + ", folds=" + this.d + ", displays=" + this.e + ")";
    }
}
