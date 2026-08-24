package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ej4  reason: default package */
/* loaded from: classes.dex */
public final class ej4 {
    public final ui4 a;
    public final Long b;
    public final byte[] c;

    public ej4(ui4 ui4Var, Long l, byte[] bArr) {
        ui4Var.getClass();
        this.a = ui4Var;
        this.b = l;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej4)) {
            return false;
        }
        ej4 ej4Var = (ej4) obj;
        if (this.a == ej4Var.a && nb3.k(this.b, ej4Var.b) && nb3.k(this.c, ej4Var.c)) {
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
        return i61.n(sb, arrays, ")");
    }
}
