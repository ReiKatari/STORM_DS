package defpackage;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: re7  reason: default package */
/* loaded from: classes.dex */
public final class re7 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final eb b;
    public volatile int c = 0;

    public re7(eb ebVar, int i) {
        this.b = ebVar;
        this.a = i;
    }

    public final int a(int i) {
        p54 b = b();
        int a = b.a(16);
        if (a != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) b.R;
            int i2 = a + b.A;
            return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [o04, java.lang.Object] */
    public final p54 b() {
        ThreadLocal threadLocal = d;
        p54 p54Var = (p54) threadLocal.get();
        p54 p54Var2 = p54Var;
        if (p54Var == null) {
            ?? o04Var = new o04();
            threadLocal.set(o04Var);
            p54Var2 = o04Var;
        }
        q54 q54Var = (q54) this.b.B;
        int a = q54Var.a(6);
        if (a != 0) {
            int i = a + q54Var.A;
            int i2 = (this.a * 4) + ((ByteBuffer) q54Var.R).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) q54Var.R).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) q54Var.R;
            p54Var2.R = byteBuffer;
            if (byteBuffer != null) {
                p54Var2.A = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                p54Var2.B = i4;
                p54Var2.L = ((ByteBuffer) p54Var2.R).getShort(i4);
                return p54Var2;
            }
            p54Var2.A = 0;
            p54Var2.B = 0;
            p54Var2.L = 0;
        }
        return p54Var2;
    }

    public final String toString() {
        int i;
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        p54 b = b();
        int a = b.a(4);
        if (a != 0) {
            i = ((ByteBuffer) b.R).getInt(a + b.A);
        } else {
            i = 0;
        }
        sb.append(Integer.toHexString(i));
        sb.append(", codepoints:");
        p54 b2 = b();
        int a2 = b2.a(16);
        if (a2 != 0) {
            int i3 = a2 + b2.A;
            i2 = ((ByteBuffer) b2.R).getInt(((ByteBuffer) b2.R).getInt(i3) + i3);
        } else {
            i2 = 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(Integer.toHexString(a(i4)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
