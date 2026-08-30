package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m07  reason: default package */
/* loaded from: classes.dex */
public final class m07 implements n93 {
    public final qo0 a;

    public m07(qo0 qo0Var) {
        Collections.EMPTY_LIST.getClass();
        this.a = qo0Var;
    }

    @Override // defpackage.n93
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.n93
    public final boolean b() {
        return false;
    }

    @Override // defpackage.n93
    public final qo0 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m07) {
            if (this.a.equals(((m07) obj).a)) {
                List list = Collections.EMPTY_LIST;
                if (b53.x(list, list)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + b31.b(this.a.hashCode() * 31, 31, Collections.EMPTY_LIST);
    }

    public final String toString() {
        String name;
        String S0;
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
            S0 = "";
        } else {
            S0 = tq0.S0(list, ", ", "<", ">", new d96(27), 24);
        }
        return (name + S0 + "").concat(" (Kotlin reflection is not available)");
    }
}
