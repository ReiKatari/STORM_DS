package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sw3  reason: default package */
/* loaded from: classes.dex */
public abstract class sw3 implements wb6 {
    public final wb6 a;

    public sw3(wb6 wb6Var) {
        this.a = wb6Var;
    }

    @Override // defpackage.wb6
    public final int d(String str) {
        str.getClass();
        Integer h0 = xs6.h0(str);
        if (h0 != null) {
            return h0.intValue();
        }
        i.h(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // defpackage.wb6
    public final np2 e() {
        return bt6.f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sw3) {
                sw3 sw3Var = (sw3) obj;
                if (nb3.k(this.a, sw3Var.a) && nb3.k(a(), sw3Var.a())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.wb6
    public final int f() {
        return 1;
    }

    @Override // defpackage.wb6
    public final String g(int i) {
        return String.valueOf(i);
    }

    public final int hashCode() {
        return a().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.wb6
    public final List i(int i) {
        if (i >= 0) {
            return yt1.A;
        }
        u34.s(xg6.t("Illegal index ", i, ", "), a(), " expects only non-negative indices");
        return null;
    }

    @Override // defpackage.wb6
    public final wb6 j(int i) {
        if (i >= 0) {
            return this.a;
        }
        u34.s(xg6.t("Illegal index ", i, ", "), a(), " expects only non-negative indices");
        return null;
    }

    @Override // defpackage.wb6
    public final boolean k(int i) {
        if (i >= 0) {
            return false;
        }
        u34.s(xg6.t("Illegal index ", i, ", "), a(), " expects only non-negative indices");
        return false;
    }

    public final String toString() {
        return a() + '(' + this.a + ')';
    }
}
