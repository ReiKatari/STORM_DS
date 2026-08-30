package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.GCMParameterSpec;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ab  reason: default package */
/* loaded from: classes.dex */
public final class ab extends x74 {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final byte[] e;

    public ab(int i, int i2, String str, byte[] bArr) {
        if (bArr.length >= 16 && bArr.length >= i) {
            n67.a(i);
            if (i2 > e() + 16) {
                this.e = Arrays.copyOf(bArr, bArr.length);
                this.d = str;
                this.a = i;
                this.b = i2;
                this.c = i2 - 16;
                return;
            }
            throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
        }
        int max = Math.max(16, i);
        throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + max);
    }

    public static GCMParameterSpec i(byte[] bArr, long j, boolean z) {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.put(bArr);
        if (0 <= j && j < 4294967296L) {
            allocate.putInt((int) j);
            allocate.put(z ? (byte) 1 : (byte) 0);
            return new GCMParameterSpec(128, allocate.array());
        }
        f81.u("Index out of range");
        return null;
    }

    @Override // defpackage.x74
    public final int c() {
        return e();
    }

    @Override // defpackage.x74
    public final int d() {
        return this.b;
    }

    @Override // defpackage.x74
    public final int e() {
        return this.a + 8;
    }

    @Override // defpackage.x74
    public final int f() {
        return this.c;
    }

    @Override // defpackage.x74
    public final wf6 g() {
        return new q9(this);
    }

    @Override // defpackage.x74
    public final xf6 h(byte[] bArr) {
        return new za(this, bArr);
    }
}
