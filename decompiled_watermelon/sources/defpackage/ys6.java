package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ys6  reason: default package */
/* loaded from: classes.dex */
public class ys6 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(ys6.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public x12[] a;

    public final void a(x12 x12Var) {
        x12Var.c((y12) this);
        x12[] x12VarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (x12VarArr == null) {
            x12VarArr = new x12[4];
            this.a = x12VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= x12VarArr.length) {
            x12VarArr = (x12[]) Arrays.copyOf(x12VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.a = x12VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        x12VarArr[i] = x12Var;
        x12Var.B = i;
        c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
        if (r6.compareTo(r7) < 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.x12 b(int r9) {
        /*
            r8 = this;
            x12[] r0 = r8.a
            r0.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.ys6.b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            r4.getClass()
            r5 = r0[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            x12[] r5 = r8.a
            r5.getClass()
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            r6.getClass()
            r7 = r5[r4]
            r7.getClass()
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            r4.getClass()
            r5 = r5[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            r9.getClass()
            r2 = 0
            r9.c(r2)
            r9.B = r3
            int r8 = r1.get(r8)
            r0[r8] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ys6.b(int):x12");
    }

    public final void c(int i) {
        while (i > 0) {
            x12[] x12VarArr = this.a;
            x12VarArr.getClass();
            int i2 = (i - 1) / 2;
            x12 x12Var = x12VarArr[i2];
            x12Var.getClass();
            x12 x12Var2 = x12VarArr[i];
            x12Var2.getClass();
            if (x12Var.compareTo(x12Var2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        x12[] x12VarArr = this.a;
        x12VarArr.getClass();
        x12 x12Var = x12VarArr[i2];
        x12Var.getClass();
        x12 x12Var2 = x12VarArr[i];
        x12Var2.getClass();
        x12VarArr[i] = x12Var;
        x12VarArr[i2] = x12Var2;
        x12Var.B = i;
        x12Var2.B = i2;
    }
}
