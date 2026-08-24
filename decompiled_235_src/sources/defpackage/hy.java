package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hy  reason: default package */
/* loaded from: classes.dex */
public final class hy {
    public final String a;
    public final Integer b;
    public final w32 c;
    public final long d;
    public final long e;
    public final Map f;

    public hy(String str, Integer num, w32 w32Var, long j, long j2, HashMap hashMap) {
        this.a = str;
        this.b = num;
        this.c = w32Var;
        this.d = j;
        this.e = j2;
        this.f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final pa c() {
        pa paVar = new pa(4, false);
        String str = this.a;
        if (str != null) {
            paVar.B = str;
            paVar.L = this.b;
            w32 w32Var = this.c;
            if (w32Var != null) {
                paVar.R = w32Var;
                paVar.X = Long.valueOf(this.d);
                paVar.Y = Long.valueOf(this.e);
                paVar.Z = new HashMap(this.f);
                return paVar;
            }
            u34.x("Null encodedPayload");
            return null;
        }
        u34.x("Null transportName");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hy) {
            hy hyVar = (hy) obj;
            if (this.a.equals(hyVar.a)) {
                Integer num = hyVar.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.c.equals(hyVar.c) && this.d == hyVar.d && this.e == hyVar.e && this.f.equals(hyVar.f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j = this.d;
        long j2 = this.e;
        return this.f.hashCode() ^ ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}
