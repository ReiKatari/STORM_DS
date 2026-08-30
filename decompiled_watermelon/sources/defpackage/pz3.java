package defpackage;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pz3  reason: default package */
/* loaded from: classes.dex */
public final class pz3 {
    public long a;
    public final SparseLongArray b = new SparseLongArray();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final ArrayList d = new ArrayList();
    public final cs3 e = new cs3((Object) null);
    public int f = -1;
    public int g = -1;
    public boolean h;
    public boolean i;
    public mb4 j;

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.b;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked == 9) {
                int pointerId = motionEvent.getPointerId(0);
                if (sparseLongArray.indexOfKey(pointerId) < 0) {
                    long j = this.a;
                    this.a = 1 + j;
                    sparseLongArray.put(pointerId, j);
                    return;
                }
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j2 = this.a;
            this.a = 1 + j2;
            sparseLongArray.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.c.put(pointerId2, true);
            }
        }
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) {
            int toolType = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType == this.f && source == this.g) {
                return;
            }
            this.f = toolType;
            this.g = source;
            this.c.clear();
            this.b.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0062, code lost:
        if (r0 == 5) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ci3 c(android.view.MotionEvent r15, defpackage.ee r16) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz3.c(android.view.MotionEvent, ee):ci3");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b3, code lost:
        if (r1 != 4) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0182 A[EDGE_INSN: B:84:0x0182->B:62:0x0182 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.tp4 d(defpackage.ee r43, android.view.MotionEvent r44, defpackage.mb4 r45, int r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz3.d(ee, android.view.MotionEvent, mb4, int, boolean):tp4");
    }

    public final void e(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.c;
        SparseLongArray sparseLongArray = this.b;
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
                int i = 0;
                while (true) {
                    if (i < pointerCount) {
                        if (motionEvent.getPointerId(i) == keyAt) {
                            break;
                        }
                        i++;
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
