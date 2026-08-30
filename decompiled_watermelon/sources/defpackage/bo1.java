package defpackage;

import java.io.Serializable;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bo1  reason: default package */
/* loaded from: classes.dex */
public final class bo1 {
    public static final long[] e = new long[0];
    public long a;
    public final Object b;
    public final Object c;
    public final Serializable d;

    /* JADX WARN: Type inference failed for: r3v0, types: [long[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [long[], java.io.Serializable] */
    public bo1(h06 h06Var, aj2 aj2Var) {
        h06Var.getClass();
        this.b = h06Var;
        this.c = aj2Var;
        int d = h06Var.d();
        if (d <= 64) {
            this.a = d != 64 ? (-1) << d : 0L;
            this.d = e;
            return;
        }
        this.a = 0L;
        int i = (d - 1) >>> 6;
        ?? r3 = new long[i];
        if ((d & 63) != 0) {
            r3[i - 1] = (-1) << d;
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
        aj2 aj2Var = (aj2) this.c;
        h06 h06Var = (h06) this.b;
        int d = h06Var.d();
        do {
            long j = this.a;
            if (j != -1) {
                numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                this.a |= 1 << numberOfTrailingZeros;
            } else if (d > 64) {
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
                        if (((Boolean) aj2Var.j(h06Var, Integer.valueOf(i4))).booleanValue()) {
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
        } while (!((Boolean) aj2Var.j(h06Var, Integer.valueOf(numberOfTrailingZeros))).booleanValue());
        return numberOfTrailingZeros;
    }

    public int c(x45 x45Var, long j) {
        TimeZone timeZone = ik7.a;
        ArrayList arrayList = x45Var.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                fo4 fo4Var = fo4.a;
                fo4.a.j(((u45) reference).a, "A connection to " + x45Var.c.a.h + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    x45Var.q = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public bo1(fn6 fn6Var) {
        fn6Var.getClass();
        TimeUnit.MINUTES.getClass();
        this.a = 300000000000L;
        this.b = fn6Var.d();
        this.c = new dg1(1, this, b31.q(new StringBuilder(), ik7.b, " ConnectionPool connection closer"));
        this.d = new ConcurrentLinkedQueue();
    }
}
