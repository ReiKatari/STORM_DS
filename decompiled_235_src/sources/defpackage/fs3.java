package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fs3  reason: default package */
/* loaded from: classes.dex */
public final class fs3 implements js3 {
    public final c95 a;
    public final ls3 b;

    public fs3(c95 c95Var) {
        c95Var.getClass();
        this.a = c95Var;
        this.b = new ls3(c95Var.a, c95Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof fs3) && nb3.k(this.a, ((fs3) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.js3
    public final ls3 getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Scoreboard(event=" + this.a + ")";
    }
}
