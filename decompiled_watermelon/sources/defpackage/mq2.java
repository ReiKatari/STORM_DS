package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mq2  reason: default package */
/* loaded from: classes.dex */
public final class mq2 {
    public final String a;
    public final String b;

    public mq2(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq2)) {
            return false;
        }
        mq2 mq2Var = (mq2) obj;
        if (b53.x(this.a, mq2Var.a) && b53.x(this.b, mq2Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HashIconRow(hash=" + this.a + ", iconUrl=" + this.b + ")";
    }
}
