package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kq3  reason: default package */
/* loaded from: classes.dex */
public final class kq3 extends lq3 {
    public final g81 a = g81.b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kq3.class == obj.getClass()) {
            return this.a.equals(((kq3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (kq3.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
