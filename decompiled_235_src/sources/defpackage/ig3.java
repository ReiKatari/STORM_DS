package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ig3  reason: default package */
/* loaded from: classes.dex */
public final class ig3 implements hg3 {
    public final hg3 a;

    public ig3(hg3 hg3Var) {
        hg3Var.getClass();
        this.a = hg3Var;
    }

    @Override // defpackage.hg3
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.hg3
    public final List b() {
        return this.a.b();
    }

    @Override // defpackage.hg3
    public final ar0 c() {
        return this.a.c();
    }

    public final boolean equals(Object obj) {
        ig3 ig3Var;
        hg3 hg3Var;
        hg3 hg3Var2;
        if (obj != null) {
            ar0 ar0Var = null;
            if (obj instanceof ig3) {
                ig3Var = (ig3) obj;
            } else {
                ig3Var = null;
            }
            if (ig3Var != null) {
                hg3Var = ig3Var.a;
            } else {
                hg3Var = null;
            }
            hg3 hg3Var3 = this.a;
            if (nb3.k(hg3Var3, hg3Var)) {
                ar0 c = hg3Var3.c();
                if (c instanceof ar0) {
                    if (obj instanceof hg3) {
                        hg3Var2 = (hg3) obj;
                    } else {
                        hg3Var2 = null;
                    }
                    if (hg3Var2 != null) {
                        ar0Var = hg3Var2.c();
                    }
                    if (ar0Var != null && (ar0Var instanceof ar0)) {
                        Class cls = c.a;
                        cls.getClass();
                        Class cls2 = ar0Var.a;
                        cls2.getClass();
                        return cls.equals(cls2);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.a;
    }
}
