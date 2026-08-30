package defpackage;

import java.util.Locale;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: er3  reason: default package */
/* loaded from: classes.dex */
public final class er3 {
    public final Locale a;

    public er3(Locale locale) {
        this.a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof er3)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return b53.x(this.a.toLanguageTag(), ((er3) obj).a.toLanguageTag());
    }

    public final int hashCode() {
        return this.a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.a.toLanguageTag();
    }
}
