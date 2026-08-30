package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sj5  reason: default package */
/* loaded from: classes.dex */
public final class sj5 extends dk5 {
    public final Integer a;

    public sj5(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof sj5) && b53.x(this.a, ((sj5) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "InternalResolutionScalingUpdate(internalResolutionScaling=" + this.a + ")";
    }
}
