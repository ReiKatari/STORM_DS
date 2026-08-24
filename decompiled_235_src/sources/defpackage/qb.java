package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qb  reason: default package */
/* loaded from: classes.dex */
public final class qb {
    public static final List b = hf.c0(new qb(0), new qb(1), new qb(2), new qb(3), new qb(4), new qb(5));
    public final int a;

    public /* synthetic */ qb(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qb) {
            if (this.a != ((qb) obj).a) {
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
        return xg6.o("AfMode(value=", this.a, ')');
    }
}
