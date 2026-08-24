package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b17  reason: default package */
/* loaded from: classes.dex */
public final class b17 {
    public static final b17 b = new b17(0);
    public static final b17 c = new b17(1);
    public static final b17 d = new b17(2);
    public final int a;

    public b17(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b17)) {
            return false;
        }
        if (this.a == ((b17) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return lb1.q(new StringBuilder("TextDecoration["), ex3.a(62, null, ", ", arrayList), ']');
    }
}
