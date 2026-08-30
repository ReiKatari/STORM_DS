package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rw  reason: default package */
/* loaded from: classes.dex */
public final class rw {
    public final int a;

    public rw(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof rw) && this.a == ((rw) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ^ 1000003) * 1000003;
    }

    public final String toString() {
        return wh1.m(new StringBuilder("StateError{code="), this.a, ", cause=null}");
    }
}
