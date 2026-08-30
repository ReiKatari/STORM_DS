package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i52  reason: default package */
/* loaded from: classes.dex */
public final class i52 implements j52 {
    public final String a;
    public final no2 b;

    public i52(String str, no2 no2Var) {
        no2Var.getClass();
        this.a = str;
        this.b = no2Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i52) {
                i52 i52Var = (i52) obj;
                if (!this.a.equals(i52Var.a) || !b53.x(this.b, i52Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UseCaseMissing(requiredUseCases=" + this.a + ", featureRequiring=" + this.b + ')';
    }
}
