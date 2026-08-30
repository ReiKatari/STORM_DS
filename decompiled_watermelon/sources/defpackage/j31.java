package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j31  reason: default package */
/* loaded from: classes.dex */
public final class j31 extends q0 {
    public static final k45 L = new k45(28);
    public final String B;

    public j31(String str) {
        super(L);
        this.B = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j31) && b53.x(this.B, ((j31) obj).B)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    public final String toString() {
        return wh1.o(new StringBuilder("CoroutineName("), this.B, ')');
    }
}
