package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zw  reason: default package */
/* loaded from: classes.dex */
public final class zw {
    public final int a;
    public final int b;
    public final List c;
    public final List d;

    public zw(int i, int i2, List list, List list2) {
        this.a = i;
        this.b = i2;
        if (list != null) {
            this.c = list;
            if (list2 != null) {
                this.d = list2;
                return;
            } else {
                c44.i("Null videoProfiles");
                throw null;
            }
        }
        c44.i("Null audioProfiles");
        throw null;
    }

    public static zw a(int i, int i2, ArrayList arrayList, ArrayList arrayList2) {
        return new zw(i, i2, Collections.unmodifiableList(new ArrayList(arrayList)), Collections.unmodifiableList(new ArrayList(arrayList2)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zw) {
            zw zwVar = (zw) obj;
            if (this.a == zwVar.a && this.b == zwVar.b && this.c.equals(zwVar.c) && this.d.equals(zwVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.a + ", recommendedFileFormat=" + this.b + ", audioProfiles=" + this.c + ", videoProfiles=" + this.d + "}";
    }
}
