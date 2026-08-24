package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oy4  reason: default package */
/* loaded from: classes.dex */
public final class oy4 {
    public final List a;
    public final yc1 b;
    public final int c;
    public final int d;
    public final int e;
    public int f;

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
        if (r11 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
        r0 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0084, code lost:
        if (r11 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
        if (r11 != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oy4(List list, yc1 yc1Var) {
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int actionMasked;
        int classification;
        int classification2;
        MotionEvent a;
        this.a = list;
        this.b = yc1Var;
        int i4 = Build.VERSION.SDK_INT;
        int i5 = 0;
        if (i4 >= 29 && (a = a()) != null) {
            i = a.getClassification();
        } else {
            i = 0;
        }
        this.c = i;
        MotionEvent a2 = a();
        if (a2 != null) {
            i2 = a2.getButtonState();
        } else {
            i2 = 0;
        }
        this.d = i2;
        MotionEvent a3 = a();
        if (a3 != null) {
            i3 = a3.getMetaState();
        } else {
            i3 = 0;
        }
        this.e = i3;
        MotionEvent a4 = a();
        if (a4 != null) {
            if (i4 >= 29) {
                classification2 = a4.getClassification();
                if (classification2 == 3) {
                    z = true;
                    if (i4 >= 29) {
                        classification = a4.getClassification();
                        if (classification == 5) {
                            z2 = true;
                            actionMasked = a4.getActionMasked();
                            if (actionMasked != 0) {
                                if (actionMasked != 1) {
                                    if (actionMasked != 2) {
                                        switch (actionMasked) {
                                            case 5:
                                                if (!z) {
                                                }
                                                i5 = 10;
                                                break;
                                            case 6:
                                                if (!z) {
                                                }
                                                i5 = 12;
                                                break;
                                            case 8:
                                                i5 = 6;
                                                break;
                                            case 9:
                                                i5 = 4;
                                                break;
                                            case 10:
                                                i5 = 5;
                                                break;
                                        }
                                    }
                                    if (z) {
                                        i5 = 11;
                                    }
                                } else {
                                    if (!z) {
                                        if (z2) {
                                            i5 = 9;
                                        }
                                        i5 = 2;
                                    }
                                    i5 = 12;
                                }
                            } else {
                                if (!z) {
                                    if (z2) {
                                        i5 = 7;
                                    }
                                    i5 = 1;
                                }
                                i5 = 10;
                            }
                        }
                    }
                    z2 = false;
                    actionMasked = a4.getActionMasked();
                    if (actionMasked != 0) {
                    }
                }
            }
            z = false;
            if (i4 >= 29) {
            }
            z2 = false;
            actionMasked = a4.getActionMasked();
            if (actionMasked != 0) {
            }
        } else {
            int size = list.size();
            while (i5 < size) {
                vy4 vy4Var = (vy4) list.get(i5);
                if (ej2.p(vy4Var)) {
                    i5 = 2;
                } else if (ej2.n(vy4Var)) {
                    i5 = 1;
                } else {
                    i5++;
                }
            }
            i5 = 3;
        }
        this.f = i5;
    }

    public final MotionEvent a() {
        yc1 yc1Var = this.b;
        if (yc1Var != null) {
            return (MotionEvent) ((ap3) yc1Var.B).L;
        }
        return null;
    }
}
