package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vc5  reason: default package */
/* loaded from: classes.dex */
public final class vc5 extends wc5 {
    public final String a;

    public vc5(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof vc5) || !this.a.equals(((vc5) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wh1.A("LoginExpired(existingUsername=", this.a, ")");
    }
}
