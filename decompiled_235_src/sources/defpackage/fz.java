package defpackage;

import android.util.Base64;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fz  reason: default package */
/* loaded from: classes.dex */
public final class fz {
    public final String a;
    public final byte[] b;
    public final b35 c;

    public fz(String str, byte[] bArr, b35 b35Var) {
        this.a = str;
        this.b = bArr;
        this.c = b35Var;
    }

    public static bt a() {
        bt btVar = new bt(5, false);
        b35 b35Var = b35.DEFAULT;
        if (b35Var != null) {
            btVar.R = b35Var;
            return btVar;
        }
        u34.x("Null priority");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fz) {
            fz fzVar = (fz) obj;
            if (this.a.equals(fzVar.a) && Arrays.equals(this.b, fzVar.b) && this.c.equals(fzVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return i61.n(sb, encodeToString, ")");
    }
}
