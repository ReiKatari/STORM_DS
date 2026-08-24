package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h41  reason: default package */
/* loaded from: classes.dex */
public final class h41 implements wb6 {
    public final yb6 a;
    public final ar0 b;
    public final String c;

    public h41(yb6 yb6Var, ar0 ar0Var) {
        ar0Var.getClass();
        this.a = yb6Var;
        this.b = ar0Var;
        this.c = yb6Var.a + '<' + ar0Var.c() + '>';
    }

    @Override // defpackage.wb6
    public final String a() {
        return this.c;
    }

    @Override // defpackage.wb6
    public final boolean c() {
        return false;
    }

    @Override // defpackage.wb6
    public final int d(String str) {
        str.getClass();
        return this.a.d(str);
    }

    @Override // defpackage.wb6
    public final np2 e() {
        return this.a.b;
    }

    public final boolean equals(Object obj) {
        h41 h41Var;
        if (obj instanceof h41) {
            h41Var = (h41) obj;
        } else {
            h41Var = null;
        }
        if (h41Var != null && this.a.equals(h41Var.a) && nb3.k(h41Var.b, this.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.wb6
    public final int f() {
        return this.a.c;
    }

    @Override // defpackage.wb6
    public final String g(int i) {
        return this.a.f[i];
    }

    @Override // defpackage.wb6
    public final List getAnnotations() {
        return this.a.d;
    }

    @Override // defpackage.wb6
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // defpackage.wb6
    public final List i(int i) {
        return this.a.h[i];
    }

    @Override // defpackage.wb6
    public final wb6 j(int i) {
        return this.a.g[i];
    }

    @Override // defpackage.wb6
    public final boolean k(int i) {
        return this.a.i[i];
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.a + ')';
    }
}
