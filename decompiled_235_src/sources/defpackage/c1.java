package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c1  reason: default package */
/* loaded from: classes.dex */
public abstract class c1 {
    protected int memoizedHashCode;

    public abstract int a();

    public final String b(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public final byte[] c() {
        try {
            int a = a();
            byte[] bArr = new byte[a];
            ms0 ms0Var = new ms0(bArr, a);
            d(ms0Var);
            if (a - ms0Var.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            u34.p(b("byte array"), e);
            return null;
        }
    }

    public abstract void d(ms0 ms0Var);
}
