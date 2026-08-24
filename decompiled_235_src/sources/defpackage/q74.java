package defpackage;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q74  reason: default package */
/* loaded from: classes.dex */
public final class q74 {
    public long a;
    public final SparseLongArray b = new SparseLongArray();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final ArrayList d = new ArrayList();
    public final hz3 e = new hz3((Object) null);
    public int f = -1;
    public int g = -1;
    public boolean h;
    public boolean i;
    public jk4 j;

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
    */
    public final ap3 c(MotionEvent motionEvent, te teVar) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        int classification;
        float rawX;
        float rawY;
        boolean z4;
        boolean z5;
        int classification2;
        int classification3;
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.c;
        if (actionMasked != 3 && actionMasked != 4) {
            b(motionEvent);
            a(motionEvent);
            if (actionMasked != 9 && actionMasked != 7 && actionMasked != 10) {
                z = false;
            } else {
                z = true;
            }
            if (actionMasked == 8) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
            }
            if (actionMasked != 1) {
                if (actionMasked != 6) {
                    actionIndex = -1;
                } else {
                    actionIndex = motionEvent.getActionIndex();
                }
                i = actionIndex;
            } else {
                i = 0;
            }
            ArrayList arrayList = this.d;
            arrayList.clear();
            if (motionEvent.getActionMasked() == 0) {
                if (Build.VERSION.SDK_INT >= 34) {
                    classification2 = motionEvent.getClassification();
                    if (classification2 != 3) {
                        classification3 = motionEvent.getClassification();
                    }
                    z4 = true;
                    if (motionEvent.getButtonState() != 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584))) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z4 || z5) {
                        this.h = true;
                    }
                }
                z4 = false;
                if (motionEvent.getButtonState() != 0) {
                }
                z5 = false;
                if (!z4) {
                }
                this.h = true;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                classification = motionEvent.getClassification();
                if (classification == 3) {
                    this.i = true;
                    if (motionEvent.getActionMasked() == 0) {
                        rawX = motionEvent.getRawX(0);
                        rawY = motionEvent.getRawY(0);
                        this.j = new jk4((Float.floatToRawIntBits(rawY) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32));
                    }
                    arrayList.add(d(teVar, motionEvent, this.j, 0, false));
                    if (motionEvent.getActionMasked() == 1) {
                        this.h = false;
                        this.i = false;
                        this.j = null;
                    }
                    e(motionEvent);
                    motionEvent.getEventTime();
                    return new ap3(15, arrayList, motionEvent);
                }
            }
            this.i = false;
            int pointerCount = motionEvent.getPointerCount();
            for (int i2 = 0; i2 < pointerCount; i2++) {
                if (!z && i2 != i && (!z2 || motionEvent.getButtonState() != 0)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                arrayList.add(d(teVar, motionEvent, null, i2, z3));
            }
            if (motionEvent.getActionMasked() == 1) {
            }
            e(motionEvent);
            motionEvent.getEventTime();
            return new ap3(15, arrayList, motionEvent);
        }
        this.b.clear();
        sparseBooleanArray.clear();
        this.h = false;
        this.i = false;
        this.j = null;
        return null;
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
    */
    public final xy4 d(te teVar, MotionEvent motionEvent, jk4 jk4Var, int i, boolean z) {
        long j;
        char c;
        long j2;
        long r;
        long j3;
        float rawX;
        float rawY;
        long floatToRawIntBits;
        long D;
        int toolType;
        int i2;
        int historySize;
        int i3;
        Float f;
        long j4;
        float f2;
        long j5;
        int i4;
        long j6;
        int classification;
        int classification2;
        int i5;
        int classification3;
        int pointerId = motionEvent.getPointerId(i);
        SparseLongArray sparseLongArray = this.b;
        int indexOfKey = sparseLongArray.indexOfKey(pointerId);
        if (indexOfKey >= 0) {
            j = sparseLongArray.valueAt(indexOfKey);
        } else {
            long j7 = this.a;
            this.a = 1 + j7;
            sparseLongArray.put(pointerId, j7);
            j = j7;
        }
        float pressure = motionEvent.getPressure(i);
        float x = motionEvent.getX(i);
        float y = motionEvent.getY(i);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(y) & 4294967295L) | (Float.floatToRawIntBits(x) << 32);
        if (i == 0) {
            if (jk4Var != null) {
                r = jk4Var.a;
                c = ' ';
                j2 = 4294967295L;
            } else {
                float rawX2 = motionEvent.getRawX();
                float rawY2 = motionEvent.getRawY();
                long floatToRawIntBits3 = Float.floatToRawIntBits(rawX2);
                int floatToRawIntBits4 = Float.floatToRawIntBits(rawY2);
                c = ' ';
                j2 = 4294967295L;
                r = (floatToRawIntBits3 << 32) | (floatToRawIntBits4 & 4294967295L);
            }
            D = teVar.D(r);
        } else {
            c = ' ';
            j2 = 4294967295L;
            if (Build.VERSION.SDK_INT >= 29) {
                if (jk4Var == null) {
                    rawX = motionEvent.getRawX(i);
                    rawY = motionEvent.getRawY(i);
                    floatToRawIntBits = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
                } else {
                    floatToRawIntBits = jk4Var.a;
                }
                r = floatToRawIntBits;
                D = teVar.D(r);
            } else {
                r = teVar.r(floatToRawIntBits2);
                j3 = floatToRawIntBits2;
                toolType = motionEvent.getToolType(i);
                if (toolType != 0) {
                    int i6 = 2;
                    if (toolType != 1) {
                        if (toolType != 2) {
                            if (toolType != 3) {
                                i6 = 4;
                            }
                            i2 = i6;
                        } else {
                            i2 = 3;
                        }
                    } else {
                        if ((!motionEvent.isFromSource(8194) && !motionEvent.isFromSource(1048584)) || (this.h && !this.i)) {
                            i2 = 1;
                        }
                        i2 = i6;
                    }
                    ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    char c2 = c;
                    i3 = 0;
                    while (true) {
                        f = null;
                        j4 = 0;
                        f2 = 1.0f;
                        if (i3 >= historySize) {
                            break;
                        }
                        float historicalX = motionEvent.getHistoricalX(i, i3);
                        float historicalY = motionEvent.getHistoricalY(i, i3);
                        if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) < 2139095040) {
                            long floatToRawIntBits5 = Float.floatToRawIntBits(historicalX);
                            int floatToRawIntBits6 = Float.floatToRawIntBits(historicalY);
                            i5 = historySize;
                            long j8 = (floatToRawIntBits5 << c2) | (floatToRawIntBits6 & j2);
                            long historicalEventTime = motionEvent.getHistoricalEventTime(i3);
                            float historicalAxisValue = motionEvent.getHistoricalAxisValue(52, i, i3);
                            Float valueOf = Float.valueOf(historicalAxisValue);
                            if (historicalAxisValue > RecyclerView.B1) {
                                f = valueOf;
                            }
                            if (f != null) {
                                f2 = f.floatValue();
                            }
                            float f3 = f2;
                            if (Build.VERSION.SDK_INT >= 29) {
                                classification3 = motionEvent.getClassification();
                                if (classification3 == 3) {
                                    float historicalAxisValue2 = motionEvent.getHistoricalAxisValue(50, i, i3);
                                    float historicalAxisValue3 = motionEvent.getHistoricalAxisValue(51, i, i3);
                                    j4 = (Float.floatToRawIntBits(historicalAxisValue2) << c2) | (Float.floatToRawIntBits(historicalAxisValue3) & j2);
                                }
                            }
                            arrayList.add(new vx2(historicalEventTime, j8, f3, j4, j8));
                        } else {
                            i5 = historySize;
                        }
                        i3++;
                        historySize = i5;
                    }
                    if (motionEvent.getActionMasked() == 8) {
                        float axisValue = motionEvent.getAxisValue(10);
                        float f4 = (-motionEvent.getAxisValue(9)) + RecyclerView.B1;
                        j5 = (Float.floatToRawIntBits(axisValue) << c2) | (Float.floatToRawIntBits(f4) & j2);
                    } else {
                        j5 = 0;
                    }
                    i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 29) {
                        classification2 = motionEvent.getClassification();
                        if (classification2 == 5) {
                            float axisValue2 = motionEvent.getAxisValue(52, i);
                            Float valueOf2 = Float.valueOf(axisValue2);
                            if (axisValue2 > RecyclerView.B1) {
                                f = valueOf2;
                            }
                            if (f != null) {
                                f2 = f.floatValue();
                            }
                        }
                    }
                    float f5 = f2;
                    if (i4 >= 29) {
                        classification = motionEvent.getClassification();
                        if (classification == 3) {
                            float axisValue3 = motionEvent.getAxisValue(50, i);
                            float axisValue4 = motionEvent.getAxisValue(51, i);
                            j6 = floatToRawIntBits2;
                            j4 = (Float.floatToRawIntBits(axisValue3) << c2) | (Float.floatToRawIntBits(axisValue4) & j2);
                            return new xy4(j, motionEvent.getEventTime(), r, j3, z, pressure, i2, this.c.get(motionEvent.getPointerId(i), false), arrayList, j5, f5, j4, j6);
                        }
                    }
                    j6 = floatToRawIntBits2;
                    return new xy4(j, motionEvent.getEventTime(), r, j3, z, pressure, i2, this.c.get(motionEvent.getPointerId(i), false), arrayList, j5, f5, j4, j6);
                }
                i2 = 0;
                ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                char c22 = c;
                i3 = 0;
                while (true) {
                    f = null;
                    j4 = 0;
                    f2 = 1.0f;
                    if (i3 >= historySize) {
                    }
                    i3++;
                    historySize = i5;
                }
                if (motionEvent.getActionMasked() == 8) {
                }
                i4 = Build.VERSION.SDK_INT;
                if (i4 >= 29) {
                }
                float f52 = f2;
                if (i4 >= 29) {
                }
                j6 = floatToRawIntBits2;
                return new xy4(j, motionEvent.getEventTime(), r, j3, z, pressure, i2, this.c.get(motionEvent.getPointerId(i), false), arrayList2, j5, f52, j4, j6);
            }
        }
        j3 = D;
        toolType = motionEvent.getToolType(i);
        if (toolType != 0) {
        }
        i2 = 0;
        ArrayList arrayList22 = new ArrayList(motionEvent.getHistorySize());
        historySize = motionEvent.getHistorySize();
        char c222 = c;
        i3 = 0;
        while (true) {
            f = null;
            j4 = 0;
            f2 = 1.0f;
            if (i3 >= historySize) {
            }
            i3++;
            historySize = i5;
        }
        if (motionEvent.getActionMasked() == 8) {
        }
        i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
        }
        float f522 = f2;
        if (i4 >= 29) {
        }
        j6 = floatToRawIntBits2;
        return new xy4(j, motionEvent.getEventTime(), r, j3, z, pressure, i2, this.c.get(motionEvent.getPointerId(i), false), arrayList22, j5, f522, j4, j6);
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
