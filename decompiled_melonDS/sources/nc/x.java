package nc;

import java.util.Collections;
import java.util.List;
import l4.c0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x implements tc.d {

    /* renamed from: a  reason: collision with root package name */
    public final e f10263a;

    public x(e eVar) {
        Collections.EMPTY_LIST.getClass();
        this.f10263a = eVar;
    }

    @Override // tc.d
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // tc.d
    public final boolean b() {
        return false;
    }

    @Override // tc.d
    public final e c() {
        return this.f10263a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            if (this.f10263a.equals(((x) obj).f10263a)) {
                List list = Collections.EMPTY_LIST;
                if (k.a(list, list)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Collections.EMPTY_LIST.hashCode();
        return Integer.hashCode(0) + ((hashCode + (this.f10263a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String name;
        String Y;
        Class cls = this.f10263a.f10259a;
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
            Y = "";
        } else {
            Y = zb.l.Y(list, ", ", "<", ">", new c0(23), 24);
        }
        return (name + Y + "").concat(" (Kotlin reflection is not available)");
    }
}
