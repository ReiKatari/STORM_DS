package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w32  reason: default package */
/* loaded from: classes.dex */
public final class w32 {
    public final c42 a;
    public final byte[] b;

    public w32(c42 c42Var, byte[] bArr) {
        if (c42Var != null) {
            if (bArr != null) {
                this.a = c42Var;
                this.b = bArr;
                return;
            }
            u34.x("bytes is null");
            throw null;
        }
        u34.x("encoding is null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w32)) {
            return false;
        }
        w32 w32Var = (w32) obj;
        if (!this.a.equals(w32Var.a)) {
            return false;
        }
        return Arrays.equals(this.b, w32Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
