package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ey  reason: default package */
/* loaded from: classes.dex */
public final class ey {
    public final int a;
    public final int b;
    public final List c;
    public final List d;

    public ey(int i, int i2, List list, List list2) {
        this.a = i;
        this.b = i2;
        if (list != null) {
            this.c = list;
            if (list2 != null) {
                this.d = list2;
                return;
            } else {
                u34.x("Null videoProfiles");
                throw null;
            }
        }
        u34.x("Null audioProfiles");
        throw null;
    }

    public static ey a(int i, int i2, ArrayList arrayList, ArrayList arrayList2) {
        return new ey(i, i2, Collections.unmodifiableList(new ArrayList(arrayList)), Collections.unmodifiableList(new ArrayList(arrayList2)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ey) {
            ey eyVar = (ey) obj;
            if (this.a == eyVar.a && this.b == eyVar.b && this.c.equals(eyVar.c) && this.d.equals(eyVar.d)) {
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
