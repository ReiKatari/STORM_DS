package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ne2  reason: default package */
/* loaded from: classes.dex */
public final class ne2 {
    public final int a;

    public ne2(int i) {
        this.a = i;
    }

    public final String a() {
        return "wght";
    }

    public final float b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ne2) && this.a == ((ne2) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 113071012 + this.a;
    }

    public final String toString() {
        return ej6.g(new StringBuilder("FontVariation.Setting(axisName='wght', value="), this.a, ')');
    }
}
