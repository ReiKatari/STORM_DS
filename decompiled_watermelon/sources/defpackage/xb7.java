package defpackage;

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
import androidx.constraintlayout.motion.widget.b;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xb7  reason: default package */
/* loaded from: classes.dex */
public final class xb7 {
    public int a;
    public int e;
    public final fa3 f;
    public final py0 g;
    public int j;
    public String k;
    public final Context o;
    public int b = -1;
    public boolean c = false;
    public int d = 0;
    public int h = -1;
    public int i = -1;
    public int l = 0;
    public String m = null;
    public int n = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (r2.equals("CustomMethod") != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xb7(android.content.Context r6, android.content.res.XmlResourceParser r7) {
        /*
            r5 = this;
            java.lang.String r0 = "Error parsing XML resource"
            java.lang.String r1 = "ViewTransition"
            r5.<init>()
            r2 = -1
            r5.b = r2
            r3 = 0
            r5.c = r3
            r5.d = r3
            r5.h = r2
            r5.i = r2
            r5.l = r3
            r3 = 0
            r5.m = r3
            r5.n = r2
            r5.p = r2
            r5.q = r2
            r5.r = r2
            r5.s = r2
            r5.t = r2
            r5.u = r2
            r5.o = r6
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
            r5 = move-exception
            goto Ld0
        L46:
            r5 = move-exception
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
            py0 r2 = r5.g     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            java.util.HashMap r2 = r2.g     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            defpackage.ey0.d(r6, r7, r2)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
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
            fa3 r2 = new fa3     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r2.<init>(r6, r7)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r5.f = r2     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            goto Lca
        L88:
            java.lang.String r3 = "ConstraintOverride"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            if (r3 == 0) goto L97
            py0 r2 = defpackage.uy0.d(r6, r7)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r5.g = r2     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            goto Lca
        L97:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r3.<init>()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            java.lang.String r4 = defpackage.b53.K()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
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
            android.util.Log.e(r1, r0, r5)
            goto Ld7
        Ld4:
            android.util.Log.e(r1, r0, r5)
        Ld7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb7.<init>(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    /* JADX WARN: Type inference failed for: r11v7, types: [fa3, java.lang.Object] */
    public final void a(ka kaVar, MotionLayout motionLayout, int i, uy0 uy0Var, View... viewArr) {
        uy0 b;
        float alpha;
        Interpolator loadInterpolator;
        Interpolator interpolator;
        if (this.c) {
            return;
        }
        int i2 = this.e;
        fa3 fa3Var = this.f;
        int i3 = 0;
        if (i2 == 2) {
            View view = viewArr[0];
            lz3 lz3Var = new lz3(view);
            wz3 wz3Var = lz3Var.f;
            float f = RecyclerView.A1;
            wz3Var.L = RecyclerView.A1;
            wz3Var.R = RecyclerView.A1;
            lz3Var.H = true;
            wz3Var.d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            lz3Var.g.d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            jz3 jz3Var = lz3Var.h;
            jz3Var.getClass();
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            jz3Var.L = view.getVisibility();
            if (view.getVisibility() != 0) {
                alpha = 0.0f;
            } else {
                alpha = view.getAlpha();
            }
            jz3Var.X = alpha;
            jz3Var.Y = view.getElevation();
            jz3Var.Z = view.getRotation();
            jz3Var.c0 = view.getRotationX();
            jz3Var.A = view.getRotationY();
            jz3Var.d0 = view.getScaleX();
            jz3Var.e0 = view.getScaleY();
            jz3Var.f0 = view.getPivotX();
            jz3Var.g0 = view.getPivotY();
            jz3Var.h0 = view.getTranslationX();
            jz3Var.i0 = view.getTranslationY();
            jz3Var.j0 = view.getTranslationZ();
            jz3 jz3Var2 = lz3Var.i;
            jz3Var2.getClass();
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            jz3Var2.L = view.getVisibility();
            if (view.getVisibility() == 0) {
                f = view.getAlpha();
            }
            jz3Var2.X = f;
            jz3Var2.Y = view.getElevation();
            jz3Var2.Z = view.getRotation();
            jz3Var2.c0 = view.getRotationX();
            jz3Var2.A = view.getRotationY();
            jz3Var2.d0 = view.getScaleX();
            jz3Var2.e0 = view.getScaleY();
            jz3Var2.f0 = view.getPivotX();
            jz3Var2.g0 = view.getPivotY();
            jz3Var2.h0 = view.getTranslationX();
            jz3Var2.i0 = view.getTranslationY();
            jz3Var2.j0 = view.getTranslationZ();
            ArrayList arrayList = (ArrayList) fa3Var.a.get(-1);
            if (arrayList != null) {
                lz3Var.w.addAll(arrayList);
            }
            lz3Var.g(System.nanoTime(), motionLayout.getWidth(), motionLayout.getHeight());
            int i4 = this.h;
            int i5 = this.i;
            int i6 = this.b;
            Context context = motionLayout.getContext();
            int i7 = this.l;
            if (i7 != -2) {
                if (i7 != -1) {
                    if (i7 != 0) {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                if (i7 != 4) {
                                    if (i7 != 5) {
                                        if (i7 != 6) {
                                            interpolator = null;
                                            new wb7(kaVar, lz3Var, i4, i5, i6, interpolator, this.p, this.q);
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
                    loadInterpolator = new kz3(an1.e(this.m), 2);
                }
            } else {
                loadInterpolator = AnimationUtils.loadInterpolator(context, this.n);
            }
            interpolator = loadInterpolator;
            new wb7(kaVar, lz3Var, i4, i5, i6, interpolator, this.p, this.q);
            return;
        }
        py0 py0Var = this.g;
        if (i2 == 1) {
            int[] constraintSetIds = motionLayout.getConstraintSetIds();
            int i8 = 0;
            while (i8 < constraintSetIds.length) {
                int i9 = constraintSetIds[i8];
                if (i9 != i) {
                    b bVar = motionLayout.o0;
                    if (bVar == null) {
                        b = null;
                    } else {
                        b = bVar.b(i9);
                    }
                    int length = viewArr.length;
                    for (int i10 = i3; i10 < length; i10++) {
                        py0 i11 = b.i(viewArr[i10].getId());
                        if (py0Var != null) {
                            oy0 oy0Var = py0Var.h;
                            if (oy0Var != null) {
                                oy0Var.e(i11);
                            }
                            i11.g.putAll(py0Var.g);
                        }
                    }
                }
                i8++;
                i3 = 0;
            }
        }
        uy0 uy0Var2 = new uy0();
        HashMap hashMap = uy0Var2.g;
        hashMap.clear();
        for (Integer num : uy0Var.g.keySet()) {
            py0 py0Var2 = (py0) uy0Var.g.get(num);
            if (py0Var2 != null) {
                hashMap.put(num, py0Var2.clone());
            }
        }
        for (View view2 : viewArr) {
            py0 i12 = uy0Var2.i(view2.getId());
            if (py0Var != null) {
                oy0 oy0Var2 = py0Var.h;
                if (oy0Var2 != null) {
                    oy0Var2.e(i12);
                }
                i12.g.putAll(py0Var.g);
            }
        }
        motionLayout.A(i, uy0Var2);
        motionLayout.A(R.id.view_transition, uy0Var);
        motionLayout.w(R.id.view_transition);
        zz3 zz3Var = new zz3(motionLayout.o0, i);
        for (View view3 : viewArr) {
            int i13 = this.h;
            if (i13 != -1) {
                zz3Var.h = Math.max(i13, 8);
            }
            zz3Var.p = this.d;
            int i14 = this.l;
            String str = this.m;
            int i15 = this.n;
            zz3Var.e = i14;
            zz3Var.f = str;
            zz3Var.g = i15;
            int id = view3.getId();
            if (fa3Var != null) {
                ArrayList arrayList2 = (ArrayList) fa3Var.a.get(-1);
                ?? obj = new Object();
                obj.a = new HashMap();
                int size = arrayList2.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj2 = arrayList2.get(i16);
                    i16++;
                    q93 b2 = ((q93) obj2).b();
                    b2.b = id;
                    obj.b(b2);
                }
                zz3Var.k.add(obj);
            }
        }
        motionLayout.setTransition(zz3Var);
        xc4 xc4Var = new xc4(11, this, viewArr);
        motionLayout.p(1.0f);
        motionLayout.j1 = xc4Var;
    }

    public final boolean b(View view) {
        boolean z;
        boolean z2;
        int i = this.r;
        if (i == -1 || view.getTag(i) != null) {
            z = true;
        } else {
            z = false;
        }
        int i2 = this.s;
        if (i2 == -1 || view.getTag(i2) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public final boolean c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.j == -1 && this.k == null) || !b(view)) {
            return false;
        }
        if (view.getId() == this.j) {
            return true;
        }
        if (this.k == null || !(view.getLayoutParams() instanceof jy0) || (str = ((jy0) view.getLayoutParams()).Y) == null || !str.matches(this.k)) {
            return false;
        }
        return true;
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), tx4.v);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = obtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == 8) {
                if (MotionLayout.s1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.j);
                    this.j = resourceId;
                    if (resourceId == -1) {
                        this.k = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.k = obtainStyledAttributes.getString(index);
                } else {
                    this.j = obtainStyledAttributes.getResourceId(index, this.j);
                }
            } else if (index == 9) {
                this.b = obtainStyledAttributes.getInt(index, this.b);
            } else if (index == 12) {
                this.c = obtainStyledAttributes.getBoolean(index, this.c);
            } else if (index == 10) {
                this.d = obtainStyledAttributes.getInt(index, this.d);
            } else if (index == 4) {
                this.h = obtainStyledAttributes.getInt(index, this.h);
            } else if (index == 13) {
                this.i = obtainStyledAttributes.getInt(index, this.i);
            } else if (index == 14) {
                this.e = obtainStyledAttributes.getInt(index, this.e);
            } else if (index == 7) {
                int i2 = obtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.n = resourceId2;
                    if (resourceId2 != -1) {
                        this.l = -2;
                    }
                } else if (i2 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.m = string;
                    if (string != null && string.indexOf("/") > 0) {
                        this.n = obtainStyledAttributes.getResourceId(index, -1);
                        this.l = -2;
                    } else {
                        this.l = -1;
                    }
                } else {
                    this.l = obtainStyledAttributes.getInteger(index, this.l);
                }
            } else if (index == 11) {
                this.p = obtainStyledAttributes.getResourceId(index, this.p);
            } else if (index == 3) {
                this.q = obtainStyledAttributes.getResourceId(index, this.q);
            } else if (index == 6) {
                this.r = obtainStyledAttributes.getResourceId(index, this.r);
            } else if (index == 5) {
                this.s = obtainStyledAttributes.getResourceId(index, this.s);
            } else if (index == 2) {
                this.u = obtainStyledAttributes.getResourceId(index, this.u);
            } else if (index == 1) {
                this.t = obtainStyledAttributes.getInteger(index, this.t);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + b53.M(this.o, this.a) + ")";
    }
}
