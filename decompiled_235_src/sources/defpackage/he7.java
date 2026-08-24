package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: he7  reason: default package */
/* loaded from: classes.dex */
public final class he7 implements hg3 {
    public final ar0 a;
    public final List b;

    public he7(ar0 ar0Var) {
        List list = Collections.EMPTY_LIST;
        list.getClass();
        this.a = ar0Var;
        this.b = list;
    }

    @Override // defpackage.hg3
    public final boolean a() {
        return false;
    }

    @Override // defpackage.hg3
    public final List b() {
        return this.b;
    }

    @Override // defpackage.hg3
    public final ar0 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof he7) {
            if (this.a.equals(((he7) obj).a)) {
                List list = Collections.EMPTY_LIST;
                if (nb3.k(list, list)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + i61.b(this.a.hashCode() * 31, Collections.EMPTY_LIST, 31);
    }

    public final String toString() {
        String name;
        String P0;
        Class cls = this.a.a;
        cls.getClass();
        if (cls.isArray()) {
            if (cls.equals(boolean[].class)) {
                name = "kotlin.BooleanArray";
            } else if (cls.equals(char[].class)) {
                name = "kotlin.CharArray";
            } else if (cls.equals(byte[].class)) {
                name = "kotlin.ByteArray";
            } else if (cls.equals(short[].class)) {
                name = "kotlin.ShortArray";
            } else if (cls.equals(int[].class)) {
                name = "kotlin.IntArray";
            } else if (cls.equals(float[].class)) {
                name = "kotlin.FloatArray";
            } else if (cls.equals(long[].class)) {
                name = "kotlin.LongArray";
            } else if (cls.equals(double[].class)) {
                name = "kotlin.DoubleArray";
            } else {
                name = "kotlin.Array";
            }
        } else {
            name = cls.getName();
        }
        List list = Collections.EMPTY_LIST;
        if (list.isEmpty()) {
            P0 = "";
        } else {
            P0 = gt0.P0(list, ", ", "<", ">", new h37(11), 24);
        }
        return (name + P0 + "").concat(" (Kotlin reflection is not available)");
    }
}
