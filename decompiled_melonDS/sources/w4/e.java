package w4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final int f14130b = 66305;

    /* renamed from: a  reason: collision with root package name */
    public final int f14131a;

    public static String a(int i2) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("LineBreak(strategy=");
        int i10 = i2 & 255;
        String str3 = "Invalid";
        if (i10 == 1) {
            str = "Strategy.Simple";
        } else if (i10 == 2) {
            str = "Strategy.HighQuality";
        } else if (i10 == 3) {
            str = "Strategy.Balanced";
        } else if (i10 != 0) {
            str = "Invalid";
        } else {
            str = "Strategy.Unspecified";
        }
        sb2.append((Object) str);
        sb2.append(", strictness=");
        int i11 = (i2 >> 8) & 255;
        if (i11 == 1) {
            str2 = "Strictness.None";
        } else if (i11 == 2) {
            str2 = "Strictness.Loose";
        } else if (i11 == 3) {
            str2 = "Strictness.Normal";
        } else if (i11 == 4) {
            str2 = "Strictness.Strict";
        } else if (i11 != 0) {
            str2 = "Invalid";
        } else {
            str2 = "Strictness.Unspecified";
        }
        sb2.append((Object) str2);
        sb2.append(", wordBreak=");
        int i12 = (i2 >> 16) & 255;
        if (i12 == 1) {
            str3 = "WordBreak.None";
        } else if (i12 == 2) {
            str3 = "WordBreak.Phrase";
        } else if (i12 == 0) {
            str3 = "WordBreak.Unspecified";
        }
        sb2.append((Object) str3);
        sb2.append(')');
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (this.f14131a != ((e) obj).f14131a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14131a);
    }

    public final String toString() {
        return a(this.f14131a);
    }
}
