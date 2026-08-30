package defpackage;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w07  reason: default package */
/* loaded from: classes.dex */
public final class w07 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final q9 b;
    public volatile int c = 0;

    public w07(q9 q9Var, int i) {
        this.b = q9Var;
        this.a = i;
    }

    public final int a(int i) {
        wx3 b = b();
        int a = b.a(16);
        if (a != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) b.R;
            int i2 = a + b.A;
            return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [lt3, java.lang.Object] */
    public final wx3 b() {
        ThreadLocal threadLocal = d;
        wx3 wx3Var = (wx3) threadLocal.get();
        wx3 wx3Var2 = wx3Var;
        if (wx3Var == null) {
            ?? lt3Var = new lt3();
            threadLocal.set(lt3Var);
            wx3Var2 = lt3Var;
        }
        xx3 xx3Var = (xx3) this.b.B;
        int a = xx3Var.a(6);
        if (a != 0) {
            int i = a + xx3Var.A;
            int i2 = (this.a * 4) + ((ByteBuffer) xx3Var.R).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) xx3Var.R).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) xx3Var.R;
            wx3Var2.R = byteBuffer;
            if (byteBuffer != null) {
                wx3Var2.A = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                wx3Var2.B = i4;
                wx3Var2.L = ((ByteBuffer) wx3Var2.R).getShort(i4);
                return wx3Var2;
            }
            wx3Var2.A = 0;
            wx3Var2.B = 0;
            wx3Var2.L = 0;
        }
        return wx3Var2;
    }

    public final String toString() {
        int i;
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        wx3 b = b();
        int a = b.a(4);
        if (a != 0) {
            i = ((ByteBuffer) b.R).getInt(a + b.A);
        } else {
            i = 0;
        }
        sb.append(Integer.toHexString(i));
        sb.append(", codepoints:");
        wx3 b2 = b();
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
