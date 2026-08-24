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
import com.stormds.emulator.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class b {
    public final MotionLayout a;
    public final zb b;
    public b84 c;
    public final ArrayList d;
    public final b84 e;
    public final ArrayList f;
    public final SparseArray g;
    public final HashMap h;
    public final SparseIntArray i;
    public int j;
    public int k;
    public MotionEvent l;
    public boolean m;
    public boolean n;
    public os0 o;
    public boolean p;
    public final pa q;
    public float r;
    public float s;

    /* JADX WARN: Code restructure failed: missing block: B:81:0x017b, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(Context context, MotionLayout motionLayout, int i) {
        this.b = null;
        this.c = null;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = null;
        this.f = new ArrayList();
        this.g = new SparseArray();
        this.h = new HashMap();
        this.i = new SparseIntArray();
        this.j = 400;
        this.k = 0;
        this.m = false;
        this.n = false;
        this.a = motionLayout;
        this.q = new pa(motionLayout);
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            b84 b84Var = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                h(context, xml);
                                continue;
                            } else {
                                continue;
                            }
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                yg3 yg3Var = new yg3(context, xml);
                                if (b84Var != null) {
                                    b84Var.k.add(yg3Var);
                                    continue;
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        case -687739768:
                            if (!name.equals("Include")) {
                                continue;
                            }
                            j(context, xml);
                            continue;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                yp7 yp7Var = new yp7(context, xml);
                                pa paVar = this.q;
                                ((ArrayList) paVar.L).add(yp7Var);
                                paVar.R = null;
                                int i2 = yp7Var.b;
                                if (i2 == 4) {
                                    pa.n(yp7Var);
                                    continue;
                                } else if (i2 == 5) {
                                    pa.n(yp7Var);
                                    continue;
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        case 269306229:
                            if (name.equals("Transition")) {
                                b84Var = new b84(this, context, xml);
                                boolean z = b84Var.b;
                                arrayList.add(b84Var);
                                if (this.c == null && !z) {
                                    this.c = b84Var;
                                    c cVar = b84Var.l;
                                    if (cVar != null) {
                                        cVar.c(this.p);
                                    }
                                }
                                if (z) {
                                    if (b84Var.c == -1) {
                                        this.e = b84Var;
                                    } else {
                                        this.f.add(b84Var);
                                    }
                                    arrayList.remove(b84Var);
                                    continue;
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        case 312750793:
                            if (name.equals("OnClick") && b84Var != null && !motionLayout.isInEditMode()) {
                                b84Var.m.add(new a84(context, b84Var, xml));
                                continue;
                            }
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                if (b84Var == null) {
                                    Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i) + ".xml:" + xml.getLineNumber() + ")");
                                }
                                if (b84Var != null) {
                                    b84Var.l = new c(context, motionLayout, xml);
                                    continue;
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                k(context, xml);
                                continue;
                            } else {
                                continue;
                            }
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                this.b = new zb(context, xml);
                                continue;
                            } else {
                                continue;
                            }
                        case 1942574248:
                            if (name.equals("include")) {
                                j(context, xml);
                                continue;
                            } else {
                                continue;
                            }
                    }
                }
            }
        } catch (IOException e) {
            Log.e("MotionScene", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("MotionScene", "Error parsing resource: " + i, e2);
        }
        this.g.put(R.id.motion_base, new z11());
        this.h.put("motion_base", Integer.valueOf((int) R.id.motion_base));
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
        b84 b84Var;
        if (this.o == null) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                b84 b84Var2 = (b84) obj;
                int i3 = b84Var2.n;
                if (i3 != 0 && ((b84Var = this.c) != b84Var2 || (b84Var.r & 2) == 0)) {
                    if (i == b84Var2.d && (i3 == 4 || i3 == 2)) {
                        MotionLayout.a aVar = MotionLayout.a.FINISHED;
                        motionLayout.setState(aVar);
                        motionLayout.setTransition(b84Var2);
                        if (b84Var2.n == 4) {
                            motionLayout.p(1.0f);
                            motionLayout.k1 = null;
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
                    } else if (i == b84Var2.c && (i3 == 3 || i3 == 1)) {
                        MotionLayout.a aVar2 = MotionLayout.a.FINISHED;
                        motionLayout.setState(aVar2);
                        motionLayout.setTransition(b84Var2);
                        if (b84Var2.n == 3) {
                            motionLayout.p(RecyclerView.B1);
                            motionLayout.setState(MotionLayout.a.SETUP);
                            motionLayout.setState(MotionLayout.a.MOVING);
                            return true;
                        }
                        motionLayout.setProgress(RecyclerView.B1);
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

    public final z11 b(int i) {
        int C;
        zb zbVar = this.b;
        if (zbVar != null && (C = zbVar.C(i)) != -1) {
            i = C;
        }
        SparseArray sparseArray = this.g;
        if (sparseArray.get(i) == null) {
            Log.e("MotionScene", "Warning could not find ConstraintSet id/" + lb4.x(this.a.getContext(), i) + " In MotionScene");
            return (z11) sparseArray.get(sparseArray.keyAt(0));
        }
        return (z11) sparseArray.get(i);
    }

    public final Interpolator d() {
        b84 b84Var = this.c;
        int i = b84Var.e;
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
            return new l74(gr1.c(b84Var.f), 1);
        }
        return AnimationUtils.loadInterpolator(this.a.getContext(), this.c.g);
    }

    public final void e(m74 m74Var) {
        b84 b84Var = this.c;
        int i = 0;
        if (b84Var == null) {
            b84 b84Var2 = this.e;
            if (b84Var2 != null) {
                ArrayList arrayList = b84Var2.k;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((yg3) obj).a(m74Var);
                }
                return;
            }
            return;
        }
        ArrayList arrayList2 = b84Var.k;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            ((yg3) obj2).a(m74Var);
        }
    }

    public final float f() {
        c cVar;
        b84 b84Var = this.c;
        if (b84Var != null && (cVar = b84Var.l) != null) {
            return cVar.t;
        }
        return RecyclerView.B1;
    }

    public final int g() {
        b84 b84Var = this.c;
        if (b84Var == null) {
            return -1;
        }
        return b84Var.d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int h(Context context, XmlResourceParser xmlResourceParser) {
        boolean z;
        boolean z2;
        z11 z11Var = new z11();
        z11Var.f = false;
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
                        z11Var.d = Integer.parseInt(attributeValue);
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
                                z11Var.d = 4;
                                continue;
                            case true:
                                z11Var.d = 2;
                                continue;
                            case true:
                                z11Var.d = 0;
                                continue;
                            case true:
                                z11Var.d = 1;
                                continue;
                            case true:
                                z11Var.d = 3;
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
                    z11Var.a = lb4.x(context, i);
                    break;
                case true:
                    z11Var.c = attributeValue.split(",");
                    int i4 = 0;
                    while (true) {
                        String[] strArr = z11Var.c;
                        if (i4 < strArr.length) {
                            strArr[i4] = strArr[i4].trim();
                            i4++;
                        }
                    }
                    break;
            }
        }
        if (i != -1) {
            int i5 = this.a.I0;
            z11Var.k(context, xmlResourceParser);
            if (i2 != -1) {
                this.i.put(i, i2);
            }
            this.g.put(i, z11Var);
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), e75.w);
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), e75.m);
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
        z11 z11Var = (z11) sparseArray.get(i);
        String str = z11Var.a;
        HashMap hashMap = z11Var.g;
        z11Var.b = str;
        int i2 = this.i.get(i);
        if (i2 > 0) {
            l(i2, motionLayout);
            z11 z11Var2 = (z11) sparseArray.get(i2);
            if (z11Var2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + lb4.x(this.a.getContext(), i2));
                return;
            }
            HashMap hashMap2 = z11Var2.g;
            z11Var.b += "/" + z11Var2.b;
            for (Integer num : hashMap2.keySet()) {
                num.getClass();
                u11 u11Var = (u11) hashMap2.get(num);
                if (!hashMap.containsKey(num)) {
                    hashMap.put(num, new u11());
                }
                u11 u11Var2 = (u11) hashMap.get(num);
                if (u11Var2 != null) {
                    v11 v11Var = u11Var2.e;
                    if (!v11Var.b) {
                        v11Var.a(u11Var.e);
                    }
                    x11 x11Var = u11Var2.c;
                    if (!x11Var.a) {
                        x11 x11Var2 = u11Var.c;
                        x11Var.a = x11Var2.a;
                        x11Var.b = x11Var2.b;
                        x11Var.d = x11Var2.d;
                        x11Var.e = x11Var2.e;
                        x11Var.c = x11Var2.c;
                    }
                    y11 y11Var = u11Var2.f;
                    if (!y11Var.a) {
                        y11Var.a(u11Var.f);
                    }
                    w11 w11Var = u11Var2.d;
                    if (!w11Var.a) {
                        w11Var.a(u11Var.d);
                    }
                    for (String str2 : u11Var.g.keySet()) {
                        if (!u11Var2.g.containsKey(str2)) {
                            u11Var2.g.put(str2, (j11) u11Var.g.get(str2));
                        }
                    }
                }
            }
        } else {
            z11Var.b = i61.n(new StringBuilder(), z11Var.b, "  layout");
            int childCount = motionLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = motionLayout.getChildAt(i3);
                o11 o11Var = (o11) childAt.getLayoutParams();
                int id = childAt.getId();
                if (z11Var.f && id == -1) {
                    u34.j("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (!hashMap.containsKey(Integer.valueOf(id))) {
                    hashMap.put(Integer.valueOf(id), new u11());
                }
                u11 u11Var3 = (u11) hashMap.get(Integer.valueOf(id));
                if (u11Var3 != null) {
                    x11 x11Var3 = u11Var3.c;
                    v11 v11Var2 = u11Var3.e;
                    y11 y11Var2 = u11Var3.f;
                    if (!v11Var2.b) {
                        u11.a(u11Var3, id, o11Var);
                        if (childAt instanceof l11) {
                            v11Var2.j0 = ((l11) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                v11Var2.o0 = barrier.getAllowsGoneWidget();
                                v11Var2.g0 = barrier.getType();
                                v11Var2.h0 = barrier.getMargin();
                            }
                        }
                        v11Var2.b = true;
                    }
                    if (!x11Var3.a) {
                        x11Var3.b = childAt.getVisibility();
                        x11Var3.d = childAt.getAlpha();
                        x11Var3.a = true;
                    }
                    if (!y11Var2.a) {
                        y11Var2.a = true;
                        y11Var2.b = childAt.getRotation();
                        y11Var2.c = childAt.getRotationX();
                        y11Var2.d = childAt.getRotationY();
                        y11Var2.e = childAt.getScaleX();
                        y11Var2.f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            y11Var2.g = pivotX;
                            y11Var2.h = pivotY;
                        }
                        y11Var2.j = childAt.getTranslationX();
                        y11Var2.k = childAt.getTranslationY();
                        y11Var2.l = childAt.getTranslationZ();
                        if (y11Var2.m) {
                            y11Var2.n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (u11 u11Var4 : hashMap.values()) {
            if (u11Var4.h != null) {
                if (u11Var4.b == null) {
                    u11Var4.h.e(z11Var.i(u11Var4.a));
                } else {
                    for (Integer num2 : hashMap.keySet()) {
                        u11 i4 = z11Var.i(num2.intValue());
                        String str3 = i4.e.l0;
                        if (str3 != null && u11Var4.b.matches(str3)) {
                            u11Var4.h.e(i4);
                            i4.g.putAll((HashMap) u11Var4.g.clone());
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
    */
    public final void m(int i, int i2) {
        int i3;
        int i4;
        zb zbVar = this.b;
        if (zbVar != null) {
            i3 = zbVar.C(i);
            if (i3 == -1) {
                i3 = i;
            }
            i4 = zbVar.C(i2);
        } else {
            i3 = i;
        }
        i4 = i2;
        b84 b84Var = this.c;
        if (b84Var == null || b84Var.c != i2 || b84Var.d != i) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i5 = 0;
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                b84 b84Var2 = (b84) obj;
                int i7 = b84Var2.c;
                if ((i7 == i4 && b84Var2.d == i3) || (i7 == i2 && b84Var2.d == i)) {
                    this.c = b84Var2;
                    c cVar = b84Var2.l;
                    if (cVar != null) {
                        cVar.c(this.p);
                        return;
                    }
                    return;
                }
            }
            ArrayList arrayList2 = this.f;
            int size2 = arrayList2.size();
            b84 b84Var3 = this.e;
            while (i5 < size2) {
                Object obj2 = arrayList2.get(i5);
                i5++;
                b84 b84Var4 = (b84) obj2;
                if (b84Var4.c == i2) {
                    b84Var3 = b84Var4;
                }
            }
            b84 b84Var5 = new b84(this, b84Var3);
            b84Var5.d = i3;
            b84Var5.c = i4;
            if (i3 != -1) {
                arrayList.add(b84Var5);
            }
            this.c = b84Var5;
        }
    }

    public final boolean n() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((b84) obj).l != null) {
                return true;
            }
        }
        b84 b84Var = this.c;
        if (b84Var == null || b84Var.l == null) {
            return false;
        }
        return true;
    }
}
