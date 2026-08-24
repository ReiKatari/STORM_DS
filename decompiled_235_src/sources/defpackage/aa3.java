package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aa3  reason: default package */
/* loaded from: classes.dex */
public abstract class aa3 {
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
            throw ub3.e();
        } catch (ub3 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        u34.x(str);
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static pr2 c(Object obj, Object obj2) {
        pr2 pr2Var = (pr2) ((c1) obj);
        pr2Var.getClass();
        mr2 mr2Var = (mr2) pr2Var.f(or2.NEW_BUILDER);
        mr2Var.d(pr2Var);
        c1 c1Var = (c1) obj2;
        if (mr2Var.A.getClass().isInstance(c1Var)) {
            mr2Var.d((pr2) c1Var);
            return mr2Var.b();
        }
        i.h("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }
}
