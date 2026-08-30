package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oq6  reason: default package */
/* loaded from: classes.dex */
public final class oq6 {
    public static final ci3 d = new ci3(22, new gu5(17), new d96(17));
    public final to a;
    public final long b;
    public final vr6 c;

    public oq6(to toVar, long j, vr6 vr6Var) {
        vr6 vr6Var2;
        this.a = toVar;
        this.b = ve2.r(toVar.B.length(), j);
        if (vr6Var != null) {
            vr6Var2 = new vr6(ve2.r(toVar.B.length(), vr6Var.a));
        } else {
            vr6Var2 = null;
        }
        this.c = vr6Var2;
    }

    public static oq6 a(oq6 oq6Var, to toVar, long j, int i) {
        vr6 vr6Var;
        if ((i & 1) != 0) {
            toVar = oq6Var.a;
        }
        if ((i & 2) != 0) {
            j = oq6Var.b;
        }
        if ((i & 4) != 0) {
            vr6Var = oq6Var.c;
        } else {
            vr6Var = null;
        }
        oq6Var.getClass();
        return new oq6(toVar, j, vr6Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq6)) {
            return false;
        }
        oq6 oq6Var = (oq6) obj;
        if (vr6.b(this.b, oq6Var.b) && b53.x(this.c, oq6Var.c) && b53.x(this.a, oq6Var.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = vr6.c;
        int c = b31.c(this.b, this.a.hashCode() * 31, 31);
        vr6 vr6Var = this.c;
        if (vr6Var != null) {
            i = Long.hashCode(vr6Var.a);
        } else {
            i = 0;
        }
        return c + i;
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) vr6.h(this.b)) + ", composition=" + this.c + ')';
    }

    public oq6(String str, int i, long j) {
        this(new to((i & 1) != 0 ? "" : str), (i & 2) != 0 ? vr6.b : j, (vr6) null);
    }
}
