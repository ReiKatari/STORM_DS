package defpackage;

import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fy3  reason: default package */
/* loaded from: classes.dex */
public final class fy3 {
    public final Locale a;

    public fy3(Locale locale) {
        this.a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof fy3)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return nb3.k(this.a.toLanguageTag(), ((fy3) obj).a.toLanguageTag());
    }

    public final int hashCode() {
        return this.a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.a.toLanguageTag();
    }
}
