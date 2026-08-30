package defpackage;

import java.io.InputStream;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ec3  reason: default package */
/* loaded from: classes.dex */
public final class ec3 extends u72 {
    public static final int[] B = {262144, 1048576, 2097152, 4194304, 4194304, 8388608, 8388608, 16777216, 33554432, 67108864};
    public int A;

    @Override // defpackage.u72
    public final InputStream a(InputStream inputStream, ut utVar) {
        return new dc3(inputStream, this.A, utVar);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException();
        }
    }
}
