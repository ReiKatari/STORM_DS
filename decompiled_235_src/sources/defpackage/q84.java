package defpackage;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q84  reason: default package */
/* loaded from: classes.dex */
public abstract class q84 extends ga2 {
    public boolean L;
    public int R;
    public int X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final ArrayList d0;
    public final ArrayList e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q84(s03 s03Var, boolean z, u87 u87Var) {
        super(s03Var, z, u87Var);
        s03Var.getClass();
        u87Var.getClass();
        this.Y = new ArrayList();
        this.Z = new ArrayList();
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
    }

    public abstract b63 b();

    public abstract b63 c();

    public abstract b63 d();

    public abstract b63 e();

    public final void f(int i, int i2) {
        float f = i / 2.0f;
        float f2 = i2 / 2.0f;
        float min = Math.min(i, i2);
        float f3 = 0.285f * min;
        float f4 = min * 0.24f;
        float f5 = f4 * f4;
        ArrayList arrayList = this.Y;
        arrayList.clear();
        int i3 = (int) f2;
        arrayList.add(new p84(d(), new my4((int) (f + f3), i3), f5));
        int i4 = (int) f;
        arrayList.add(new p84(b(), new my4(i4, (int) (f2 + f3)), f5));
        arrayList.add(new p84(e(), new my4(i4, (int) (f2 - f3)), f5));
        arrayList.add(new p84(c(), new my4((int) (f - f3), i3), f5));
    }

    public boolean g() {
        return false;
    }

