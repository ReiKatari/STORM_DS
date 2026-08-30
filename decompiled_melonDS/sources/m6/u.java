package m6;

import a6.m0;
import java.nio.ByteBuffer;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal f9304d = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    public final int f9305a;

    /* renamed from: b  reason: collision with root package name */
    public final b9.e f9306b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f9307c = 0;

    public u(b9.e eVar, int i2) {
        this.f9306b = eVar;
        this.f9305a = i2;
    }

    public final int a(int i2) {
        n6.a b10 = b();
        int a10 = b10.a(16);
        if (a10 != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) b10.R;
            int i10 = a10 + b10.A;
            return byteBuffer.getInt((i2 * 4) + byteBuffer.getInt(i10) + i10 + 4);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, a6.m0] */
    public final n6.a b() {
        ThreadLocal threadLocal = f9304d;
        n6.a aVar = (n6.a) threadLocal.get();
        n6.a aVar2 = aVar;
        if (aVar == null) {
            ?? m0Var = new m0();
            threadLocal.set(m0Var);
            aVar2 = m0Var;
        }
        n6.b bVar = (n6.b) this.f9306b.B;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i2 = a10 + bVar.A;
            int i10 = (this.f9305a * 4) + ((ByteBuffer) bVar.R).getInt(i2) + i2 + 4;
            int i11 = ((ByteBuffer) bVar.R).getInt(i10) + i10;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.R;
            aVar2.R = byteBuffer;
            if (byteBuffer != null) {
                aVar2.A = i11;
                int i12 = i11 - byteBuffer.getInt(i11);
                aVar2.B = i12;
                aVar2.L = ((ByteBuffer) aVar2.R).getShort(i12);
                return aVar2;
            }
            aVar2.A = 0;
            aVar2.B = 0;
            aVar2.L = 0;
        }
        return aVar2;
    }

    public final String toString() {
        int i2;
        int i10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        n6.a b10 = b();
        int a10 = b10.a(4);
        if (a10 != 0) {
            i2 = ((ByteBuffer) b10.R).getInt(a10 + b10.A);
        } else {
            i2 = 0;
        }
        sb2.append(Integer.toHexString(i2));
        sb2.append(", codepoints:");
        n6.a b11 = b();
        int a11 = b11.a(16);
        if (a11 != 0) {
            int i11 = a11 + b11.A;
            i10 = ((ByteBuffer) b11.R).getInt(((ByteBuffer) b11.R).getInt(i11) + i11);
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(Integer.toHexString(a(i12)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
