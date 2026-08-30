package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kq2  reason: default package */
/* loaded from: classes.dex */
public final class kq2 {
    public final t40 a;
    public final an1 b;
    public final an1 c;

    public kq2(t40 t40Var, an1 an1Var, an1 an1Var2) {
        this.a = t40Var;
        this.b = an1Var;
        this.c = an1Var2;
        if (t40Var.b() == 0 && t40Var.a() == 0) {
            i.i("Bounds must be non zero");
            throw null;
        } else if (t40Var.a != 0 && t40Var.b != 0) {
            i.i("Bounding rectangle must start at the top or left window edge for folding features");
            throw null;
        }
    }

    public final an1 a() {
        t40 t40Var = this.a;
        if (t40Var.b() > t40Var.a()) {
            return an1.c0;
        }
        return an1.Z;
    }

    public final boolean b() {
        an1 an1Var = an1.g0;
        an1 an1Var2 = this.b;
        if (an1Var2 == an1Var || (an1Var2 == an1.f0 && this.c == an1.e0)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (kq2.class.equals(cls)) {
            obj.getClass();
            kq2 kq2Var = (kq2) obj;
            if (this.a.equals(kq2Var.a) && this.b == kq2Var.b && this.c == kq2Var.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return kq2.class.getSimpleName() + " { " + this.a + ", type=" + this.b + ", state=" + this.c + " }";
    }
}
