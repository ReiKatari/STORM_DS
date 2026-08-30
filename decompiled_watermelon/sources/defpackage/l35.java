package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l35  reason: default package */
/* loaded from: classes.dex */
public final class l35 implements n35 {
    public final long a;
    public final t35 b;
    public final u35 c;
    public final i35 d;

    public l35(long j, t35 t35Var, u35 u35Var, i35 i35Var) {
        t35Var.getClass();
        u35Var.getClass();
        i35Var.getClass();
        this.a = j;
        this.b = t35Var;
        this.c = u35Var;
        this.d = i35Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l35)) {
            return false;
        }
        l35 l35Var = (l35) obj;
        if (this.a == l35Var.a && b53.x(this.b, l35Var.b) && this.c == l35Var.c && this.d == l35Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (Long.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Result(requestId=" + this.a + ", result=" + this.b + ", action=" + this.c + ", priority=" + this.d + ")";
    }
}
