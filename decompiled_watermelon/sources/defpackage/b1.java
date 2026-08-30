package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b1  reason: default package */
/* loaded from: classes.dex */
public abstract class b1 {
    protected int memoizedHashCode;

    public abstract int a();

    public final String b(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public final byte[] c() {
        try {
            int a = a();
            byte[] bArr = new byte[a];
            zp0 zp0Var = new zp0(a, bArr);
            d(zp0Var);
            if (a - zp0Var.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            c44.o(b("byte array"), e);
            return null;
        }
    }

    public abstract void d(zp0 zp0Var);
}
