package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iu5  reason: default package */
/* loaded from: classes.dex */
public final class iu5 extends tu5 {
    public final Integer a;

    public iu5(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof iu5) && nb3.k(this.a, ((iu5) obj).a)) {
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
