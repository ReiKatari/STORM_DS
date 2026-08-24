package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pw2  reason: default package */
/* loaded from: classes.dex */
public final class pw2 implements wb6 {
    public final String a;
    public final wb6 b;
    public final wb6 c;

    public pw2(String str, wb6 wb6Var, wb6 wb6Var2) {
        this.a = str;
        this.b = wb6Var;
        this.c = wb6Var2;
    }

    @Override // defpackage.wb6
    public final String a() {
        return this.a;
    }

    @Override // defpackage.wb6
    public final int d(String str) {
        str.getClass();
        Integer h0 = xs6.h0(str);
        if (h0 != null) {
            return h0.intValue();
        }
        i.h(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // defpackage.wb6
    public final np2 e() {
        return bt6.g;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pw2) {
                pw2 pw2Var = (pw2) obj;
                if (!this.a.equals(pw2Var.a) || !this.b.equals(pw2Var.b) || !this.c.equals(pw2Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.wb6
    public final int f() {
        return 2;
    }

    @Override // defpackage.wb6
    public final String g(int i) {
        return String.valueOf(i);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.wb6
    public final List i(int i) {
        if (i >= 0) {
            return yt1.A;
        }
        i.f(i61.n(xg6.t("Illegal index ", i, ", "), this.a, " expects only non-negative indices"));
        return null;
    }

    @Override // defpackage.wb6
    public final wb6 j(int i) {
        if (i >= 0) {
            int i2 = i % 2;
            if (i2 != 0) {
                if (i2 == 1) {
                    return this.c;
                }
                i.m("Unreached");
                return null;
            }
            return this.b;
        }
        i.f(i61.n(xg6.t("Illegal index ", i, ", "), this.a, " expects only non-negative indices"));
        return null;
    }

    @Override // defpackage.wb6
    public final boolean k(int i) {
        if (i >= 0) {
            return false;
        }
        i.f(i61.n(xg6.t("Illegal index ", i, ", "), this.a, " expects only non-negative indices"));
        return false;
    }

    public final String toString() {
        return this.a + '(' + this.b + ", " + this.c + ')';
    }
}
