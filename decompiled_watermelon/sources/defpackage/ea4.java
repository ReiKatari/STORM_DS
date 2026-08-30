package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: ea4  reason: default package */
/* loaded from: classes.dex */
public final class ea4 {
    public static final da4 Companion = new Object();
    public final ba4 a;
    public final byte[] b;
    public final byte[] c;

    public /* synthetic */ ea4(int i, ba4 ba4Var, byte[] bArr, byte[] bArr2) {
        if ((i & 1) == 0) {
            this.a = new ba4(null, null, null, 0L, 0L, false, null, 0L, 0L, 0L, 0L, 0L, null, null, false, 131071);
        } else {
            this.a = ba4Var;
        }
        if ((i & 2) == 0) {
            this.b = new byte[0];
        } else {
            this.b = bArr;
        }
        if ((i & 4) == 0) {
            this.c = new byte[0];
        } else {
            this.c = bArr2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea4)) {
            return false;
        }
        ea4 ea4Var = (ea4) obj;
        if (b53.x(this.a, ea4Var.a) && b53.x(this.b, ea4Var.b) && b53.x(this.c, ea4Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.b);
        return Arrays.hashCode(this.c) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.b);
        String arrays2 = Arrays.toString(this.c);
        StringBuilder sb = new StringBuilder("OfflineLedgerRecord(payload=");
        sb.append(this.a);
        sb.append(", payloadHash=");
        sb.append(arrays);
        sb.append(", signature=");
        return b31.q(sb, arrays2, ")");
    }

    public ea4(ba4 ba4Var, byte[] bArr, byte[] bArr2) {
        this.a = ba4Var;
        this.b = bArr;
        this.c = bArr2;
    }
}
