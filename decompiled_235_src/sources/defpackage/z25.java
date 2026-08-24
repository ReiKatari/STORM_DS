package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z25  reason: default package */
/* loaded from: classes.dex */
public final class z25 implements Comparable {
    public final byte[] A;

    public z25(byte[] bArr) {
        this.A = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        z25 z25Var = (z25) obj;
        byte[] bArr = this.A;
        int length = bArr.length;
        byte[] bArr2 = z25Var.A;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = z25Var.A[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z25)) {
            return false;
        }
        return Arrays.equals(this.A, ((z25) obj).A);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A);
    }

    public final String toString() {
        return np2.L(this.A);
    }
}
