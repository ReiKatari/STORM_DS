package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ha4  reason: default package */
/* loaded from: classes.dex */
public final class ha4 {
    public final x94 a;
    public final Long b;
    public final byte[] c;

    public ha4(x94 x94Var, Long l, byte[] bArr) {
        x94Var.getClass();
        this.a = x94Var;
        this.b = l;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha4)) {
            return false;
        }
        ha4 ha4Var = (ha4) obj;
        if (this.a == ha4Var.a && b53.x(this.b, ha4Var.b) && b53.x(this.c, ha4Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        Long l = this.b;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        byte[] bArr = this.c;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        }
        return i2 + i;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.c);
        StringBuilder sb = new StringBuilder("Verification(integrity=");
        sb.append(this.a);
        sb.append(", lastSeq=");
        sb.append(this.b);
        sb.append(", lastPayloadHash=");
        return b31.q(sb, arrays, ")");
    }
}
