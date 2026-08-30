package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xt4  reason: default package */
/* loaded from: classes.dex */
public final class xt4 implements Comparable {
    public final byte[] A;

    public xt4(byte[] bArr) {
        this.A = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        xt4 xt4Var = (xt4) obj;
        byte[] bArr = this.A;
        int length = bArr.length;
        byte[] bArr2 = xt4Var.A;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = xt4Var.A[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xt4)) {
            return false;
        }
        return Arrays.equals(this.A, ((xt4) obj).A);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A);
    }

    public final String toString() {
        return hk2.r(this.A);
    }
}
