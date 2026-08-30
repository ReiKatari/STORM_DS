package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class b {
    public final MotionLayout a;
    public final sb b;
    public zz3 c;
    public final ArrayList d;
    public final zz3 e;
    public final ArrayList f;
    public final SparseArray g;
    public final HashMap h;
    public final SparseIntArray i;
    public int j;
    public int k;
    public MotionEvent l;
    public boolean m;
    public boolean n;
    public bq0 o;
    public boolean p;
    public final ka q;
    public float r;
    public float s;

    /* JADX WARN: Code restructure failed: missing block: B:81:0x017b, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.content.Context r11, androidx.constraintlayout.motion.widget.MotionLayout r12, int r13) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.b.<init>(android.content.Context, androidx.constraintlayout.motion.widget.MotionLayout, int):void");
    }

    public static int c(Context context, String str) {
        int i;
        if (str.contains("/")) {
            i = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            i = -1;
        }
        if (i == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
        }
        return i;
    }

    public final boolean a(int i, MotionLayout motionLayout) {
        zz3 zz3Var;
        if (this.o == null) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                zz3 zz3Var2 = (zz3) obj;
                int i3 = zz3Var2.n;
                if (i3 != 0 && ((zz3Var = this.c) != zz3Var2 || (zz3Var.r & 2) == 0)) {
                    if (i == zz3Var2.d && (i3 == 4 || i3 == 2)) {
                        MotionLayout.a aVar = MotionLayout.a.FINISHED;
                        motionLayout.setState(aVar);
                        motionLayout.setTransition(zz3Var2);
                        if (zz3Var2.n == 4) {
                            motionLayout.p(1.0f);
                            motionLayout.j1 = null;
                            motionLayout.setState(MotionLayout.a.SETUP);
                            motionLayout.setState(MotionLayout.a.MOVING);
                            return true;
                        }
                        motionLayout.setProgress(1.0f);
                        motionLayout.r(true);
                        motionLayout.setState(MotionLayout.a.SETUP);
                        motionLayout.setState(MotionLayout.a.MOVING);
                        motionLayout.setState(aVar);
                        motionLayout.u();
                        return true;
                    } else if (i == zz3Var2.c && (i3 == 3 || i3 == 1)) {
                        MotionLayout.a aVar2 = MotionLayout.a.FINISHED;
                        motionLayout.setState(aVar2);
                        motionLayout.setTransition(zz3Var2);
                        if (zz3Var2.n == 3) {
                            motionLayout.p(RecyclerView.A1);
                            motionLayout.setState(MotionLayout.a.SETUP);
                            motionLayout.setState(MotionLayout.a.MOVING);
                            return true;
                        }
                        motionLayout.setProgress(RecyclerView.A1);
                        motionLayout.r(true);
                        motionLayout.setState(MotionLayout.a.SETUP);
                        motionLayout.setState(MotionLayout.a.MOVING);
                        motionLayout.setState(aVar2);
                        motionLayout.u();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final uy0 b(int i) {
        int D;
        sb sbVar = this.b;
        if (sbVar != null && (D = sbVar.D(i)) != -1) {
            i = D;
        }
        SparseArray sparseArray = this.g;
        if (sparseArray.get(i) == null) {
            Log.e("MotionScene", "Warning could not find ConstraintSet id/" + b53.M(this.a.getContext(), i) + " In MotionScene");
            return (uy0) sparseArray.get(sparseArray.keyAt(0));
        }
        return (uy0) sparseArray.get(i);
    }

    public final Interpolator d() {
        zz3 zz3Var = this.c;
        int i = zz3Var.e;
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 4) {
                                if (i != 5) {
                                    if (i != 6) {
                                        return null;
                                    }
                                    return new AnticipateInterpolator();
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            return new kz3(an1.e(zz3Var.f), 1);
        }
        return AnimationUtils.loadInterpolator(this.a.getContext(), this.c.g);
    }

    public final void e(lz3 lz3Var) {
        zz3 zz3Var = this.c;
        int i = 0;
        if (zz3Var == null) {
            zz3 zz3Var2 = this.e;
            if (zz3Var2 != null) {
                ArrayList arrayList = zz3Var2.k;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((fa3) obj).a(lz3Var);
                }
                return;
            }
            return;
        }
        ArrayList arrayList2 = zz3Var.k;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            ((fa3) obj2).a(lz3Var);
        }
    }

    public final float f() {
        c cVar;
        zz3 zz3Var = this.c;
        if (zz3Var != null && (cVar = zz3Var.l) != null) {
            return cVar.t;
        }
        return RecyclerView.A1;
    }

    public final int g() {
        zz3 zz3Var = this.c;
        if (zz3Var == null) {
            return -1;
        }
        return zz3Var.d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int h(Context context, XmlResourceParser xmlResourceParser) {
        boolean z;
        boolean z2;
        uy0 uy0Var = new uy0();
        uy0Var.f = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeName = xmlResourceParser.getAttributeName(i3);
            String attributeValue = xmlResourceParser.getAttributeValue(i3);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1496482599:
                    if (attributeName.equals("deriveConstraintsFrom")) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                case -1153153640:
                    if (attributeName.equals("constraintRotate")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case 973381616:
                    if (attributeName.equals("stateLabels")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                default:
                    z = true;
                    break;
            }
            switch (z) {
                case false:
                    i2 = c(context, attributeValue);
                    break;
                case true:
                    try {
                        uy0Var.d = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue.hashCode()) {
                            case -768416914:
                                if (attributeValue.equals("x_left")) {
                                    z2 = false;
                                    break;
                                }
                                z2 = true;
                                break;
                            case 3317767:
                                if (attributeValue.equals("left")) {
                                    z2 = true;
                                    break;
                                }
                                z2 = true;
                                break;
                            case 3387192:
                                if (attributeValue.equals("none")) {
                                    z2 = true;
                                    break;
                                }
                                z2 = true;
                                break;
                            case 108511772:
                                if (attributeValue.equals("right")) {
                                    z2 = true;
                                    break;
                                }
                                z2 = true;
                                break;
                            case 1954540437:
                                if (attributeValue.equals("x_right")) {
                                    z2 = true;
                                    break;
                                }
                                z2 = true;
                                break;
                            default:
                                z2 = true;
                                break;
                        }
                        switch (z2) {
                            case false:
                                uy0Var.d = 4;
                                continue;
                            case true:
                                uy0Var.d = 2;
                                continue;
                            case true:
                                uy0Var.d = 0;
                                continue;
                            case true:
                                uy0Var.d = 1;
                                continue;
                            case true:
                                uy0Var.d = 3;
                                continue;
                        }
                    }
                    break;
                case true:
                    i = c(context, attributeValue);
                    int indexOf = attributeValue.indexOf(47);
                    if (indexOf >= 0) {
                        attributeValue = attributeValue.substring(indexOf + 1);
                    }
                    this.h.put(attributeValue, Integer.valueOf(i));
                    uy0Var.a = b53.M(context, i);
                    break;
                case true:
                    uy0Var.c = attributeValue.split(",");
                    int i4 = 0;
                    while (true) {
                        String[] strArr = uy0Var.c;
                        if (i4 < strArr.length) {
                            strArr[i4] = strArr[i4].trim();
                            i4++;
                        }
                    }
                    break;
            }
        }
        if (i != -1) {
            int i5 = this.a.H0;
            uy0Var.k(context, xmlResourceParser);
            if (i2 != -1) {
                this.i.put(i, i2);
            }
            this.g.put(i, uy0Var);
        }
        return i;
    }

    public final int i(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return h(context, xml);
                }
            }
            return -1;
        } catch (IOException e) {
            Log.e("MotionScene", "Error parsing resource: " + i, e);
            return -1;
        } catch (XmlPullParserException e2) {
            Log.e("MotionScene", "Error parsing resource: " + i, e2);
            return -1;
        }
    }

    public final void j(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), tx4.w);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                i(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void k(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), tx4.m);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.j);
                this.j = i2;
                if (i2 < 8) {
                    this.j = 8;
                }
            } else if (index == 1) {
                this.k = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void l(int i, MotionLayout motionLayout) {
        SparseArray sparseArray = this.g;
        uy0 uy0Var = (uy0) sparseArray.get(i);
        String str = uy0Var.a;
        HashMap hashMap = uy0Var.g;
        uy0Var.b = str;
        int i2 = this.i.get(i);
        if (i2 > 0) {
            l(i2, motionLayout);
            uy0 uy0Var2 = (uy0) sparseArray.get(i2);
            if (uy0Var2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + b53.M(this.a.getContext(), i2));
                return;
            }
            HashMap hashMap2 = uy0Var2.g;
            uy0Var.b += "/" + uy0Var2.b;
            for (Integer num : hashMap2.keySet()) {
                num.getClass();
                py0 py0Var = (py0) hashMap2.get(num);
                if (!hashMap.containsKey(num)) {
                    hashMap.put(num, new py0());
                }
                py0 py0Var2 = (py0) hashMap.get(num);
                if (py0Var2 != null) {
                    qy0 qy0Var = py0Var2.e;
                    if (!qy0Var.b) {
                        qy0Var.a(py0Var.e);
                    }
                    sy0 sy0Var = py0Var2.c;
                    if (!sy0Var.a) {
                        sy0 sy0Var2 = py0Var.c;
                        sy0Var.a = sy0Var2.a;
                        sy0Var.b = sy0Var2.b;
                        sy0Var.d = sy0Var2.d;
                        sy0Var.e = sy0Var2.e;
                        sy0Var.c = sy0Var2.c;
                    }
                    ty0 ty0Var = py0Var2.f;
                    if (!ty0Var.a) {
                        ty0Var.a(py0Var.f);
                    }
                    ry0 ry0Var = py0Var2.d;
                    if (!ry0Var.a) {
                        ry0Var.a(py0Var.d);
                    }
                    for (String str2 : py0Var.g.keySet()) {
                        if (!py0Var2.g.containsKey(str2)) {
                            py0Var2.g.put(str2, (ey0) py0Var.g.get(str2));
                        }
                    }
                }
            }
        } else {
            uy0Var.b = b31.q(new StringBuilder(), uy0Var.b, "  layout");
            int childCount = motionLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = motionLayout.getChildAt(i3);
                jy0 jy0Var = (jy0) childAt.getLayoutParams();
                int id = childAt.getId();
                if (uy0Var.f && id == -1) {
                    f81.w("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (!hashMap.containsKey(Integer.valueOf(id))) {
                    hashMap.put(Integer.valueOf(id), new py0());
                }
                py0 py0Var3 = (py0) hashMap.get(Integer.valueOf(id));
                if (py0Var3 != null) {
                    sy0 sy0Var3 = py0Var3.c;
                    qy0 qy0Var2 = py0Var3.e;
                    ty0 ty0Var2 = py0Var3.f;
                    if (!qy0Var2.b) {
                        py0.a(py0Var3, id, jy0Var);
                        if (childAt instanceof gy0) {
                            qy0Var2.j0 = ((gy0) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                qy0Var2.o0 = barrier.getAllowsGoneWidget();
                                qy0Var2.g0 = barrier.getType();
                                qy0Var2.h0 = barrier.getMargin();
                            }
                        }
                        qy0Var2.b = true;
                    }
                    if (!sy0Var3.a) {
                        sy0Var3.b = childAt.getVisibility();
                        sy0Var3.d = childAt.getAlpha();
                        sy0Var3.a = true;
                    }
                    if (!ty0Var2.a) {
                        ty0Var2.a = true;
                        ty0Var2.b = childAt.getRotation();
                        ty0Var2.c = childAt.getRotationX();
                        ty0Var2.d = childAt.getRotationY();
                        ty0Var2.e = childAt.getScaleX();
                        ty0Var2.f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            ty0Var2.g = pivotX;
                            ty0Var2.h = pivotY;
                        }
                        ty0Var2.j = childAt.getTranslationX();
                        ty0Var2.k = childAt.getTranslationY();
                        ty0Var2.l = childAt.getTranslationZ();
                        if (ty0Var2.m) {
                            ty0Var2.n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (py0 py0Var4 : hashMap.values()) {
            if (py0Var4.h != null) {
                if (py0Var4.b == null) {
                    py0Var4.h.e(uy0Var.i(py0Var4.a));
                } else {
                    for (Integer num2 : hashMap.keySet()) {
                        py0 i4 = uy0Var.i(num2.intValue());
                        String str3 = i4.e.l0;
                        if (str3 != null && py0Var4.b.matches(str3)) {
                            py0Var4.h.e(i4);
                            i4.g.putAll((HashMap) py0Var4.g.clone());
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r1 != (-1)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r11, int r12) {
        /*
            r10 = this;
            r0 = -1
            sb r1 = r10.b
            if (r1 == 0) goto L16
            int r2 = r1.D(r11)
            if (r2 == r0) goto Lc
            goto Ld
        Lc:
            r2 = r11
        Ld:
            int r1 = r1.D(r12)
            if (r1 == r0) goto L14
            goto L18
        L14:
            r1 = r12
            goto L18
        L16:
            r2 = r11
            goto L14
        L18:
            zz3 r3 = r10.c
            if (r3 == 0) goto L25
            int r4 = r3.c
            if (r4 != r12) goto L25
            int r3 = r3.d
            if (r3 != r11) goto L25
            goto L50
        L25:
            java.util.ArrayList r3 = r10.d
            int r4 = r3.size()
            r5 = 0
            r6 = r5
        L2d:
            if (r6 >= r4) goto L51
            java.lang.Object r7 = r3.get(r6)
            int r6 = r6 + 1
            zz3 r7 = (defpackage.zz3) r7
            int r8 = r7.c
            if (r8 != r1) goto L3f
            int r9 = r7.d
            if (r9 == r2) goto L45
        L3f:
            if (r8 != r12) goto L2d
            int r8 = r7.d
            if (r8 != r11) goto L2d
        L45:
            r10.c = r7
            androidx.constraintlayout.motion.widget.c r11 = r7.l
            if (r11 == 0) goto L50
            boolean r10 = r10.p
            r11.c(r10)
        L50:
            return
        L51:
            java.util.ArrayList r11 = r10.f
            int r4 = r11.size()
            zz3 r6 = r10.e
        L59:
            if (r5 >= r4) goto L69
            java.lang.Object r7 = r11.get(r5)
            int r5 = r5 + 1
            zz3 r7 = (defpackage.zz3) r7
            int r8 = r7.c
            if (r8 != r12) goto L59
            r6 = r7
            goto L59
        L69:
            zz3 r11 = new zz3
            r11.<init>(r10, r6)
            r11.d = r2
            r11.c = r1
            if (r2 == r0) goto L77
            r3.add(r11)
        L77:
            r10.c = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.b.m(int, int):void");
    }

    public final boolean n() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((zz3) obj).l != null) {
                return true;
            }
        }
        zz3 zz3Var = this.c;
        if (zz3Var == null || zz3Var.l == null) {
            return false;
        }
        return true;
    }
}
