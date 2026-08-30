package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oq2  reason: default package */
/* loaded from: classes.dex */
public final class oq2 implements h06 {
    public final String a;
    public final h06 b;
    public final h06 c;

    public oq2(String str, h06 h06Var, h06 h06Var2) {
        this.a = str;
        this.b = h06Var;
        this.c = h06Var2;
    }

    @Override // defpackage.h06
    public final int a(String str) {
        str.getClass();
        Integer o0 = gh6.o0(str);
        if (o0 != null) {
            return o0.intValue();
        }
        i.i(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // defpackage.h06
    public final String b() {
        return this.a;
    }

    @Override // defpackage.h06
    public final ep2 c() {
        return kh6.j;
    }

    @Override // defpackage.h06
    public final int d() {
        return 2;
    }

    @Override // defpackage.h06
    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof oq2) {
                oq2 oq2Var = (oq2) obj;
                if (!this.a.equals(oq2Var.a) || !this.b.equals(oq2Var.b) || !this.c.equals(oq2Var.c)) {
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
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.h06
    public final List i(int i) {
        if (i >= 0) {
            return pp1.A;
        }
        i.g(b31.q(wh1.s("Illegal index ", i, ", "), this.a, " expects only non-negative indices"));
        return null;
    }

    @Override // defpackage.h06
    public final h06 j(int i) {
        if (i >= 0) {
            int i2 = i % 2;
            if (i2 != 0) {
                if (i2 == 1) {
                    return this.c;
                }
                i.n("Unreached");
                return null;
            }
            return this.b;
        }
        i.g(b31.q(wh1.s("Illegal index ", i, ", "), this.a, " expects only non-negative indices"));
        return null;
    }

    @Override // defpackage.h06
    public final boolean k(int i) {
        if (i >= 0) {
            return false;
        }
        i.g(b31.q(wh1.s("Illegal index ", i, ", "), this.a, " expects only non-negative indices"));
        return false;
    }

    public final String toString() {
        return this.a + '(' + this.b + ", " + this.c + ')';
    }
}
