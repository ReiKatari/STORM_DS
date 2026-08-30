package w4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: d  reason: collision with root package name */
    public static final i f14138d = new i(f.f14133c, 17, 0);

    /* renamed from: a  reason: collision with root package name */
    public final float f14139a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14140b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14141c;

    public i(float f8, int i2, int i10) {
        this.f14139a = f8;
        this.f14140b = i2;
        this.f14141c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        float f8 = iVar.f14139a;
        float f10 = f.f14132b;
        if (Float.compare(this.f14139a, f8) == 0 && this.f14140b == iVar.f14140b && this.f14141c == iVar.f14141c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        float f8 = f.f14132b;
        return Integer.hashCode(this.f14141c) + w.d.c(this.f14140b, Float.hashCode(this.f14139a) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LineHeightStyle(alignment=");
        sb2.append((Object) f.b(this.f14139a));
        sb2.append(", trim=");
        String str2 = "Invalid";
        int i2 = this.f14140b;
        if (i2 == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i2 == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i2 == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else if (i2 != 0) {
            str = "Invalid";
        } else {
            str = "LineHeightStyle.Trim.None";
        }
        sb2.append((Object) str);
        sb2.append(",mode=");
        int i10 = this.f14141c;
        if (i10 == 0) {
            str2 = "LineHeightStyle.Mode.Fixed";
        } else if (i10 == 1) {
            str2 = "LineHeightStyle.Mode.Minimum";
        } else if (i10 == 2) {
            str2 = "LineHeightStyle.Mode.Tight";
        }
        sb2.append((Object) str2);
        sb2.append(')');
        return sb2.toString();
    }
}
