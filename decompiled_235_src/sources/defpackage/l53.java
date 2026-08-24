package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l53  reason: default package */
/* loaded from: classes.dex */
public final class l53 extends ly4 {
    public final boolean l;

    public l53(String str, m53 m53Var) {
        super(str, m53Var, 1);
        this.l = true;
    }

    @Override // defpackage.ly4
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l53) {
                wb6 wb6Var = (wb6) obj;
                if (this.a.equals(wb6Var.a())) {
                    l53 l53Var = (l53) obj;
                    if (l53Var.l && Arrays.equals((wb6[]) this.j.getValue(), (wb6[]) l53Var.j.getValue())) {
                        int f = wb6Var.f();
                        int i = this.c;
                        if (i == f) {
                            for (int i2 = 0; i2 < i; i2++) {
                                if (nb3.k(j(i2).a(), wb6Var.j(i2).a()) && nb3.k(j(i2).e(), wb6Var.j(i2).e())) {
                                }
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.wb6
    public final boolean h() {
        return this.l;
    }

    @Override // defpackage.ly4
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
