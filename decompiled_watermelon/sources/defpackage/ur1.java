package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ur1  reason: default package */
/* loaded from: classes.dex */
public final class ur1 extends zr1 {
    public final int a;

    public ur1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ur1) && this.a == ((ur1) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wh1.j("RumbleStart(duration=", this.a, ")");
    }
}
