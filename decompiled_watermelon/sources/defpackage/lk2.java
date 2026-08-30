package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lk2  reason: default package */
/* loaded from: classes.dex */
public final class lk2 {
    public final String a;
    public final String b;

    public lk2(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk2)) {
            return false;
        }
        lk2 lk2Var = (lk2) obj;
        if (b53.x(this.a, lk2Var.a) && b53.x(this.b, lk2Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "GamepadHint(button=" + this.a + ", label=" + this.b + ")";
    }
}