    public final void h(float f, float f2, ArrayList arrayList) {
        p84 p84Var;
        int i;
        ArrayList arrayList2 = this.Y;
        if (arrayList2.isEmpty()) {
            int i2 = this.R;
            if (i2 > 0 && (i = this.X) > 0) {
                f(i2, i);
            }
            if (arrayList2.isEmpty()) {
                return;
            }
        }
        ArrayList arrayList3 = new ArrayList(ht0.v0(arrayList2, 10));
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            arrayList3.add(new vr4((p84) obj, Float.valueOf((float) Math.sqrt(((float) Math.pow(f - p84Var.b.a, 2.0d)) + ((float) Math.pow(f2 - p84Var.b.b, 2.0d))))));
        }
        List d1 = gt0.d1(arrayList3, new zh2(23));
        vr4 vr4Var = (vr4) d1.get(0);
        Object obj2 = vr4Var.A;
        Object obj3 = vr4Var.B;
        float sqrt = (float) Math.sqrt(((p84) obj2).c);
        Number number = (Number) obj3;
        if (number.floatValue() <= 1.55f * sqrt) {
            float floatValue = number.floatValue();
            p84 p84Var2 = (p84) obj2;
            if (!arrayList.contains(p84Var2.a)) {
                arrayList.add(p84Var2.a);
            }
            int size2 = d1.size();
            for (int i4 = 1; i4 < size2; i4++) {
                vr4 vr4Var2 = (vr4) d1.get(i4);
                Object obj4 = vr4Var2.B;
                Object obj5 = vr4Var2.A;
                if (((Number) obj4).floatValue() <= 1.45f * sqrt && ((Number) vr4Var2.B).floatValue() - floatValue <= 0.7f * sqrt) {
                    p84 p84Var3 = (p84) obj5;
                    if (!arrayList.contains(p84Var3.a)) {
                        arrayList.add(p84Var3.a);
                    }
                }
            }
        }
    }

    public final void i(float f, float f2, ArrayList arrayList) {
        float f3 = f - (this.R / 2.0f);
        float f4 = f2 - (this.X / 2.0f);
        if (((float) Math.sqrt((f4 * f4) + (f3 * f3))) >= this.R * 0.1f) {
            float degrees = (float) Math.toDegrees(Math.atan2(f4, f3));
            if (degrees < RecyclerView.B1) {
                degrees += 360.0f;
            }
            if (degrees < 337.5f && degrees >= 22.5f) {
                if (22.5f <= degrees && degrees <= 67.5f) {
                    arrayList.add(d());
                    arrayList.add(b());
                    return;
                } else if (67.5f <= degrees && degrees <= 112.5f) {
                    arrayList.add(b());
                    return;
                } else if (112.5f <= degrees && degrees <= 157.5f) {
                    arrayList.add(b());
                    arrayList.add(c());
                    return;
                } else if (157.5f <= degrees && degrees <= 202.5f) {
                    arrayList.add(c());
                    return;
                } else if (202.5f <= degrees && degrees <= 247.5f) {
                    arrayList.add(c());
                    arrayList.add(e());
                    return;
                } else if (247.5f <= degrees && degrees <= 292.5f) {
                    arrayList.add(e());
                    return;
                } else if (292.5f <= degrees && degrees <= 337.5f) {
                    arrayList.add(e());
                    arrayList.add(d());
                    return;
                } else {
                    return;
                }
            }
            arrayList.add(d());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1 A[LOOP:2: B:43:0x00bf->B:44:0x00c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fb A[LOOP:4: B:54:0x00f9->B:55:0x00fb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0122  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList;
        int size;
        int i;
        int size2;
        int i2;
        int size3;
        int i3;
        int size4;
        r03 r03Var;
        s03 s03Var = this.A;
        view.getClass();
        motionEvent.getClass();
        if (!this.L || this.R != view.getWidth() || this.X != view.getHeight()) {
            this.R = view.getWidth();
            this.X = view.getHeight();
            f(view.getWidth(), view.getHeight());
            this.L = true;
        }
        ArrayList arrayList2 = this.d0;
        arrayList2.clear();
        int actionMasked = motionEvent.getActionMasked();
        int i4 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                int pointerCount = motionEvent.getPointerCount();
                                for (int i5 = 0; i5 < pointerCount; i5++) {
                                    if (i5 != actionIndex) {
                                        float x = motionEvent.getX(i5);
                                        float y = motionEvent.getY(i5);
                                        if (g()) {
                                            i(x, y, arrayList2);
                                        } else {
                                            h(x, y, arrayList2);
                                        }
                                    }
                                }
                            }
                            arrayList = this.e0;
                            arrayList.clear();
                            ArrayList arrayList3 = this.Z;
                            size = arrayList3.size();
                            i = 0;
                            while (i < size) {
                                Object obj = arrayList3.get(i);
                                i++;
                                if (!arrayList2.contains((b63) obj)) {
                                    arrayList.add(obj);
                                }
                            }
                            size2 = arrayList.size();
                            i2 = 0;
                            while (i2 < size2) {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                s03Var.b((b63) obj2);
                            }
                            if (!arrayList.isEmpty()) {
                                a(view, ea2.KEY_RELEASE);
                            }
                            arrayList.clear();
                            size3 = arrayList2.size();
                            i3 = 0;
                            while (i3 < size3) {
                                Object obj3 = arrayList2.get(i3);
                                i3++;
                                if (!arrayList3.contains((b63) obj3)) {
                                    arrayList.add(obj3);
                                }
                            }
                            size4 = arrayList.size();
                            while (i4 < size4) {
                                Object obj4 = arrayList.get(i4);
                                i4++;
                                s03Var.c((b63) obj4);
                            }
                            if (!arrayList.isEmpty()) {
                                a(view, ea2.KEY_PRESS);
                            }
                            arrayList3.clear();
                            arrayList3.addAll(arrayList2);
                            if (view instanceof r03) {
                                r03Var = (r03) view;
                            } else {
                                r03Var = null;
                            }
                            if (r03Var != null) {
                                r03Var.a(gt0.p1(arrayList2));
                            }
                            return true;
                        }
                    }
                }
            }
            arrayList2.clear();
            arrayList = this.e0;
            arrayList.clear();
            ArrayList arrayList32 = this.Z;
            size = arrayList32.size();
            i = 0;
            while (i < size) {
            }
            size2 = arrayList.size();
            i2 = 0;
            while (i2 < size2) {
            }
            if (!arrayList.isEmpty()) {
            }
            arrayList.clear();
            size3 = arrayList2.size();
            i3 = 0;
            while (i3 < size3) {
            }
            size4 = arrayList.size();
            while (i4 < size4) {
            }
            if (!arrayList.isEmpty()) {
            }
            arrayList32.clear();
            arrayList32.addAll(arrayList2);
            if (view instanceof r03) {
            }
            if (r03Var != null) {
            }
            return true;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        for (int i6 = 0; i6 < pointerCount2; i6++) {
            float x2 = motionEvent.getX(i6);
            float y2 = motionEvent.getY(i6);
            if (g()) {
                i(x2, y2, arrayList2);
            } else {
                h(x2, y2, arrayList2);
            }
        }
        arrayList = this.e0;
        arrayList.clear();
        ArrayList arrayList322 = this.Z;
        size = arrayList322.size();
        i = 0;
        while (i < size) {
        }
        size2 = arrayList.size();
        i2 = 0;
        while (i2 < size2) {
        }
        if (!arrayList.isEmpty()) {
        }
        arrayList.clear();
        size3 = arrayList2.size();
        i3 = 0;
        while (i3 < size3) {
        }
        size4 = arrayList.size();
        while (i4 < size4) {
        }
        if (!arrayList.isEmpty()) {
        }
        arrayList322.clear();
        arrayList322.addAll(arrayList2);
        if (view instanceof r03) {
        }
        if (r03Var != null) {
        }
        return true;
    }
}
