package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pd2  reason: default package */
/* loaded from: classes.dex */
public final class pd2 {
    public static final List b = hf.c0(new pd2(0), new pd2(1), new pd2(2));
    public final int a;

    public /* synthetic */ pd2(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pd2) {
            if (this.a != ((pd2) obj).a) {
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
        return xg6.o("FlashMode(value=", this.a, ')');
    }
}
