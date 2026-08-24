package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oa  reason: default package */
/* loaded from: classes.dex */
public final class oa {
    public static final List b = hf.c0(new oa(0), new oa(1), new oa(2), new oa(3), new oa(4), new oa(5), new oa(6));
    public final int a;

    public /* synthetic */ oa(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oa) {
            if (this.a != ((oa) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return xg6.o("AeMode(value=", this.a, ')');
    }
}
