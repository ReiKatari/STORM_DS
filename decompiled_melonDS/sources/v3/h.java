package v3;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public long f13651a;

    /* renamed from: b  reason: collision with root package name */
    public final SparseLongArray f13652b = new SparseLongArray();

    /* renamed from: c  reason: collision with root package name */
    public final SparseBooleanArray f13653c = new SparseBooleanArray();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f13654d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final a1.q f13655e = new a1.q((Object) null);

    /* renamed from: f  reason: collision with root package name */
    public int f13656f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f13657g = -1;

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f13652b;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked == 9) {
                int pointerId = motionEvent.getPointerId(0);
                if (sparseLongArray.indexOfKey(pointerId) < 0) {
                    long j2 = this.f13651a;
                    this.f13651a = 1 + j2;
                    sparseLongArray.put(pointerId, j2);
                    return;
                }
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j10 = this.f13651a;
            this.f13651a = 1 + j10;
            sparseLongArray.put(pointerId2, j10);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f13653c.put(pointerId2, true);
            }
        }
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) {
            int toolType = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType == this.f13656f && source == this.f13657g) {
                return;
            }
            this.f13656f = toolType;
            this.f13657g = source;
            this.f13653c.clear();
            this.f13652b.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p1.a0 c(android.view.MotionEvent r46, b4.x r47) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.h.c(android.view.MotionEvent, b4.x):p1.a0");
    }

    public final void d(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.f13653c;
        SparseLongArray sparseLongArray = this.f13652b;
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int keyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i2 = 0;
                while (true) {
                    if (i2 < pointerCount) {
                        if (motionEvent.getPointerId(i2) == keyAt) {
                            break;
                        }
                        i2++;
                    } else {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(keyAt);
                        break;
                    }
                }
            }
        }
    }
}
