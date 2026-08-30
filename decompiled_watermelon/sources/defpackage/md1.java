package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: md1  reason: default package */
/* loaded from: classes.dex */
public final class md1 {
    public int a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof md1) && this.a == ((md1) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return ej6.g(new StringBuilder("DeltaCounter(count="), this.a, ')');
    }
}
