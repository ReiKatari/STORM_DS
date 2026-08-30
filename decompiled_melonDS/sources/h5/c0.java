package h5;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
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
import java.util.ArrayList;
import java.util.HashMap;
import me.magnum.melonds.R;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public int f6098a;

    /* renamed from: e  reason: collision with root package name */
    public int f6102e;

    /* renamed from: f  reason: collision with root package name */
    public final g f6103f;

    /* renamed from: g  reason: collision with root package name */
    public final i5.l f6104g;

    /* renamed from: j  reason: collision with root package name */
    public int f6107j;

    /* renamed from: k  reason: collision with root package name */
    public String f6108k;

    /* renamed from: o  reason: collision with root package name */
    public final Context f6111o;

    /* renamed from: b  reason: collision with root package name */
    public int f6099b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6100c = false;

    /* renamed from: d  reason: collision with root package name */
    public int f6101d = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f6105h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f6106i = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f6109l = 0;
    public String m = null;

    /* renamed from: n  reason: collision with root package name */
    public int f6110n = -1;

    /* renamed from: p  reason: collision with root package name */
    public int f6112p = -1;

    /* renamed from: q  reason: collision with root package name */
    public int f6113q = -1;

    /* renamed from: r  reason: collision with root package name */
    public int f6114r = -1;

    /* renamed from: s  reason: collision with root package name */
    public int f6115s = -1;

    /* renamed from: t  reason: collision with root package name */
    public int f6116t = -1;

    /* renamed from: u  reason: collision with root package name */
    public int f6117u = -1;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (r2.equals("CustomMethod") != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c0(android.content.Context r6, android.content.res.XmlResourceParser r7) {
        /*
            r5 = this;
            java.lang.String r0 = "Error parsing XML resource"
            java.lang.String r1 = "ViewTransition"
            r5.<init>()
            r2 = -1
            r5.f6099b = r2
            r3 = 0
            r5.f6100c = r3
            r5.f6101d = r3
            r5.f6105h = r2
            r5.f6106i = r2
            r5.f6109l = r3
            r3 = 0
            r5.m = r3
            r5.f6110n = r2
            r5.f6112p = r2
            r5.f6113q = r2
            r5.f6114r = r2
            r5.f6115s = r2
            r5.f6116t = r2
            r5.f6117u = r2
            r5.f6111o = r6
            int r2 = r7.getEventType()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
        L2c:
            r3 = 1
            if (r2 == r3) goto Ld7
            r3 = 2
            if (r2 == r3) goto L49
            r3 = 3
            if (r2 == r3) goto L37
            goto Lca
        L37:
            java.lang.String r2 = r7.getName()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            boolean r2 = r1.equals(r2)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            if (r2 == 0) goto Lca
            goto Ld7
        L43:
            r6 = move-exception
            goto Ld0
        L46:
            r6 = move-exception
            goto Ld4
        L49:
            java.lang.String r2 = r7.getName()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            int r3 = r2.hashCode()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            switch(r3) {
                case -1962203927: goto L88;
                case -1239391468: goto L78;
                case 61998586: goto L6e;
                case 366511058: goto L5e;
                case 1791837707: goto L55;
                default: goto L54;
            }     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
        L54:
            goto L97
        L55:
            java.lang.String r3 = "CustomAttribute"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            if (r3 == 0) goto L97
            goto L66
        L5e:
            java.lang.String r3 = "CustomMethod"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            if (r3 == 0) goto L97
        L66:
            i5.l r2 = r5.f6104g     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            java.util.HashMap r2 = r2.f6908g     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            i5.b.d(r6, r7, r2)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            goto Lca
        L6e:
            boolean r3 = r2.equals(r1)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            if (r3 == 0) goto L97
            r5.d(r6, r7)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            goto Lca
        L78:
            java.lang.String r3 = "KeyFrameSet"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            if (r3 == 0) goto L97
            h5.g r2 = new h5.g     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r2.<init>(r6, r7)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r5.f6103f = r2     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            goto Lca
        L88:
            java.lang.String r3 = "ConstraintOverride"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            if (r3 == 0) goto L97
            i5.l r2 = i5.q.d(r6, r7)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r5.f6104g = r2     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            goto Lca
        L97:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r3.<init>()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            java.lang.String r4 = d0.d.T()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r3.append(r4)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            java.lang.String r4 = " unknown tag "
            r3.append(r4)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r3.append(r2)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            java.lang.String r2 = r3.toString()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            android.util.Log.e(r1, r2)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r2.<init>()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            java.lang.String r3 = ".xml:"
            r2.append(r3)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            int r3 = r7.getLineNumber()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r2.append(r3)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            android.util.Log.e(r1, r2)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
        Lca:
            int r2 = r7.next()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            goto L2c
        Ld0:
            android.util.Log.e(r1, r0, r6)
            goto Ld7
        Ld4:
            android.util.Log.e(r1, r0, r6)
        Ld7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.c0.<init>(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    /* JADX WARN: Type inference failed for: r11v7, types: [h5.g, java.lang.Object] */
    public final void a(x0 x0Var, MotionLayout motionLayout, int i2, i5.q qVar, View... viewArr) {
        i5.q b10;
        float alpha;
        Interpolator loadInterpolator;
        Interpolator interpolator;
        if (this.f6100c) {
            return;
        }
        int i10 = this.f6102e;
        g gVar = this.f6103f;
        int i11 = 0;
        if (i10 == 2) {
            View view = viewArr[0];
            p pVar = new p(view);
            x xVar = pVar.f6215f;
            float f8 = 0.0f;
            xVar.L = 0.0f;
            xVar.R = 0.0f;
            pVar.H = true;
            xVar.d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            pVar.f6216g.d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            n nVar = pVar.f6217h;
            nVar.getClass();
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            nVar.L = view.getVisibility();
            if (view.getVisibility() != 0) {
                alpha = 0.0f;
            } else {
                alpha = view.getAlpha();
            }
            nVar.X = alpha;
            nVar.Y = view.getElevation();
            nVar.Z = view.getRotation();
            nVar.f6198b0 = view.getRotationX();
            nVar.A = view.getRotationY();
            nVar.f6199c0 = view.getScaleX();
            nVar.f6200d0 = view.getScaleY();
            nVar.f6201e0 = view.getPivotX();
            nVar.f6202f0 = view.getPivotY();
            nVar.f6203g0 = view.getTranslationX();
            nVar.f6204h0 = view.getTranslationY();
            nVar.f6205i0 = view.getTranslationZ();
            n nVar2 = pVar.f6218i;
            nVar2.getClass();
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            nVar2.L = view.getVisibility();
            if (view.getVisibility() == 0) {
                f8 = view.getAlpha();
            }
            nVar2.X = f8;
            nVar2.Y = view.getElevation();
            nVar2.Z = view.getRotation();
            nVar2.f6198b0 = view.getRotationX();
            nVar2.A = view.getRotationY();
            nVar2.f6199c0 = view.getScaleX();
            nVar2.f6200d0 = view.getScaleY();
            nVar2.f6201e0 = view.getPivotX();
            nVar2.f6202f0 = view.getPivotY();
            nVar2.f6203g0 = view.getTranslationX();
            nVar2.f6204h0 = view.getTranslationY();
            nVar2.f6205i0 = view.getTranslationZ();
            ArrayList arrayList = (ArrayList) gVar.f6152a.get(-1);
            if (arrayList != null) {
                pVar.f6231w.addAll(arrayList);
            }
            pVar.g(System.nanoTime(), motionLayout.getWidth(), motionLayout.getHeight());
            int i12 = this.f6105h;
            int i13 = this.f6106i;
            int i14 = this.f6099b;
            Context context = motionLayout.getContext();
            int i15 = this.f6109l;
            if (i15 != -2) {
                if (i15 != -1) {
                    if (i15 != 0) {
                        if (i15 != 1) {
                            if (i15 != 2) {
                                if (i15 != 4) {
                                    if (i15 != 5) {
                                        if (i15 != 6) {
                                            interpolator = null;
                                            new b0(x0Var, pVar, i12, i13, i14, interpolator, this.f6112p, this.f6113q);
                                            return;
                                        }
                                        loadInterpolator = new AnticipateInterpolator();
                                    } else {
                                        loadInterpolator = new OvershootInterpolator();
                                    }
                                } else {
                                    loadInterpolator = new BounceInterpolator();
                                }
                            } else {
                                loadInterpolator = new DecelerateInterpolator();
                            }
                        } else {
                            loadInterpolator = new AccelerateInterpolator();
                        }
                    } else {
                        loadInterpolator = new AccelerateDecelerateInterpolator();
                    }
                } else {
                    loadInterpolator = new o(d5.e.d(this.m), 2);
                }
            } else {
                loadInterpolator = AnimationUtils.loadInterpolator(context, this.f6110n);
            }
            interpolator = loadInterpolator;
            new b0(x0Var, pVar, i12, i13, i14, interpolator, this.f6112p, this.f6113q);
            return;
        }
        i5.l lVar = this.f6104g;
        if (i10 == 1) {
            int[] constraintSetIds = motionLayout.getConstraintSetIds();
            int i16 = 0;
            while (i16 < constraintSetIds.length) {
                int i17 = constraintSetIds[i16];
                if (i17 != i2) {
                    androidx.constraintlayout.motion.widget.b bVar = motionLayout.f1088n0;
                    if (bVar == null) {
                        b10 = null;
                    } else {
                        b10 = bVar.b(i17);
                    }
                    int length = viewArr.length;
                    for (int i18 = i11; i18 < length; i18++) {
                        i5.l i19 = b10.i(viewArr[i18].getId());
                        if (lVar != null) {
                            i5.k kVar = lVar.f6909h;
                            if (kVar != null) {
                                kVar.e(i19);
                            }
                            i19.f6908g.putAll(lVar.f6908g);
                        }
                    }
                }
                i16++;
                i11 = 0;
            }
        }
        i5.q qVar2 = new i5.q();
        HashMap hashMap = qVar2.f6992g;
        hashMap.clear();
        for (Integer num : qVar.f6992g.keySet()) {
            i5.l lVar2 = (i5.l) qVar.f6992g.get(num);
            if (lVar2 != null) {
                hashMap.put(num, lVar2.clone());
            }
        }
        for (View view2 : viewArr) {
            i5.l i20 = qVar2.i(view2.getId());
            if (lVar != null) {
                i5.k kVar2 = lVar.f6909h;
                if (kVar2 != null) {
                    kVar2.e(i20);
                }
                i20.f6908g.putAll(lVar.f6908g);
            }
        }
        motionLayout.A(i2, qVar2);
        motionLayout.A(R.id.view_transition, qVar);
        motionLayout.w(R.id.view_transition);
        z zVar = new z(motionLayout.f1088n0, i2);
        for (View view3 : viewArr) {
            int i21 = this.f6105h;
            if (i21 != -1) {
                zVar.f6279h = Math.max(i21, 8);
            }
            zVar.f6286p = this.f6101d;
            int i22 = this.f6109l;
            String str = this.m;
            int i23 = this.f6110n;
            zVar.f6276e = i22;
            zVar.f6277f = str;
            zVar.f6278g = i23;
            int id2 = view3.getId();
            if (gVar != null) {
                ArrayList arrayList2 = (ArrayList) gVar.f6152a.get(-1);
                ?? obj = new Object();
                obj.f6152a = new HashMap();
                int size = arrayList2.size();
                int i24 = 0;
                while (i24 < size) {
                    Object obj2 = arrayList2.get(i24);
                    i24++;
                    b b11 = ((b) obj2).b();
                    b11.f6082b = id2;
                    obj.b(b11);
                }
                zVar.f6282k.add(obj);
            }
        }
        motionLayout.setTransition(zVar);
        ad.c cVar = new ad.c(8, this, viewArr);
        motionLayout.p(1.0f);
        motionLayout.f1083i1 = cVar;
    }

    public final boolean b(View view) {
        boolean z10;
        boolean z11;
        int i2 = this.f6114r;
        if (i2 == -1 || view.getTag(i2) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.f6115s;
        if (i10 == -1 || view.getTag(i10) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }

    public final boolean c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f6107j == -1 && this.f6108k == null) || !b(view)) {
            return false;
        }
        if (view.getId() == this.f6107j) {
            return true;
        }
        if (this.f6108k == null || !(view.getLayoutParams() instanceof i5.f) || (str = ((i5.f) view.getLayoutParams()).Y) == null || !str.matches(this.f6108k)) {
            return false;
        }
        return true;
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), i5.v.f7013v);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                this.f6098a = obtainStyledAttributes.getResourceId(index, this.f6098a);
            } else if (index == 8) {
                if (MotionLayout.f1074r1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f6107j);
                    this.f6107j = resourceId;
                    if (resourceId == -1) {
                        this.f6108k = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.f6108k = obtainStyledAttributes.getString(index);
                } else {
                    this.f6107j = obtainStyledAttributes.getResourceId(index, this.f6107j);
                }
            } else if (index == 9) {
                this.f6099b = obtainStyledAttributes.getInt(index, this.f6099b);
            } else if (index == 12) {
                this.f6100c = obtainStyledAttributes.getBoolean(index, this.f6100c);
            } else if (index == 10) {
                this.f6101d = obtainStyledAttributes.getInt(index, this.f6101d);
            } else if (index == 4) {
                this.f6105h = obtainStyledAttributes.getInt(index, this.f6105h);
            } else if (index == 13) {
                this.f6106i = obtainStyledAttributes.getInt(index, this.f6106i);
            } else if (index == 14) {
                this.f6102e = obtainStyledAttributes.getInt(index, this.f6102e);
            } else if (index == 7) {
                int i10 = obtainStyledAttributes.peekValue(index).type;
                if (i10 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.f6110n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f6109l = -2;
                    }
                } else if (i10 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.m = string;
                    if (string != null && string.indexOf("/") > 0) {
                        this.f6110n = obtainStyledAttributes.getResourceId(index, -1);
                        this.f6109l = -2;
                    } else {
                        this.f6109l = -1;
                    }
                } else {
                    this.f6109l = obtainStyledAttributes.getInteger(index, this.f6109l);
                }
            } else if (index == 11) {
                this.f6112p = obtainStyledAttributes.getResourceId(index, this.f6112p);
            } else if (index == 3) {
                this.f6113q = obtainStyledAttributes.getResourceId(index, this.f6113q);
            } else if (index == 6) {
                this.f6114r = obtainStyledAttributes.getResourceId(index, this.f6114r);
            } else if (index == 5) {
                this.f6115s = obtainStyledAttributes.getResourceId(index, this.f6115s);
            } else if (index == 2) {
                this.f6117u = obtainStyledAttributes.getResourceId(index, this.f6117u);
            } else if (index == 1) {
                this.f6116t = obtainStyledAttributes.getInteger(index, this.f6116t);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + d0.d.V(this.f6111o, this.f6098a) + ")";
    }
}
