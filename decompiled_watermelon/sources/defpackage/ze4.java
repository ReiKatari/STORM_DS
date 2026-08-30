package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ze4  reason: default package */
/* loaded from: classes.dex */
public abstract class ze4 {
    public final /* synthetic */ int a;
    public int b;
    public int c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ze4(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
        this.a = 0;
    }

    public static final void e(short[] sArr) {
        Arrays.fill(sArr, (short) 1024);
    }

    public int a(short[] sArr, int i) {
        f();
        short s = sArr[i];
        int i2 = (this.b >>> 11) * s;
        if (Integer.compare(this.c ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i2) < 0) {
            this.b = i2;
            sArr[i] = (short) (s + ((2048 - s) >>> 5));
            return 0;
        }
        this.b -= i2;
        this.c -= i2;
        sArr[i] = (short) (s - (s >>> 5));
        return 1;
    }

    public int b(short[] sArr) {
        int i = 1;
        do {
            i = a(sArr, i) | (i << 1);
        } while (i < sArr.length);
        return i - sArr.length;
    }

    public abstract void c(yp0 yp0Var, xs xsVar, z86 z86Var, r8 r8Var, af4 af4Var);

    public mk2 d(yp0 yp0Var) {
        return null;
    }

    public abstract void f();

    public String toString() {
        switch (this.a) {
            case 0:
                String c = q75.a(getClass()).c();
                if (c == null) {
                    return "";
                }
                return c;
            default:
                return super.toString();
        }
    }

    public ze4(int i, int i2) {
        this.a = 0;
        this.b = i;
        this.c = i2;
    }

    public ze4() {
        this.a = 1;
        this.b = 0;
        this.c = 0;
    }
}
