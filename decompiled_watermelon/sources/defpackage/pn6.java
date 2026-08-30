package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pn6  reason: default package */
/* loaded from: classes.dex */
public final class pn6 {
    public final to a;
    public to b;
    public boolean c = false;
    public s04 d = null;

    public pn6(to toVar, to toVar2) {
        this.a = toVar;
        this.b = toVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn6)) {
            return false;
        }
        pn6 pn6Var = (pn6) obj;
        if (b53.x(this.a, pn6Var.a) && b53.x(this.b, pn6Var.b) && this.c == pn6Var.c && b53.x(this.d, pn6Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c = ej6.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
        s04 s04Var = this.d;
        if (s04Var == null) {
            hashCode = 0;
        } else {
            hashCode = s04Var.hashCode();
        }
        return c + hashCode;
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) this.b) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ')';
    }
}
