package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z07  reason: default package */
/* loaded from: classes.dex */
public final class z07 extends e74 {
    public final rr6 a;
    public final wc0 b;
    public final k27 c;
    public final s51 d;

    public z07(rr6 rr6Var, wc0 wc0Var, k27 k27Var, s51 s51Var) {
        this.a = rr6Var;
        this.b = wc0Var;
        this.c = k27Var;
        this.d = s51Var;
    }

    @Override // defpackage.e74
    public final z64 e() {
        return new a17(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof z07) {
                z07 z07Var = (z07) obj;
                if (this.a != z07Var.a || this.b != z07Var.b || this.c != z07Var.c || this.d != z07Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        j87 j87Var;
        a17 a17Var = (a17) z64Var;
        a17Var.m0.B = null;
        rr6 rr6Var = this.a;
        a17Var.m0 = rr6Var;
        rr6Var.B = a17Var;
        if (a17Var.j0) {
            j87Var = j87.Attached;
        } else {
            j87Var = j87.Detached;
        }
        rr6Var.L = j87Var;
        a17Var.n0 = this.b;
        a17Var.o0 = this.c;
        a17Var.p0 = this.d;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
