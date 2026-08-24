package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x25  reason: default package */
/* loaded from: classes.dex */
public final class x25 implements wb6 {
    public final String a;
    public final v25 b;

    public x25(String str, v25 v25Var) {
        v25Var.getClass();
        this.a = str;
        this.b = v25Var;
    }

    @Override // defpackage.wb6
    public final String a() {
        return this.a;
    }

    public final void b() {
        throw new IllegalStateException(i61.n(new StringBuilder("Primitive descriptor "), this.a, " does not have elements"));
    }

    @Override // defpackage.wb6
    public final int d(String str) {
        str.getClass();
        b();
        throw null;
    }

    @Override // defpackage.wb6
    public final np2 e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof x25) {
                x25 x25Var = (x25) obj;
                if (this.a.equals(x25Var.a) && nb3.k(this.b, x25Var.b)) {
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
        return 0;
    }

    @Override // defpackage.wb6
    public final String g(int i) {
        b();
        throw null;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.wb6
    public final List i(int i) {
        b();
        throw null;
    }

    @Override // defpackage.wb6
    public final wb6 j(int i) {
        b();
        throw null;
    }

    @Override // defpackage.wb6
    public final boolean k(int i) {
        b();
        throw null;
    }

    public final String toString() {
        return lb1.q(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
