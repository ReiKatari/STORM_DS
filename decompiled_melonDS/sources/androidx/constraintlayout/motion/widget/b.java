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
import d0.d;
import d5.e;
import h5.g;
import h5.o;
import h5.p;
import h5.v;
import h5.z;
import i5.f;
import i5.l;
import i5.m;
import i5.n;
import i5.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import me.magnum.melonds.common.camera.DSiCameraSource;
import org.xmlpull.v1.XmlPullParserException;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final MotionLayout f1109a;

    /* renamed from: b  reason: collision with root package name */
    public final bk.a f1110b;

    /* renamed from: c  reason: collision with root package name */
    public z f1111c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f1112d;

    /* renamed from: e  reason: collision with root package name */
    public final z f1113e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f1114f;

    /* renamed from: g  reason: collision with root package name */
    public final SparseArray f1115g;

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f1116h;

    /* renamed from: i  reason: collision with root package name */
    public final SparseIntArray f1117i;

    /* renamed from: j  reason: collision with root package name */
    public int f1118j;

    /* renamed from: k  reason: collision with root package name */
    public int f1119k;

    /* renamed from: l  reason: collision with root package name */
    public MotionEvent f1120l;
    public boolean m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1121n;

    /* renamed from: o  reason: collision with root package name */
    public v f1122o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1123p;

    /* renamed from: q  reason: collision with root package name */
    public final x0 f1124q;

    /* renamed from: r  reason: collision with root package name */
    public float f1125r;

    /* renamed from: s  reason: collision with root package name */
    public float f1126s;

    /* JADX WARN: Code restructure failed: missing block: B:83:0x017d, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.content.Context r11, androidx.constraintlayout.motion.widget.MotionLayout r12, int r13) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.b.<init>(android.content.Context, androidx.constraintlayout.motion.widget.MotionLayout, int):void");
    }

    public static int c(Context context, String str) {
        int i2;
        if (str.contains("/")) {
            i2 = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            i2 = -1;
        }
        if (i2 == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
        }
        return i2;
    }

    public final boolean a(int i2, MotionLayout motionLayout) {
        z zVar;
        if (this.f1122o == null) {
            ArrayList arrayList = this.f1112d;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                z zVar2 = (z) obj;
                int i11 = zVar2.f6284n;
                if (i11 != 0 && ((zVar = this.f1111c) != zVar2 || (zVar.f6288r & 2) == 0)) {
                    if (i2 == zVar2.f6275d && (i11 == 4 || i11 == 2)) {
                        MotionLayout.a aVar = MotionLayout.a.FINISHED;
                        motionLayout.setState(aVar);
                        motionLayout.setTransition(zVar2);
                        if (zVar2.f6284n == 4) {
                            motionLayout.p(1.0f);
                            motionLayout.f1083i1 = null;
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
                    } else if (i2 == zVar2.f6274c && (i11 == 3 || i11 == 1)) {
                        MotionLayout.a aVar2 = MotionLayout.a.FINISHED;
                        motionLayout.setState(aVar2);
                        motionLayout.setTransition(zVar2);
                        if (zVar2.f6284n == 3) {
                            motionLayout.p(0.0f);
                            motionLayout.setState(MotionLayout.a.SETUP);
                            motionLayout.setState(MotionLayout.a.MOVING);
                            return true;
                        }
                        motionLayout.setProgress(0.0f);
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

    public final q b(int i2) {
        int z10;
        bk.a aVar = this.f1110b;
        if (aVar != null && (z10 = aVar.z(i2)) != -1) {
            i2 = z10;
        }
        SparseArray sparseArray = this.f1115g;
        if (sparseArray.get(i2) == null) {
            Log.e("MotionScene", "Warning could not find ConstraintSet id/" + d.V(this.f1109a.getContext(), i2) + " In MotionScene");
            return (q) sparseArray.get(sparseArray.keyAt(0));
        }
        return (q) sparseArray.get(i2);
    }

    public final Interpolator d() {
        z zVar = this.f1111c;
        int i2 = zVar.f6276e;
        if (i2 != -2) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 4) {
                                if (i2 != 5) {
                                    if (i2 != 6) {
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
            return new o(e.d(zVar.f6277f), 1);
        }
        return AnimationUtils.loadInterpolator(this.f1109a.getContext(), this.f1111c.f6278g);
    }

    public final void e(p pVar) {
        z zVar = this.f1111c;
        int i2 = 0;
        if (zVar == null) {
            z zVar2 = this.f1113e;
            if (zVar2 != null) {
                ArrayList arrayList = zVar2.f6282k;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((g) obj).a(pVar);
                }
                return;
            }
            return;
        }
        ArrayList arrayList2 = zVar.f6282k;
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            ((g) obj2).a(pVar);
        }
    }

    public final float f() {
        c cVar;
        z zVar = this.f1111c;
        if (zVar != null && (cVar = zVar.f6283l) != null) {
            return cVar.f1145t;
        }
        return 0.0f;
    }

    public final int g() {
        z zVar = this.f1111c;
        if (zVar == null) {
            return -1;
        }
        return zVar.f6275d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int h(Context context, XmlResourceParser xmlResourceParser) {
        boolean z10;
        boolean z11;
        q qVar = new q();
        qVar.f6991f = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int i2 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < attributeCount; i11++) {
            String attributeName = xmlResourceParser.getAttributeName(i11);
            String attributeValue = xmlResourceParser.getAttributeValue(i11);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1496482599:
                    if (attributeName.equals("deriveConstraintsFrom")) {
                        z10 = false;
                        break;
                    }
                    z10 = true;
                    break;
                case -1153153640:
                    if (attributeName.equals("constraintRotate")) {
                        z10 = true;
                        break;
                    }
                    z10 = true;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        z10 = true;
                        break;
                    }
                    z10 = true;
                    break;
                case 973381616:
                    if (attributeName.equals("stateLabels")) {
                        z10 = true;
                        break;
                    }
                    z10 = true;
                    break;
                default:
                    z10 = true;
                    break;
            }
            switch (z10) {
                case false:
                    i10 = c(context, attributeValue);
                    break;
                case DSiCameraSource.FrontCamera /* 1 */:
                    try {
                        qVar.f6989d = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue.hashCode()) {
                            case -768416914:
                                if (attributeValue.equals("x_left")) {
                                    z11 = false;
                                    break;
                                }
                                z11 = true;
                                break;
                            case 3317767:
                                if (attributeValue.equals("left")) {
                                    z11 = true;
                                    break;
                                }
                                z11 = true;
                                break;
                            case 3387192:
                                if (attributeValue.equals("none")) {
                                    z11 = true;
                                    break;
                                }
                                z11 = true;
                                break;
                            case 108511772:
                                if (attributeValue.equals("right")) {
                                    z11 = true;
                                    break;
                                }
                                z11 = true;
                                break;
                            case 1954540437:
                                if (attributeValue.equals("x_right")) {
                                    z11 = true;
                                    break;
                                }
                                z11 = true;
                                break;
                            default:
                                z11 = true;
                                break;
                        }
                        switch (z11) {
                            case false:
                                qVar.f6989d = 4;
                                continue;
                            case DSiCameraSource.FrontCamera /* 1 */:
                                qVar.f6989d = 2;
                                continue;
                            case true:
                                qVar.f6989d = 0;
                                continue;
                            case true:
                                qVar.f6989d = 1;
                                continue;
                            case true:
                                qVar.f6989d = 3;
                                continue;
                        }
                    }
                    break;
                case true:
                    i2 = c(context, attributeValue);
                    int indexOf = attributeValue.indexOf(47);
                    if (indexOf >= 0) {
                        attributeValue = attributeValue.substring(indexOf + 1);
                    }
                    this.f1116h.put(attributeValue, Integer.valueOf(i2));
                    qVar.f6986a = d.V(context, i2);
                    break;
                case true:
                    qVar.f6988c = attributeValue.split(",");
                    int i12 = 0;
                    while (true) {
                        String[] strArr = qVar.f6988c;
                        if (i12 < strArr.length) {
                            strArr[i12] = strArr[i12].trim();
                            i12++;
                        }
                    }
                    break;
            }
        }
        if (i2 != -1) {
            int i13 = this.f1109a.G0;
            qVar.k(context, xmlResourceParser);
            if (i10 != -1) {
                this.f1117i.put(i2, i10);
            }
            this.f1115g.put(i2, qVar);
        }
        return i2;
    }

    public final int i(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return h(context, xml);
                }
            }
            return -1;
        } catch (IOException e6) {
            Log.e("MotionScene", "Error parsing resource: " + i2, e6);
            return -1;
        } catch (XmlPullParserException e10) {
            Log.e("MotionScene", "Error parsing resource: " + i2, e10);
            return -1;
        }
    }

    public final void j(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), i5.v.f7014w);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                i(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void k(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), i5.v.m);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                int i10 = obtainStyledAttributes.getInt(index, this.f1118j);
                this.f1118j = i10;
                if (i10 < 8) {
                    this.f1118j = 8;
                }
            } else if (index == 1) {
                this.f1119k = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void l(int i2, MotionLayout motionLayout) {
        SparseArray sparseArray = this.f1115g;
        q qVar = (q) sparseArray.get(i2);
        String str = qVar.f6986a;
        HashMap hashMap = qVar.f6992g;
        qVar.f6987b = str;
        int i10 = this.f1117i.get(i2);
        if (i10 > 0) {
            l(i10, motionLayout);
            q qVar2 = (q) sparseArray.get(i10);
            if (qVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + d.V(this.f1109a.getContext(), i10));
                return;
            }
            HashMap hashMap2 = qVar2.f6992g;
            qVar.f6987b += "/" + qVar2.f6987b;
            for (Integer num : hashMap2.keySet()) {
                num.getClass();
                l lVar = (l) hashMap2.get(num);
                if (!hashMap.containsKey(num)) {
                    hashMap.put(num, new l());
                }
                l lVar2 = (l) hashMap.get(num);
                if (lVar2 != null) {
                    m mVar = lVar2.f6906e;
                    if (!mVar.f6913b) {
                        mVar.a(lVar.f6906e);
                    }
                    i5.o oVar = lVar2.f6904c;
                    if (!oVar.f6964a) {
                        i5.o oVar2 = lVar.f6904c;
                        oVar.f6964a = oVar2.f6964a;
                        oVar.f6965b = oVar2.f6965b;
                        oVar.f6967d = oVar2.f6967d;
                        oVar.f6968e = oVar2.f6968e;
                        oVar.f6966c = oVar2.f6966c;
                    }
                    i5.p pVar = lVar2.f6907f;
                    if (!pVar.f6970a) {
                        pVar.a(lVar.f6907f);
                    }
                    n nVar = lVar2.f6905d;
                    if (!nVar.f6952a) {
                        nVar.a(lVar.f6905d);
                    }
                    for (String str2 : lVar.f6908g.keySet()) {
                        if (!lVar2.f6908g.containsKey(str2)) {
                            lVar2.f6908g.put(str2, (i5.b) lVar.f6908g.get(str2));
                        }
                    }
                }
            }
        } else {
            qVar.f6987b = w.d.s(new StringBuilder(), qVar.f6987b, "  layout");
            int childCount = motionLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = motionLayout.getChildAt(i11);
                f fVar = (f) childAt.getLayoutParams();
                int id2 = childAt.getId();
                if (qVar.f6991f && id2 == -1) {
                    m9.o.r("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (!hashMap.containsKey(Integer.valueOf(id2))) {
                    hashMap.put(Integer.valueOf(id2), new l());
                }
                l lVar3 = (l) hashMap.get(Integer.valueOf(id2));
                if (lVar3 != null) {
                    i5.o oVar3 = lVar3.f6904c;
                    m mVar2 = lVar3.f6906e;
                    i5.p pVar2 = lVar3.f6907f;
                    if (!mVar2.f6913b) {
                        l.a(lVar3, id2, fVar);
                        if (childAt instanceof i5.c) {
                            mVar2.f6930j0 = ((i5.c) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                mVar2.f6939o0 = barrier.getAllowsGoneWidget();
                                mVar2.f6924g0 = barrier.getType();
                                mVar2.f6926h0 = barrier.getMargin();
                            }
                        }
                        mVar2.f6913b = true;
                    }
                    if (!oVar3.f6964a) {
                        oVar3.f6965b = childAt.getVisibility();
                        oVar3.f6967d = childAt.getAlpha();
                        oVar3.f6964a = true;
                    }
                    if (!pVar2.f6970a) {
                        pVar2.f6970a = true;
                        pVar2.f6971b = childAt.getRotation();
                        pVar2.f6972c = childAt.getRotationX();
                        pVar2.f6973d = childAt.getRotationY();
                        pVar2.f6974e = childAt.getScaleX();
                        pVar2.f6975f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            pVar2.f6976g = pivotX;
                            pVar2.f6977h = pivotY;
                        }
                        pVar2.f6979j = childAt.getTranslationX();
                        pVar2.f6980k = childAt.getTranslationY();
                        pVar2.f6981l = childAt.getTranslationZ();
                        if (pVar2.m) {
                            pVar2.f6982n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (l lVar4 : hashMap.values()) {
            if (lVar4.f6909h != null) {
                if (lVar4.f6903b == null) {
                    lVar4.f6909h.e(qVar.i(lVar4.f6902a));
                } else {
                    for (Integer num2 : hashMap.keySet()) {
                        l i12 = qVar.i(num2.intValue());
                        String str3 = i12.f6906e.f6934l0;
                        if (str3 != null && lVar4.f6903b.matches(str3)) {
                            lVar4.f6909h.e(i12);
                            i12.f6908g.putAll((HashMap) lVar4.f6908g.clone());
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r2 != (-1)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r11, int r12) {
        /*
            r10 = this;
            r0 = -1
            bk.a r1 = r10.f1110b
            if (r1 == 0) goto L18
            int r1 = r1.z(r11)
            if (r1 == r0) goto Lc
            goto Ld
        Lc:
            r1 = r11
        Ld:
            bk.a r2 = r10.f1110b
            int r2 = r2.z(r12)
            if (r2 == r0) goto L16
            goto L1a
        L16:
            r2 = r12
            goto L1a
        L18:
            r1 = r11
            goto L16
        L1a:
            h5.z r3 = r10.f1111c
            if (r3 == 0) goto L27
            int r4 = r3.f6274c
            if (r4 != r12) goto L27
            int r3 = r3.f6275d
            if (r3 != r11) goto L27
            goto L52
        L27:
            java.util.ArrayList r3 = r10.f1112d
            int r4 = r3.size()
            r5 = 0
            r6 = r5
        L2f:
            if (r6 >= r4) goto L53
            java.lang.Object r7 = r3.get(r6)
            int r6 = r6 + 1
            h5.z r7 = (h5.z) r7
            int r8 = r7.f6274c
            if (r8 != r2) goto L41
            int r9 = r7.f6275d
            if (r9 == r1) goto L47
        L41:
            if (r8 != r12) goto L2f
            int r8 = r7.f6275d
            if (r8 != r11) goto L2f
        L47:
            r10.f1111c = r7
            androidx.constraintlayout.motion.widget.c r11 = r7.f6283l
            if (r11 == 0) goto L52
            boolean r12 = r10.f1123p
            r11.c(r12)
        L52:
            return
        L53:
            java.util.ArrayList r11 = r10.f1114f
            int r4 = r11.size()
            h5.z r6 = r10.f1113e
        L5b:
            if (r5 >= r4) goto L6b
            java.lang.Object r7 = r11.get(r5)
            int r5 = r5 + 1
            h5.z r7 = (h5.z) r7
            int r8 = r7.f6274c
            if (r8 != r12) goto L5b
            r6 = r7
            goto L5b
        L6b:
            h5.z r11 = new h5.z
            r11.<init>(r10, r6)
            r11.f6275d = r1
            r11.f6274c = r2
            if (r1 == r0) goto L79
            r3.add(r11)
        L79:
            r10.f1111c = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.b.m(int, int):void");
    }

    public final boolean n() {
        ArrayList arrayList = this.f1112d;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (((z) obj).f6283l != null) {
                return true;
            }
        }
        z zVar = this.f1111c;
        if (zVar == null || zVar.f6283l == null) {
            return false;
        }
        return true;
    }
}
