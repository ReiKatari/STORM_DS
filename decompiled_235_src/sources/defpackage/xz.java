package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xz  reason: default package */
/* loaded from: classes.dex */
public final class xz {
    public static final List b = hf.c0(new xz(0), new xz(1), new xz(6), new xz(5), new xz(2), new xz(3), new xz(8), new xz(7));
    public final int a;

    public /* synthetic */ xz(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xz) {
            if (this.a != ((xz) obj).a) {
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
        return xg6.o("AwbMode(value=", this.a, ')');
    }
}
