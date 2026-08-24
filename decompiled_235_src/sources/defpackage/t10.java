package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: t10  reason: default package */
/* loaded from: classes.dex */
public final class t10 extends l {
    public static final s10 Companion = new Object();
    public static final Map m;
    public final g10 l;

    /* JADX WARN: Type inference failed for: r0v0, types: [s10, java.lang.Object] */
    static {
        lh5 lh5Var = gh5.a;
        ar0 a = gh5.a(g10.class);
        List list = Collections.EMPTY_LIST;
        lh5Var.getClass();
        Map singletonMap = Collections.singletonMap(new he7(a), l.b);
        singletonMap.getClass();
        m = singletonMap;
    }

    public t10(int i, g10 g10Var) {
        if (1 == (i & 1)) {
            this.l = g10Var;
        } else {
            ii2.S(i, 1, r10.a.e());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof t10) && nb3.k(this.l, ((t10) obj).l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.l.hashCode();
    }

    public final String toString() {
        return "BackgroundPreview(backgroundParcelable=" + this.l + ")";
    }

    public t10(g10 g10Var) {
        this.l = g10Var;
    }
}
