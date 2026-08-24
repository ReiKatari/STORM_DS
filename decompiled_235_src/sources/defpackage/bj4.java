package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: bj4  reason: default package */
/* loaded from: classes.dex */
public final class bj4 {
    public static final aj4 Companion = new Object();
    public final yi4 a;
    public final byte[] b;
    public final byte[] c;

    public /* synthetic */ bj4(int i, yi4 yi4Var, byte[] bArr, byte[] bArr2) {
        if ((i & 1) == 0) {
            this.a = new yi4(null, null, null, 0L, 0L, false, null, 0L, 0L, 0L, 0L, 0L, null, null, false, 131071);
        } else {
            this.a = yi4Var;
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
        if (!(obj instanceof bj4)) {
            return false;
        }
        bj4 bj4Var = (bj4) obj;
        if (nb3.k(this.a, bj4Var.a) && nb3.k(this.b, bj4Var.b) && nb3.k(this.c, bj4Var.c)) {
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
        return i61.n(sb, arrays2, ")");
    }

    public bj4(yi4 yi4Var, byte[] bArr, byte[] bArr2) {
        this.a = yi4Var;
        this.b = bArr;
        this.c = bArr2;
    }
}
