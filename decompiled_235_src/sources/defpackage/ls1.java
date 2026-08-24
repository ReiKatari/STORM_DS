package defpackage;

import java.io.Serializable;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ls1  reason: default package */
/* loaded from: classes.dex */
public final class ls1 {
    public static final long[] e = new long[0];
    public long a;
    public final Object b;
    public final Object c;
    public final Serializable d;

    /* JADX WARN: Type inference failed for: r3v0, types: [long[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [long[], java.io.Serializable] */
    public ls1(wb6 wb6Var, eo2 eo2Var) {
        wb6Var.getClass();
        this.b = wb6Var;
        this.c = eo2Var;
        int f = wb6Var.f();
        if (f <= 64) {
            this.a = f != 64 ? (-1) << f : 0L;
            this.d = e;
            return;
        }
        this.a = 0L;
        int i = (f - 1) >>> 6;
        ?? r3 = new long[i];
        if ((f & 63) != 0) {
            r3[i - 1] = (-1) << f;
        }
        this.d = r3;
    }

    public void a(int i) {
        if (i < 64) {
            this.a = (1 << i) | this.a;
            return;
        }
        int i2 = (i >>> 6) - 1;
        long[] jArr = (long[]) this.d;
        jArr[i2] = (1 << (i & 63)) | jArr[i2];
    }

    public int b() {
        int numberOfTrailingZeros;
        eo2 eo2Var = (eo2) this.c;
        wb6 wb6Var = (wb6) this.b;
        int f = wb6Var.f();
        do {
            long j = this.a;
            if (j != -1) {
                numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                this.a |= 1 << numberOfTrailingZeros;
            } else if (f > 64) {
                long[] jArr = (long[]) this.d;
                int length = jArr.length;
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    int i3 = i2 * 64;
                    long j2 = jArr[i];
                    while (j2 != -1) {
                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j2);
                        j2 |= 1 << numberOfTrailingZeros2;
                        int i4 = numberOfTrailingZeros2 + i3;
                        if (((Boolean) eo2Var.o(wb6Var, Integer.valueOf(i4))).booleanValue()) {
                            jArr[i] = j2;
                            return i4;
                        }
                    }
                    jArr[i] = j2;
                    i = i2;
                }
                return -1;
            } else {
                return -1;
            }
        } while (!((Boolean) eo2Var.o(wb6Var, Integer.valueOf(numberOfTrailingZeros))).booleanValue());
        return numberOfTrailingZeros;
    }

    public int c(ke5 ke5Var, long j) {
        TimeZone timeZone = az7.a;
        ArrayList arrayList = ke5Var.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                kx4 kx4Var = kx4.a;
                kx4.a.j(((he5) reference).a, "A connection to " + ke5Var.c.a.h + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    ke5Var.q = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public ls1(qz6 qz6Var) {
        qz6Var.getClass();
        TimeUnit.MINUTES.getClass();
        this.a = 300000000000L;
        this.b = qz6Var.d();
        this.c = new hk1(i61.n(new StringBuilder(), az7.b, " ConnectionPool connection closer"), 1, this);
        this.d = new ConcurrentLinkedQueue();
    }
}
