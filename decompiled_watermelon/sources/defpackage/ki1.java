package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ki1  reason: default package */
/* loaded from: classes.dex */
public final class ki1 implements z21 {
    public final float a;

    public ki1(float f) {
        this.a = f;
    }

    @Override // defpackage.z21
    public final float a(long j, od1 od1Var) {
        return od1Var.C(this.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ki1) || !ji1.b(this.a, ((ki1) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
