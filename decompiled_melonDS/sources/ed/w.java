package ed;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import zc.o0;
import zc.p0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class w {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4469b = AtomicIntegerFieldUpdater.newUpdater(w.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a  reason: collision with root package name */
    public o0[] f4470a;

    public final void a(o0 o0Var) {
        o0Var.c((p0) this);
        o0[] o0VarArr = this.f4470a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4469b;
        if (o0VarArr == null) {
            o0VarArr = new o0[4];
            this.f4470a = o0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= o0VarArr.length) {
            o0VarArr = (o0[]) Arrays.copyOf(o0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.f4470a = o0VarArr;
        }
        int i2 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i2 + 1);
        o0VarArr[i2] = o0Var;
        o0Var.B = i2;
        c(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
        if (r6.compareTo(r7) < 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final zc.o0 b(int r9) {
        /*
            r8 = this;
            zc.o0[] r0 = r8.f4470a
            r0.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = ed.w.f4469b
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
            zc.o0[] r5 = r8.f4470a
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
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ed.w.b(int):zc.o0");
    }

    public final void c(int i2) {
        while (i2 > 0) {
            o0[] o0VarArr = this.f4470a;
            o0VarArr.getClass();
            int i10 = (i2 - 1) / 2;
            o0 o0Var = o0VarArr[i10];
            o0Var.getClass();
            o0 o0Var2 = o0VarArr[i2];
            o0Var2.getClass();
            if (o0Var.compareTo(o0Var2) <= 0) {
                return;
            }
            d(i2, i10);
            i2 = i10;
        }
    }

    public final void d(int i2, int i10) {
        o0[] o0VarArr = this.f4470a;
        o0VarArr.getClass();
        o0 o0Var = o0VarArr[i10];
        o0Var.getClass();
        o0 o0Var2 = o0VarArr[i2];
        o0Var2.getClass();
        o0VarArr[i2] = o0Var;
        o0VarArr[i10] = o0Var2;
        o0Var.B = i2;
        o0Var2.B = i10;
    }
}
