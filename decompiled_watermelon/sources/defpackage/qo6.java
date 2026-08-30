package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qo6  reason: default package */
/* loaded from: classes.dex */
public final class qo6 {
    public static final qo6 b = new qo6(0);
    public static final qo6 c = new qo6(1);
    public static final qo6 d = new qo6(2);
    public final int a;

    public qo6(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo6)) {
            return false;
        }
        if (this.a == ((qo6) obj).a) {
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
        return wh1.o(new StringBuilder("TextDecoration["), dq3.a(62, null, ", ", arrayList), ']');
    }
}
