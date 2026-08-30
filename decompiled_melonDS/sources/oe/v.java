package oe;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v extends x {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f10959a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10960b;

    public v(int i2, Integer num) {
        this.f10959a = num;
        this.f10960b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (nc.k.a(this.f10959a, vVar.f10959a) && this.f10960b == vVar.f10960b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.f10959a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return Integer.hashCode(this.f10960b) + (hashCode * 31);
    }

    public final String toString() {
        return "Key(deviceId=" + this.f10959a + ", keyCode=" + this.f10960b + ")";
    }
}
