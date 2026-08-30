package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s33  reason: default package */
/* loaded from: classes.dex */
public abstract class s33 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        if ((0 - 0) + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw i53.e();
        } catch (i53 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        c44.i(str);
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static jl2 c(Object obj, Object obj2) {
        jl2 jl2Var = (jl2) ((b1) obj);
        jl2Var.getClass();
        gl2 gl2Var = (gl2) jl2Var.f(il2.NEW_BUILDER);
        gl2Var.e(jl2Var);
        b1 b1Var = (b1) obj2;
        if (gl2Var.A.getClass().isInstance(b1Var)) {
            gl2Var.e((jl2) b1Var);
            return gl2Var.b();
        }
        i.i("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }
}
