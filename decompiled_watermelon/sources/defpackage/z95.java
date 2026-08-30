package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z95  reason: default package */
/* loaded from: classes.dex */
public final class z95 {
    public int a;

    public /* synthetic */ z95() {
        this(524287);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof z95) && this.a == ((z95) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wh1.j("Renderer3DDebugControlState(featureMask=", this.a, ")");
    }

    public z95(int i) {
        this.a = i;
    }
}
