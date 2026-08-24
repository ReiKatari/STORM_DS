package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p57  reason: default package */
/* loaded from: classes.dex */
public class p57 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(p57.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public o62[] a;

    public final void a(o62 o62Var) {
        o62Var.c((p62) this);
        o62[] o62VarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (o62VarArr == null) {
            o62VarArr = new o62[4];
            this.a = o62VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= o62VarArr.length) {
            o62VarArr = (o62[]) Arrays.copyOf(o62VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.a = o62VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        o62VarArr[i] = o62Var;
        o62Var.B = i;
        c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
        if (r6.compareTo(r7) < 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o62 b(int i) {
        o62[] o62VarArr = this.a;
        o62VarArr.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            d(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                o62 o62Var = o62VarArr[i];
                o62Var.getClass();
                o62 o62Var2 = o62VarArr[i2];
                o62Var2.getClass();
                if (o62Var.compareTo(o62Var2) < 0) {
                    d(i, i2);
                    c(i2);
                }
            }
            while (true) {
                int i3 = i * 2;
                int i4 = i3 + 1;
                if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                o62[] o62VarArr2 = this.a;
                o62VarArr2.getClass();
                int i5 = i3 + 2;
                if (i5 < atomicIntegerFieldUpdater.get(this)) {
                    o62 o62Var3 = o62VarArr2[i5];
                    o62Var3.getClass();
                    o62 o62Var4 = o62VarArr2[i4];
                    o62Var4.getClass();
                }
                i5 = i4;
                o62 o62Var5 = o62VarArr2[i];
                o62Var5.getClass();
                o62 o62Var6 = o62VarArr2[i5];
                o62Var6.getClass();
                if (o62Var5.compareTo(o62Var6) <= 0) {
                    break;
                }
                d(i, i5);
                i = i5;
            }
        }
        o62 o62Var7 = o62VarArr[atomicIntegerFieldUpdater.get(this)];
        o62Var7.getClass();
        o62Var7.c(null);
        o62Var7.B = -1;
        o62VarArr[atomicIntegerFieldUpdater.get(this)] = null;
        return o62Var7;
    }

    public final void c(int i) {
        while (i > 0) {
            o62[] o62VarArr = this.a;
            o62VarArr.getClass();
            int i2 = (i - 1) / 2;
            o62 o62Var = o62VarArr[i2];
            o62Var.getClass();
            o62 o62Var2 = o62VarArr[i];
            o62Var2.getClass();
            if (o62Var.compareTo(o62Var2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        o62[] o62VarArr = this.a;
        o62VarArr.getClass();
        o62 o62Var = o62VarArr[i2];
        o62Var.getClass();
        o62 o62Var2 = o62VarArr[i];
        o62Var2.getClass();
        o62VarArr[i] = o62Var;
        o62VarArr[i2] = o62Var2;
        o62Var.B = i;
        o62Var2.B = i2;
    }
}
