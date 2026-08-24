package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oy  reason: default package */
/* loaded from: classes.dex */
public final class oy extends py3 {
    public final long a;
    public final long b;
    public final wx c;
    public final Integer d;
    public final String e;
    public final ArrayList f;
    public final q65 g;

    public oy(long j, long j2, wx wxVar, Integer num, String str, ArrayList arrayList, q65 q65Var) {
        this.a = j;
        this.b = j2;
        this.c = wxVar;
        this.d = num;
        this.e = str;
        this.f = arrayList;
        this.g = q65Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof py3) {
                oy oyVar = (oy) ((py3) obj);
                if (this.a == oyVar.a && this.b == oyVar.b && this.c.equals(oyVar.c)) {
                    Integer num = oyVar.d;
                    Integer num2 = this.d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str = oyVar.e;
                    String str2 = this.e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f.equals(oyVar.f)) {
                        q65 q65Var = oyVar.g;
                        q65 q65Var2 = this.g;
                        if (q65Var2 == null) {
                            if (q65Var == null) {
                                return true;
                            }
                            return false;
                        } else if (q65Var2.equals(q65Var)) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long j = this.a;
        long j2 = this.b;
        int hashCode3 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        int i = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode3 ^ hashCode) * 1000003;
        String str = this.e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int hashCode4 = (((i2 ^ hashCode2) * 1000003) ^ this.f.hashCode()) * 1000003;
        q65 q65Var = this.g;
        if (q65Var != null) {
            i = q65Var.hashCode();
        }
        return hashCode4 ^ i;
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }
}
