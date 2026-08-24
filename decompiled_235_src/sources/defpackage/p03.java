package defpackage;

import android.view.MotionEvent;
import android.view.View;
import me.magnum.melonds.MelonEmulator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p03  reason: default package */
/* loaded from: classes.dex */
public final class p03 extends h20 {
    public final /* synthetic */ int B;
    public final my4 L;
    public boolean R;
    public int X;

    public p03(s03 s03Var, int i) {
        this.B = i;
        switch (i) {
            case 1:
                s03Var.getClass();
                this.A = s03Var;
                this.L = new my4(0, 0);
                this.X = -1;
                return;
            default:
                s03Var.getClass();
                this.A = s03Var;
                this.L = new my4(0, 0);
                this.X = -1;
                return;
        }
    }

    public static int b(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int toolType = motionEvent.getToolType(i);
            if (toolType == 2 || toolType == 4) {
                return motionEvent.getPointerId(i);
            }
        }
        return motionEvent.getPointerId(motionEvent.getActionIndex());
    }

    public static int c(MotionEvent motionEvent, float f) {
        int toolType;
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            if (motionEvent.getY(i) >= f && ((toolType = motionEvent.getToolType(i)) == 2 || toolType == 4)) {
                return motionEvent.getPointerId(i);
            }
        }
        int pointerCount2 = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount2; i2++) {
            if (motionEvent.getY(i2) >= f) {
                return motionEvent.getPointerId(i2);
            }
        }
        return -1;
    }

    public void a() {
        if (this.R) {
            this.A.b(b63.TOUCHSCREEN);
            MelonEmulator.a.onScreenRelease();
            this.R = false;
            this.X = -1;
        }
    }

    public my4 d(MotionEvent motionEvent, int i, int i2) {
        int i3;
        float y;
        float f;
        int pointerCount = motionEvent.getPointerCount();
        int i4 = 0;
        while (true) {
            if (i4 < pointerCount) {
                int toolType = motionEvent.getToolType(i4);
                if (toolType == 2 || toolType == 4) {
                    break;
                }
                i4++;
            } else {
                i4 = -1;
                break;
            }
        }
        if (i4 != -1) {
            f = motionEvent.getX(i4);
            y = motionEvent.getY(i4);
        } else {
            int i5 = this.X;
            if (i5 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i5);
                Integer valueOf = Integer.valueOf(findPointerIndex);
                if (findPointerIndex < 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    i3 = valueOf.intValue();
                    float x = motionEvent.getX(i3);
                    y = motionEvent.getY(i3);
                    f = x;
                }
            }
            i3 = 0;
            float x2 = motionEvent.getX(i3);
            y = motionEvent.getY(i3);
            f = x2;
        }
        int q = gi2.q((int) ((f / i) * 256.0f), 0, 255);
        my4 my4Var = this.L;
        my4Var.a = q;
        my4Var.b = gi2.q((int) ((y / i2) * 192.0f), 0, 191);
        return my4Var;
    }

    public my4 e(MotionEvent motionEvent, int i, int i2, float f) {
        int i3;
        float y;
        float f2;
        int toolType;
        int pointerCount = motionEvent.getPointerCount();
        int i4 = 0;
        while (true) {
            if (i4 < pointerCount) {
                if (motionEvent.getY(i4) >= f && ((toolType = motionEvent.getToolType(i4)) == 2 || toolType == 4)) {
                    break;
                }
                i4++;
            } else {
                i4 = -1;
                break;
            }
        }
        if (i4 != -1) {
            f2 = motionEvent.getX(i4);
            y = motionEvent.getY(i4);
        } else {
            int i5 = this.X;
            if (i5 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i5);
                Integer valueOf = Integer.valueOf(findPointerIndex);
                if (findPointerIndex < 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    i3 = valueOf.intValue();
                    float x = motionEvent.getX(i3);
                    y = motionEvent.getY(i3);
                    f2 = x;
                }
            }
            i3 = 0;
            float x2 = motionEvent.getX(i3);
            y = motionEvent.getY(i3);
            f2 = x2;
        }
        float f3 = i2 - f;
        if (f3 < 1.0f) {
            f3 = 1.0f;
        }
        int q = gi2.q((int) ((f2 / i) * 256.0f), 0, 255);
        my4 my4Var = this.L;
        my4Var.a = q;
        my4Var.b = gi2.q((int) (((y - f) / f3) * 192.0f), 0, 191);
        return my4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0183  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int toolType;
        int toolType2;
        int i2 = 0;
        int i3 = -1;
        switch (this.B) {
            case 0:
                s03 s03Var = this.A;
                view.getClass();
                motionEvent.getClass();
                float height = view.getHeight() / 2.0f;
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked != 5) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (this.X == motionEvent.getPointerId(actionIndex)) {
                                            if (motionEvent.getPointerCount() - 1 > 0) {
                                                int pointerCount = motionEvent.getPointerCount();
                                                for (int i4 = 0; i4 < pointerCount; i4++) {
                                                    if (i4 != actionIndex && motionEvent.getY(i4) >= height && ((toolType = motionEvent.getToolType(i4)) == 2 || toolType == 4)) {
                                                        i = motionEvent.getPointerId(i4);
                                                        this.X = i;
                                                        if (i == -1) {
                                                            s03Var.a(e(motionEvent, view.getWidth(), view.getHeight(), height));
                                                        } else {
                                                            a();
                                                        }
                                                    }
                                                }
                                                int pointerCount2 = motionEvent.getPointerCount();
                                                while (true) {
                                                    if (i2 < pointerCount2) {
                                                        if (i2 != actionIndex && motionEvent.getY(i2) >= height) {
                                                            i = motionEvent.getPointerId(i2);
                                                        } else {
                                                            i2++;
                                                        }
                                                    } else {
                                                        i = -1;
                                                    }
                                                }
                                                this.X = i;
                                                if (i == -1) {
                                                }
                                            } else {
                                                a();
                                            }
                                        }
                                    }
                                } else {
                                    int c = c(motionEvent, height);
                                    if (c != -1) {
                                        this.X = c;
                                        if (this.R) {
                                            s03Var.a(e(motionEvent, view.getWidth(), view.getHeight(), height));
                                        } else {
                                            this.R = true;
                                            s03Var.c(b63.TOUCHSCREEN);
                                            s03Var.a(e(motionEvent, view.getWidth(), view.getHeight(), height));
                                        }
                                    }
                                }
                            }
                        } else if (this.R) {
                            s03Var.a(e(motionEvent, view.getWidth(), view.getHeight(), height));
                        }
                    }
                    a();
                } else {
                    int c2 = c(motionEvent, height);
                    if (c2 != -1) {
                        this.R = true;
                        this.X = c2;
                        s03Var.c(b63.TOUCHSCREEN);
                        s03Var.a(e(motionEvent, view.getWidth(), view.getHeight(), height));
                    }
                }
                return true;
            default:
                s03 s03Var2 = this.A;
                view.getClass();
                motionEvent.getClass();
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    MelonEmulator melonEmulator = MelonEmulator.a;
                    if (actionMasked2 != 1) {
                        if (actionMasked2 != 2) {
                            if (actionMasked2 != 3) {
                                if (actionMasked2 != 5) {
                                    if (actionMasked2 == 6) {
                                        int actionIndex2 = motionEvent.getActionIndex();
                                        if (this.X == motionEvent.getPointerId(actionIndex2)) {
                                            if (motionEvent.getPointerCount() - 1 > 0) {
                                                int pointerCount3 = motionEvent.getPointerCount();
                                                for (int i5 = 0; i5 < pointerCount3; i5++) {
                                                    if (i5 != actionIndex2 && ((toolType2 = motionEvent.getToolType(i5)) == 2 || toolType2 == 4)) {
                                                        i3 = motionEvent.getPointerId(i5);
                                                        this.X = i3;
                                                        s03Var2.a(d(motionEvent, view.getWidth(), view.getHeight()));
                                                    }
                                                }
                                                int pointerCount4 = motionEvent.getPointerCount();
                                                while (true) {
                                                    if (i2 < pointerCount4) {
                                                        if (i2 != actionIndex2) {
                                                            i3 = motionEvent.getPointerId(i2);
                                                        } else {
                                                            i2++;
                                                        }
                                                    }
                                                }
                                                this.X = i3;
                                                s03Var2.a(d(motionEvent, view.getWidth(), view.getHeight()));
                                            } else if (this.R) {
                                                s03Var2.b(b63.TOUCHSCREEN);
                                                melonEmulator.onScreenRelease();
                                                this.R = false;
                                                this.X = -1;
                                            }
                                        }
                                    }
                                } else {
                                    this.X = b(motionEvent);
                                    if (this.R) {
                                        s03Var2.a(d(motionEvent, view.getWidth(), view.getHeight()));
                                    } else {
                                        this.R = true;
                                        s03Var2.c(b63.TOUCHSCREEN);
                                        s03Var2.a(d(motionEvent, view.getWidth(), view.getHeight()));
                                    }
                                }
                            }
                        } else if (this.R) {
                            s03Var2.a(d(motionEvent, view.getWidth(), view.getHeight()));
                        }
                    }
                    if (this.R) {
                        s03Var2.b(b63.TOUCHSCREEN);
                        melonEmulator.onScreenRelease();
                        this.R = false;
                        this.X = -1;
                    }
                } else {
                    this.R = true;
                    this.X = b(motionEvent);
                    s03Var2.c(b63.TOUCHSCREEN);
                    s03Var2.a(d(motionEvent, view.getWidth(), view.getHeight()));
                }
                return true;
        }
    }
}
