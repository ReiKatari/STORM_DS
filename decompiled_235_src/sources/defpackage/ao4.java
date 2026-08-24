package defpackage;

import com.github.junrar.rarfile.BaseBlock;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ao4  reason: default package */
/* loaded from: classes.dex */
public abstract class ao4 {
    public final /* synthetic */ int a;
    public int b;
    public int c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ao4(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
        this.a = 0;
    }

    public static final void e(short[] sArr) {
        Arrays.fill(sArr, (short) BaseBlock.LHD_SALT);
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

    public abstract void c(ls0 ls0Var, nt ntVar, pk6 pk6Var, jb1 jb1Var, bo4 bo4Var);

    public sq2 d(ls0 ls0Var) {
        return null;
    }

    public abstract void f();

    public String toString() {
        switch (this.a) {
            case 0:
                String c = gh5.a(getClass()).c();
                if (c == null) {
                    return "";
                }
                return c;
            default:
                return super.toString();
        }
    }

    public ao4(int i, int i2) {
        this.a = 0;
        this.b = i;
        this.c = i2;
    }

    public ao4() {
        this.a = 1;
        this.b = 0;
        this.c = 0;
    }
}
